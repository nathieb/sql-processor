package org.sqlproc.engine.plugin;

import org.sqlproc.engine.type.SqlMetaType;

/**
 * The SQL Processor plugin devoted to evaluate the emptiness of the input value.
 * 
 * <p>
 * The emptiness is the basic facility in the construction of the final SQL statements from the META SQL fragments.
 * 
 * <p>
 * The standard evaluation is the next one:
 * <p>
 * The emptiness of a dynamic input value depends on the Java type of the related attribute
 * <ul>
 * <li>for a String it must be not null and the length must be &gt;0</li>
 * <li>for a Collection it must be not null and the size must be &gt;0</li>
 * <li>for the rest Java types it must be not null</li>
 * <li>an enumeration based attribute is treated in a special way, please see the advanced tutorial</li>
 * </ul>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface IsEmptyPlugin {

    /**
     * Used for the evaluation of the emptiness in the META SQL fragments.
     * 
     * @param obj
     *            the input value
     * @param sqlMetaType
     *            the internal type (= META type) devoted for the special processing of the input values
     * @param sqlMetaTypeExt
     *            the META type extension (=the internal type supplement value) devoted to extend the special processing
     *            of the input values
     * @param inSqlSetOrInsert
     *            an indicator the input value is evaluated in the CRUD statement (INSERT or SET)
     * @return the emptiness of the input value
     */
    public boolean isEmpty(Object obj, SqlMetaType sqlMetaType, String sqlMetaTypeExt, boolean inSqlSetOrInsert)
            throws IllegalArgumentException;
}
