/*
* generated by Xtext
*/
package org.sqlproc.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.sqlproc.dsl.services.ProcessorDslGrammarAccess;

public class ProcessorDslParser extends AbstractContentAssistParser {
	
	@Inject
	private ProcessorDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.sqlproc.dsl.ui.contentassist.antlr.internal.InternalProcessorDslParser createParser() {
		org.sqlproc.dsl.ui.contentassist.antlr.internal.InternalProcessorDslParser result = new org.sqlproc.dsl.ui.contentassist.antlr.internal.InternalProcessorDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getArtifactsAccess().getAlternatives_1(), "rule__Artifacts__Alternatives_1");
					put(grammarAccess.getPropertyAccess().getAlternatives_0(), "rule__Property__Alternatives_0");
					put(grammarAccess.getPropertyValueAccess().getAlternatives_0(), "rule__PropertyValue__Alternatives_0");
					put(grammarAccess.getPropertyValueAccess().getAlternatives_1_0(), "rule__PropertyValue__Alternatives_1_0");
					put(grammarAccess.getPojoDefinitionAccess().getClassAlternatives_2_0(), "rule__PojoDefinition__ClassAlternatives_2_0");
					put(grammarAccess.getPojoUsageAccess().getAlternatives(), "rule__PojoUsage__Alternatives");
					put(grammarAccess.getSqlFragmentAccess().getAlternatives(), "rule__SqlFragment__Alternatives");
					put(grammarAccess.getSqlFragmentAccess().getAlternatives_5_1(), "rule__SqlFragment__Alternatives_5_1");
					put(grammarAccess.getSqlValueAccess().getAlternatives_0(), "rule__SqlValue__Alternatives_0");
					put(grammarAccess.getSqlValueAccess().getAlternatives_1_0(), "rule__SqlValue__Alternatives_1_0");
					put(grammarAccess.getMetaSqlAccess().getAlternatives(), "rule__MetaSql__Alternatives");
					put(grammarAccess.getIfSqlFragmentAccess().getAlternatives(), "rule__IfSqlFragment__Alternatives");
					put(grammarAccess.getIfSqlFragmentAccess().getAlternatives_4_1(), "rule__IfSqlFragment__Alternatives_4_1");
					put(grammarAccess.getIfSqlValueAccess().getAlternatives_0(), "rule__IfSqlValue__Alternatives_0");
					put(grammarAccess.getIfSqlValueAccess().getAlternatives_1_0(), "rule__IfSqlValue__Alternatives_1_0");
					put(grammarAccess.getIfMetaSqlAccess().getAlternatives(), "rule__IfMetaSql__Alternatives");
					put(grammarAccess.getIfSqlCondAccess().getOperAlternatives_3_0_0(), "rule__IfSqlCond__OperAlternatives_3_0_0");
					put(grammarAccess.getIfSqlBoolAccess().getAlternatives(), "rule__IfSqlBool__Alternatives");
					put(grammarAccess.getOrdSql2Access().getAlternatives(), "rule__OrdSql2__Alternatives");
					put(grammarAccess.getOrdSqlValueAccess().getAlternatives_0(), "rule__OrdSqlValue__Alternatives_0");
					put(grammarAccess.getOrdSqlValueAccess().getAlternatives_1_0(), "rule__OrdSqlValue__Alternatives_1_0");
					put(grammarAccess.getColumnAccess().getNameAlternatives_0_0(), "rule__Column__NameAlternatives_0_0");
					put(grammarAccess.getColumnAccess().getValsAlternatives_1_2_1_0(), "rule__Column__ValsAlternatives_1_2_1_0");
					put(grammarAccess.getConstantAccess().getCaseAlternatives_0_0(), "rule__Constant__CaseAlternatives_0_0");
					put(grammarAccess.getConstantAccess().getNameAlternatives_1_0(), "rule__Constant__NameAlternatives_1_0");
					put(grammarAccess.getConstantAccess().getValsAlternatives_2_2_1_0(), "rule__Constant__ValsAlternatives_2_2_1_0");
					put(grammarAccess.getIdentifierAccess().getModeAlternatives_0_0(), "rule__Identifier__ModeAlternatives_0_0");
					put(grammarAccess.getIdentifierAccess().getCaseAlternatives_1_0(), "rule__Identifier__CaseAlternatives_1_0");
					put(grammarAccess.getIdentifierAccess().getNameAlternatives_2_0(), "rule__Identifier__NameAlternatives_2_0");
					put(grammarAccess.getIdentifierAccess().getValsAlternatives_3_2_1_0(), "rule__Identifier__ValsAlternatives_3_2_1_0");
					put(grammarAccess.getDatabaseColumnAccess().getNameAlternatives_0(), "rule__DatabaseColumn__NameAlternatives_0");
					put(grammarAccess.getDatabaseTableAccess().getNameAlternatives_0(), "rule__DatabaseTable__NameAlternatives_0");
					put(grammarAccess.getMappingItemAccess().getColAlternatives_0_0(), "rule__MappingItem__ColAlternatives_0_0");
					put(grammarAccess.getMappingColumnAccess().getNameAlternatives_0_0(), "rule__MappingColumn__NameAlternatives_0_0");
					put(grammarAccess.getMappingColumnAccess().getValsAlternatives_1_1_0(), "rule__MappingColumn__ValsAlternatives_1_1_0");
					put(grammarAccess.getFeatureValueAccess().getAlternatives(), "rule__FeatureValue__Alternatives");
					put(grammarAccess.getArtifactsAccess().getGroup(), "rule__Artifacts__Group__0");
					put(grammarAccess.getArtifactsAccess().getGroup_1_0(), "rule__Artifacts__Group_1_0__0");
					put(grammarAccess.getArtifactsAccess().getGroup_1_1(), "rule__Artifacts__Group_1_1__0");
					put(grammarAccess.getArtifactsAccess().getGroup_1_2(), "rule__Artifacts__Group_1_2__0");
					put(grammarAccess.getArtifactsAccess().getGroup_1_3(), "rule__Artifacts__Group_1_3__0");
					put(grammarAccess.getArtifactsAccess().getGroup_1_4(), "rule__Artifacts__Group_1_4__0");
					put(grammarAccess.getArtifactsAccess().getGroup_1_5(), "rule__Artifacts__Group_1_5__0");
					put(grammarAccess.getArtifactsAccess().getGroup_1_6(), "rule__Artifacts__Group_1_6__0");
					put(grammarAccess.getArtifactsAccess().getGroup_1_7(), "rule__Artifacts__Group_1_7__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getPropertyAccess().getGroup_0_0(), "rule__Property__Group_0_0__0");
					put(grammarAccess.getPropertyAccess().getGroup_0_1(), "rule__Property__Group_0_1__0");
					put(grammarAccess.getPropertyAccess().getGroup_0_2(), "rule__Property__Group_0_2__0");
					put(grammarAccess.getPropertyAccess().getGroup_0_3(), "rule__Property__Group_0_3__0");
					put(grammarAccess.getPropertyAccess().getGroup_0_4(), "rule__Property__Group_0_4__0");
					put(grammarAccess.getPropertyAccess().getGroup_0_5(), "rule__Property__Group_0_5__0");
					put(grammarAccess.getPropertyAccess().getGroup_0_6(), "rule__Property__Group_0_6__0");
					put(grammarAccess.getPropertyValueAccess().getGroup(), "rule__PropertyValue__Group__0");
					put(grammarAccess.getPropertyValueAccess().getGroup_1(), "rule__PropertyValue__Group_1__0");
					put(grammarAccess.getPojoDefinitionAccess().getGroup(), "rule__PojoDefinition__Group__0");
					put(grammarAccess.getColumnUsageAccess().getGroup(), "rule__ColumnUsage__Group__0");
					put(grammarAccess.getIdentifierUsageAccess().getGroup(), "rule__IdentifierUsage__Group__0");
					put(grammarAccess.getConstantUsageAccess().getGroup(), "rule__ConstantUsage__Group__0");
					put(grammarAccess.getMappingUsageAccess().getGroup(), "rule__MappingUsage__Group__0");
					put(grammarAccess.getTableDefinitionAccess().getGroup(), "rule__TableDefinition__Group__0");
					put(grammarAccess.getTableUsageAccess().getGroup(), "rule__TableUsage__Group__0");
					put(grammarAccess.getTableUsageAccess().getGroup_3(), "rule__TableUsage__Group_3__0");
					put(grammarAccess.getMetaStatementAccess().getGroup(), "rule__MetaStatement__Group__0");
					put(grammarAccess.getMetaStatementAccess().getGroup_3(), "rule__MetaStatement__Group_3__0");
					put(grammarAccess.getSqlFragmentAccess().getGroup_1(), "rule__SqlFragment__Group_1__0");
					put(grammarAccess.getSqlFragmentAccess().getGroup_2(), "rule__SqlFragment__Group_2__0");
					put(grammarAccess.getSqlFragmentAccess().getGroup_3(), "rule__SqlFragment__Group_3__0");
					put(grammarAccess.getSqlFragmentAccess().getGroup_4(), "rule__SqlFragment__Group_4__0");
					put(grammarAccess.getSqlFragmentAccess().getGroup_5(), "rule__SqlFragment__Group_5__0");
					put(grammarAccess.getSqlFragmentAccess().getGroup_5_1_0(), "rule__SqlFragment__Group_5_1_0__0");
					put(grammarAccess.getSqlValueAccess().getGroup(), "rule__SqlValue__Group__0");
					put(grammarAccess.getSqlValueAccess().getGroup_1(), "rule__SqlValue__Group_1__0");
					put(grammarAccess.getMetaSqlAccess().getGroup_0(), "rule__MetaSql__Group_0__0");
					put(grammarAccess.getMetaSqlAccess().getGroup_0_2(), "rule__MetaSql__Group_0_2__0");
					put(grammarAccess.getMetaSqlAccess().getGroup_1(), "rule__MetaSql__Group_1__0");
					put(grammarAccess.getMetaSqlAccess().getGroup_1_4(), "rule__MetaSql__Group_1_4__0");
					put(grammarAccess.getMetaSqlAccess().getGroup_2(), "rule__MetaSql__Group_2__0");
					put(grammarAccess.getMetaSqlAccess().getGroup_2_2(), "rule__MetaSql__Group_2_2__0");
					put(grammarAccess.getMetaSqlAccess().getGroup_3(), "rule__MetaSql__Group_3__0");
					put(grammarAccess.getMetaSqlAccess().getGroup_3_2(), "rule__MetaSql__Group_3_2__0");
					put(grammarAccess.getMetaSqlAccess().getGroup_4(), "rule__MetaSql__Group_4__0");
					put(grammarAccess.getMetaSqlAccess().getGroup_5(), "rule__MetaSql__Group_5__0");
					put(grammarAccess.getIfSqlFragmentAccess().getGroup_1(), "rule__IfSqlFragment__Group_1__0");
					put(grammarAccess.getIfSqlFragmentAccess().getGroup_2(), "rule__IfSqlFragment__Group_2__0");
					put(grammarAccess.getIfSqlFragmentAccess().getGroup_3(), "rule__IfSqlFragment__Group_3__0");
					put(grammarAccess.getIfSqlFragmentAccess().getGroup_4(), "rule__IfSqlFragment__Group_4__0");
					put(grammarAccess.getIfSqlFragmentAccess().getGroup_4_1_0(), "rule__IfSqlFragment__Group_4_1_0__0");
					put(grammarAccess.getIfSqlFragmentAccess().getGroup_5(), "rule__IfSqlFragment__Group_5__0");
					put(grammarAccess.getIfSqlValueAccess().getGroup(), "rule__IfSqlValue__Group__0");
					put(grammarAccess.getIfSqlValueAccess().getGroup_1(), "rule__IfSqlValue__Group_1__0");
					put(grammarAccess.getIfMetaSqlAccess().getGroup_0(), "rule__IfMetaSql__Group_0__0");
					put(grammarAccess.getIfMetaSqlAccess().getGroup_0_2(), "rule__IfMetaSql__Group_0_2__0");
					put(grammarAccess.getIfMetaSqlAccess().getGroup_1(), "rule__IfMetaSql__Group_1__0");
					put(grammarAccess.getIfMetaSqlAccess().getGroup_1_4(), "rule__IfMetaSql__Group_1_4__0");
					put(grammarAccess.getIfMetaSqlAccess().getGroup_2(), "rule__IfMetaSql__Group_2__0");
					put(grammarAccess.getIfMetaSqlAccess().getGroup_2_2(), "rule__IfMetaSql__Group_2_2__0");
					put(grammarAccess.getIfMetaSqlAccess().getGroup_3(), "rule__IfMetaSql__Group_3__0");
					put(grammarAccess.getIfMetaSqlAccess().getGroup_3_2(), "rule__IfMetaSql__Group_3_2__0");
					put(grammarAccess.getIfSqlCondAccess().getGroup(), "rule__IfSqlCond__Group__0");
					put(grammarAccess.getIfSqlCondAccess().getGroup_3(), "rule__IfSqlCond__Group_3__0");
					put(grammarAccess.getIfSqlBoolAccess().getGroup_0(), "rule__IfSqlBool__Group_0__0");
					put(grammarAccess.getIfSqlBoolAccess().getGroup_1(), "rule__IfSqlBool__Group_1__0");
					put(grammarAccess.getIfSqlBoolAccess().getGroup_2(), "rule__IfSqlBool__Group_2__0");
					put(grammarAccess.getOrdSql2Access().getGroup_1(), "rule__OrdSql2__Group_1__0");
					put(grammarAccess.getOrdSql2Access().getGroup_2(), "rule__OrdSql2__Group_2__0");
					put(grammarAccess.getOrdSql2Access().getGroup_3(), "rule__OrdSql2__Group_3__0");
					put(grammarAccess.getOrdSqlValueAccess().getGroup(), "rule__OrdSqlValue__Group__0");
					put(grammarAccess.getOrdSqlValueAccess().getGroup_1(), "rule__OrdSqlValue__Group_1__0");
					put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
					put(grammarAccess.getColumnAccess().getGroup_1(), "rule__Column__Group_1__0");
					put(grammarAccess.getColumnAccess().getGroup_1_2(), "rule__Column__Group_1_2__0");
					put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
					put(grammarAccess.getConstantAccess().getGroup_2(), "rule__Constant__Group_2__0");
					put(grammarAccess.getConstantAccess().getGroup_2_2(), "rule__Constant__Group_2_2__0");
					put(grammarAccess.getIdentifierAccess().getGroup(), "rule__Identifier__Group__0");
					put(grammarAccess.getIdentifierAccess().getGroup_3(), "rule__Identifier__Group_3__0");
					put(grammarAccess.getIdentifierAccess().getGroup_3_2(), "rule__Identifier__Group_3_2__0");
					put(grammarAccess.getMappingRuleAccess().getGroup(), "rule__MappingRule__Group__0");
					put(grammarAccess.getMappingRuleAccess().getGroup_3(), "rule__MappingRule__Group_3__0");
					put(grammarAccess.getMappingAccess().getGroup(), "rule__Mapping__Group__0");
					put(grammarAccess.getMappingAccess().getGroup_2(), "rule__Mapping__Group_2__0");
					put(grammarAccess.getMappingItemAccess().getGroup(), "rule__MappingItem__Group__0");
					put(grammarAccess.getMappingItemAccess().getGroup_1(), "rule__MappingItem__Group_1__0");
					put(grammarAccess.getMappingItemAccess().getGroup_1_2(), "rule__MappingItem__Group_1_2__0");
					put(grammarAccess.getMappingColumnAccess().getGroup(), "rule__MappingColumn__Group__0");
					put(grammarAccess.getMappingColumnAccess().getGroup_1(), "rule__MappingColumn__Group_1__0");
					put(grammarAccess.getOptionalFeatureAccess().getGroup(), "rule__OptionalFeature__Group__0");
					put(grammarAccess.getOptionalFeatureAccess().getGroup_3(), "rule__OptionalFeature__Group_3__0");
					put(grammarAccess.getArtifactsAccess().getFeaturesAssignment_1_0_0(), "rule__Artifacts__FeaturesAssignment_1_0_0");
					put(grammarAccess.getArtifactsAccess().getStatementsAssignment_1_1_0(), "rule__Artifacts__StatementsAssignment_1_1_0");
					put(grammarAccess.getArtifactsAccess().getMappingsAssignment_1_2_0(), "rule__Artifacts__MappingsAssignment_1_2_0");
					put(grammarAccess.getArtifactsAccess().getPojosAssignment_1_3_0(), "rule__Artifacts__PojosAssignment_1_3_0");
					put(grammarAccess.getArtifactsAccess().getUsagesAssignment_1_4_0(), "rule__Artifacts__UsagesAssignment_1_4_0");
					put(grammarAccess.getArtifactsAccess().getPropertiesAssignment_1_5_0(), "rule__Artifacts__PropertiesAssignment_1_5_0");
					put(grammarAccess.getArtifactsAccess().getTablesAssignment_1_6_0(), "rule__Artifacts__TablesAssignment_1_6_0");
					put(grammarAccess.getArtifactsAccess().getTableUsagesAssignment_1_7_0(), "rule__Artifacts__TableUsagesAssignment_1_7_0");
					put(grammarAccess.getPropertyAccess().getNameAssignment_0_0_0(), "rule__Property__NameAssignment_0_0_0");
					put(grammarAccess.getPropertyAccess().getDoResolvePojoAssignment_0_0_2(), "rule__Property__DoResolvePojoAssignment_0_0_2");
					put(grammarAccess.getPropertyAccess().getNameAssignment_0_1_0(), "rule__Property__NameAssignment_0_1_0");
					put(grammarAccess.getPropertyAccess().getDoResolveDbAssignment_0_1_2(), "rule__Property__DoResolveDbAssignment_0_1_2");
					put(grammarAccess.getPropertyAccess().getNameAssignment_0_2_0(), "rule__Property__NameAssignment_0_2_0");
					put(grammarAccess.getPropertyAccess().getDbUrlAssignment_0_2_2(), "rule__Property__DbUrlAssignment_0_2_2");
					put(grammarAccess.getPropertyAccess().getNameAssignment_0_3_0(), "rule__Property__NameAssignment_0_3_0");
					put(grammarAccess.getPropertyAccess().getDbUsernameAssignment_0_3_2(), "rule__Property__DbUsernameAssignment_0_3_2");
					put(grammarAccess.getPropertyAccess().getNameAssignment_0_4_0(), "rule__Property__NameAssignment_0_4_0");
					put(grammarAccess.getPropertyAccess().getDbPasswordAssignment_0_4_2(), "rule__Property__DbPasswordAssignment_0_4_2");
					put(grammarAccess.getPropertyAccess().getNameAssignment_0_5_0(), "rule__Property__NameAssignment_0_5_0");
					put(grammarAccess.getPropertyAccess().getDbSchemaAssignment_0_5_2(), "rule__Property__DbSchemaAssignment_0_5_2");
					put(grammarAccess.getPropertyAccess().getNameAssignment_0_6_0(), "rule__Property__NameAssignment_0_6_0");
					put(grammarAccess.getPropertyAccess().getDbDriverAssignment_0_6_2(), "rule__Property__DbDriverAssignment_0_6_2");
					put(grammarAccess.getPojoDefinitionAccess().getNameAssignment_1(), "rule__PojoDefinition__NameAssignment_1");
					put(grammarAccess.getPojoDefinitionAccess().getClassAssignment_2(), "rule__PojoDefinition__ClassAssignment_2");
					put(grammarAccess.getColumnUsageAccess().getStatementAssignment_1(), "rule__ColumnUsage__StatementAssignment_1");
					put(grammarAccess.getColumnUsageAccess().getPojoAssignment_2(), "rule__ColumnUsage__PojoAssignment_2");
					put(grammarAccess.getIdentifierUsageAccess().getStatementAssignment_1(), "rule__IdentifierUsage__StatementAssignment_1");
					put(grammarAccess.getIdentifierUsageAccess().getPojoAssignment_2(), "rule__IdentifierUsage__PojoAssignment_2");
					put(grammarAccess.getConstantUsageAccess().getStatementAssignment_1(), "rule__ConstantUsage__StatementAssignment_1");
					put(grammarAccess.getConstantUsageAccess().getPojoAssignment_2(), "rule__ConstantUsage__PojoAssignment_2");
					put(grammarAccess.getMappingUsageAccess().getStatementAssignment_1(), "rule__MappingUsage__StatementAssignment_1");
					put(grammarAccess.getMappingUsageAccess().getPojoAssignment_2(), "rule__MappingUsage__PojoAssignment_2");
					put(grammarAccess.getTableDefinitionAccess().getNameAssignment_1(), "rule__TableDefinition__NameAssignment_1");
					put(grammarAccess.getTableDefinitionAccess().getTableAssignment_2(), "rule__TableDefinition__TableAssignment_2");
					put(grammarAccess.getTableUsageAccess().getStatementAssignment_1(), "rule__TableUsage__StatementAssignment_1");
					put(grammarAccess.getTableUsageAccess().getTableAssignment_2(), "rule__TableUsage__TableAssignment_2");
					put(grammarAccess.getTableUsageAccess().getPrefixAssignment_3_1(), "rule__TableUsage__PrefixAssignment_3_1");
					put(grammarAccess.getMetaStatementAccess().getNameAssignment_0(), "rule__MetaStatement__NameAssignment_0");
					put(grammarAccess.getMetaStatementAccess().getTypeAssignment_2(), "rule__MetaStatement__TypeAssignment_2");
					put(grammarAccess.getMetaStatementAccess().getFiltersAssignment_3_1(), "rule__MetaStatement__FiltersAssignment_3_1");
					put(grammarAccess.getMetaStatementAccess().getStatementAssignment_6(), "rule__MetaStatement__StatementAssignment_6");
					put(grammarAccess.getSqlAccess().getSqlsAssignment(), "rule__Sql__SqlsAssignment");
					put(grammarAccess.getSqlFragmentAccess().getValueAssignment_0(), "rule__SqlFragment__ValueAssignment_0");
					put(grammarAccess.getSqlFragmentAccess().getColAssignment_1_1(), "rule__SqlFragment__ColAssignment_1_1");
					put(grammarAccess.getSqlFragmentAccess().getCnstAssignment_2_1(), "rule__SqlFragment__CnstAssignment_2_1");
					put(grammarAccess.getSqlFragmentAccess().getIdentAssignment_3_1(), "rule__SqlFragment__IdentAssignment_3_1");
					put(grammarAccess.getSqlFragmentAccess().getMetaAssignment_4_1(), "rule__SqlFragment__MetaAssignment_4_1");
					put(grammarAccess.getSqlFragmentAccess().getDbtabAssignment_5_1_0_1(), "rule__SqlFragment__DbtabAssignment_5_1_0_1");
					put(grammarAccess.getSqlFragmentAccess().getDbcolAssignment_5_1_1(), "rule__SqlFragment__DbcolAssignment_5_1_1");
					put(grammarAccess.getMetaSqlAccess().getIfsAssignment_0_1(), "rule__MetaSql__IfsAssignment_0_1");
					put(grammarAccess.getMetaSqlAccess().getIfsAssignment_0_2_1(), "rule__MetaSql__IfsAssignment_0_2_1");
					put(grammarAccess.getMetaSqlAccess().getTypeAssignment_1_0(), "rule__MetaSql__TypeAssignment_1_0");
					put(grammarAccess.getMetaSqlAccess().getCondAssignment_1_1(), "rule__MetaSql__CondAssignment_1_1");
					put(grammarAccess.getMetaSqlAccess().getIfsAssignment_1_3(), "rule__MetaSql__IfsAssignment_1_3");
					put(grammarAccess.getMetaSqlAccess().getIfsAssignment_1_4_1(), "rule__MetaSql__IfsAssignment_1_4_1");
					put(grammarAccess.getMetaSqlAccess().getTypeAssignment_2_0(), "rule__MetaSql__TypeAssignment_2_0");
					put(grammarAccess.getMetaSqlAccess().getIfsAssignment_2_1(), "rule__MetaSql__IfsAssignment_2_1");
					put(grammarAccess.getMetaSqlAccess().getIfsAssignment_2_2_1(), "rule__MetaSql__IfsAssignment_2_2_1");
					put(grammarAccess.getMetaSqlAccess().getTypeAssignment_3_0(), "rule__MetaSql__TypeAssignment_3_0");
					put(grammarAccess.getMetaSqlAccess().getIfsAssignment_3_1(), "rule__MetaSql__IfsAssignment_3_1");
					put(grammarAccess.getMetaSqlAccess().getIfsAssignment_3_2_1(), "rule__MetaSql__IfsAssignment_3_2_1");
					put(grammarAccess.getMetaSqlAccess().getTypeAssignment_4_0(), "rule__MetaSql__TypeAssignment_4_0");
					put(grammarAccess.getMetaSqlAccess().getFtypeAssignment_4_2(), "rule__MetaSql__FtypeAssignment_4_2");
					put(grammarAccess.getMetaSqlAccess().getIfsAssignment_4_3(), "rule__MetaSql__IfsAssignment_4_3");
					put(grammarAccess.getMetaSqlAccess().getTypeAssignment_5_0(), "rule__MetaSql__TypeAssignment_5_0");
					put(grammarAccess.getMetaSqlAccess().getOrdAssignment_5_2(), "rule__MetaSql__OrdAssignment_5_2");
					put(grammarAccess.getIfSqlAccess().getSqlsAssignment(), "rule__IfSql__SqlsAssignment");
					put(grammarAccess.getIfSqlFragmentAccess().getValueAssignment_0(), "rule__IfSqlFragment__ValueAssignment_0");
					put(grammarAccess.getIfSqlFragmentAccess().getColAssignment_1_1(), "rule__IfSqlFragment__ColAssignment_1_1");
					put(grammarAccess.getIfSqlFragmentAccess().getCnstAssignment_2_1(), "rule__IfSqlFragment__CnstAssignment_2_1");
					put(grammarAccess.getIfSqlFragmentAccess().getIdentAssignment_3_1(), "rule__IfSqlFragment__IdentAssignment_3_1");
					put(grammarAccess.getIfSqlFragmentAccess().getDbtabAssignment_4_1_0_1(), "rule__IfSqlFragment__DbtabAssignment_4_1_0_1");
					put(grammarAccess.getIfSqlFragmentAccess().getDbcolAssignment_4_1_1(), "rule__IfSqlFragment__DbcolAssignment_4_1_1");
					put(grammarAccess.getIfSqlFragmentAccess().getMetaAssignment_5_1(), "rule__IfSqlFragment__MetaAssignment_5_1");
					put(grammarAccess.getIfMetaSqlAccess().getIfsAssignment_0_1(), "rule__IfMetaSql__IfsAssignment_0_1");
					put(grammarAccess.getIfMetaSqlAccess().getIfsAssignment_0_2_1(), "rule__IfMetaSql__IfsAssignment_0_2_1");
					put(grammarAccess.getIfMetaSqlAccess().getTypeAssignment_1_0(), "rule__IfMetaSql__TypeAssignment_1_0");
					put(grammarAccess.getIfMetaSqlAccess().getCondAssignment_1_1(), "rule__IfMetaSql__CondAssignment_1_1");
					put(grammarAccess.getIfMetaSqlAccess().getIfsAssignment_1_3(), "rule__IfMetaSql__IfsAssignment_1_3");
					put(grammarAccess.getIfMetaSqlAccess().getIfsAssignment_1_4_1(), "rule__IfMetaSql__IfsAssignment_1_4_1");
					put(grammarAccess.getIfMetaSqlAccess().getTypeAssignment_2_0(), "rule__IfMetaSql__TypeAssignment_2_0");
					put(grammarAccess.getIfMetaSqlAccess().getIfsAssignment_2_1(), "rule__IfMetaSql__IfsAssignment_2_1");
					put(grammarAccess.getIfMetaSqlAccess().getIfsAssignment_2_2_1(), "rule__IfMetaSql__IfsAssignment_2_2_1");
					put(grammarAccess.getIfMetaSqlAccess().getTypeAssignment_3_0(), "rule__IfMetaSql__TypeAssignment_3_0");
					put(grammarAccess.getIfMetaSqlAccess().getIfsAssignment_3_1(), "rule__IfMetaSql__IfsAssignment_3_1");
					put(grammarAccess.getIfMetaSqlAccess().getIfsAssignment_3_2_1(), "rule__IfMetaSql__IfsAssignment_3_2_1");
					put(grammarAccess.getIfSqlCondAccess().getBool1Assignment_1(), "rule__IfSqlCond__Bool1Assignment_1");
					put(grammarAccess.getIfSqlCondAccess().getOperAssignment_3_0(), "rule__IfSqlCond__OperAssignment_3_0");
					put(grammarAccess.getIfSqlCondAccess().getBool2Assignment_3_2(), "rule__IfSqlCond__Bool2Assignment_3_2");
					put(grammarAccess.getIfSqlBoolAccess().getNotAssignment_0_0(), "rule__IfSqlBool__NotAssignment_0_0");
					put(grammarAccess.getIfSqlBoolAccess().getCnstAssignment_0_2(), "rule__IfSqlBool__CnstAssignment_0_2");
					put(grammarAccess.getIfSqlBoolAccess().getNotAssignment_1_0(), "rule__IfSqlBool__NotAssignment_1_0");
					put(grammarAccess.getIfSqlBoolAccess().getIdentAssignment_1_2(), "rule__IfSqlBool__IdentAssignment_1_2");
					put(grammarAccess.getIfSqlBoolAccess().getNotAssignment_2_0(), "rule__IfSqlBool__NotAssignment_2_0");
					put(grammarAccess.getIfSqlBoolAccess().getCondAssignment_2_2(), "rule__IfSqlBool__CondAssignment_2_2");
					put(grammarAccess.getOrdSqlAccess().getSqlsAssignment(), "rule__OrdSql__SqlsAssignment");
					put(grammarAccess.getOrdSql2Access().getValueAssignment_0(), "rule__OrdSql2__ValueAssignment_0");
					put(grammarAccess.getOrdSql2Access().getCnstAssignment_1_1(), "rule__OrdSql2__CnstAssignment_1_1");
					put(grammarAccess.getOrdSql2Access().getIdentAssignment_2_1(), "rule__OrdSql2__IdentAssignment_2_1");
					put(grammarAccess.getOrdSql2Access().getDbcolAssignment_3_1(), "rule__OrdSql2__DbcolAssignment_3_1");
					put(grammarAccess.getColumnAccess().getNameAssignment_0(), "rule__Column__NameAssignment_0");
					put(grammarAccess.getColumnAccess().getTypeAssignment_1_1(), "rule__Column__TypeAssignment_1_1");
					put(grammarAccess.getColumnAccess().getValsAssignment_1_2_1(), "rule__Column__ValsAssignment_1_2_1");
					put(grammarAccess.getConstantAccess().getCaseAssignment_0(), "rule__Constant__CaseAssignment_0");
					put(grammarAccess.getConstantAccess().getNameAssignment_1(), "rule__Constant__NameAssignment_1");
					put(grammarAccess.getConstantAccess().getTypeAssignment_2_1(), "rule__Constant__TypeAssignment_2_1");
					put(grammarAccess.getConstantAccess().getValsAssignment_2_2_1(), "rule__Constant__ValsAssignment_2_2_1");
					put(grammarAccess.getIdentifierAccess().getModeAssignment_0(), "rule__Identifier__ModeAssignment_0");
					put(grammarAccess.getIdentifierAccess().getCaseAssignment_1(), "rule__Identifier__CaseAssignment_1");
					put(grammarAccess.getIdentifierAccess().getNameAssignment_2(), "rule__Identifier__NameAssignment_2");
					put(grammarAccess.getIdentifierAccess().getTypeAssignment_3_1(), "rule__Identifier__TypeAssignment_3_1");
					put(grammarAccess.getIdentifierAccess().getValsAssignment_3_2_1(), "rule__Identifier__ValsAssignment_3_2_1");
					put(grammarAccess.getDatabaseColumnAccess().getNameAssignment(), "rule__DatabaseColumn__NameAssignment");
					put(grammarAccess.getDatabaseTableAccess().getNameAssignment(), "rule__DatabaseTable__NameAssignment");
					put(grammarAccess.getMappingRuleAccess().getNameAssignment_0(), "rule__MappingRule__NameAssignment_0");
					put(grammarAccess.getMappingRuleAccess().getTypeAssignment_2(), "rule__MappingRule__TypeAssignment_2");
					put(grammarAccess.getMappingRuleAccess().getFiltersAssignment_3_1(), "rule__MappingRule__FiltersAssignment_3_1");
					put(grammarAccess.getMappingRuleAccess().getMappingAssignment_6(), "rule__MappingRule__MappingAssignment_6");
					put(grammarAccess.getMappingAccess().getMappingItemsAssignment_1(), "rule__Mapping__MappingItemsAssignment_1");
					put(grammarAccess.getMappingAccess().getMappingItemsAssignment_2_1(), "rule__Mapping__MappingItemsAssignment_2_1");
					put(grammarAccess.getMappingItemAccess().getColAssignment_0(), "rule__MappingItem__ColAssignment_0");
					put(grammarAccess.getMappingItemAccess().getTypeAssignment_1_1(), "rule__MappingItem__TypeAssignment_1_1");
					put(grammarAccess.getMappingItemAccess().getAttrAssignment_1_2_1(), "rule__MappingItem__AttrAssignment_1_2_1");
					put(grammarAccess.getMappingColumnAccess().getNameAssignment_0(), "rule__MappingColumn__NameAssignment_0");
					put(grammarAccess.getMappingColumnAccess().getValsAssignment_1_1(), "rule__MappingColumn__ValsAssignment_1_1");
					put(grammarAccess.getOptionalFeatureAccess().getNameAssignment_0(), "rule__OptionalFeature__NameAssignment_0");
					put(grammarAccess.getOptionalFeatureAccess().getTypeAssignment_2(), "rule__OptionalFeature__TypeAssignment_2");
					put(grammarAccess.getOptionalFeatureAccess().getFiltersAssignment_3_1(), "rule__OptionalFeature__FiltersAssignment_3_1");
					put(grammarAccess.getOptionalFeatureAccess().getOptionAssignment_6(), "rule__OptionalFeature__OptionAssignment_6");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.sqlproc.dsl.ui.contentassist.antlr.internal.InternalProcessorDslParser typedParser = (org.sqlproc.dsl.ui.contentassist.antlr.internal.InternalProcessorDslParser) parser;
			typedParser.entryRuleArtifacts();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ProcessorDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ProcessorDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
