package org.sqlproc.sample.catalog.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.hibernate.HibernateSimpleSession;
import org.sqlproc.sample.catalog.form.ItemForm;
import org.sqlproc.sample.catalog.model.Item;
import org.sqlproc.sample.catalog.to.ItemTO;

public class ItemDao extends HibernateDaoSupport {

    protected SqlEngineFactory sqlFactory;

    private SqlSession getSqlSession() {
        SqlSession session = new HibernateSimpleSession(getSession());
        return session;
    }

    public Item findById(Serializable id) {
        Item entity = (Item) getHibernateTemplate().get(Item.class, id);
        return entity;
    }

    public Item store(Item entity) {
        entity = getHibernateTemplate().merge(entity);
        getHibernateTemplate().flush();
        return entity;
    }

    public void remove(Serializable entityId) {
        Item entity = findById(entityId);
        if (entity != null) {
            remove(entity);
        }
    }

    protected void remove(Item entity) {
        getHibernateTemplate().delete(entity);
        getHibernateTemplate().flush();
    }

    public List<ItemTO> find(ItemForm criteria) {
        SqlSession session = getSqlSession();
        return getQueryEngine("ITEMS").query(session, ItemTO.class, criteria, null,
                SqlOrder.getOrder(criteria.getOrder()), 0, criteria.getCount(), criteria.getFirst());
    }

    public int findCount(ItemForm criteria) {
        SqlSession session = getSqlSession();
        return getQueryEngine("ITEMS").queryCount(session, criteria);
    }

    public SqlQueryEngine getQueryEngine(String name) {
        SqlQueryEngine queryEngine = sqlFactory.getQueryEngine(name);
        if (queryEngine == null)
            throw new RuntimeException("Missing SqlQueryEngine " + name);
        return queryEngine;
    }

    public void setSqlFactory(SqlEngineFactory sqlFactory) {
        this.sqlFactory = sqlFactory;
    }
}
