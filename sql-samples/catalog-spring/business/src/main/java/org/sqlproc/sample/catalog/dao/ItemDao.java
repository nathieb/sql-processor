package org.sqlproc.sample.catalog.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.spring.SpringSimpleSession;
import org.sqlproc.sample.catalog.form.ItemForm;
import org.sqlproc.sample.catalog.model.Item;
import org.sqlproc.sample.catalog.to.ItemTO;

public class ItemDao {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected JdbcTemplate jdbcTemplate;
    protected SqlEngineFactory sqlFactory;

    private SqlSession getSqlSession() {
        SqlSession session = new SpringSimpleSession(jdbcTemplate);
        return session;
    }

    @Cacheable(value = "itemCache", key = "#id")
    public Item findById(Long id) {
        SqlSession session = getSqlSession();
        Item item = getCrudEngine("GET_ITEM").get(session, Item.class, new Item(id));
        logger.info("findById: " + item.toDebugString());
        return item;
    }

    @CacheEvict(value = "itemCache", key = "#item.itemid")
    public Item create(Item item) {
        SqlSession session = getSqlSession();
        logger.info("create: " + item.toDebugString());
        getCrudEngine("INSERT_ITEM").insert(session, item);
        logger.info("create: " + item.toDebugString());
        return item;
    }

    @CacheEvict(value = "itemCache", key = "#item.itemid")
    public Item update(Item item) {
        SqlSession session = getSqlSession();
        logger.info("update: " + item.toDebugString());
        getCrudEngine("UPDATE_ITEM").update(session, item);
        logger.info("update: " + item.toDebugString());
        return item;
    }

    @CacheEvict(value = "itemCache", key = "#id")
    public void delete(Long id) {
        SqlSession session = getSqlSession();
        logger.info("delete: " + id);
        getCrudEngine("DELETE_ITEM").delete(session, new Item(id));
    }

    public List<ItemTO> find(ItemForm criteria) {
        SqlSession session = getSqlSession();
        logger.info("find: " + criteria);
        return getQueryEngine("ITEMS").query(session, ItemTO.class, criteria, null,
                SqlOrder.getOrder(criteria.getOrder()), 0, criteria.getCount(), criteria.getFirst());
    }

    public int findCount(ItemForm criteria) {
        SqlSession session = getSqlSession();
        logger.info("findCount: " + criteria);
        return getQueryEngine("ITEMS").queryCount(session, criteria);
    }

    public SqlCrudEngine getCrudEngine(String name) {
        SqlCrudEngine queryEngine = sqlFactory.getCrudEngine(name);
        if (queryEngine == null)
            throw new RuntimeException("Missing SqlQueryEngine " + name);
        return queryEngine;
    }

    public SqlQueryEngine getQueryEngine(String name) {
        SqlQueryEngine queryEngine = sqlFactory.getQueryEngine(name);
        if (queryEngine == null)
            throw new RuntimeException("Missing SqlQueryEngine " + name);
        return queryEngine;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setSqlFactory(SqlEngineFactory sqlFactory) {
        this.sqlFactory = sqlFactory;
    }
}
