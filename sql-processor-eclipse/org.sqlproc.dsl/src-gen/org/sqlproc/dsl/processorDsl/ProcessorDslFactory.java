/**
 * <copyright>
 * </copyright>
 *
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage
 * @generated
 */
public interface ProcessorDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProcessorDslFactory eINSTANCE = org.sqlproc.dsl.processorDsl.impl.ProcessorDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Artifacts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifacts</em>'.
   * @generated
   */
  Artifacts createArtifacts();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Pojo Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Definition</em>'.
   * @generated
   */
  PojoDefinition createPojoDefinition();

  /**
   * Returns a new object of class '<em>Pojo Usage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Usage</em>'.
   * @generated
   */
  PojoUsage createPojoUsage();

  /**
   * Returns a new object of class '<em>Column Usage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Usage</em>'.
   * @generated
   */
  ColumnUsage createColumnUsage();

  /**
   * Returns a new object of class '<em>Identifier Usage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identifier Usage</em>'.
   * @generated
   */
  IdentifierUsage createIdentifierUsage();

  /**
   * Returns a new object of class '<em>Constant Usage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Usage</em>'.
   * @generated
   */
  ConstantUsage createConstantUsage();

  /**
   * Returns a new object of class '<em>Mapping Usage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Usage</em>'.
   * @generated
   */
  MappingUsage createMappingUsage();

  /**
   * Returns a new object of class '<em>Table Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Definition</em>'.
   * @generated
   */
  TableDefinition createTableDefinition();

  /**
   * Returns a new object of class '<em>Table Usage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Usage</em>'.
   * @generated
   */
  TableUsage createTableUsage();

  /**
   * Returns a new object of class '<em>Meta Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Statement</em>'.
   * @generated
   */
  MetaStatement createMetaStatement();

  /**
   * Returns a new object of class '<em>Sql</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sql</em>'.
   * @generated
   */
  Sql createSql();

  /**
   * Returns a new object of class '<em>Sql Fragment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sql Fragment</em>'.
   * @generated
   */
  SqlFragment createSqlFragment();

  /**
   * Returns a new object of class '<em>Meta Sql</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Sql</em>'.
   * @generated
   */
  MetaSql createMetaSql();

  /**
   * Returns a new object of class '<em>If Sql</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Sql</em>'.
   * @generated
   */
  IfSql createIfSql();

  /**
   * Returns a new object of class '<em>If Sql Fragment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Sql Fragment</em>'.
   * @generated
   */
  IfSqlFragment createIfSqlFragment();

  /**
   * Returns a new object of class '<em>If Meta Sql</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Meta Sql</em>'.
   * @generated
   */
  IfMetaSql createIfMetaSql();

  /**
   * Returns a new object of class '<em>If Sql Cond</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Sql Cond</em>'.
   * @generated
   */
  IfSqlCond createIfSqlCond();

  /**
   * Returns a new object of class '<em>If Sql Bool</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Sql Bool</em>'.
   * @generated
   */
  IfSqlBool createIfSqlBool();

  /**
   * Returns a new object of class '<em>Ord Sql</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ord Sql</em>'.
   * @generated
   */
  OrdSql createOrdSql();

  /**
   * Returns a new object of class '<em>Ord Sql2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ord Sql2</em>'.
   * @generated
   */
  OrdSql2 createOrdSql2();

  /**
   * Returns a new object of class '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column</em>'.
   * @generated
   */
  Column createColumn();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identifier</em>'.
   * @generated
   */
  Identifier createIdentifier();

  /**
   * Returns a new object of class '<em>Database Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Column</em>'.
   * @generated
   */
  DatabaseColumn createDatabaseColumn();

  /**
   * Returns a new object of class '<em>Database Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Table</em>'.
   * @generated
   */
  DatabaseTable createDatabaseTable();

  /**
   * Returns a new object of class '<em>Mapping Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Rule</em>'.
   * @generated
   */
  MappingRule createMappingRule();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns a new object of class '<em>Mapping Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Item</em>'.
   * @generated
   */
  MappingItem createMappingItem();

  /**
   * Returns a new object of class '<em>Mapping Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Column</em>'.
   * @generated
   */
  MappingColumn createMappingColumn();

  /**
   * Returns a new object of class '<em>Optional Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional Feature</em>'.
   * @generated
   */
  OptionalFeature createOptionalFeature();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ProcessorDslPackage getProcessorDslPackage();

} //ProcessorDslFactory
