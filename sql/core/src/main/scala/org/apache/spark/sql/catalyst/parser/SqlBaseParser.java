// Generated from org/apache/spark/sql/catalyst/parser/SqlBase.g4 by ANTLR 4.8
package org.apache.spark.sql.catalyst.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ADD=12, AFTER=13, ALL=14, ALTER=15, ANALYZE=16, AND=17, 
		ANTI=18, ANY=19, ARCHIVE=20, ARRAY=21, AS=22, ASC=23, AT=24, AUTHORIZATION=25, 
		BETWEEN=26, BOTH=27, BUCKET=28, BUCKETS=29, BY=30, CACHE=31, CASCADE=32, 
		CASE=33, CAST=34, CHANGE=35, CHECK=36, CLEAR=37, CLUSTER=38, CLUSTERED=39, 
		CODEGEN=40, COLLATE=41, COLLECTION=42, COLUMN=43, COLUMNS=44, COMMENT=45, 
		COMMIT=46, COMPACT=47, COMPACTIONS=48, COMPUTE=49, CONCATENATE=50, CONSTRAINT=51, 
		COST=52, CREATE=53, CROSS=54, CUBE=55, CURRENT=56, CURRENT_DATE=57, CURRENT_TIME=58, 
		CURRENT_TIMESTAMP=59, CURRENT_USER=60, DAY=61, DATA=62, DATABASE=63, DATABASES=64, 
		DBPROPERTIES=65, DEFINED=66, DELETE=67, DELIMITED=68, DESC=69, DESCRIBE=70, 
		DFS=71, DIRECTORIES=72, DIRECTORY=73, DISTINCT=74, DISTRIBUTE=75, DIV=76, 
		DROP=77, ELSE=78, END=79, ESCAPE=80, ESCAPED=81, EXCEPT=82, EXCHANGE=83, 
		EXISTS=84, EXPLAIN=85, EXPORT=86, EXTENDED=87, EXTERNAL=88, EXTRACT=89, 
		FALSE=90, FETCH=91, FIELDS=92, FILTER=93, FILEFORMAT=94, FIRST=95, FOLLOWING=96, 
		FOR=97, FOREIGN=98, FORMAT=99, FORMATTED=100, FROM=101, FULL=102, FUNCTION=103, 
		FUNCTIONS=104, GLOBAL=105, GRANT=106, GROUP=107, GROUPING=108, HAVING=109, 
		HOUR=110, IF=111, IGNORE=112, IMPORT=113, IN=114, INDEX=115, INDEXES=116, 
		INNER=117, INPATH=118, INPUTFORMAT=119, INSERT=120, INTERSECT=121, INTERVAL=122, 
		INTO=123, IS=124, ITEMS=125, JOIN=126, KEYS=127, LAST=128, LATERAL=129, 
		LAZY=130, LEADING=131, LEFT=132, LIKE=133, LIMIT=134, LINES=135, LIST=136, 
		LOAD=137, LOCAL=138, LOCATION=139, LOCK=140, LOCKS=141, LOGICAL=142, MACRO=143, 
		MAP=144, MATCHED=145, MERGE=146, MINUTE=147, MONTH=148, MSCK=149, NAMESPACE=150, 
		NAMESPACES=151, NATURAL=152, NO=153, NOT=154, NULL=155, NULLS=156, OF=157, 
		ON=158, ONLY=159, OPTION=160, OPTIONS=161, OR=162, ORDER=163, OUT=164, 
		OUTER=165, OUTPUTFORMAT=166, OVER=167, OVERLAPS=168, OVERLAY=169, OVERWRITE=170, 
		PARTITION=171, PARTITIONED=172, PARTITIONS=173, PERCENTLIT=174, PIVOT=175, 
		PLACING=176, POSITION=177, PRECEDING=178, PRIMARY=179, PRINCIPALS=180, 
		PROPERTIES=181, PURGE=182, QUERY=183, RANGE=184, RECORDREADER=185, RECORDWRITER=186, 
		RECOVER=187, REDUCE=188, REFERENCES=189, REFRESH=190, RENAME=191, REPAIR=192, 
		REPLACE=193, RESET=194, RESPECT=195, RESTRICT=196, REVOKE=197, RIGHT=198, 
		RLIKE=199, ROLE=200, ROLES=201, ROLLBACK=202, ROLLUP=203, ROW=204, ROWS=205, 
		SECOND=206, SCHEMA=207, SELECT=208, SEMI=209, SEPARATED=210, SERDE=211, 
		SERDEPROPERTIES=212, SESSION_USER=213, SET=214, SETMINUS=215, SETS=216, 
		SHOW=217, SKEWED=218, SOME=219, SORT=220, SORTED=221, START=222, STATISTICS=223, 
		STORED=224, STRATIFY=225, STRUCT=226, SUBSTR=227, SUBSTRING=228, SYNC=229, 
		TABLE=230, TABLES=231, TABLESAMPLE=232, TBLPROPERTIES=233, TEMPORARY=234, 
		TERMINATED=235, THEN=236, TIME=237, TO=238, TOUCH=239, TRAILING=240, TRANSACTION=241, 
		TRANSACTIONS=242, TRANSFORM=243, TRIM=244, TRUE=245, TRUNCATE=246, TRY_CAST=247, 
		TYPE=248, UNARCHIVE=249, UNBOUNDED=250, UNCACHE=251, UNION=252, UNIQUE=253, 
		UNKNOWN=254, UNLOCK=255, UNSET=256, UPDATE=257, USE=258, USER=259, USING=260, 
		VALUES=261, VIEW=262, VIEWS=263, VERSION=264, WHEN=265, WHERE=266, WINDOW=267, 
		WITH=268, YEAR=269, ZONE=270, EQ=271, NSEQ=272, NEQ=273, NEQJ=274, LT=275, 
		LTE=276, GT=277, GTE=278, PLUS=279, MINUS=280, ASTERISK=281, SLASH=282, 
		PERCENT=283, TILDE=284, AMPERSAND=285, PIPE=286, CONCAT_PIPE=287, HAT=288, 
		STRING=289, BIGINT_LITERAL=290, SMALLINT_LITERAL=291, TINYINT_LITERAL=292, 
		INTEGER_VALUE=293, EXPONENT_VALUE=294, DECIMAL_VALUE=295, FLOAT_LITERAL=296, 
		DOUBLE_LITERAL=297, BIGDECIMAL_LITERAL=298, IDENTIFIER=299, BACKQUOTED_IDENTIFIER=300, 
		SIMPLE_COMMENT=301, BRACKETED_COMMENT=302, WS=303, UNRECOGNIZED=304;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_configKey = 8, RULE_configValue = 9, RULE_unsupportedHiveNativeCommands = 10, 
		RULE_createTableHeader = 11, RULE_replaceTableHeader = 12, RULE_bucketSpec = 13, 
		RULE_skewSpec = 14, RULE_locationSpec = 15, RULE_commentSpec = 16, RULE_query = 17, 
		RULE_insertInto = 18, RULE_partitionSpecLocation = 19, RULE_partitionSpec = 20, 
		RULE_partitionVal = 21, RULE_namespace = 22, RULE_describeFuncName = 23, 
		RULE_describeColName = 24, RULE_ctes = 25, RULE_namedQuery = 26, RULE_tableProvider = 27, 
		RULE_createTableClauses = 28, RULE_tablePropertyList = 29, RULE_tableProperty = 30, 
		RULE_tablePropertyKey = 31, RULE_tablePropertyValue = 32, RULE_constantList = 33, 
		RULE_nestedConstantList = 34, RULE_createFileFormat = 35, RULE_fileFormat = 36, 
		RULE_storageHandler = 37, RULE_resource = 38, RULE_dmlStatementNoWith = 39, 
		RULE_queryOrganization = 40, RULE_multiInsertQueryBody = 41, RULE_queryTerm = 42, 
		RULE_queryPrimary = 43, RULE_sortItem = 44, RULE_fromStatement = 45, RULE_fromStatementBody = 46, 
		RULE_querySpecification = 47, RULE_transformClause = 48, RULE_selectClause = 49, 
		RULE_setClause = 50, RULE_matchedClause = 51, RULE_notMatchedClause = 52, 
		RULE_matchedAction = 53, RULE_notMatchedAction = 54, RULE_assignmentList = 55, 
		RULE_assignment = 56, RULE_whereClause = 57, RULE_havingClause = 58, RULE_hint = 59, 
		RULE_hintStatement = 60, RULE_fromClause = 61, RULE_aggregationClause = 62, 
		RULE_groupByClause = 63, RULE_groupingAnalytics = 64, RULE_groupingElement = 65, 
		RULE_groupingSet = 66, RULE_pivotClause = 67, RULE_pivotColumn = 68, RULE_pivotValue = 69, 
		RULE_lateralView = 70, RULE_setQuantifier = 71, RULE_relation = 72, RULE_joinRelation = 73, 
		RULE_joinType = 74, RULE_joinCriteria = 75, RULE_sample = 76, RULE_sampleMethod = 77, 
		RULE_identifierList = 78, RULE_identifierSeq = 79, RULE_orderedIdentifierList = 80, 
		RULE_orderedIdentifier = 81, RULE_identifierCommentList = 82, RULE_identifierComment = 83, 
		RULE_relationPrimary = 84, RULE_inlineTable = 85, RULE_functionTable = 86, 
		RULE_tableAlias = 87, RULE_rowFormat = 88, RULE_multipartIdentifierList = 89, 
		RULE_multipartIdentifier = 90, RULE_tableIdentifier = 91, RULE_functionIdentifier = 92, 
		RULE_namedExpression = 93, RULE_namedExpressionSeq = 94, RULE_partitionFieldList = 95, 
		RULE_partitionField = 96, RULE_transform = 97, RULE_transformArgument = 98, 
		RULE_expression = 99, RULE_expressionSeq = 100, RULE_booleanExpression = 101, 
		RULE_predicate = 102, RULE_valueExpression = 103, RULE_primaryExpression = 104, 
		RULE_constant = 105, RULE_comparisonOperator = 106, RULE_arithmeticOperator = 107, 
		RULE_predicateOperator = 108, RULE_booleanValue = 109, RULE_interval = 110, 
		RULE_errorCapturingMultiUnitsInterval = 111, RULE_multiUnitsInterval = 112, 
		RULE_errorCapturingUnitToUnitInterval = 113, RULE_unitToUnitInterval = 114, 
		RULE_intervalValue = 115, RULE_colPosition = 116, RULE_dataType = 117, 
		RULE_qualifiedColTypeWithPositionList = 118, RULE_qualifiedColTypeWithPosition = 119, 
		RULE_colTypeList = 120, RULE_colType = 121, RULE_complexColTypeList = 122, 
		RULE_complexColType = 123, RULE_whenClause = 124, RULE_windowClause = 125, 
		RULE_namedWindow = 126, RULE_windowSpec = 127, RULE_windowFrame = 128, 
		RULE_frameBound = 129, RULE_qualifiedNameList = 130, RULE_functionName = 131, 
		RULE_qualifiedName = 132, RULE_errorCapturingIdentifier = 133, RULE_errorCapturingIdentifierExtra = 134, 
		RULE_identifier = 135, RULE_strictIdentifier = 136, RULE_quotedIdentifier = 137, 
		RULE_number = 138, RULE_alterColumnAction = 139, RULE_ansiNonReserved = 140, 
		RULE_strictNonReserved = 141, RULE_nonReserved = 142;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
			"configKey", "configValue", "unsupportedHiveNativeCommands", "createTableHeader", 
			"replaceTableHeader", "bucketSpec", "skewSpec", "locationSpec", "commentSpec", 
			"query", "insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
			"namespace", "describeFuncName", "describeColName", "ctes", "namedQuery", 
			"tableProvider", "createTableClauses", "tablePropertyList", "tableProperty", 
			"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
			"createFileFormat", "fileFormat", "storageHandler", "resource", "dmlStatementNoWith", 
			"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
			"sortItem", "fromStatement", "fromStatementBody", "querySpecification", 
			"transformClause", "selectClause", "setClause", "matchedClause", "notMatchedClause", 
			"matchedAction", "notMatchedAction", "assignmentList", "assignment", 
			"whereClause", "havingClause", "hint", "hintStatement", "fromClause", 
			"aggregationClause", "groupByClause", "groupingAnalytics", "groupingElement", 
			"groupingSet", "pivotClause", "pivotColumn", "pivotValue", "lateralView", 
			"setQuantifier", "relation", "joinRelation", "joinType", "joinCriteria", 
			"sample", "sampleMethod", "identifierList", "identifierSeq", "orderedIdentifierList", 
			"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
			"inlineTable", "functionTable", "tableAlias", "rowFormat", "multipartIdentifierList", 
			"multipartIdentifier", "tableIdentifier", "functionIdentifier", "namedExpression", 
			"namedExpressionSeq", "partitionFieldList", "partitionField", "transform", 
			"transformArgument", "expression", "expressionSeq", "booleanExpression", 
			"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
			"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
			"errorCapturingMultiUnitsInterval", "multiUnitsInterval", "errorCapturingUnitToUnitInterval", 
			"unitToUnitInterval", "intervalValue", "colPosition", "dataType", "qualifiedColTypeWithPositionList", 
			"qualifiedColTypeWithPosition", "colTypeList", "colType", "complexColTypeList", 
			"complexColType", "whenClause", "windowClause", "namedWindow", "windowSpec", 
			"windowFrame", "frameBound", "qualifiedNameList", "functionName", "qualifiedName", 
			"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier", 
			"strictIdentifier", "quotedIdentifier", "number", "alterColumnAction", 
			"ansiNonReserved", "strictNonReserved", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", 
			"']'", "':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", 
			"'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
			"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
			"'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
			"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
			"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
			"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
			"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
			"'DAY'", "'DATA'", "'DATABASE'", null, "'DBPROPERTIES'", "'DEFINED'", 
			"'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", 
			"'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DIV'", "'DROP'", "'ELSE'", 
			"'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", 
			"'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", 
			"'FETCH'", "'FIELDS'", "'FILTER'", "'FILEFORMAT'", "'FIRST'", "'FOLLOWING'", 
			"'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", 
			"'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", 
			"'HAVING'", "'HOUR'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", 
			"'INDEXES'", "'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", 
			"'INTERVAL'", "'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", 
			"'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", 
			"'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", 
			"'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MINUTE'", "'MONTH'", "'MSCK'", 
			"'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", 
			"'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", 
			"'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", "'OVERLAY'", 
			"'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", "'PERCENT'", 
			"'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
			"'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
			"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
			"'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", 
			null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", 
			"'SECOND'", "'SCHEMA'", "'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", 
			"'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", 
			"'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", "'START'", "'STATISTICS'", 
			"'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'SYNC'", 
			"'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
			"'THEN'", "'TIME'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
			"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TRY_CAST'", 
			"'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", 
			"'UNKNOWN'", "'UNLOCK'", "'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", 
			"'VALUES'", "'VIEW'", "'VIEWS'", "'VERSION'", "'WHEN'", "'WHERE'", "'WINDOW'", 
			"'WITH'", "'YEAR'", "'ZONE'", null, "'<=>'", "'<>'", "'!='", "'<'", null, 
			"'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'|'", 
			"'||'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
			"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
			"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", 
			"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DAY", "DATA", "DATABASE", "DATABASES", "DBPROPERTIES", "DEFINED", "DELETE", 
			"DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", 
			"DISTRIBUTE", "DIV", "DROP", "ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", 
			"EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", 
			"FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", 
			"FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", 
			"FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "HOUR", 
			"IF", "IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", 
			"INPUTFORMAT", "INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", 
			"JOIN", "KEYS", "LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", 
			"LIMIT", "LINES", "LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", 
			"LOGICAL", "MACRO", "MAP", "MATCHED", "MERGE", "MINUTE", "MONTH", "MSCK", 
			"NAMESPACE", "NAMESPACES", "NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", 
			"ON", "ONLY", "OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", 
			"OVER", "OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", 
			"PARTITIONS", "PERCENTLIT", "PIVOT", "PLACING", "POSITION", "PRECEDING", 
			"PRIMARY", "PRINCIPALS", "PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", 
			"RECORDWRITER", "RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", 
			"REPAIR", "REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", 
			"RLIKE", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SECOND", 
			"SCHEMA", "SELECT", "SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", 
			"SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", "SKEWED", "SOME", 
			"SORT", "SORTED", "START", "STATISTICS", "STORED", "STRATIFY", "STRUCT", 
			"SUBSTR", "SUBSTRING", "SYNC", "TABLE", "TABLES", "TABLESAMPLE", "TBLPROPERTIES", 
			"TEMPORARY", "TERMINATED", "THEN", "TIME", "TO", "TOUCH", "TRAILING", 
			"TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", "TRUNCATE", 
			"TRY_CAST", "TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", 
			"UNKNOWN", "UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", "VALUES", 
			"VIEW", "VIEWS", "VERSION", "WHEN", "WHERE", "WINDOW", "WITH", "YEAR", 
			"ZONE", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", 
			"MINUS", "ASTERISK", "SLASH", "PERCENT", "TILDE", "AMPERSAND", "PIPE", 
			"CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
			"TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", 
			"FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enabled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			statement();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(287);
				match(T__0);
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			namedExpression();
			setState(296);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			tableIdentifier();
			setState(299);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			multipartIdentifier();
			setState(302);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			functionIdentifier();
			setState(305);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			dataType();
			setState(308);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			colTypeList();
			setState(311);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowVersionContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public ShowVersionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowVersion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public Token option;
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeTablesContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public AnalyzeTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyzeTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyzeTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyzeTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetQuotedConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConfigValueContext configValue() {
			return getRuleContext(ConfigValueContext.class,0);
		}
		public SetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveReplaceColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public HiveReplaceColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHiveReplaceColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHiveReplaceColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHiveReplaceColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetQuotedConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public ResetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveChangeColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHiveChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHiveChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHiveChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTimeZoneContext extends StatementContext {
		public Token timezone;
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public SetTimeZoneContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableExtendedContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowTableExtendedContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTableExtended(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTableExtended(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTableExtended(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableAlterColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(SqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterTableAlterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterTableAlterColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterTableAlterColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshFunctionContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowViewsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowViews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowViews(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowViews(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(314);
					ctes();
					}
				}

				setState(317);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(USE);
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(319);
					match(NAMESPACE);
					}
					break;
				}
				setState(322);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				match(CREATE);
				setState(324);
				namespace();
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(325);
					match(IF);
					setState(326);
					match(NOT);
					setState(327);
					match(EXISTS);
					}
					break;
				}
				setState(330);
				multipartIdentifier();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(336);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(331);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(332);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(333);
						match(WITH);
						setState(334);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(335);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				match(ALTER);
				setState(342);
				namespace();
				setState(343);
				multipartIdentifier();
				setState(344);
				match(SET);
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(348);
				match(ALTER);
				setState(349);
				namespace();
				setState(350);
				multipartIdentifier();
				setState(351);
				match(SET);
				setState(352);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(354);
				match(DROP);
				setState(355);
				namespace();
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(356);
					match(IF);
					setState(357);
					match(EXISTS);
					}
					break;
				}
				setState(360);
				multipartIdentifier();
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(361);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 8:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(364);
				match(SHOW);
				setState(365);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(366);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(367);
					multipartIdentifier();
					}
				}

				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(370);
						match(LIKE);
						}
					}

					setState(373);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(376);
				createTableHeader();
				setState(381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(377);
					match(T__1);
					setState(378);
					colTypeList();
					setState(379);
					match(T__2);
					}
					break;
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(383);
					tableProvider();
					}
				}

				setState(386);
				createTableClauses();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (REDUCE - 188)) | (1L << (SELECT - 188)) | (1L << (TABLE - 188)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(387);
						match(AS);
						}
					}

					setState(390);
					query();
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(393);
				match(CREATE);
				setState(394);
				match(TABLE);
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(395);
					match(IF);
					setState(396);
					match(NOT);
					setState(397);
					match(EXISTS);
					}
					break;
				}
				setState(400);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(401);
				match(LIKE);
				setState(402);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (ROW - 204)) | (1L << (STORED - 204)) | (1L << (TBLPROPERTIES - 204)) | (1L << (USING - 204)))) != 0)) {
					{
					setState(409);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(403);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(404);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(405);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(406);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(407);
						match(TBLPROPERTIES);
						setState(408);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 11:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(414);
				replaceTableHeader();
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(415);
					match(T__1);
					setState(416);
					colTypeList();
					setState(417);
					match(T__2);
					}
					break;
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(421);
					tableProvider();
					}
				}

				setState(424);
				createTableClauses();
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (REDUCE - 188)) | (1L << (SELECT - 188)) | (1L << (TABLE - 188)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(425);
						match(AS);
						}
					}

					setState(428);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(431);
				match(ANALYZE);
				setState(432);
				match(TABLE);
				setState(433);
				multipartIdentifier();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(434);
					partitionSpec();
					}
				}

				setState(437);
				match(COMPUTE);
				setState(438);
				match(STATISTICS);
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(439);
					identifier();
					}
					break;
				case 2:
					{
					setState(440);
					match(FOR);
					setState(441);
					match(COLUMNS);
					setState(442);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(443);
					match(FOR);
					setState(444);
					match(ALL);
					setState(445);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new AnalyzeTablesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(448);
				match(ANALYZE);
				setState(449);
				match(TABLES);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(450);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(451);
					multipartIdentifier();
					}
				}

				setState(454);
				match(COMPUTE);
				setState(455);
				match(STATISTICS);
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(456);
					identifier();
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(459);
				match(ALTER);
				setState(460);
				match(TABLE);
				setState(461);
				multipartIdentifier();
				setState(462);
				match(ADD);
				setState(463);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(464);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 15:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(466);
				match(ALTER);
				setState(467);
				match(TABLE);
				setState(468);
				multipartIdentifier();
				setState(469);
				match(ADD);
				setState(470);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(471);
				match(T__1);
				setState(472);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(473);
				match(T__2);
				}
				break;
			case 16:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(475);
				match(ALTER);
				setState(476);
				match(TABLE);
				setState(477);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(478);
				match(RENAME);
				setState(479);
				match(COLUMN);
				setState(480);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(481);
				match(TO);
				setState(482);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 17:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(484);
				match(ALTER);
				setState(485);
				match(TABLE);
				setState(486);
				multipartIdentifier();
				setState(487);
				match(DROP);
				setState(488);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(489);
				match(T__1);
				setState(490);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(491);
				match(T__2);
				}
				break;
			case 18:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(493);
				match(ALTER);
				setState(494);
				match(TABLE);
				setState(495);
				multipartIdentifier();
				setState(496);
				match(DROP);
				setState(497);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(498);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 19:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(500);
				match(ALTER);
				setState(501);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(502);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(503);
				match(RENAME);
				setState(504);
				match(TO);
				setState(505);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 20:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(507);
				match(ALTER);
				setState(508);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(509);
				multipartIdentifier();
				setState(510);
				match(SET);
				setState(511);
				match(TBLPROPERTIES);
				setState(512);
				tablePropertyList();
				}
				break;
			case 21:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(514);
				match(ALTER);
				setState(515);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(516);
				multipartIdentifier();
				setState(517);
				match(UNSET);
				setState(518);
				match(TBLPROPERTIES);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(519);
					match(IF);
					setState(520);
					match(EXISTS);
					}
				}

				setState(523);
				tablePropertyList();
				}
				break;
			case 22:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(525);
				match(ALTER);
				setState(526);
				match(TABLE);
				setState(527);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(528);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(529);
					match(COLUMN);
					}
					break;
				}
				setState(532);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(533);
					alterColumnAction();
					}
				}

				}
				break;
			case 23:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(536);
				match(ALTER);
				setState(537);
				match(TABLE);
				setState(538);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(539);
					partitionSpec();
					}
				}

				setState(542);
				match(CHANGE);
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(543);
					match(COLUMN);
					}
					break;
				}
				setState(546);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(547);
				colType();
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(548);
					colPosition();
					}
				}

				}
				break;
			case 24:
				_localctx = new HiveReplaceColumnsContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(551);
				match(ALTER);
				setState(552);
				match(TABLE);
				setState(553);
				((HiveReplaceColumnsContext)_localctx).table = multipartIdentifier();
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(554);
					partitionSpec();
					}
				}

				setState(557);
				match(REPLACE);
				setState(558);
				match(COLUMNS);
				setState(559);
				match(T__1);
				setState(560);
				((HiveReplaceColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(561);
				match(T__2);
				}
				break;
			case 25:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(563);
				match(ALTER);
				setState(564);
				match(TABLE);
				setState(565);
				multipartIdentifier();
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(566);
					partitionSpec();
					}
				}

				setState(569);
				match(SET);
				setState(570);
				match(SERDE);
				setState(571);
				match(STRING);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(572);
					match(WITH);
					setState(573);
					match(SERDEPROPERTIES);
					setState(574);
					tablePropertyList();
					}
				}

				}
				break;
			case 26:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(577);
				match(ALTER);
				setState(578);
				match(TABLE);
				setState(579);
				multipartIdentifier();
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(580);
					partitionSpec();
					}
				}

				setState(583);
				match(SET);
				setState(584);
				match(SERDEPROPERTIES);
				setState(585);
				tablePropertyList();
				}
				break;
			case 27:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(587);
				match(ALTER);
				setState(588);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(589);
				multipartIdentifier();
				setState(590);
				match(ADD);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(591);
					match(IF);
					setState(592);
					match(NOT);
					setState(593);
					match(EXISTS);
					}
				}

				setState(597); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(596);
					partitionSpecLocation();
					}
					}
					setState(599); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 28:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(601);
				match(ALTER);
				setState(602);
				match(TABLE);
				setState(603);
				multipartIdentifier();
				setState(604);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(605);
				match(RENAME);
				setState(606);
				match(TO);
				setState(607);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 29:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(609);
				match(ALTER);
				setState(610);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(611);
				multipartIdentifier();
				setState(612);
				match(DROP);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(613);
					match(IF);
					setState(614);
					match(EXISTS);
					}
				}

				setState(617);
				partitionSpec();
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(618);
					match(T__3);
					setState(619);
					partitionSpec();
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(625);
					match(PURGE);
					}
				}

				}
				break;
			case 30:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(628);
				match(ALTER);
				setState(629);
				match(TABLE);
				setState(630);
				multipartIdentifier();
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(631);
					partitionSpec();
					}
				}

				setState(634);
				match(SET);
				setState(635);
				locationSpec();
				}
				break;
			case 31:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(637);
				match(ALTER);
				setState(638);
				match(TABLE);
				setState(639);
				multipartIdentifier();
				setState(640);
				match(RECOVER);
				setState(641);
				match(PARTITIONS);
				}
				break;
			case 32:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(643);
				match(DROP);
				setState(644);
				match(TABLE);
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(645);
					match(IF);
					setState(646);
					match(EXISTS);
					}
					break;
				}
				setState(649);
				multipartIdentifier();
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(650);
					match(PURGE);
					}
				}

				}
				break;
			case 33:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(653);
				match(DROP);
				setState(654);
				match(VIEW);
				setState(657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(655);
					match(IF);
					setState(656);
					match(EXISTS);
					}
					break;
				}
				setState(659);
				multipartIdentifier();
				}
				break;
			case 34:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(660);
				match(CREATE);
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(661);
					match(OR);
					setState(662);
					match(REPLACE);
					}
				}

				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(665);
						match(GLOBAL);
						}
					}

					setState(668);
					match(TEMPORARY);
					}
				}

				setState(671);
				match(VIEW);
				setState(675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(672);
					match(IF);
					setState(673);
					match(NOT);
					setState(674);
					match(EXISTS);
					}
					break;
				}
				setState(677);
				multipartIdentifier();
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(678);
					identifierCommentList();
					}
				}

				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(687);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(681);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(682);
						match(PARTITIONED);
						setState(683);
						match(ON);
						setState(684);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(685);
						match(TBLPROPERTIES);
						setState(686);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(692);
				match(AS);
				setState(693);
				query();
				}
				break;
			case 35:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(695);
				match(CREATE);
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(696);
					match(OR);
					setState(697);
					match(REPLACE);
					}
				}

				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(700);
					match(GLOBAL);
					}
				}

				setState(703);
				match(TEMPORARY);
				setState(704);
				match(VIEW);
				setState(705);
				tableIdentifier();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(706);
					match(T__1);
					setState(707);
					colTypeList();
					setState(708);
					match(T__2);
					}
				}

				setState(712);
				tableProvider();
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(713);
					match(OPTIONS);
					setState(714);
					tablePropertyList();
					}
				}

				}
				break;
			case 36:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(717);
				match(ALTER);
				setState(718);
				match(VIEW);
				setState(719);
				multipartIdentifier();
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(720);
					match(AS);
					}
				}

				setState(723);
				query();
				}
				break;
			case 37:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(725);
				match(CREATE);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(726);
					match(OR);
					setState(727);
					match(REPLACE);
					}
				}

				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(730);
					match(TEMPORARY);
					}
				}

				setState(733);
				match(FUNCTION);
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(734);
					match(IF);
					setState(735);
					match(NOT);
					setState(736);
					match(EXISTS);
					}
					break;
				}
				setState(739);
				multipartIdentifier();
				setState(740);
				match(AS);
				setState(741);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(742);
					match(USING);
					setState(743);
					resource();
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(744);
						match(T__3);
						setState(745);
						resource();
						}
						}
						setState(750);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 38:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(753);
				match(DROP);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(754);
					match(TEMPORARY);
					}
				}

				setState(757);
				match(FUNCTION);
				setState(760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(758);
					match(IF);
					setState(759);
					match(EXISTS);
					}
					break;
				}
				setState(762);
				multipartIdentifier();
				}
				break;
			case 39:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(763);
				match(EXPLAIN);
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXTENDED - 87)) | (1L << (FORMATTED - 87)) | (1L << (LOGICAL - 87)))) != 0)) {
					{
					setState(764);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXTENDED - 87)) | (1L << (FORMATTED - 87)) | (1L << (LOGICAL - 87)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(767);
				statement();
				}
				break;
			case 40:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(768);
				match(SHOW);
				setState(769);
				match(TABLES);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(770);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(771);
					multipartIdentifier();
					}
				}

				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(775);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(774);
						match(LIKE);
						}
					}

					setState(777);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowTableExtendedContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(780);
				match(SHOW);
				setState(781);
				match(TABLE);
				setState(782);
				match(EXTENDED);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(783);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(784);
					((ShowTableExtendedContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(787);
				match(LIKE);
				setState(788);
				((ShowTableExtendedContext)_localctx).pattern = match(STRING);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(789);
					partitionSpec();
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(792);
				match(SHOW);
				setState(793);
				match(TBLPROPERTIES);
				setState(794);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(795);
					match(T__1);
					setState(796);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(797);
					match(T__2);
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(801);
				match(SHOW);
				setState(802);
				match(COLUMNS);
				setState(803);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(804);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(805);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(806);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(809);
				match(SHOW);
				setState(810);
				match(VIEWS);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(811);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(812);
					multipartIdentifier();
					}
				}

				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(815);
						match(LIKE);
						}
					}

					setState(818);
					((ShowViewsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(821);
				match(SHOW);
				setState(822);
				match(PARTITIONS);
				setState(823);
				multipartIdentifier();
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(824);
					partitionSpec();
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(827);
				match(SHOW);
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(828);
					identifier();
					}
					break;
				}
				setState(831);
				match(FUNCTIONS);
				setState(839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(833);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(832);
						match(LIKE);
						}
						break;
					}
					setState(837);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(835);
						multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(836);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 47:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(841);
				match(SHOW);
				setState(842);
				match(CREATE);
				setState(843);
				match(TABLE);
				setState(844);
				multipartIdentifier();
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(845);
					match(AS);
					setState(846);
					match(SERDE);
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(849);
				match(SHOW);
				setState(850);
				match(CURRENT);
				setState(851);
				match(NAMESPACE);
				}
				break;
			case 49:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(852);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(853);
				match(FUNCTION);
				setState(855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(854);
					match(EXTENDED);
					}
					break;
				}
				setState(857);
				describeFuncName();
				}
				break;
			case 50:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(858);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(859);
				namespace();
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(860);
					match(EXTENDED);
					}
					break;
				}
				setState(863);
				multipartIdentifier();
				}
				break;
			case 51:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(865);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(866);
					match(TABLE);
					}
					break;
				}
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(869);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(872);
				multipartIdentifier();
				setState(874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(873);
					partitionSpec();
					}
					break;
				}
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(876);
					describeColName();
					}
					break;
				}
				}
				break;
			case 52:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(879);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(880);
					match(QUERY);
					}
				}

				setState(883);
				query();
				}
				break;
			case 53:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(884);
				match(COMMENT);
				setState(885);
				match(ON);
				setState(886);
				namespace();
				setState(887);
				multipartIdentifier();
				setState(888);
				match(IS);
				setState(889);
				((CommentNamespaceContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentNamespaceContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 54:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(891);
				match(COMMENT);
				setState(892);
				match(ON);
				setState(893);
				match(TABLE);
				setState(894);
				multipartIdentifier();
				setState(895);
				match(IS);
				setState(896);
				((CommentTableContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentTableContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 55:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(898);
				match(REFRESH);
				setState(899);
				match(TABLE);
				setState(900);
				multipartIdentifier();
				}
				break;
			case 56:
				_localctx = new RefreshFunctionContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(901);
				match(REFRESH);
				setState(902);
				match(FUNCTION);
				setState(903);
				multipartIdentifier();
				}
				break;
			case 57:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(904);
				match(REFRESH);
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(905);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(909);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
					while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(906);
							matchWildcard();
							}
							} 
						}
						setState(911);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 58:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(914);
				match(CACHE);
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(915);
					match(LAZY);
					}
				}

				setState(918);
				match(TABLE);
				setState(919);
				multipartIdentifier();
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(920);
					match(OPTIONS);
					setState(921);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (REDUCE - 188)) | (1L << (SELECT - 188)) | (1L << (TABLE - 188)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(924);
						match(AS);
						}
					}

					setState(927);
					query();
					}
				}

				}
				break;
			case 59:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(930);
				match(UNCACHE);
				setState(931);
				match(TABLE);
				setState(934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(932);
					match(IF);
					setState(933);
					match(EXISTS);
					}
					break;
				}
				setState(936);
				multipartIdentifier();
				}
				break;
			case 60:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(937);
				match(CLEAR);
				setState(938);
				match(CACHE);
				}
				break;
			case 61:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(939);
				match(LOAD);
				setState(940);
				match(DATA);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(941);
					match(LOCAL);
					}
				}

				setState(944);
				match(INPATH);
				setState(945);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(946);
					match(OVERWRITE);
					}
				}

				setState(949);
				match(INTO);
				setState(950);
				match(TABLE);
				setState(951);
				multipartIdentifier();
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(952);
					partitionSpec();
					}
				}

				}
				break;
			case 62:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(955);
				match(TRUNCATE);
				setState(956);
				match(TABLE);
				setState(957);
				multipartIdentifier();
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(958);
					partitionSpec();
					}
				}

				}
				break;
			case 63:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(961);
				match(MSCK);
				setState(962);
				match(REPAIR);
				setState(963);
				match(TABLE);
				setState(964);
				multipartIdentifier();
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==DROP || _la==SYNC) {
					{
					setState(965);
					((RepairTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==DROP || _la==SYNC) ) {
						((RepairTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(966);
					match(PARTITIONS);
					}
				}

				}
				break;
			case 64:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(969);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(970);
				identifier();
				setState(974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(971);
						matchWildcard();
						}
						} 
					}
					setState(976);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				break;
			case 65:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(977);
				match(SET);
				setState(978);
				match(ROLE);
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(979);
						matchWildcard();
						}
						} 
					}
					setState(984);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				}
				break;
			case 66:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(985);
				match(SET);
				setState(986);
				match(TIME);
				setState(987);
				match(ZONE);
				setState(988);
				interval();
				}
				break;
			case 67:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(989);
				match(SET);
				setState(990);
				match(TIME);
				setState(991);
				match(ZONE);
				setState(992);
				((SetTimeZoneContext)_localctx).timezone = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LOCAL || _la==STRING) ) {
					((SetTimeZoneContext)_localctx).timezone = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 68:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(993);
				match(SET);
				setState(994);
				match(TIME);
				setState(995);
				match(ZONE);
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(996);
						matchWildcard();
						}
						} 
					}
					setState(1001);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			case 69:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(1002);
				match(SET);
				setState(1003);
				configKey();
				setState(1004);
				match(EQ);
				setState(1005);
				configValue();
				}
				break;
			case 70:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(1007);
				match(SET);
				setState(1008);
				configKey();
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1009);
					match(EQ);
					setState(1013);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(1010);
							matchWildcard();
							}
							} 
						}
						setState(1015);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					}
					}
				}

				}
				break;
			case 71:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1018);
				match(SET);
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1019);
						matchWildcard();
						}
						} 
					}
					setState(1024);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(1025);
				match(EQ);
				setState(1026);
				configValue();
				}
				break;
			case 72:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1027);
				match(SET);
				setState(1031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1028);
						matchWildcard();
						}
						} 
					}
					setState(1033);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				}
				break;
			case 73:
				_localctx = new ResetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1034);
				match(RESET);
				setState(1035);
				configKey();
				}
				break;
			case 74:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1036);
				match(RESET);
				setState(1040);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1037);
						matchWildcard();
						}
						} 
					}
					setState(1042);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
			case 75:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1043);
				unsupportedHiveNativeCommands();
				setState(1047);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1044);
						matchWildcard();
						}
						} 
					}
					setState(1049);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			case 76:
				_localctx = new ShowVersionContext(_localctx);
				enterOuterAlt(_localctx, 76);
				{
				setState(1050);
				match(SHOW);
				setState(1051);
				match(VERSION);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigKeyContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConfigKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConfigKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConfigKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigKeyContext configKey() throws RecognitionException {
		ConfigKeyContext _localctx = new ConfigKeyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_configKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigValueContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConfigValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConfigValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1059);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1061);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1062);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1064);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1063);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1066);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1068);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1067);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1070);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1071);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1072);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1073);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1075);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1074);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1077);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1078);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1079);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1080);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1081);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1082);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1083);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1084);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1085);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1086);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1087);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1088);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1089);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1090);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1091);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1092);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1093);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1094);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1095);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1096);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1097);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1098);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1099);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1100);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1101);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1102);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1103);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1104);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1105);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1106);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1107);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1108);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1109);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1110);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1111);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1112);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1113);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1114);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1115);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1116);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1117);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1118);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1119);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1120);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1121);
				tableIdentifier();
				setState(1122);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1123);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1125);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1126);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1127);
				tableIdentifier();
				setState(1128);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1129);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1131);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1132);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1133);
				tableIdentifier();
				setState(1134);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1135);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1137);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1138);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1139);
				tableIdentifier();
				setState(1140);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1141);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1143);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1144);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1145);
				tableIdentifier();
				setState(1146);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1147);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1149);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1150);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1151);
				tableIdentifier();
				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1153);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1157);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1159);
				tableIdentifier();
				setState(1160);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1162);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1164);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1165);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1166);
				tableIdentifier();
				setState(1167);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1168);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1170);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1171);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1172);
				tableIdentifier();
				setState(1173);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1176);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1178);
				tableIdentifier();
				setState(1179);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1180);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1182);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1183);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1184);
				tableIdentifier();
				setState(1185);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1187);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1189);
				tableIdentifier();
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1190);
					partitionSpec();
					}
				}

				setState(1193);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1195);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1196);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1197);
				tableIdentifier();
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1198);
					partitionSpec();
					}
				}

				setState(1201);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1203);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1204);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1205);
				tableIdentifier();
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1206);
					partitionSpec();
					}
				}

				setState(1209);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1210);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1212);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1213);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1214);
				tableIdentifier();
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1215);
					partitionSpec();
					}
				}

				setState(1218);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1219);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1221);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1223);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1224);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1225);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			match(CREATE);
			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1229);
				match(TEMPORARY);
				}
			}

			setState(1233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1232);
				match(EXTERNAL);
				}
			}

			setState(1235);
			match(TABLE);
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1236);
				match(IF);
				setState(1237);
				match(NOT);
				setState(1238);
				match(EXISTS);
				}
				break;
			}
			setState(1241);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1243);
				match(CREATE);
				setState(1244);
				match(OR);
				}
			}

			setState(1247);
			match(REPLACE);
			setState(1248);
			match(TABLE);
			setState(1249);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(CLUSTERED);
			setState(1252);
			match(BY);
			setState(1253);
			identifierList();
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1254);
				match(SORTED);
				setState(1255);
				match(BY);
				setState(1256);
				orderedIdentifierList();
				}
			}

			setState(1259);
			match(INTO);
			setState(1260);
			match(INTEGER_VALUE);
			setState(1261);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(SKEWED);
			setState(1264);
			match(BY);
			setState(1265);
			identifierList();
			setState(1266);
			match(ON);
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1267);
				constantList();
				}
				break;
			case 2:
				{
				setState(1268);
				nestedConstantList();
				}
				break;
			}
			setState(1274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1271);
				match(STORED);
				setState(1272);
				match(AS);
				setState(1273);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(LOCATION);
			setState(1277);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(COMMENT);
			setState(1280);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1282);
				ctes();
				}
			}

			setState(1285);
			queryTerm(0);
			setState(1286);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_insertInto);
		int _la;
		try {
			setState(1349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				match(INSERT);
				setState(1289);
				match(OVERWRITE);
				setState(1291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1290);
					match(TABLE);
					}
					break;
				}
				setState(1293);
				multipartIdentifier();
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1294);
					partitionSpec();
					setState(1298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1295);
						match(IF);
						setState(1296);
						match(NOT);
						setState(1297);
						match(EXISTS);
						}
					}

					}
				}

				setState(1303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1302);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				match(INSERT);
				setState(1306);
				match(INTO);
				setState(1308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1307);
					match(TABLE);
					}
					break;
				}
				setState(1310);
				multipartIdentifier();
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1311);
					partitionSpec();
					}
				}

				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1314);
					match(IF);
					setState(1315);
					match(NOT);
					setState(1316);
					match(EXISTS);
					}
				}

				setState(1320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1319);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1322);
				match(INSERT);
				setState(1323);
				match(OVERWRITE);
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1324);
					match(LOCAL);
					}
				}

				setState(1327);
				match(DIRECTORY);
				setState(1328);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1329);
					rowFormat();
					}
				}

				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1332);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1335);
				match(INSERT);
				setState(1336);
				match(OVERWRITE);
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1337);
					match(LOCAL);
					}
				}

				setState(1340);
				match(DIRECTORY);
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1341);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1344);
				tableProvider();
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1345);
					match(OPTIONS);
					setState(1346);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			partitionSpec();
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1352);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			match(PARTITION);
			setState(1356);
			match(T__1);
			setState(1357);
			partitionVal();
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1358);
				match(T__3);
				setState(1359);
				partitionVal();
				}
				}
				setState(1364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1365);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			identifier();
			setState(1370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1368);
				match(EQ);
				setState(1369);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_describeFuncName);
		try {
			setState(1379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1374);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1375);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1376);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1377);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1378);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1382);
				match(T__4);
				setState(1383);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			match(WITH);
			setState(1390);
			namedQuery();
			setState(1395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1391);
				match(T__3);
				setState(1392);
				namedQuery();
				}
				}
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1399);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1402);
				match(AS);
				}
			}

			setState(1405);
			match(T__1);
			setState(1406);
			query();
			setState(1407);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(USING);
			setState(1410);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableClausesContext extends ParserRuleContext {
		public TablePropertyListContext options;
		public PartitionFieldListContext partitioning;
		public TablePropertyListContext tableProps;
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<PartitionFieldListContext> partitionFieldList() {
			return getRuleContexts(PartitionFieldListContext.class);
		}
		public PartitionFieldListContext partitionFieldList(int i) {
			return getRuleContext(PartitionFieldListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (LOCATION - 139)) | (1L << (OPTIONS - 139)) | (1L << (PARTITIONED - 139)))) != 0) || ((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (ROW - 204)) | (1L << (SKEWED - 204)) | (1L << (STORED - 204)) | (1L << (TBLPROPERTIES - 204)))) != 0)) {
				{
				setState(1425);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1412);
					match(OPTIONS);
					setState(1413);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1414);
					match(PARTITIONED);
					setState(1415);
					match(BY);
					setState(1416);
					((CreateTableClausesContext)_localctx).partitioning = partitionFieldList();
					}
					}
					break;
				case SKEWED:
					{
					setState(1417);
					skewSpec();
					}
					break;
				case CLUSTERED:
					{
					setState(1418);
					bucketSpec();
					}
					break;
				case ROW:
					{
					setState(1419);
					rowFormat();
					}
					break;
				case STORED:
					{
					setState(1420);
					createFileFormat();
					}
					break;
				case LOCATION:
					{
					setState(1421);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1422);
					commentSpec();
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1423);
					match(TBLPROPERTIES);
					setState(1424);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			match(T__1);
			setState(1431);
			tableProperty();
			setState(1436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1432);
				match(T__3);
				setState(1433);
				tableProperty();
				}
				}
				setState(1438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1439);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 245)) & ~0x3f) == 0 && ((1L << (_la - 245)) & ((1L << (TRUE - 245)) | (1L << (EQ - 245)) | (1L << (STRING - 245)) | (1L << (INTEGER_VALUE - 245)) | (1L << (DECIMAL_VALUE - 245)))) != 0)) {
				{
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1442);
					match(EQ);
					}
				}

				setState(1445);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1448);
				identifier();
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1449);
					match(T__4);
					setState(1450);
					identifier();
					}
					}
					setState(1455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tablePropertyValue);
		try {
			setState(1463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1459);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1460);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1461);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1462);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			match(T__1);
			setState(1466);
			constant();
			setState(1471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1467);
				match(T__3);
				setState(1468);
				constant();
				}
				}
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1474);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(T__1);
			setState(1477);
			constantList();
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1478);
				match(T__3);
				setState(1479);
				constantList();
				}
				}
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1485);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_createFileFormat);
		try {
			setState(1493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1487);
				match(STORED);
				setState(1488);
				match(AS);
				setState(1489);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1490);
				match(STORED);
				setState(1491);
				match(BY);
				setState(1492);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fileFormat);
		try {
			setState(1500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1495);
				match(INPUTFORMAT);
				setState(1496);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1497);
				match(OUTPUTFORMAT);
				setState(1498);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			match(STRING);
			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1503);
				match(WITH);
				setState(1504);
				match(SERDEPROPERTIES);
				setState(1505);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			identifier();
			setState(1509);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1511);
				insertInto();
				setState(1512);
				queryTerm(0);
				setState(1513);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1515);
				fromClause();
				setState(1517); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1516);
					multiInsertQueryBody();
					}
					}
					setState(1519); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1521);
				match(DELETE);
				setState(1522);
				match(FROM);
				setState(1523);
				multipartIdentifier();
				setState(1524);
				tableAlias();
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1525);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1528);
				match(UPDATE);
				setState(1529);
				multipartIdentifier();
				setState(1530);
				tableAlias();
				setState(1531);
				setClause();
				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1532);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1535);
				match(MERGE);
				setState(1536);
				match(INTO);
				setState(1537);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1538);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1539);
				match(USING);
				setState(1545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1540);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1541);
					match(T__1);
					setState(1542);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1543);
					match(T__2);
					}
					break;
				}
				setState(1547);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1548);
				match(ON);
				setState(1549);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1550);
						matchedClause();
						}
						} 
					}
					setState(1555);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1556);
					notMatchedClause();
					}
					}
					setState(1561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1564);
				match(ORDER);
				setState(1565);
				match(BY);
				setState(1566);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1567);
						match(T__3);
						setState(1568);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				}
				break;
			}
			setState(1586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1576);
				match(CLUSTER);
				setState(1577);
				match(BY);
				setState(1578);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1579);
						match(T__3);
						setState(1580);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1585);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				}
				break;
			}
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1588);
				match(DISTRIBUTE);
				setState(1589);
				match(BY);
				setState(1590);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1591);
						match(T__3);
						setState(1592);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1597);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				}
				}
				break;
			}
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1600);
				match(SORT);
				setState(1601);
				match(BY);
				setState(1602);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1603);
						match(T__3);
						setState(1604);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1609);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				}
				break;
			}
			setState(1613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1612);
				windowClause();
				}
				break;
			}
			setState(1620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1615);
				match(LIMIT);
				setState(1618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1616);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1617);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			insertInto();
			setState(1623);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1626);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1649);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1628);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1629);
						if (!(legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enabled");
						setState(1630);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1632);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1631);
							setQuantifier();
							}
						}

						setState(1634);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1635);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1636);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1637);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1639);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1638);
							setQuantifier();
							}
						}

						setState(1641);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1642);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1643);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1644);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1646);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1645);
							setQuantifier();
							}
						}

						setState(1648);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_queryPrimary);
		try {
			setState(1663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1654);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1655);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1656);
				match(TABLE);
				setState(1657);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1658);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1659);
				match(T__1);
				setState(1660);
				query();
				setState(1661);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			expression();
			setState(1667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1666);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1669);
				match(NULLS);
				setState(1670);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			fromClause();
			setState(1675); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1674);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1677); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1679);
				transformClause();
				setState(1681);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1680);
					whereClause();
					}
					break;
				}
				setState(1683);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1685);
				selectClause();
				setState(1689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1686);
						lateralView();
						}
						} 
					}
					setState(1691);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				setState(1693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1692);
					whereClause();
					}
					break;
				}
				setState(1696);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1695);
					aggregationClause();
					}
					break;
				}
				setState(1699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1698);
					havingClause();
					}
					break;
				}
				setState(1702);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1701);
					windowClause();
					}
					break;
				}
				setState(1704);
				queryOrganization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_querySpecification);
		try {
			int _alt;
			setState(1752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1708);
				transformClause();
				setState(1710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1709);
					fromClause();
					}
					break;
				}
				setState(1715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1712);
						lateralView();
						}
						} 
					}
					setState(1717);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				setState(1719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1718);
					whereClause();
					}
					break;
				}
				setState(1722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1721);
					aggregationClause();
					}
					break;
				}
				setState(1725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1724);
					havingClause();
					}
					break;
				}
				setState(1728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1727);
					windowClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1730);
				selectClause();
				setState(1732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1731);
					fromClause();
					}
					break;
				}
				setState(1737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1734);
						lateralView();
						}
						} 
					}
					setState(1739);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				}
				setState(1741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1740);
					whereClause();
					}
					break;
				}
				setState(1744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1743);
					aggregationClause();
					}
					break;
				}
				setState(1747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1746);
					havingClause();
					}
					break;
				}
				setState(1750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1749);
					windowClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public ExpressionSeqContext expressionSeq() {
			return getRuleContext(ExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1754);
				match(SELECT);
				setState(1755);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1756);
				match(T__1);
				setState(1758);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1757);
					setQuantifier();
					}
					break;
				}
				setState(1760);
				expressionSeq();
				setState(1761);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(1763);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1764);
					setQuantifier();
					}
					break;
				}
				setState(1767);
				expressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1768);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1770);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1769);
					setQuantifier();
					}
					break;
				}
				setState(1772);
				expressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1775);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1778);
				match(RECORDWRITER);
				setState(1779);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1782);
			match(USING);
			setState(1783);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1784);
				match(AS);
				setState(1794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1785);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1786);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1787);
					match(T__1);
					setState(1790);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						setState(1788);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1789);
						colTypeList();
						}
						break;
					}
					setState(1792);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1798);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1801);
				match(RECORDREADER);
				setState(1802);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			match(SELECT);
			setState(1809);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1806);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			}
			setState(1813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1812);
				setQuantifier();
				}
				break;
			}
			setState(1815);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			match(SET);
			setState(1818);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(WHEN);
			setState(1821);
			match(MATCHED);
			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1822);
				match(AND);
				setState(1823);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1826);
			match(THEN);
			setState(1827);
			matchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			match(WHEN);
			setState(1830);
			match(NOT);
			setState(1831);
			match(MATCHED);
			setState(1834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1832);
				match(AND);
				setState(1833);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1836);
			match(THEN);
			setState(1837);
			notMatchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_matchedAction);
		try {
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1839);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1840);
				match(UPDATE);
				setState(1841);
				match(SET);
				setState(1842);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1843);
				match(UPDATE);
				setState(1844);
				match(SET);
				setState(1845);
				assignmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_notMatchedAction);
		int _la;
		try {
			setState(1866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1848);
				match(INSERT);
				setState(1849);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1850);
				match(INSERT);
				setState(1851);
				match(T__1);
				setState(1852);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1853);
				match(T__2);
				setState(1854);
				match(VALUES);
				setState(1855);
				match(T__1);
				setState(1856);
				expression();
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1857);
					match(T__3);
					setState(1858);
					expression();
					}
					}
					setState(1863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1864);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			assignment();
			setState(1873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1869);
				match(T__3);
				setState(1870);
				assignment();
				}
				}
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1877);
			match(EQ);
			setState(1878);
			((AssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
			match(WHERE);
			setState(1881);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			match(HAVING);
			setState(1884);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			match(T__5);
			setState(1887);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1894);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1889);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
					case 1:
						{
						setState(1888);
						match(T__3);
						}
						break;
					}
					setState(1891);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			setState(1897);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_hintStatement);
		int _la;
		try {
			setState(1912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1899);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1900);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1901);
				match(T__1);
				setState(1902);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1903);
					match(T__3);
					setState(1904);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1910);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			match(FROM);
			setState(1915);
			relation();
			setState(1920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1916);
					match(T__3);
					setState(1917);
					relation();
					}
					} 
				}
				setState(1922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			setState(1926);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1923);
					lateralView();
					}
					} 
				}
				setState(1928);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			setState(1930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1929);
				pivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationClauseContext extends ParserRuleContext {
		public GroupByClauseContext groupByClause;
		public List<GroupByClauseContext> groupingExpressionsWithGroupingAnalytics = new ArrayList<GroupByClauseContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<GroupByClauseContext> groupByClause() {
			return getRuleContexts(GroupByClauseContext.class);
		}
		public GroupByClauseContext groupByClause(int i) {
			return getRuleContext(GroupByClauseContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(1971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1932);
				match(GROUP);
				setState(1933);
				match(BY);
				setState(1934);
				((AggregationClauseContext)_localctx).groupByClause = groupByClause();
				((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
				setState(1939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1935);
						match(T__3);
						setState(1936);
						((AggregationClauseContext)_localctx).groupByClause = groupByClause();
						((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
						}
						} 
					}
					setState(1941);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1942);
				match(GROUP);
				setState(1943);
				match(BY);
				setState(1944);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1945);
						match(T__3);
						setState(1946);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1951);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				}
				setState(1969);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1952);
					match(WITH);
					setState(1953);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1954);
					match(WITH);
					setState(1955);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1956);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1957);
					match(SETS);
					setState(1958);
					match(T__1);
					setState(1959);
					groupingSet();
					setState(1964);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1960);
						match(T__3);
						setState(1961);
						groupingSet();
						}
						}
						setState(1966);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1967);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_groupByClause);
		try {
			setState(1975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1973);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1974);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingAnalyticsContext extends ParserRuleContext {
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public GroupingAnalyticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingAnalytics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingAnalytics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingAnalytics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingAnalytics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingAnalyticsContext groupingAnalytics() throws RecognitionException {
		GroupingAnalyticsContext _localctx = new GroupingAnalyticsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_groupingAnalytics);
		int _la;
		try {
			setState(2002);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1977);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1978);
				match(T__1);
				setState(1979);
				groupingSet();
				setState(1984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1980);
					match(T__3);
					setState(1981);
					groupingSet();
					}
					}
					setState(1986);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1987);
				match(T__2);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1989);
				match(GROUPING);
				setState(1990);
				match(SETS);
				setState(1991);
				match(T__1);
				setState(1992);
				groupingElement();
				setState(1997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1993);
					match(T__3);
					setState(1994);
					groupingElement();
					}
					}
					setState(1999);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2000);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_groupingElement);
		try {
			setState(2006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2004);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2005);
				groupingSet();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_groupingSet);
		int _la;
		try {
			setState(2021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2008);
				match(T__1);
				setState(2017);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2009);
					expression();
					setState(2014);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2010);
						match(T__3);
						setState(2011);
						expression();
						}
						}
						setState(2016);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2019);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2020);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			match(PIVOT);
			setState(2024);
			match(T__1);
			setState(2025);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(2026);
			match(FOR);
			setState(2027);
			pivotColumn();
			setState(2028);
			match(IN);
			setState(2029);
			match(T__1);
			setState(2030);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(2035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2031);
				match(T__3);
				setState(2032);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2037);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2038);
			match(T__2);
			setState(2039);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_pivotColumn);
		int _la;
		try {
			setState(2053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2041);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				match(T__1);
				setState(2043);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2044);
					match(T__3);
					setState(2045);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2050);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2051);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			expression();
			setState(2060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2057);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2056);
					match(AS);
					}
					break;
				}
				setState(2059);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
			match(LATERAL);
			setState(2063);
			match(VIEW);
			setState(2065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2064);
				match(OUTER);
				}
				break;
			}
			setState(2067);
			qualifiedName();
			setState(2068);
			match(T__1);
			setState(2077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2069);
				expression();
				setState(2074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2070);
					match(T__3);
					setState(2071);
					expression();
					}
					}
					setState(2076);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2079);
			match(T__2);
			setState(2080);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(2082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(2081);
					match(AS);
					}
					break;
				}
				setState(2084);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2089);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2085);
						match(T__3);
						setState(2086);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2091);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2094);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2096);
				match(LATERAL);
				}
				break;
			}
			setState(2099);
			relationPrimary();
			setState(2103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2100);
					joinRelation();
					}
					} 
				}
				setState(2105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_joinRelation);
		try {
			setState(2123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2106);
				joinType();
				}
				setState(2107);
				match(JOIN);
				setState(2109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2108);
					match(LATERAL);
					}
					break;
				}
				setState(2111);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2112);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2115);
				match(NATURAL);
				setState(2116);
				joinType();
				setState(2117);
				match(JOIN);
				setState(2119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2118);
					match(LATERAL);
					}
					break;
				}
				setState(2121);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_joinType);
		int _la;
		try {
			setState(2149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2125);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2128);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2129);
				match(LEFT);
				setState(2131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2130);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2133);
					match(LEFT);
					}
				}

				setState(2136);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2137);
				match(RIGHT);
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2138);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2141);
				match(FULL);
				setState(2143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2142);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2145);
					match(LEFT);
					}
				}

				setState(2148);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_joinCriteria);
		try {
			setState(2155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2151);
				match(ON);
				setState(2152);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2153);
				match(USING);
				setState(2154);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			match(TABLESAMPLE);
			setState(2158);
			match(T__1);
			setState(2160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2159);
				sampleMethod();
				}
				break;
			}
			setState(2162);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_sampleMethod);
		int _la;
		try {
			setState(2188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2164);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2167);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2168);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2169);
				expression();
				setState(2170);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2172);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2173);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2174);
				match(OUT);
				setState(2175);
				match(OF);
				setState(2176);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2177);
					match(ON);
					setState(2183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
					case 1:
						{
						setState(2178);
						identifier();
						}
						break;
					case 2:
						{
						setState(2179);
						qualifiedName();
						setState(2180);
						match(T__1);
						setState(2181);
						match(T__2);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2187);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			match(T__1);
			setState(2191);
			identifierSeq();
			setState(2192);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2195);
					match(T__3);
					setState(2196);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
			match(T__1);
			setState(2203);
			orderedIdentifier();
			setState(2208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2204);
				match(T__3);
				setState(2205);
				orderedIdentifier();
				}
				}
				setState(2210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2211);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2214);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2217);
			match(T__1);
			setState(2218);
			identifierComment();
			setState(2223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2219);
				match(T__3);
				setState(2220);
				identifierComment();
				}
				}
				setState(2225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2226);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2228);
			identifier();
			setState(2230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2229);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_relationPrimary);
		try {
			setState(2256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2232);
				multipartIdentifier();
				setState(2234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2233);
					sample();
					}
					break;
				}
				setState(2236);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2238);
				match(T__1);
				setState(2239);
				query();
				setState(2240);
				match(T__2);
				setState(2242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2241);
					sample();
					}
					break;
				}
				setState(2244);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2246);
				match(T__1);
				setState(2247);
				relation();
				setState(2248);
				match(T__2);
				setState(2250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2249);
					sample();
					}
					break;
				}
				setState(2252);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2254);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2255);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2258);
			match(VALUES);
			setState(2259);
			expression();
			setState(2264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2260);
					match(T__3);
					setState(2261);
					expression();
					}
					} 
				}
				setState(2266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			setState(2267);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public FunctionNameContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2269);
			((FunctionTableContext)_localctx).funcName = functionName();
			setState(2270);
			match(T__1);
			setState(2279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2271);
				expression();
				setState(2276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2272);
					match(T__3);
					setState(2273);
					expression();
					}
					}
					setState(2278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2281);
			match(T__2);
			setState(2282);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2284);
					match(AS);
					}
					break;
				}
				setState(2287);
				strictIdentifier();
				setState(2289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2288);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_rowFormat);
		try {
			setState(2342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2293);
				match(ROW);
				setState(2294);
				match(FORMAT);
				setState(2295);
				match(SERDE);
				setState(2296);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2297);
					match(WITH);
					setState(2298);
					match(SERDEPROPERTIES);
					setState(2299);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2302);
				match(ROW);
				setState(2303);
				match(FORMAT);
				setState(2304);
				match(DELIMITED);
				setState(2314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2305);
					match(FIELDS);
					setState(2306);
					match(TERMINATED);
					setState(2307);
					match(BY);
					setState(2308);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
					case 1:
						{
						setState(2309);
						match(ESCAPED);
						setState(2310);
						match(BY);
						setState(2311);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2316);
					match(COLLECTION);
					setState(2317);
					match(ITEMS);
					setState(2318);
					match(TERMINATED);
					setState(2319);
					match(BY);
					setState(2320);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2323);
					match(MAP);
					setState(2324);
					match(KEYS);
					setState(2325);
					match(TERMINATED);
					setState(2326);
					match(BY);
					setState(2327);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2330);
					match(LINES);
					setState(2331);
					match(TERMINATED);
					setState(2332);
					match(BY);
					setState(2333);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2336);
					match(NULL);
					setState(2337);
					match(DEFINED);
					setState(2338);
					match(AS);
					setState(2339);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2344);
			multipartIdentifier();
			setState(2349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2345);
				match(T__3);
				setState(2346);
				multipartIdentifier();
				}
				}
				setState(2351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2352);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2353);
					match(T__4);
					setState(2354);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				{
				setState(2360);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2361);
				match(T__4);
				}
				break;
			}
			setState(2365);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2367);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2368);
				match(T__4);
				}
				break;
			}
			setState(2372);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2374);
			expression();
			setState(2382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2376);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(2375);
					match(AS);
					}
					break;
				}
				setState(2380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2378);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2379);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			namedExpression();
			setState(2389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2385);
					match(T__3);
					setState(2386);
					namedExpression();
					}
					} 
				}
				setState(2391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionFieldListContext extends ParserRuleContext {
		public PartitionFieldContext partitionField;
		public List<PartitionFieldContext> fields = new ArrayList<PartitionFieldContext>();
		public List<PartitionFieldContext> partitionField() {
			return getRuleContexts(PartitionFieldContext.class);
		}
		public PartitionFieldContext partitionField(int i) {
			return getRuleContext(PartitionFieldContext.class,i);
		}
		public PartitionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldListContext partitionFieldList() throws RecognitionException {
		PartitionFieldListContext _localctx = new PartitionFieldListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_partitionFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2392);
			match(T__1);
			setState(2393);
			((PartitionFieldListContext)_localctx).partitionField = partitionField();
			((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
			setState(2398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2394);
				match(T__3);
				setState(2395);
				((PartitionFieldListContext)_localctx).partitionField = partitionField();
				((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
				}
				}
				setState(2400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2401);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionFieldContext extends ParserRuleContext {
		public PartitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionField; }
	 
		public PartitionFieldContext() { }
		public void copyFrom(PartitionFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PartitionColumnContext extends PartitionFieldContext {
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionColumnContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartitionTransformContext extends PartitionFieldContext {
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public PartitionTransformContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldContext partitionField() throws RecognitionException {
		PartitionFieldContext _localctx = new PartitionFieldContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_partitionField);
		try {
			setState(2405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				_localctx = new PartitionTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2403);
				transform();
				}
				break;
			case 2:
				_localctx = new PartitionColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2404);
				colType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_transform);
		int _la;
		try {
			setState(2420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2407);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2408);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2409);
				match(T__1);
				setState(2410);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2411);
					match(T__3);
					setState(2412);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2418);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_transformArgument);
		try {
			setState(2424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2422);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2423);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSeqContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSeqContext expressionSeq() throws RecognitionException {
		ExpressionSeqContext _localctx = new ExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_expressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			expression();
			setState(2433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2429);
				match(T__3);
				setState(2430);
				expression();
				}
				}
				setState(2435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2437);
				match(NOT);
				setState(2438);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2439);
				match(EXISTS);
				setState(2440);
				match(T__1);
				setState(2441);
				query();
				setState(2442);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2444);
				valueExpression(0);
				setState(2446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2445);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2456);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2450);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2451);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2452);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2453);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2454);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2455);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_predicate);
		int _la;
		try {
			setState(2543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2461);
					match(NOT);
					}
				}

				setState(2464);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2465);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2466);
				match(AND);
				setState(2467);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2469);
					match(NOT);
					}
				}

				setState(2472);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2473);
				match(T__1);
				setState(2474);
				expression();
				setState(2479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2475);
					match(T__3);
					setState(2476);
					expression();
					}
					}
					setState(2481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2482);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2484);
					match(NOT);
					}
				}

				setState(2487);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2488);
				match(T__1);
				setState(2489);
				query();
				setState(2490);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2492);
					match(NOT);
					}
				}

				setState(2495);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2496);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2497);
					match(NOT);
					}
				}

				setState(2500);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2501);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2502);
					match(T__1);
					setState(2503);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(2504);
					match(T__1);
					setState(2505);
					expression();
					setState(2510);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2506);
						match(T__3);
						setState(2507);
						expression();
						}
						}
						setState(2512);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2513);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2517);
					match(NOT);
					}
				}

				setState(2520);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2521);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2522);
					match(ESCAPE);
					setState(2523);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2526);
				match(IS);
				setState(2528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2527);
					match(NOT);
					}
				}

				setState(2530);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2531);
				match(IS);
				setState(2533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2532);
					match(NOT);
					}
				}

				setState(2535);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2536);
				match(IS);
				setState(2538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2537);
					match(NOT);
					}
				}

				setState(2540);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2541);
				match(FROM);
				setState(2542);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2546);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2547);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 279)) & ~0x3f) == 0 && ((1L << (_la - 279)) & ((1L << (PLUS - 279)) | (1L << (MINUS - 279)) | (1L << (TILDE - 279)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2548);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2570);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2551);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2552);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (ASTERISK - 281)) | (1L << (SLASH - 281)) | (1L << (PERCENT - 281)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2553);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2554);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2555);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 279)) & ~0x3f) == 0 && ((1L << (_la - 279)) & ((1L << (PLUS - 279)) | (1L << (MINUS - 279)) | (1L << (CONCAT_PIPE - 279)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2556);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2557);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2558);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2559);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2560);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2561);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2562);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2563);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2564);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2565);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2566);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2567);
						comparisonOperator();
						setState(2568);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentLikeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentLikeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public BooleanExpressionContext where;
		public Token nullsOption;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentLikeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2576);
				((CurrentLikeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURRENT_DATE) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER))) != 0)) ) {
					((CurrentLikeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2577);
				match(CASE);
				setState(2579); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2578);
					whenClause();
					}
					}
					setState(2581); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2583);
					match(ELSE);
					setState(2584);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2587);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2589);
				match(CASE);
				setState(2590);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2592); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2591);
					whenClause();
					}
					}
					setState(2594); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2596);
					match(ELSE);
					setState(2597);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2600);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2602);
				((CastContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CAST || _la==TRY_CAST) ) {
					((CastContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2603);
				match(T__1);
				setState(2604);
				expression();
				setState(2605);
				match(AS);
				setState(2606);
				dataType();
				setState(2607);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2609);
				match(STRUCT);
				setState(2610);
				match(T__1);
				setState(2619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
				case 1:
					{
					setState(2611);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2616);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2612);
						match(T__3);
						setState(2613);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2618);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2621);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2622);
				match(FIRST);
				setState(2623);
				match(T__1);
				setState(2624);
				expression();
				setState(2627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2625);
					match(IGNORE);
					setState(2626);
					match(NULLS);
					}
				}

				setState(2629);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2631);
				match(LAST);
				setState(2632);
				match(T__1);
				setState(2633);
				expression();
				setState(2636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2634);
					match(IGNORE);
					setState(2635);
					match(NULLS);
					}
				}

				setState(2638);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2640);
				match(POSITION);
				setState(2641);
				match(T__1);
				setState(2642);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2643);
				match(IN);
				setState(2644);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2645);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2647);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2648);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2649);
				qualifiedName();
				setState(2650);
				match(T__4);
				setState(2651);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2653);
				match(T__1);
				setState(2654);
				namedExpression();
				setState(2657); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2655);
					match(T__3);
					setState(2656);
					namedExpression();
					}
					}
					setState(2659); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2661);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2663);
				match(T__1);
				setState(2664);
				query();
				setState(2665);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2667);
				functionName();
				setState(2668);
				match(T__1);
				setState(2680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
				case 1:
					{
					setState(2670);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
					case 1:
						{
						setState(2669);
						setQuantifier();
						}
						break;
					}
					setState(2672);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2677);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2673);
						match(T__3);
						setState(2674);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2679);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2682);
				match(T__2);
				setState(2689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
				case 1:
					{
					setState(2683);
					match(FILTER);
					setState(2684);
					match(T__1);
					setState(2685);
					match(WHERE);
					setState(2686);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(2687);
					match(T__2);
					}
					break;
				}
				setState(2693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
				case 1:
					{
					setState(2691);
					((FunctionCallContext)_localctx).nullsOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
						((FunctionCallContext)_localctx).nullsOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2692);
					match(NULLS);
					}
					break;
				}
				setState(2697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					setState(2695);
					match(OVER);
					setState(2696);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2699);
				identifier();
				setState(2700);
				match(T__7);
				setState(2701);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2703);
				match(T__1);
				setState(2704);
				identifier();
				setState(2707); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2705);
					match(T__3);
					setState(2706);
					identifier();
					}
					}
					setState(2709); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2711);
				match(T__2);
				setState(2712);
				match(T__7);
				setState(2713);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2715);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2716);
				match(T__1);
				setState(2717);
				expression();
				setState(2718);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2720);
				match(EXTRACT);
				setState(2721);
				match(T__1);
				setState(2722);
				((ExtractContext)_localctx).field = identifier();
				setState(2723);
				match(FROM);
				setState(2724);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2725);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2727);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2728);
				match(T__1);
				setState(2729);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2730);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2731);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==FOR) {
					{
					setState(2732);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2733);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2736);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2738);
				match(TRIM);
				setState(2739);
				match(T__1);
				setState(2741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
				case 1:
					{
					setState(2740);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
				case 1:
					{
					setState(2743);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2746);
				match(FROM);
				setState(2747);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2748);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2750);
				match(OVERLAY);
				setState(2751);
				match(T__1);
				setState(2752);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2753);
				match(PLACING);
				setState(2754);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2755);
				match(FROM);
				setState(2756);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2757);
					match(FOR);
					setState(2758);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2761);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2773);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2765);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2766);
						match(T__8);
						setState(2767);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2768);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2770);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2771);
						match(T__4);
						setState(2772);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constant);
		try {
			int _alt;
			setState(2790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2778);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2779);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2780);
				identifier();
				setState(2781);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2783);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2784);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2786); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2785);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2788); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,359,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2792);
			_la = _input.LA(1);
			if ( !(((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (EQ - 271)) | (1L << (NSEQ - 271)) | (1L << (NEQ - 271)) | (1L << (NEQJ - 271)) | (1L << (LT - 271)) | (1L << (LTE - 271)) | (1L << (GT - 271)) | (1L << (GTE - 271)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2794);
			_la = _input.LA(1);
			if ( !(_la==DIV || ((((_la - 279)) & ~0x3f) == 0 && ((1L << (_la - 279)) & ((1L << (PLUS - 279)) | (1L << (MINUS - 279)) | (1L << (ASTERISK - 279)) | (1L << (SLASH - 279)) | (1L << (PERCENT - 279)) | (1L << (TILDE - 279)) | (1L << (AMPERSAND - 279)) | (1L << (PIPE - 279)) | (1L << (CONCAT_PIPE - 279)) | (1L << (HAT - 279)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2796);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (IN - 114)) | (1L << (NOT - 114)) | (1L << (OR - 114)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2798);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2800);
			match(INTERVAL);
			setState(2803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				{
				setState(2801);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2802);
				errorCapturingUnitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext body;
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2805);
			((ErrorCapturingMultiUnitsIntervalContext)_localctx).body = multiUnitsInterval();
			setState(2807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				{
				setState(2806);
				unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> unit = new ArrayList<IdentifierContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2812); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2809);
					intervalValue();
					setState(2810);
					((MultiUnitsIntervalContext)_localctx).identifier = identifier();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2814); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2816);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
			case 1:
				{
				setState(2817);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2818);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2821);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2822);
			((UnitToUnitIntervalContext)_localctx).from = identifier();
			setState(2823);
			match(TO);
			setState(2824);
			((UnitToUnitIntervalContext)_localctx).to = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_intervalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(2826);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2829);
			_la = _input.LA(1);
			if ( !(((((_la - 289)) & ~0x3f) == 0 && ((1L << (_la - 289)) & ((1L << (STRING - 289)) | (1L << (INTEGER_VALUE - 289)) | (1L << (DECIMAL_VALUE - 289)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_colPosition);
		try {
			setState(2834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2831);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2832);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2833);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class YearMonthIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public List<TerminalNode> MONTH() { return getTokens(SqlBaseParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(SqlBaseParser.MONTH, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public YearMonthIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterYearMonthIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitYearMonthIntervalDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitYearMonthIntervalDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DayTimeIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public List<TerminalNode> HOUR() { return getTokens(SqlBaseParser.HOUR); }
		public TerminalNode HOUR(int i) {
			return getToken(SqlBaseParser.HOUR, i);
		}
		public List<TerminalNode> MINUTE() { return getTokens(SqlBaseParser.MINUTE); }
		public TerminalNode MINUTE(int i) {
			return getToken(SqlBaseParser.MINUTE, i);
		}
		public List<TerminalNode> SECOND() { return getTokens(SqlBaseParser.SECOND); }
		public TerminalNode SECOND(int i) {
			return getToken(SqlBaseParser.SECOND, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public DayTimeIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDayTimeIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDayTimeIntervalDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDayTimeIntervalDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_dataType);
		int _la;
		try {
			setState(2882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2836);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2837);
				match(LT);
				setState(2838);
				dataType();
				setState(2839);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2841);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2842);
				match(LT);
				setState(2843);
				dataType();
				setState(2844);
				match(T__3);
				setState(2845);
				dataType();
				setState(2846);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2848);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2855);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2849);
					match(LT);
					setState(2851);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
					case 1:
						{
						setState(2850);
						complexColTypeList();
						}
						break;
					}
					setState(2853);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2854);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new YearMonthIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2857);
				match(INTERVAL);
				setState(2858);
				((YearMonthIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MONTH || _la==YEAR) ) {
					((YearMonthIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
				case 1:
					{
					setState(2859);
					match(TO);
					setState(2860);
					((YearMonthIntervalDataTypeContext)_localctx).to = match(MONTH);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new DayTimeIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2863);
				match(INTERVAL);
				setState(2864);
				((DayTimeIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DAY || _la==HOUR || _la==MINUTE || _la==SECOND) ) {
					((DayTimeIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
				case 1:
					{
					setState(2865);
					match(TO);
					setState(2866);
					((DayTimeIntervalDataTypeContext)_localctx).to = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==HOUR || _la==MINUTE || _la==SECOND) ) {
						((DayTimeIntervalDataTypeContext)_localctx).to = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2869);
				identifier();
				setState(2880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
				case 1:
					{
					setState(2870);
					match(T__1);
					setState(2871);
					match(INTEGER_VALUE);
					setState(2876);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2872);
						match(T__3);
						setState(2873);
						match(INTEGER_VALUE);
						}
						}
						setState(2878);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2879);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2884);
			qualifiedColTypeWithPosition();
			setState(2889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2885);
				match(T__3);
				setState(2886);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2892);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2893);
			dataType();
			setState(2896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2894);
				match(NOT);
				setState(2895);
				match(NULL);
				}
			}

			setState(2899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2898);
				commentSpec();
				}
			}

			setState(2902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2901);
				colPosition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2904);
			colType();
			setState(2909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,378,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2905);
					match(T__3);
					setState(2906);
					colType();
					}
					} 
				}
				setState(2911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,378,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2912);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2913);
			dataType();
			setState(2916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				{
				setState(2914);
				match(NOT);
				setState(2915);
				match(NULL);
				}
				break;
			}
			setState(2919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
			case 1:
				{
				setState(2918);
				commentSpec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2921);
			complexColType();
			setState(2926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2922);
				match(T__3);
				setState(2923);
				complexColType();
				}
				}
				setState(2928);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2929);
			identifier();
			setState(2931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				{
				setState(2930);
				match(T__10);
				}
				break;
			}
			setState(2933);
			dataType();
			setState(2936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2934);
				match(NOT);
				setState(2935);
				match(NULL);
				}
			}

			setState(2939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2938);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2941);
			match(WHEN);
			setState(2942);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2943);
			match(THEN);
			setState(2944);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2946);
			match(WINDOW);
			setState(2947);
			namedWindow();
			setState(2952);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2948);
					match(T__3);
					setState(2949);
					namedWindow();
					}
					} 
				}
				setState(2954);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2955);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2956);
			match(AS);
			setState(2957);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_windowSpec);
		int _la;
		try {
			setState(3005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,393,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2959);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2960);
				match(T__1);
				setState(2961);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2962);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2964);
				match(T__1);
				setState(2999);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2965);
					match(CLUSTER);
					setState(2966);
					match(BY);
					setState(2967);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2972);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2968);
						match(T__3);
						setState(2969);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2974);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(2985);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2975);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2976);
						match(BY);
						setState(2977);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2982);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2978);
							match(T__3);
							setState(2979);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2984);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2997);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2987);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2988);
						match(BY);
						setState(2989);
						sortItem();
						setState(2994);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2990);
							match(T__3);
							setState(2991);
							sortItem();
							}
							}
							setState(2996);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(3001);
					windowFrame();
					}
				}

				setState(3004);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_windowFrame);
		try {
			setState(3023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3007);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3008);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3009);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3010);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3011);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3012);
				match(BETWEEN);
				setState(3013);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3014);
				match(AND);
				setState(3015);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3017);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3018);
				match(BETWEEN);
				setState(3019);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3020);
				match(AND);
				setState(3021);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_frameBound);
		int _la;
		try {
			setState(3032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3025);
				match(UNBOUNDED);
				setState(3026);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3027);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(3028);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3029);
				expression();
				setState(3030);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3034);
			qualifiedName();
			setState(3039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(3035);
				match(T__3);
				setState(3036);
				qualifiedName();
				}
				}
				setState(3041);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_functionName);
		try {
			setState(3046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3042);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3043);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3044);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3045);
				match(RIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3048);
			identifier();
			setState(3053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,398,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3049);
					match(T__4);
					setState(3050);
					identifier();
					}
					} 
				}
				setState(3055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,398,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3056);
			identifier();
			setState(3057);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3061); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3059);
						match(MINUS);
						setState(3060);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3063); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_identifier);
		try {
			setState(3071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,401,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3068);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3069);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3070);
				strictNonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_strictIdentifier);
		try {
			setState(3079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3073);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3074);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3075);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3076);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3077);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3078);
				nonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3081);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SqlBaseParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_number);
		int _la;
		try {
			setState(3126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3083);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3084);
					match(MINUS);
					}
				}

				setState(3087);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3088);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3089);
					match(MINUS);
					}
				}

				setState(3092);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3093);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(3095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3094);
					match(MINUS);
					}
				}

				setState(3097);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3098);
					match(MINUS);
					}
				}

				setState(3101);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3102);
					match(MINUS);
					}
				}

				setState(3105);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3106);
					match(MINUS);
					}
				}

				setState(3109);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3110);
					match(MINUS);
					}
				}

				setState(3113);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3114);
					match(MINUS);
					}
				}

				setState(3117);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3118);
					match(MINUS);
					}
				}

				setState(3121);
				match(FLOAT_LITERAL);
				}
				break;
			case 10:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(3123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3122);
					match(MINUS);
					}
				}

				setState(3125);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterColumnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterColumnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_alterColumnAction);
		int _la;
		try {
			setState(3135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3128);
				match(TYPE);
				setState(3129);
				dataType();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3130);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(3131);
				colPosition();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(3132);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3133);
				match(NOT);
				setState(3134);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALTER) | (1L << ANALYZE) | (1L << ANTI) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BETWEEN) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CHANGE) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLECTION) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << COST) | (1L << CUBE) | (1L << CURRENT) | (1L << DAY) | (1L << DATA) | (1L << DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATABASES - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAST - 128)) | (1L << (LAZY - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OUT - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (RECOVER - 128)) | (1L << (REDUCE - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REPAIR - 192)) | (1L << (REPLACE - 192)) | (1L << (RESET - 192)) | (1L << (RESPECT - 192)) | (1L << (RESTRICT - 192)) | (1L << (REVOKE - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SECOND - 192)) | (1L << (SCHEMA - 192)) | (1L << (SEMI - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SET - 192)) | (1L << (SETMINUS - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYNC - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (TOUCH - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNLOCK - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (UNSET - 256)) | (1L << (UPDATE - 256)) | (1L << (USE - 256)) | (1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (VERSION - 256)) | (1L << (WINDOW - 256)) | (1L << (YEAR - 256)) | (1L << (ZONE - 256)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3139);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EXCEPT - 82)) | (1L << (FULL - 82)) | (1L << (INNER - 82)) | (1L << (INTERSECT - 82)) | (1L << (JOIN - 82)) | (1L << (LATERAL - 82)) | (1L << (LEFT - 82)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (NATURAL - 152)) | (1L << (ON - 152)) | (1L << (RIGHT - 152)) | (1L << (SEMI - 152)) | (1L << (SETMINUS - 152)))) != 0) || _la==UNION || _la==USING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DATA) | (1L << DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATABASES - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAST - 128)) | (1L << (LAZY - 128)) | (1L << (LEADING - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (RECOVER - 128)) | (1L << (REDUCE - 128)) | (1L << (REFERENCES - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REPAIR - 192)) | (1L << (REPLACE - 192)) | (1L << (RESET - 192)) | (1L << (RESPECT - 192)) | (1L << (RESTRICT - 192)) | (1L << (REVOKE - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SECOND - 192)) | (1L << (SCHEMA - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYNC - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TIME - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNIQUE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (UNLOCK - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (UNSET - 256)) | (1L << (UPDATE - 256)) | (1L << (USE - 256)) | (1L << (USER - 256)) | (1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (VERSION - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (YEAR - 256)) | (1L << (ZONE - 256)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 101:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 103:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 104:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 135:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 136:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 138:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enabled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enabled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enabled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SQL_standard_keyword_behavior;
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 20:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 21:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0132\u0c4a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\3\2\3\2\7\2\u0123\n\2\f\2\16"+
		"\2\u0126\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\t\u013e\n\t\3\t\3\t\3\t\5\t\u0143\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u014b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0153"+
		"\n\t\f\t\16\t\u0156\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0169\n\t\3\t\3\t\5\t\u016d\n\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0173\n\t\3\t\5\t\u0176\n\t\3\t\5\t\u0179\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0180\n\t\3\t\5\t\u0183\n\t\3\t\3\t\5\t\u0187\n\t\3\t\5\t\u018a"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0191\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u019c\n\t\f\t\16\t\u019f\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u01a6\n"+
		"\t\3\t\5\t\u01a9\n\t\3\t\3\t\5\t\u01ad\n\t\3\t\5\t\u01b0\n\t\3\t\3\t\3"+
		"\t\3\t\5\t\u01b6\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01c1\n\t"+
		"\3\t\3\t\3\t\3\t\5\t\u01c7\n\t\3\t\3\t\3\t\5\t\u01cc\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u020c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0215\n\t\3\t\3\t\5\t\u0219\n\t\3\t\3\t\3\t\3\t\5\t\u021f\n\t\3\t\3\t"+
		"\5\t\u0223\n\t\3\t\3\t\3\t\5\t\u0228\n\t\3\t\3\t\3\t\3\t\5\t\u022e\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u023a\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0242\n\t\3\t\3\t\3\t\3\t\5\t\u0248\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0255\n\t\3\t\6\t\u0258\n\t\r\t\16\t\u0259"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u026a\n\t"+
		"\3\t\3\t\3\t\7\t\u026f\n\t\f\t\16\t\u0272\13\t\3\t\5\t\u0275\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u027b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u028a\n\t\3\t\3\t\5\t\u028e\n\t\3\t\3\t\3\t\3\t\5\t\u0294\n"+
		"\t\3\t\3\t\3\t\3\t\5\t\u029a\n\t\3\t\5\t\u029d\n\t\3\t\5\t\u02a0\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u02a6\n\t\3\t\3\t\5\t\u02aa\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u02b2\n\t\f\t\16\t\u02b5\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02bd"+
		"\n\t\3\t\5\t\u02c0\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02c9\n\t\3\t\3"+
		"\t\3\t\5\t\u02ce\n\t\3\t\3\t\3\t\3\t\5\t\u02d4\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u02db\n\t\3\t\5\t\u02de\n\t\3\t\3\t\3\t\3\t\5\t\u02e4\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u02ed\n\t\f\t\16\t\u02f0\13\t\5\t\u02f2\n\t\3"+
		"\t\3\t\5\t\u02f6\n\t\3\t\3\t\3\t\5\t\u02fb\n\t\3\t\3\t\3\t\5\t\u0300\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0307\n\t\3\t\5\t\u030a\n\t\3\t\5\t\u030d\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0314\n\t\3\t\3\t\3\t\5\t\u0319\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0322\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u032a\n"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0330\n\t\3\t\5\t\u0333\n\t\3\t\5\t\u0336\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u033c\n\t\3\t\3\t\5\t\u0340\n\t\3\t\3\t\5\t\u0344\n"+
		"\t\3\t\3\t\5\t\u0348\n\t\5\t\u034a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0352"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u035a\n\t\3\t\3\t\3\t\3\t\5\t\u0360\n"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0366\n\t\3\t\5\t\u0369\n\t\3\t\3\t\5\t\u036d\n"+
		"\t\3\t\5\t\u0370\n\t\3\t\3\t\5\t\u0374\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u038e\n\t\f\t\16\t\u0391\13\t\5\t\u0393\n\t\3\t\3\t\5\t\u0397\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u039d\n\t\3\t\5\t\u03a0\n\t\3\t\5\t\u03a3\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u03a9\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03b1\n\t\3\t\3\t"+
		"\3\t\5\t\u03b6\n\t\3\t\3\t\3\t\3\t\5\t\u03bc\n\t\3\t\3\t\3\t\3\t\5\t\u03c2"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03ca\n\t\3\t\3\t\3\t\7\t\u03cf\n\t\f"+
		"\t\16\t\u03d2\13\t\3\t\3\t\3\t\7\t\u03d7\n\t\f\t\16\t\u03da\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03e8\n\t\f\t\16\t\u03eb"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03f6\n\t\f\t\16\t\u03f9"+
		"\13\t\5\t\u03fb\n\t\3\t\3\t\7\t\u03ff\n\t\f\t\16\t\u0402\13\t\3\t\3\t"+
		"\3\t\3\t\7\t\u0408\n\t\f\t\16\t\u040b\13\t\3\t\3\t\3\t\3\t\7\t\u0411\n"+
		"\t\f\t\16\t\u0414\13\t\3\t\3\t\7\t\u0418\n\t\f\t\16\t\u041b\13\t\3\t\3"+
		"\t\5\t\u041f\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u042b\n"+
		"\f\3\f\3\f\5\f\u042f\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0436\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04aa\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04b2"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04ba\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u04c3\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04cd\n\f\3\r\3\r\5"+
		"\r\u04d1\n\r\3\r\5\r\u04d4\n\r\3\r\3\r\3\r\3\r\5\r\u04da\n\r\3\r\3\r\3"+
		"\16\3\16\5\16\u04e0\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u04ec\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u04f8\n\20\3\20\3\20\3\20\5\20\u04fd\n\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\5\23\u0506\n\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u050e"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0515\n\24\5\24\u0517\n\24\3\24\5"+
		"\24\u051a\n\24\3\24\3\24\3\24\5\24\u051f\n\24\3\24\3\24\5\24\u0523\n\24"+
		"\3\24\3\24\3\24\5\24\u0528\n\24\3\24\5\24\u052b\n\24\3\24\3\24\3\24\5"+
		"\24\u0530\n\24\3\24\3\24\3\24\5\24\u0535\n\24\3\24\5\24\u0538\n\24\3\24"+
		"\3\24\3\24\5\24\u053d\n\24\3\24\3\24\5\24\u0541\n\24\3\24\3\24\3\24\5"+
		"\24\u0546\n\24\5\24\u0548\n\24\3\25\3\25\5\25\u054c\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0553\n\26\f\26\16\26\u0556\13\26\3\26\3\26\3\27\3\27"+
		"\3\27\5\27\u055d\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0566\n"+
		"\31\3\32\3\32\3\32\7\32\u056b\n\32\f\32\16\32\u056e\13\32\3\33\3\33\3"+
		"\33\3\33\7\33\u0574\n\33\f\33\16\33\u0577\13\33\3\34\3\34\5\34\u057b\n"+
		"\34\3\34\5\34\u057e\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0594\n\36"+
		"\f\36\16\36\u0597\13\36\3\37\3\37\3\37\3\37\7\37\u059d\n\37\f\37\16\37"+
		"\u05a0\13\37\3\37\3\37\3 \3 \5 \u05a6\n \3 \5 \u05a9\n \3!\3!\3!\7!\u05ae"+
		"\n!\f!\16!\u05b1\13!\3!\5!\u05b4\n!\3\"\3\"\3\"\3\"\5\"\u05ba\n\"\3#\3"+
		"#\3#\3#\7#\u05c0\n#\f#\16#\u05c3\13#\3#\3#\3$\3$\3$\3$\7$\u05cb\n$\f$"+
		"\16$\u05ce\13$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u05d8\n%\3&\3&\3&\3&\3&\5&\u05df"+
		"\n&\3\'\3\'\3\'\3\'\5\'\u05e5\n\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\6)\u05f0"+
		"\n)\r)\16)\u05f1\3)\3)\3)\3)\3)\5)\u05f9\n)\3)\3)\3)\3)\3)\5)\u0600\n"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u060c\n)\3)\3)\3)\3)\7)\u0612\n)\f"+
		")\16)\u0615\13)\3)\7)\u0618\n)\f)\16)\u061b\13)\5)\u061d\n)\3*\3*\3*\3"+
		"*\3*\7*\u0624\n*\f*\16*\u0627\13*\5*\u0629\n*\3*\3*\3*\3*\3*\7*\u0630"+
		"\n*\f*\16*\u0633\13*\5*\u0635\n*\3*\3*\3*\3*\3*\7*\u063c\n*\f*\16*\u063f"+
		"\13*\5*\u0641\n*\3*\3*\3*\3*\3*\7*\u0648\n*\f*\16*\u064b\13*\5*\u064d"+
		"\n*\3*\5*\u0650\n*\3*\3*\3*\5*\u0655\n*\5*\u0657\n*\3+\3+\3+\3,\3,\3,"+
		"\3,\3,\3,\3,\5,\u0663\n,\3,\3,\3,\3,\3,\5,\u066a\n,\3,\3,\3,\3,\3,\5,"+
		"\u0671\n,\3,\7,\u0674\n,\f,\16,\u0677\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5"+
		"-\u0682\n-\3.\3.\5.\u0686\n.\3.\3.\5.\u068a\n.\3/\3/\6/\u068e\n/\r/\16"+
		"/\u068f\3\60\3\60\5\60\u0694\n\60\3\60\3\60\3\60\3\60\7\60\u069a\n\60"+
		"\f\60\16\60\u069d\13\60\3\60\5\60\u06a0\n\60\3\60\5\60\u06a3\n\60\3\60"+
		"\5\60\u06a6\n\60\3\60\5\60\u06a9\n\60\3\60\3\60\5\60\u06ad\n\60\3\61\3"+
		"\61\5\61\u06b1\n\61\3\61\7\61\u06b4\n\61\f\61\16\61\u06b7\13\61\3\61\5"+
		"\61\u06ba\n\61\3\61\5\61\u06bd\n\61\3\61\5\61\u06c0\n\61\3\61\5\61\u06c3"+
		"\n\61\3\61\3\61\5\61\u06c7\n\61\3\61\7\61\u06ca\n\61\f\61\16\61\u06cd"+
		"\13\61\3\61\5\61\u06d0\n\61\3\61\5\61\u06d3\n\61\3\61\5\61\u06d6\n\61"+
		"\3\61\5\61\u06d9\n\61\5\61\u06db\n\61\3\62\3\62\3\62\3\62\5\62\u06e1\n"+
		"\62\3\62\3\62\3\62\3\62\3\62\5\62\u06e8\n\62\3\62\3\62\3\62\5\62\u06ed"+
		"\n\62\3\62\5\62\u06f0\n\62\3\62\5\62\u06f3\n\62\3\62\3\62\5\62\u06f7\n"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0701\n\62\3\62\3\62"+
		"\5\62\u0705\n\62\5\62\u0707\n\62\3\62\5\62\u070a\n\62\3\62\3\62\5\62\u070e"+
		"\n\62\3\63\3\63\7\63\u0712\n\63\f\63\16\63\u0715\13\63\3\63\5\63\u0718"+
		"\n\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u0723\n\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u072d\n\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0739\n\67\38\38\38\38\38\38\38\3"+
		"8\38\38\38\78\u0746\n8\f8\168\u0749\138\38\38\58\u074d\n8\39\39\39\79"+
		"\u0752\n9\f9\169\u0755\139\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\5=\u0764"+
		"\n=\3=\7=\u0767\n=\f=\16=\u076a\13=\3=\3=\3>\3>\3>\3>\3>\3>\7>\u0774\n"+
		">\f>\16>\u0777\13>\3>\3>\5>\u077b\n>\3?\3?\3?\3?\7?\u0781\n?\f?\16?\u0784"+
		"\13?\3?\7?\u0787\n?\f?\16?\u078a\13?\3?\5?\u078d\n?\3@\3@\3@\3@\3@\7@"+
		"\u0794\n@\f@\16@\u0797\13@\3@\3@\3@\3@\3@\7@\u079e\n@\f@\16@\u07a1\13"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u07ad\n@\f@\16@\u07b0\13@\3@\3@\5@"+
		"\u07b4\n@\5@\u07b6\n@\3A\3A\5A\u07ba\nA\3B\3B\3B\3B\3B\7B\u07c1\nB\fB"+
		"\16B\u07c4\13B\3B\3B\3B\3B\3B\3B\3B\3B\7B\u07ce\nB\fB\16B\u07d1\13B\3"+
		"B\3B\5B\u07d5\nB\3C\3C\5C\u07d9\nC\3D\3D\3D\3D\7D\u07df\nD\fD\16D\u07e2"+
		"\13D\5D\u07e4\nD\3D\3D\5D\u07e8\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u07f4"+
		"\nE\fE\16E\u07f7\13E\3E\3E\3E\3F\3F\3F\3F\3F\7F\u0801\nF\fF\16F\u0804"+
		"\13F\3F\3F\5F\u0808\nF\3G\3G\5G\u080c\nG\3G\5G\u080f\nG\3H\3H\3H\5H\u0814"+
		"\nH\3H\3H\3H\3H\3H\7H\u081b\nH\fH\16H\u081e\13H\5H\u0820\nH\3H\3H\3H\5"+
		"H\u0825\nH\3H\3H\3H\7H\u082a\nH\fH\16H\u082d\13H\5H\u082f\nH\3I\3I\3J"+
		"\5J\u0834\nJ\3J\3J\7J\u0838\nJ\fJ\16J\u083b\13J\3K\3K\3K\5K\u0840\nK\3"+
		"K\3K\5K\u0844\nK\3K\3K\3K\3K\5K\u084a\nK\3K\3K\5K\u084e\nK\3L\5L\u0851"+
		"\nL\3L\3L\3L\5L\u0856\nL\3L\5L\u0859\nL\3L\3L\3L\5L\u085e\nL\3L\3L\5L"+
		"\u0862\nL\3L\5L\u0865\nL\3L\5L\u0868\nL\3M\3M\3M\3M\5M\u086e\nM\3N\3N"+
		"\3N\5N\u0873\nN\3N\3N\3O\5O\u0878\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\5O\u088a\nO\5O\u088c\nO\3O\5O\u088f\nO\3P\3P\3P\3P\3Q"+
		"\3Q\3Q\7Q\u0898\nQ\fQ\16Q\u089b\13Q\3R\3R\3R\3R\7R\u08a1\nR\fR\16R\u08a4"+
		"\13R\3R\3R\3S\3S\5S\u08aa\nS\3T\3T\3T\3T\7T\u08b0\nT\fT\16T\u08b3\13T"+
		"\3T\3T\3U\3U\5U\u08b9\nU\3V\3V\5V\u08bd\nV\3V\3V\3V\3V\3V\3V\5V\u08c5"+
		"\nV\3V\3V\3V\3V\3V\3V\5V\u08cd\nV\3V\3V\3V\3V\5V\u08d3\nV\3W\3W\3W\3W"+
		"\7W\u08d9\nW\fW\16W\u08dc\13W\3W\3W\3X\3X\3X\3X\3X\7X\u08e5\nX\fX\16X"+
		"\u08e8\13X\5X\u08ea\nX\3X\3X\3X\3Y\5Y\u08f0\nY\3Y\3Y\5Y\u08f4\nY\5Y\u08f6"+
		"\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u08ff\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z"+
		"\u090b\nZ\5Z\u090d\nZ\3Z\3Z\3Z\3Z\3Z\5Z\u0914\nZ\3Z\3Z\3Z\3Z\3Z\5Z\u091b"+
		"\nZ\3Z\3Z\3Z\3Z\5Z\u0921\nZ\3Z\3Z\3Z\3Z\5Z\u0927\nZ\5Z\u0929\nZ\3[\3["+
		"\3[\7[\u092e\n[\f[\16[\u0931\13[\3\\\3\\\3\\\7\\\u0936\n\\\f\\\16\\\u0939"+
		"\13\\\3]\3]\3]\5]\u093e\n]\3]\3]\3^\3^\3^\5^\u0945\n^\3^\3^\3_\3_\5_\u094b"+
		"\n_\3_\3_\5_\u094f\n_\5_\u0951\n_\3`\3`\3`\7`\u0956\n`\f`\16`\u0959\13"+
		"`\3a\3a\3a\3a\7a\u095f\na\fa\16a\u0962\13a\3a\3a\3b\3b\5b\u0968\nb\3c"+
		"\3c\3c\3c\3c\3c\7c\u0970\nc\fc\16c\u0973\13c\3c\3c\5c\u0977\nc\3d\3d\5"+
		"d\u097b\nd\3e\3e\3f\3f\3f\7f\u0982\nf\ff\16f\u0985\13f\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\5g\u0991\ng\5g\u0993\ng\3g\3g\3g\3g\3g\3g\7g\u099b\ng"+
		"\fg\16g\u099e\13g\3h\5h\u09a1\nh\3h\3h\3h\3h\3h\3h\5h\u09a9\nh\3h\3h\3"+
		"h\3h\3h\7h\u09b0\nh\fh\16h\u09b3\13h\3h\3h\3h\5h\u09b8\nh\3h\3h\3h\3h"+
		"\3h\3h\5h\u09c0\nh\3h\3h\3h\5h\u09c5\nh\3h\3h\3h\3h\3h\3h\3h\3h\7h\u09cf"+
		"\nh\fh\16h\u09d2\13h\3h\3h\5h\u09d6\nh\3h\5h\u09d9\nh\3h\3h\3h\3h\5h\u09df"+
		"\nh\3h\3h\5h\u09e3\nh\3h\3h\3h\5h\u09e8\nh\3h\3h\3h\5h\u09ed\nh\3h\3h"+
		"\3h\5h\u09f2\nh\3i\3i\3i\3i\5i\u09f8\ni\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i"+
		"\3i\3i\3i\3i\3i\3i\3i\3i\3i\7i\u0a0d\ni\fi\16i\u0a10\13i\3j\3j\3j\3j\6"+
		"j\u0a16\nj\rj\16j\u0a17\3j\3j\5j\u0a1c\nj\3j\3j\3j\3j\3j\6j\u0a23\nj\r"+
		"j\16j\u0a24\3j\3j\5j\u0a29\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\7j\u0a39\nj\fj\16j\u0a3c\13j\5j\u0a3e\nj\3j\3j\3j\3j\3j\3j\5j\u0a46"+
		"\nj\3j\3j\3j\3j\3j\3j\3j\5j\u0a4f\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\6j\u0a64\nj\rj\16j\u0a65\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\5j\u0a71\nj\3j\3j\3j\7j\u0a76\nj\fj\16j\u0a79\13j\5j\u0a7b\nj"+
		"\3j\3j\3j\3j\3j\3j\3j\5j\u0a84\nj\3j\3j\5j\u0a88\nj\3j\3j\5j\u0a8c\nj"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\6j\u0a96\nj\rj\16j\u0a97\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0ab1\nj\3j\3j\3"+
		"j\3j\3j\5j\u0ab8\nj\3j\5j\u0abb\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\5j\u0aca\nj\3j\3j\5j\u0ace\nj\3j\3j\3j\3j\3j\3j\3j\3j\7j\u0ad8\n"+
		"j\fj\16j\u0adb\13j\3k\3k\3k\3k\3k\3k\3k\3k\6k\u0ae5\nk\rk\16k\u0ae6\5"+
		"k\u0ae9\nk\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3p\5p\u0af6\np\3q\3q\5q\u0afa"+
		"\nq\3r\3r\3r\6r\u0aff\nr\rr\16r\u0b00\3s\3s\3s\5s\u0b06\ns\3t\3t\3t\3"+
		"t\3t\3u\5u\u0b0e\nu\3u\3u\3v\3v\3v\5v\u0b15\nv\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\5w\u0b26\nw\3w\3w\5w\u0b2a\nw\3w\3w\3w\3w\5w\u0b30"+
		"\nw\3w\3w\3w\3w\5w\u0b36\nw\3w\3w\3w\3w\3w\7w\u0b3d\nw\fw\16w\u0b40\13"+
		"w\3w\5w\u0b43\nw\5w\u0b45\nw\3x\3x\3x\7x\u0b4a\nx\fx\16x\u0b4d\13x\3y"+
		"\3y\3y\3y\5y\u0b53\ny\3y\5y\u0b56\ny\3y\5y\u0b59\ny\3z\3z\3z\7z\u0b5e"+
		"\nz\fz\16z\u0b61\13z\3{\3{\3{\3{\5{\u0b67\n{\3{\5{\u0b6a\n{\3|\3|\3|\7"+
		"|\u0b6f\n|\f|\16|\u0b72\13|\3}\3}\5}\u0b76\n}\3}\3}\3}\5}\u0b7b\n}\3}"+
		"\5}\u0b7e\n}\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\7\177\u0b89\n\177"+
		"\f\177\16\177\u0b8c\13\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u0b9d\n\u0081\f\u0081\16\u0081\u0ba0\13\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\7\u0081\u0ba7\n\u0081\f\u0081\16\u0081\u0baa"+
		"\13\u0081\5\u0081\u0bac\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u0bb3\n\u0081\f\u0081\16\u0081\u0bb6\13\u0081\5\u0081\u0bb8\n"+
		"\u0081\5\u0081\u0bba\n\u0081\3\u0081\5\u0081\u0bbd\n\u0081\3\u0081\5\u0081"+
		"\u0bc0\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u0bd2\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u0bdb\n\u0083\3\u0084\3\u0084\3\u0084\7\u0084\u0be0\n"+
		"\u0084\f\u0084\16\u0084\u0be3\13\u0084\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\5\u0085\u0be9\n\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u0bee\n\u0086\f"+
		"\u0086\16\u0086\u0bf1\13\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\6\u0088\u0bf8\n\u0088\r\u0088\16\u0088\u0bf9\3\u0088\5\u0088\u0bfd\n"+
		"\u0088\3\u0089\3\u0089\3\u0089\5\u0089\u0c02\n\u0089\3\u008a\3\u008a\3"+
		"\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0c0a\n\u008a\3\u008b\3\u008b\3"+
		"\u008c\3\u008c\5\u008c\u0c10\n\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0c15"+
		"\n\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0c1a\n\u008c\3\u008c\3\u008c"+
		"\5\u008c\u0c1e\n\u008c\3\u008c\3\u008c\5\u008c\u0c22\n\u008c\3\u008c\3"+
		"\u008c\5\u008c\u0c26\n\u008c\3\u008c\3\u008c\5\u008c\u0c2a\n\u008c\3\u008c"+
		"\3\u008c\5\u008c\u0c2e\n\u008c\3\u008c\3\u008c\5\u008c\u0c32\n\u008c\3"+
		"\u008c\3\u008c\5\u008c\u0c36\n\u008c\3\u008c\5\u008c\u0c39\n\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0c42\n\u008d"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\13\u038f\u03d0"+
		"\u03d8\u03e9\u03f7\u0400\u0409\u0412\u0419\6V\u00cc\u00d0\u00d2\u0091"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\2\65\4\2CC\u00b7\u00b7\4\2\"\"\u00c6\u00c6\4\2BB\u0099\u0099\4"+
		"\2ggtt\3\2-.\4\2\u00e8\u00e8\u0108\u0108\4\2\21\21%%\7\2**\66\66YYff\u0090"+
		"\u0090\3\2GH\4\2YYff\4\2\u009d\u009d\u0123\u0123\5\2\16\16OO\u00e7\u00e7"+
		"\4\2\16\16\u008a\u008a\4\2\u008c\u008c\u0123\u0123\5\2AA\u0098\u0098\u00d1"+
		"\u00d1\6\2TT{{\u00d9\u00d9\u00fe\u00fe\5\2TT\u00d9\u00d9\u00fe\u00fe\4"+
		"\2\31\31GG\4\2aa\u0082\u0082\4\299\u00cd\u00cd\4\2\20\20LL\4\2\u0127\u0127"+
		"\u0129\u0129\5\2\20\20\25\25\u00dd\u00dd\5\2\\\\\u00f7\u00f7\u0100\u0100"+
		"\4\2\u0119\u011a\u011e\u011e\4\2NN\u011b\u011d\4\2\u0119\u011a\u0121\u0121"+
		"\4\2;;=>\4\2$$\u00f9\u00f9\4\2rr\u00c5\u00c5\3\2\u00e5\u00e6\4\2\6\6g"+
		"g\4\2\6\6cc\5\2\35\35\u0085\u0085\u00f2\u00f2\3\2\u0111\u0118\4\2NN\u0119"+
		"\u0122\6\2\23\23tt\u009c\u009c\u00a4\u00a4\4\2\\\\\u00f7\u00f7\3\2\u0119"+
		"\u011a\5\2\u0123\u0123\u0127\u0127\u0129\u0129\4\2\u0096\u0096\u010f\u010f"+
		"\6\2??pp\u0095\u0095\u00d0\u00d0\5\2pp\u0095\u0095\u00d0\u00d0\4\2MM\u00ad"+
		"\u00ad\4\2\u00a5\u00a5\u00de\u00de\4\2bb\u00b4\u00b4\3\2\u0128\u0129\4"+
		"\2OO\u00d8\u00d8\63\2\16\17\21\22\24\24\26\27\31\32\34\34\36\"%%\'*,,"+
		".\64\66\669:?KMOSSU[^^`befiknnpsuvxz||\177\177\u0081\u0082\u0084\u0084"+
		"\u0087\u0099\u009b\u009b\u009e\u009f\u00a2\u00a3\u00a6\u00a6\u00a8\u00a9"+
		"\u00ab\u00b4\u00b6\u00be\u00c0\u00c7\u00c9\u00d1\u00d3\u00d6\u00d8\u00dc"+
		"\u00de\u00e7\u00e9\u00ed\u00f1\u00f1\u00f3\u00fd\u0101\u0104\u0107\u010a"+
		"\u010d\u010d\u010f\u0110\22\2\24\2488TThhww{{\u0080\u0080\u0083\u0083"+
		"\u0086\u0086\u009a\u009a\u00a0\u00a0\u00c8\u00c8\u00d3\u00d3\u00d9\u00d9"+
		"\u00fe\u00fe\u0106\u0106\23\2\16\23\25\679SUgivxz|\177\u0081\u0082\u0084"+
		"\u0085\u0087\u0099\u009b\u009f\u00a1\u00c7\u00c9\u00d2\u00d4\u00d8\u00da"+
		"\u00fd\u00ff\u0105\u0107\u0110\2\u0e34\2\u0120\3\2\2\2\4\u0129\3\2\2\2"+
		"\6\u012c\3\2\2\2\b\u012f\3\2\2\2\n\u0132\3\2\2\2\f\u0135\3\2\2\2\16\u0138"+
		"\3\2\2\2\20\u041e\3\2\2\2\22\u0420\3\2\2\2\24\u0422\3\2\2\2\26\u04cc\3"+
		"\2\2\2\30\u04ce\3\2\2\2\32\u04df\3\2\2\2\34\u04e5\3\2\2\2\36\u04f1\3\2"+
		"\2\2 \u04fe\3\2\2\2\"\u0501\3\2\2\2$\u0505\3\2\2\2&\u0547\3\2\2\2(\u0549"+
		"\3\2\2\2*\u054d\3\2\2\2,\u0559\3\2\2\2.\u055e\3\2\2\2\60\u0565\3\2\2\2"+
		"\62\u0567\3\2\2\2\64\u056f\3\2\2\2\66\u0578\3\2\2\28\u0583\3\2\2\2:\u0595"+
		"\3\2\2\2<\u0598\3\2\2\2>\u05a3\3\2\2\2@\u05b3\3\2\2\2B\u05b9\3\2\2\2D"+
		"\u05bb\3\2\2\2F\u05c6\3\2\2\2H\u05d7\3\2\2\2J\u05de\3\2\2\2L\u05e0\3\2"+
		"\2\2N\u05e6\3\2\2\2P\u061c\3\2\2\2R\u0628\3\2\2\2T\u0658\3\2\2\2V\u065b"+
		"\3\2\2\2X\u0681\3\2\2\2Z\u0683\3\2\2\2\\\u068b\3\2\2\2^\u06ac\3\2\2\2"+
		"`\u06da\3\2\2\2b\u06ef\3\2\2\2d\u070f\3\2\2\2f\u071b\3\2\2\2h\u071e\3"+
		"\2\2\2j\u0727\3\2\2\2l\u0738\3\2\2\2n\u074c\3\2\2\2p\u074e\3\2\2\2r\u0756"+
		"\3\2\2\2t\u075a\3\2\2\2v\u075d\3\2\2\2x\u0760\3\2\2\2z\u077a\3\2\2\2|"+
		"\u077c\3\2\2\2~\u07b5\3\2\2\2\u0080\u07b9\3\2\2\2\u0082\u07d4\3\2\2\2"+
		"\u0084\u07d8\3\2\2\2\u0086\u07e7\3\2\2\2\u0088\u07e9\3\2\2\2\u008a\u0807"+
		"\3\2\2\2\u008c\u0809\3\2\2\2\u008e\u0810\3\2\2\2\u0090\u0830\3\2\2\2\u0092"+
		"\u0833\3\2\2\2\u0094\u084d\3\2\2\2\u0096\u0867\3\2\2\2\u0098\u086d\3\2"+
		"\2\2\u009a\u086f\3\2\2\2\u009c\u088e\3\2\2\2\u009e\u0890\3\2\2\2\u00a0"+
		"\u0894\3\2\2\2\u00a2\u089c\3\2\2\2\u00a4\u08a7\3\2\2\2\u00a6\u08ab\3\2"+
		"\2\2\u00a8\u08b6\3\2\2\2\u00aa\u08d2\3\2\2\2\u00ac\u08d4\3\2\2\2\u00ae"+
		"\u08df\3\2\2\2\u00b0\u08f5\3\2\2\2\u00b2\u0928\3\2\2\2\u00b4\u092a\3\2"+
		"\2\2\u00b6\u0932\3\2\2\2\u00b8\u093d\3\2\2\2\u00ba\u0944\3\2\2\2\u00bc"+
		"\u0948\3\2\2\2\u00be\u0952\3\2\2\2\u00c0\u095a\3\2\2\2\u00c2\u0967\3\2"+
		"\2\2\u00c4\u0976\3\2\2\2\u00c6\u097a\3\2\2\2\u00c8\u097c\3\2\2\2\u00ca"+
		"\u097e\3\2\2\2\u00cc\u0992\3\2\2\2\u00ce\u09f1\3\2\2\2\u00d0\u09f7\3\2"+
		"\2\2\u00d2\u0acd\3\2\2\2\u00d4\u0ae8\3\2\2\2\u00d6\u0aea\3\2\2\2\u00d8"+
		"\u0aec\3\2\2\2\u00da\u0aee\3\2\2\2\u00dc\u0af0\3\2\2\2\u00de\u0af2\3\2"+
		"\2\2\u00e0\u0af7\3\2\2\2\u00e2\u0afe\3\2\2\2\u00e4\u0b02\3\2\2\2\u00e6"+
		"\u0b07\3\2\2\2\u00e8\u0b0d\3\2\2\2\u00ea\u0b14\3\2\2\2\u00ec\u0b44\3\2"+
		"\2\2\u00ee\u0b46\3\2\2\2\u00f0\u0b4e\3\2\2\2\u00f2\u0b5a\3\2\2\2\u00f4"+
		"\u0b62\3\2\2\2\u00f6\u0b6b\3\2\2\2\u00f8\u0b73\3\2\2\2\u00fa\u0b7f\3\2"+
		"\2\2\u00fc\u0b84\3\2\2\2\u00fe\u0b8d\3\2\2\2\u0100\u0bbf\3\2\2\2\u0102"+
		"\u0bd1\3\2\2\2\u0104\u0bda\3\2\2\2\u0106\u0bdc\3\2\2\2\u0108\u0be8\3\2"+
		"\2\2\u010a\u0bea\3\2\2\2\u010c\u0bf2\3\2\2\2\u010e\u0bfc\3\2\2\2\u0110"+
		"\u0c01\3\2\2\2\u0112\u0c09\3\2\2\2\u0114\u0c0b\3\2\2\2\u0116\u0c38\3\2"+
		"\2\2\u0118\u0c41\3\2\2\2\u011a\u0c43\3\2\2\2\u011c\u0c45\3\2\2\2\u011e"+
		"\u0c47\3\2\2\2\u0120\u0124\5\20\t\2\u0121\u0123\7\3\2\2\u0122\u0121\3"+
		"\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\2\2\3\u0128\3\3\2\2\2"+
		"\u0129\u012a\5\u00bc_\2\u012a\u012b\7\2\2\3\u012b\5\3\2\2\2\u012c\u012d"+
		"\5\u00b8]\2\u012d\u012e\7\2\2\3\u012e\7\3\2\2\2\u012f\u0130\5\u00b6\\"+
		"\2\u0130\u0131\7\2\2\3\u0131\t\3\2\2\2\u0132\u0133\5\u00ba^\2\u0133\u0134"+
		"\7\2\2\3\u0134\13\3\2\2\2\u0135\u0136\5\u00ecw\2\u0136\u0137\7\2\2\3\u0137"+
		"\r\3\2\2\2\u0138\u0139\5\u00f2z\2\u0139\u013a\7\2\2\3\u013a\17\3\2\2\2"+
		"\u013b\u041f\5$\23\2\u013c\u013e\5\64\33\2\u013d\u013c\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u041f\5P)\2\u0140\u0142\7\u0104\2\2"+
		"\u0141\u0143\7\u0098\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u041f\5\u00b6\\\2\u0145\u0146\7\67\2\2\u0146\u014a"+
		"\5.\30\2\u0147\u0148\7q\2\2\u0148\u0149\7\u009c\2\2\u0149\u014b\7V\2\2"+
		"\u014a\u0147\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0154"+
		"\5\u00b6\\\2\u014d\u0153\5\"\22\2\u014e\u0153\5 \21\2\u014f\u0150\7\u010e"+
		"\2\2\u0150\u0151\t\2\2\2\u0151\u0153\5<\37\2\u0152\u014d\3\2\2\2\u0152"+
		"\u014e\3\2\2\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u041f\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0158\7\21\2\2\u0158\u0159\5.\30\2\u0159\u015a\5\u00b6\\\2\u015a\u015b"+
		"\7\u00d8\2\2\u015b\u015c\t\2\2\2\u015c\u015d\5<\37\2\u015d\u041f\3\2\2"+
		"\2\u015e\u015f\7\21\2\2\u015f\u0160\5.\30\2\u0160\u0161\5\u00b6\\\2\u0161"+
		"\u0162\7\u00d8\2\2\u0162\u0163\5 \21\2\u0163\u041f\3\2\2\2\u0164\u0165"+
		"\7O\2\2\u0165\u0168\5.\30\2\u0166\u0167\7q\2\2\u0167\u0169\7V\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\5\u00b6"+
		"\\\2\u016b\u016d\t\3\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u041f\3\2\2\2\u016e\u016f\7\u00db\2\2\u016f\u0172\t\4\2\2\u0170\u0171"+
		"\t\5\2\2\u0171\u0173\5\u00b6\\\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2"+
		"\2\u0173\u0178\3\2\2\2\u0174\u0176\7\u0087\2\2\u0175\u0174\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\7\u0123\2\2\u0178\u0175"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u041f\3\2\2\2\u017a\u017f\5\30\r\2"+
		"\u017b\u017c\7\4\2\2\u017c\u017d\5\u00f2z\2\u017d\u017e\7\5\2\2\u017e"+
		"\u0180\3\2\2\2\u017f\u017b\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2"+
		"\2\2\u0181\u0183\58\35\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0189\5:\36\2\u0185\u0187\7\30\2\2\u0186\u0185\3"+
		"\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\5$\23\2\u0189"+
		"\u0186\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u041f\3\2\2\2\u018b\u018c\7\67"+
		"\2\2\u018c\u0190\7\u00e8\2\2\u018d\u018e\7q\2\2\u018e\u018f\7\u009c\2"+
		"\2\u018f\u0191\7V\2\2\u0190\u018d\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0193\5\u00b8]\2\u0193\u0194\7\u0087\2\2\u0194\u019d\5"+
		"\u00b8]\2\u0195\u019c\58\35\2\u0196\u019c\5\u00b2Z\2\u0197\u019c\5H%\2"+
		"\u0198\u019c\5 \21\2\u0199\u019a\7\u00eb\2\2\u019a\u019c\5<\37\2\u019b"+
		"\u0195\3\2\2\2\u019b\u0196\3\2\2\2\u019b\u0197\3\2\2\2\u019b\u0198\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u041f\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a5\5\32"+
		"\16\2\u01a1\u01a2\7\4\2\2\u01a2\u01a3\5\u00f2z\2\u01a3\u01a4\7\5\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2"+
		"\2\2\u01a7\u01a9\58\35\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01af\5:\36\2\u01ab\u01ad\7\30\2\2\u01ac\u01ab\3"+
		"\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\5$\23\2\u01af"+
		"\u01ac\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u041f\3\2\2\2\u01b1\u01b2\7\22"+
		"\2\2\u01b2\u01b3\7\u00e8\2\2\u01b3\u01b5\5\u00b6\\\2\u01b4\u01b6\5*\26"+
		"\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8"+
		"\7\63\2\2\u01b8\u01c0\7\u00e1\2\2\u01b9\u01c1\5\u0110\u0089\2\u01ba\u01bb"+
		"\7c\2\2\u01bb\u01bc\7.\2\2\u01bc\u01c1\5\u00a0Q\2\u01bd\u01be\7c\2\2\u01be"+
		"\u01bf\7\20\2\2\u01bf\u01c1\7.\2\2\u01c0\u01b9\3\2\2\2\u01c0\u01ba\3\2"+
		"\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u041f\3\2\2\2\u01c2"+
		"\u01c3\7\22\2\2\u01c3\u01c6\7\u00e9\2\2\u01c4\u01c5\t\5\2\2\u01c5\u01c7"+
		"\5\u00b6\\\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2"+
		"\2\u01c8\u01c9\7\63\2\2\u01c9\u01cb\7\u00e1\2\2\u01ca\u01cc\5\u0110\u0089"+
		"\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u041f\3\2\2\2\u01cd\u01ce"+
		"\7\21\2\2\u01ce\u01cf\7\u00e8\2\2\u01cf\u01d0\5\u00b6\\\2\u01d0\u01d1"+
		"\7\16\2\2\u01d1\u01d2\t\6\2\2\u01d2\u01d3\5\u00eex\2\u01d3\u041f\3\2\2"+
		"\2\u01d4\u01d5\7\21\2\2\u01d5\u01d6\7\u00e8\2\2\u01d6\u01d7\5\u00b6\\"+
		"\2\u01d7\u01d8\7\16\2\2\u01d8\u01d9\t\6\2\2\u01d9\u01da\7\4\2\2\u01da"+
		"\u01db\5\u00eex\2\u01db\u01dc\7\5\2\2\u01dc\u041f\3\2\2\2\u01dd\u01de"+
		"\7\21\2\2\u01de\u01df\7\u00e8\2\2\u01df\u01e0\5\u00b6\\\2\u01e0\u01e1"+
		"\7\u00c1\2\2\u01e1\u01e2\7-\2\2\u01e2\u01e3\5\u00b6\\\2\u01e3\u01e4\7"+
		"\u00f0\2\2\u01e4\u01e5\5\u010c\u0087\2\u01e5\u041f\3\2\2\2\u01e6\u01e7"+
		"\7\21\2\2\u01e7\u01e8\7\u00e8\2\2\u01e8\u01e9\5\u00b6\\\2\u01e9\u01ea"+
		"\7O\2\2\u01ea\u01eb\t\6\2\2\u01eb\u01ec\7\4\2\2\u01ec\u01ed\5\u00b4[\2"+
		"\u01ed\u01ee\7\5\2\2\u01ee\u041f\3\2\2\2\u01ef\u01f0\7\21\2\2\u01f0\u01f1"+
		"\7\u00e8\2\2\u01f1\u01f2\5\u00b6\\\2\u01f2\u01f3\7O\2\2\u01f3\u01f4\t"+
		"\6\2\2\u01f4\u01f5\5\u00b4[\2\u01f5\u041f\3\2\2\2\u01f6\u01f7\7\21\2\2"+
		"\u01f7\u01f8\t\7\2\2\u01f8\u01f9\5\u00b6\\\2\u01f9\u01fa\7\u00c1\2\2\u01fa"+
		"\u01fb\7\u00f0\2\2\u01fb\u01fc\5\u00b6\\\2\u01fc\u041f\3\2\2\2\u01fd\u01fe"+
		"\7\21\2\2\u01fe\u01ff\t\7\2\2\u01ff\u0200\5\u00b6\\\2\u0200\u0201\7\u00d8"+
		"\2\2\u0201\u0202\7\u00eb\2\2\u0202\u0203\5<\37\2\u0203\u041f\3\2\2\2\u0204"+
		"\u0205\7\21\2\2\u0205\u0206\t\7\2\2\u0206\u0207\5\u00b6\\\2\u0207\u0208"+
		"\7\u0102\2\2\u0208\u020b\7\u00eb\2\2\u0209\u020a\7q\2\2\u020a\u020c\7"+
		"V\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020e\5<\37\2\u020e\u041f\3\2\2\2\u020f\u0210\7\21\2\2\u0210\u0211\7"+
		"\u00e8\2\2\u0211\u0212\5\u00b6\\\2\u0212\u0214\t\b\2\2\u0213\u0215\7-"+
		"\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\5\u00b6\\\2\u0217\u0219\5\u0118\u008d\2\u0218\u0217\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u041f\3\2\2\2\u021a\u021b\7\21\2\2\u021b\u021c\7"+
		"\u00e8\2\2\u021c\u021e\5\u00b6\\\2\u021d\u021f\5*\26\2\u021e\u021d\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\7%\2\2\u0221"+
		"\u0223\7-\2\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0225\5\u00b6\\\2\u0225\u0227\5\u00f4{\2\u0226\u0228\5\u00ea"+
		"v\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u041f\3\2\2\2\u0229"+
		"\u022a\7\21\2\2\u022a\u022b\7\u00e8\2\2\u022b\u022d\5\u00b6\\\2\u022c"+
		"\u022e\5*\26\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2"+
		"\2\2\u022f\u0230\7\u00c3\2\2\u0230\u0231\7.\2\2\u0231\u0232\7\4\2\2\u0232"+
		"\u0233\5\u00eex\2\u0233\u0234\7\5\2\2\u0234\u041f\3\2\2\2\u0235\u0236"+
		"\7\21\2\2\u0236\u0237\7\u00e8\2\2\u0237\u0239\5\u00b6\\\2\u0238\u023a"+
		"\5*\26\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023c\7\u00d8\2\2\u023c\u023d\7\u00d5\2\2\u023d\u0241\7\u0123\2\2\u023e"+
		"\u023f\7\u010e\2\2\u023f\u0240\7\u00d6\2\2\u0240\u0242\5<\37\2\u0241\u023e"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u041f\3\2\2\2\u0243\u0244\7\21\2\2"+
		"\u0244\u0245\7\u00e8\2\2\u0245\u0247\5\u00b6\\\2\u0246\u0248\5*\26\2\u0247"+
		"\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7\u00d8"+
		"\2\2\u024a\u024b\7\u00d6\2\2\u024b\u024c\5<\37\2\u024c\u041f\3\2\2\2\u024d"+
		"\u024e\7\21\2\2\u024e\u024f\t\7\2\2\u024f\u0250\5\u00b6\\\2\u0250\u0254"+
		"\7\16\2\2\u0251\u0252\7q\2\2\u0252\u0253\7\u009c\2\2\u0253\u0255\7V\2"+
		"\2\u0254\u0251\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0258"+
		"\5(\25\2\u0257\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u041f\3\2\2\2\u025b\u025c\7\21\2\2\u025c\u025d\7"+
		"\u00e8\2\2\u025d\u025e\5\u00b6\\\2\u025e\u025f\5*\26\2\u025f\u0260\7\u00c1"+
		"\2\2\u0260\u0261\7\u00f0\2\2\u0261\u0262\5*\26\2\u0262\u041f\3\2\2\2\u0263"+
		"\u0264\7\21\2\2\u0264\u0265\t\7\2\2\u0265\u0266\5\u00b6\\\2\u0266\u0269"+
		"\7O\2\2\u0267\u0268\7q\2\2\u0268\u026a\7V\2\2\u0269\u0267\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u0270\5*\26\2\u026c\u026d\7\6"+
		"\2\2\u026d\u026f\5*\26\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2\2\2\u0270"+
		"\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2"+
		"\2\2\u0273\u0275\7\u00b8\2\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u041f\3\2\2\2\u0276\u0277\7\21\2\2\u0277\u0278\7\u00e8\2\2\u0278\u027a"+
		"\5\u00b6\\\2\u0279\u027b\5*\26\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2"+
		"\2\u027b\u027c\3\2\2\2\u027c\u027d\7\u00d8\2\2\u027d\u027e\5 \21\2\u027e"+
		"\u041f\3\2\2\2\u027f\u0280\7\21\2\2\u0280\u0281\7\u00e8\2\2\u0281\u0282"+
		"\5\u00b6\\\2\u0282\u0283\7\u00bd\2\2\u0283\u0284\7\u00af\2\2\u0284\u041f"+
		"\3\2\2\2\u0285\u0286\7O\2\2\u0286\u0289\7\u00e8\2\2\u0287\u0288\7q\2\2"+
		"\u0288\u028a\7V\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b"+
		"\3\2\2\2\u028b\u028d\5\u00b6\\\2\u028c\u028e\7\u00b8\2\2\u028d\u028c\3"+
		"\2\2\2\u028d\u028e\3\2\2\2\u028e\u041f\3\2\2\2\u028f\u0290\7O\2\2\u0290"+
		"\u0293\7\u0108\2\2\u0291\u0292\7q\2\2\u0292\u0294\7V\2\2\u0293\u0291\3"+
		"\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u041f\5\u00b6\\\2"+
		"\u0296\u0299\7\67\2\2\u0297\u0298\7\u00a4\2\2\u0298\u029a\7\u00c3\2\2"+
		"\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029f\3\2\2\2\u029b\u029d"+
		"\7k\2\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u02a0\7\u00ec\2\2\u029f\u029c\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a5\7\u0108\2\2\u02a2\u02a3\7q\2\2\u02a3\u02a4\7\u009c"+
		"\2\2\u02a4\u02a6\7V\2\2\u02a5\u02a2\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a9\5\u00b6\\\2\u02a8\u02aa\5\u00a6T\2\u02a9\u02a8"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02b3\3\2\2\2\u02ab\u02b2\5\"\22\2"+
		"\u02ac\u02ad\7\u00ae\2\2\u02ad\u02ae\7\u00a0\2\2\u02ae\u02b2\5\u009eP"+
		"\2\u02af\u02b0\7\u00eb\2\2\u02b0\u02b2\5<\37\2\u02b1\u02ab\3\2\2\2\u02b1"+
		"\u02ac\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2"+
		"\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6"+
		"\u02b7\7\30\2\2\u02b7\u02b8\5$\23\2\u02b8\u041f\3\2\2\2\u02b9\u02bc\7"+
		"\67\2\2\u02ba\u02bb\7\u00a4\2\2\u02bb\u02bd\7\u00c3\2\2\u02bc\u02ba\3"+
		"\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02c0\7k\2\2\u02bf"+
		"\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\7\u00ec"+
		"\2\2\u02c2\u02c3\7\u0108\2\2\u02c3\u02c8\5\u00b8]\2\u02c4\u02c5\7\4\2"+
		"\2\u02c5\u02c6\5\u00f2z\2\u02c6\u02c7\7\5\2\2\u02c7\u02c9\3\2\2\2\u02c8"+
		"\u02c4\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cd\58"+
		"\35\2\u02cb\u02cc\7\u00a3\2\2\u02cc\u02ce\5<\37\2\u02cd\u02cb\3\2\2\2"+
		"\u02cd\u02ce\3\2\2\2\u02ce\u041f\3\2\2\2\u02cf\u02d0\7\21\2\2\u02d0\u02d1"+
		"\7\u0108\2\2\u02d1\u02d3\5\u00b6\\\2\u02d2\u02d4\7\30\2\2\u02d3\u02d2"+
		"\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\5$\23\2\u02d6"+
		"\u041f\3\2\2\2\u02d7\u02da\7\67\2\2\u02d8\u02d9\7\u00a4\2\2\u02d9\u02db"+
		"\7\u00c3\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2"+
		"\2\u02dc\u02de\7\u00ec\2\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e3\7i\2\2\u02e0\u02e1\7q\2\2\u02e1\u02e2\7\u009c"+
		"\2\2\u02e2\u02e4\7V\2\2\u02e3\u02e0\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e6\5\u00b6\\\2\u02e6\u02e7\7\30\2\2\u02e7\u02f1"+
		"\7\u0123\2\2\u02e8\u02e9\7\u0106\2\2\u02e9\u02ee\5N(\2\u02ea\u02eb\7\6"+
		"\2\2\u02eb\u02ed\5N(\2\u02ec\u02ea\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec"+
		"\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1"+
		"\u02e8\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u041f\3\2\2\2\u02f3\u02f5\7O"+
		"\2\2\u02f4\u02f6\7\u00ec\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02fa\7i\2\2\u02f8\u02f9\7q\2\2\u02f9\u02fb\7V\2"+
		"\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u041f"+
		"\5\u00b6\\\2\u02fd\u02ff\7W\2\2\u02fe\u0300\t\t\2\2\u02ff\u02fe\3\2\2"+
		"\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u041f\5\20\t\2\u0302"+
		"\u0303\7\u00db\2\2\u0303\u0306\7\u00e9\2\2\u0304\u0305\t\5\2\2\u0305\u0307"+
		"\5\u00b6\\\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u030c\3\2\2"+
		"\2\u0308\u030a\7\u0087\2\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030b\u030d\7\u0123\2\2\u030c\u0309\3\2\2\2\u030c\u030d"+
		"\3\2\2\2\u030d\u041f\3\2\2\2\u030e\u030f\7\u00db\2\2\u030f\u0310\7\u00e8"+
		"\2\2\u0310\u0313\7Y\2\2\u0311\u0312\t\5\2\2\u0312\u0314\5\u00b6\\\2\u0313"+
		"\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\7\u0087"+
		"\2\2\u0316\u0318\7\u0123\2\2\u0317\u0319\5*\26\2\u0318\u0317\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u041f\3\2\2\2\u031a\u031b\7\u00db\2\2\u031b\u031c"+
		"\7\u00eb\2\2\u031c\u0321\5\u00b6\\\2\u031d\u031e\7\4\2\2\u031e\u031f\5"+
		"@!\2\u031f\u0320\7\5\2\2\u0320\u0322\3\2\2\2\u0321\u031d\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u041f\3\2\2\2\u0323\u0324\7\u00db\2\2\u0324\u0325"+
		"\7.\2\2\u0325\u0326\t\5\2\2\u0326\u0329\5\u00b6\\\2\u0327\u0328\t\5\2"+
		"\2\u0328\u032a\5\u00b6\\\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a"+
		"\u041f\3\2\2\2\u032b\u032c\7\u00db\2\2\u032c\u032f\7\u0109\2\2\u032d\u032e"+
		"\t\5\2\2\u032e\u0330\5\u00b6\\\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2"+
		"\2\u0330\u0335\3\2\2\2\u0331\u0333\7\u0087\2\2\u0332\u0331\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\7\u0123\2\2\u0335\u0332"+
		"\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u041f\3\2\2\2\u0337\u0338\7\u00db\2"+
		"\2\u0338\u0339\7\u00af\2\2\u0339\u033b\5\u00b6\\\2\u033a\u033c\5*\26\2"+
		"\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u041f\3\2\2\2\u033d\u033f"+
		"\7\u00db\2\2\u033e\u0340\5\u0110\u0089\2\u033f\u033e\3\2\2\2\u033f\u0340"+
		"\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0349\7j\2\2\u0342\u0344\7\u0087\2"+
		"\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0348"+
		"\5\u00b6\\\2\u0346\u0348\7\u0123\2\2\u0347\u0345\3\2\2\2\u0347\u0346\3"+
		"\2\2\2\u0348\u034a\3\2\2\2\u0349\u0343\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u041f\3\2\2\2\u034b\u034c\7\u00db\2\2\u034c\u034d\7\67\2\2\u034d\u034e"+
		"\7\u00e8\2\2\u034e\u0351\5\u00b6\\\2\u034f\u0350\7\30\2\2\u0350\u0352"+
		"\7\u00d5\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u041f\3\2\2"+
		"\2\u0353\u0354\7\u00db\2\2\u0354\u0355\7:\2\2\u0355\u041f\7\u0098\2\2"+
		"\u0356\u0357\t\n\2\2\u0357\u0359\7i\2\2\u0358\u035a\7Y\2\2\u0359\u0358"+
		"\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u041f\5\60\31\2"+
		"\u035c\u035d\t\n\2\2\u035d\u035f\5.\30\2\u035e\u0360\7Y\2\2\u035f\u035e"+
		"\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\5\u00b6\\"+
		"\2\u0362\u041f\3\2\2\2\u0363\u0365\t\n\2\2\u0364\u0366\7\u00e8\2\2\u0365"+
		"\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2\2\u0367\u0369\t\13"+
		"\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036c\5\u00b6\\\2\u036b\u036d\5*\26\2\u036c\u036b\3\2\2\2\u036c\u036d"+
		"\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u0370\5\62\32\2\u036f\u036e\3\2\2\2"+
		"\u036f\u0370\3\2\2\2\u0370\u041f\3\2\2\2\u0371\u0373\t\n\2\2\u0372\u0374"+
		"\7\u00b9\2\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2"+
		"\2\u0375\u041f\5$\23\2\u0376\u0377\7/\2\2\u0377\u0378\7\u00a0\2\2\u0378"+
		"\u0379\5.\30\2\u0379\u037a\5\u00b6\\\2\u037a\u037b\7~\2\2\u037b\u037c"+
		"\t\f\2\2\u037c\u041f\3\2\2\2\u037d\u037e\7/\2\2\u037e\u037f\7\u00a0\2"+
		"\2\u037f\u0380\7\u00e8\2\2\u0380\u0381\5\u00b6\\\2\u0381\u0382\7~\2\2"+
		"\u0382\u0383\t\f\2\2\u0383\u041f\3\2\2\2\u0384\u0385\7\u00c0\2\2\u0385"+
		"\u0386\7\u00e8\2\2\u0386\u041f\5\u00b6\\\2\u0387\u0388\7\u00c0\2\2\u0388"+
		"\u0389\7i\2\2\u0389\u041f\5\u00b6\\\2\u038a\u0392\7\u00c0\2\2\u038b\u0393"+
		"\7\u0123\2\2\u038c\u038e\13\2\2\2\u038d\u038c\3\2\2\2\u038e\u0391\3\2"+
		"\2\2\u038f\u0390\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2\2\2\u0391"+
		"\u038f\3\2\2\2\u0392\u038b\3\2\2\2\u0392\u038f\3\2\2\2\u0393\u041f\3\2"+
		"\2\2\u0394\u0396\7!\2\2\u0395\u0397\7\u0084\2\2\u0396\u0395\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\7\u00e8\2\2\u0399\u039c"+
		"\5\u00b6\\\2\u039a\u039b\7\u00a3\2\2\u039b\u039d\5<\37\2\u039c\u039a\3"+
		"\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a2\3\2\2\2\u039e\u03a0\7\30\2\2\u039f"+
		"\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\5$"+
		"\23\2\u03a2\u039f\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u041f\3\2\2\2\u03a4"+
		"\u03a5\7\u00fd\2\2\u03a5\u03a8\7\u00e8\2\2\u03a6\u03a7\7q\2\2\u03a7\u03a9"+
		"\7V\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u041f\5\u00b6\\\2\u03ab\u03ac\7\'\2\2\u03ac\u041f\7!\2\2\u03ad\u03ae"+
		"\7\u008b\2\2\u03ae\u03b0\7@\2\2\u03af\u03b1\7\u008c\2\2\u03b0\u03af\3"+
		"\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\7x\2\2\u03b3"+
		"\u03b5\7\u0123\2\2\u03b4\u03b6\7\u00ac\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6"+
		"\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\7}\2\2\u03b8\u03b9\7\u00e8\2"+
		"\2\u03b9\u03bb\5\u00b6\\\2\u03ba\u03bc\5*\26\2\u03bb\u03ba\3\2\2\2\u03bb"+
		"\u03bc\3\2\2\2\u03bc\u041f\3\2\2\2\u03bd\u03be\7\u00f8\2\2\u03be\u03bf"+
		"\7\u00e8\2\2\u03bf\u03c1\5\u00b6\\\2\u03c0\u03c2\5*\26\2\u03c1\u03c0\3"+
		"\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u041f\3\2\2\2\u03c3\u03c4\7\u0097\2\2"+
		"\u03c4\u03c5\7\u00c2\2\2\u03c5\u03c6\7\u00e8\2\2\u03c6\u03c9\5\u00b6\\"+
		"\2\u03c7\u03c8\t\r\2\2\u03c8\u03ca\7\u00af\2\2\u03c9\u03c7\3\2\2\2\u03c9"+
		"\u03ca\3\2\2\2\u03ca\u041f\3\2\2\2\u03cb\u03cc\t\16\2\2\u03cc\u03d0\5"+
		"\u0110\u0089\2\u03cd\u03cf\13\2\2\2\u03ce\u03cd\3\2\2\2\u03cf\u03d2\3"+
		"\2\2\2\u03d0\u03d1\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u041f\3\2\2\2\u03d2"+
		"\u03d0\3\2\2\2\u03d3\u03d4\7\u00d8\2\2\u03d4\u03d8\7\u00ca\2\2\u03d5\u03d7"+
		"\13\2\2\2\u03d6\u03d5\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d9\3\2\2\2"+
		"\u03d8\u03d6\3\2\2\2\u03d9\u041f\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dc"+
		"\7\u00d8\2\2\u03dc\u03dd\7\u00ef\2\2\u03dd\u03de\7\u0110\2\2\u03de\u041f"+
		"\5\u00dep\2\u03df\u03e0\7\u00d8\2\2\u03e0\u03e1\7\u00ef\2\2\u03e1\u03e2"+
		"\7\u0110\2\2\u03e2\u041f\t\17\2\2\u03e3\u03e4\7\u00d8\2\2\u03e4\u03e5"+
		"\7\u00ef\2\2\u03e5\u03e9\7\u0110\2\2\u03e6\u03e8\13\2\2\2\u03e7\u03e6"+
		"\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea"+
		"\u041f\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03ed\7\u00d8\2\2\u03ed\u03ee"+
		"\5\22\n\2\u03ee\u03ef\7\u0111\2\2\u03ef\u03f0\5\24\13\2\u03f0\u041f\3"+
		"\2\2\2\u03f1\u03f2\7\u00d8\2\2\u03f2\u03fa\5\22\n\2\u03f3\u03f7\7\u0111"+
		"\2\2\u03f4\u03f6\13\2\2\2\u03f5\u03f4\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7"+
		"\u03f8\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03f7\3\2"+
		"\2\2\u03fa\u03f3\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u041f\3\2\2\2\u03fc"+
		"\u0400\7\u00d8\2\2\u03fd\u03ff\13\2\2\2\u03fe\u03fd\3\2\2\2\u03ff\u0402"+
		"\3\2\2\2\u0400\u0401\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0403\3\2\2\2\u0402"+
		"\u0400\3\2\2\2\u0403\u0404\7\u0111\2\2\u0404\u041f\5\24\13\2\u0405\u0409"+
		"\7\u00d8\2\2\u0406\u0408\13\2\2\2\u0407\u0406\3\2\2\2\u0408\u040b\3\2"+
		"\2\2\u0409\u040a\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u041f\3\2\2\2\u040b"+
		"\u0409\3\2\2\2\u040c\u040d\7\u00c4\2\2\u040d\u041f\5\22\n\2\u040e\u0412"+
		"\7\u00c4\2\2\u040f\u0411\13\2\2\2\u0410\u040f\3\2\2\2\u0411\u0414\3\2"+
		"\2\2\u0412\u0413\3\2\2\2\u0412\u0410\3\2\2\2\u0413\u041f\3\2\2\2\u0414"+
		"\u0412\3\2\2\2\u0415\u0419\5\26\f\2\u0416\u0418\13\2\2\2\u0417\u0416\3"+
		"\2\2\2\u0418\u041b\3\2\2\2\u0419\u041a\3\2\2\2\u0419\u0417\3\2\2\2\u041a"+
		"\u041f\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u041d\7\u00db\2\2\u041d\u041f"+
		"\7\u010a\2\2\u041e\u013b\3\2\2\2\u041e\u013d\3\2\2\2\u041e\u0140\3\2\2"+
		"\2\u041e\u0145\3\2\2\2\u041e\u0157\3\2\2\2\u041e\u015e\3\2\2\2\u041e\u0164"+
		"\3\2\2\2\u041e\u016e\3\2\2\2\u041e\u017a\3\2\2\2\u041e\u018b\3\2\2\2\u041e"+
		"\u01a0\3\2\2\2\u041e\u01b1\3\2\2\2\u041e\u01c2\3\2\2\2\u041e\u01cd\3\2"+
		"\2\2\u041e\u01d4\3\2\2\2\u041e\u01dd\3\2\2\2\u041e\u01e6\3\2\2\2\u041e"+
		"\u01ef\3\2\2\2\u041e\u01f6\3\2\2\2\u041e\u01fd\3\2\2\2\u041e\u0204\3\2"+
		"\2\2\u041e\u020f\3\2\2\2\u041e\u021a\3\2\2\2\u041e\u0229\3\2\2\2\u041e"+
		"\u0235\3\2\2\2\u041e\u0243\3\2\2\2\u041e\u024d\3\2\2\2\u041e\u025b\3\2"+
		"\2\2\u041e\u0263\3\2\2\2\u041e\u0276\3\2\2\2\u041e\u027f\3\2\2\2\u041e"+
		"\u0285\3\2\2\2\u041e\u028f\3\2\2\2\u041e\u0296\3\2\2\2\u041e\u02b9\3\2"+
		"\2\2\u041e\u02cf\3\2\2\2\u041e\u02d7\3\2\2\2\u041e\u02f3\3\2\2\2\u041e"+
		"\u02fd\3\2\2\2\u041e\u0302\3\2\2\2\u041e\u030e\3\2\2\2\u041e\u031a\3\2"+
		"\2\2\u041e\u0323\3\2\2\2\u041e\u032b\3\2\2\2\u041e\u0337\3\2\2\2\u041e"+
		"\u033d\3\2\2\2\u041e\u034b\3\2\2\2\u041e\u0353\3\2\2\2\u041e\u0356\3\2"+
		"\2\2\u041e\u035c\3\2\2\2\u041e\u0363\3\2\2\2\u041e\u0371\3\2\2\2\u041e"+
		"\u0376\3\2\2\2\u041e\u037d\3\2\2\2\u041e\u0384\3\2\2\2\u041e\u0387\3\2"+
		"\2\2\u041e\u038a\3\2\2\2\u041e\u0394\3\2\2\2\u041e\u03a4\3\2\2\2\u041e"+
		"\u03ab\3\2\2\2\u041e\u03ad\3\2\2\2\u041e\u03bd\3\2\2\2\u041e\u03c3\3\2"+
		"\2\2\u041e\u03cb\3\2\2\2\u041e\u03d3\3\2\2\2\u041e\u03db\3\2\2\2\u041e"+
		"\u03df\3\2\2\2\u041e\u03e3\3\2\2\2\u041e\u03ec\3\2\2\2\u041e\u03f1\3\2"+
		"\2\2\u041e\u03fc\3\2\2\2\u041e\u0405\3\2\2\2\u041e\u040c\3\2\2\2\u041e"+
		"\u040e\3\2\2\2\u041e\u0415\3\2\2\2\u041e\u041c\3\2\2\2\u041f\21\3\2\2"+
		"\2\u0420\u0421\5\u0114\u008b\2\u0421\23\3\2\2\2\u0422\u0423\5\u0114\u008b"+
		"\2\u0423\25\3\2\2\2\u0424\u0425\7\67\2\2\u0425\u04cd\7\u00ca\2\2\u0426"+
		"\u0427\7O\2\2\u0427\u04cd\7\u00ca\2\2\u0428\u042a\7l\2\2\u0429\u042b\7"+
		"\u00ca\2\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u04cd\3\2\2\2"+
		"\u042c\u042e\7\u00c7\2\2\u042d\u042f\7\u00ca\2\2\u042e\u042d\3\2\2\2\u042e"+
		"\u042f\3\2\2\2\u042f\u04cd\3\2\2\2\u0430\u0431\7\u00db\2\2\u0431\u04cd"+
		"\7l\2\2\u0432\u0433\7\u00db\2\2\u0433\u0435\7\u00ca\2\2\u0434\u0436\7"+
		"l\2\2\u0435\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u04cd\3\2\2\2\u0437"+
		"\u0438\7\u00db\2\2\u0438\u04cd\7\u00b6\2\2\u0439\u043a\7\u00db\2\2\u043a"+
		"\u04cd\7\u00cb\2\2\u043b\u043c\7\u00db\2\2\u043c\u043d\7:\2\2\u043d\u04cd"+
		"\7\u00cb\2\2\u043e\u043f\7X\2\2\u043f\u04cd\7\u00e8\2\2\u0440\u0441\7"+
		"s\2\2\u0441\u04cd\7\u00e8\2\2\u0442\u0443\7\u00db\2\2\u0443\u04cd\7\62"+
		"\2\2\u0444\u0445\7\u00db\2\2\u0445\u0446\7\67\2\2\u0446\u04cd\7\u00e8"+
		"\2\2\u0447\u0448\7\u00db\2\2\u0448\u04cd\7\u00f4\2\2\u0449\u044a\7\u00db"+
		"\2\2\u044a\u04cd\7v\2\2\u044b\u044c\7\u00db\2\2\u044c\u04cd\7\u008f\2"+
		"\2\u044d\u044e\7\67\2\2\u044e\u04cd\7u\2\2\u044f\u0450\7O\2\2\u0450\u04cd"+
		"\7u\2\2\u0451\u0452\7\21\2\2\u0452\u04cd\7u\2\2\u0453\u0454\7\u008e\2"+
		"\2\u0454\u04cd\7\u00e8\2\2\u0455\u0456\7\u008e\2\2\u0456\u04cd\7A\2\2"+
		"\u0457\u0458\7\u0101\2\2\u0458\u04cd\7\u00e8\2\2\u0459\u045a\7\u0101\2"+
		"\2\u045a\u04cd\7A\2\2\u045b\u045c\7\67\2\2\u045c\u045d\7\u00ec\2\2\u045d"+
		"\u04cd\7\u0091\2\2\u045e\u045f\7O\2\2\u045f\u0460\7\u00ec\2\2\u0460\u04cd"+
		"\7\u0091\2\2\u0461\u0462\7\21\2\2\u0462\u0463\7\u00e8\2\2\u0463\u0464"+
		"\5\u00b8]\2\u0464\u0465\7\u009c\2\2\u0465\u0466\7)\2\2\u0466\u04cd\3\2"+
		"\2\2\u0467\u0468\7\21\2\2\u0468\u0469\7\u00e8\2\2\u0469\u046a\5\u00b8"+
		"]\2\u046a\u046b\7)\2\2\u046b\u046c\7 \2\2\u046c\u04cd\3\2\2\2\u046d\u046e"+
		"\7\21\2\2\u046e\u046f\7\u00e8\2\2\u046f\u0470\5\u00b8]\2\u0470\u0471\7"+
		"\u009c\2\2\u0471\u0472\7\u00df\2\2\u0472\u04cd\3\2\2\2\u0473\u0474\7\21"+
		"\2\2\u0474\u0475\7\u00e8\2\2\u0475\u0476\5\u00b8]\2\u0476\u0477\7\u00dc"+
		"\2\2\u0477\u0478\7 \2\2\u0478\u04cd\3\2\2\2\u0479\u047a\7\21\2\2\u047a"+
		"\u047b\7\u00e8\2\2\u047b\u047c\5\u00b8]\2\u047c\u047d\7\u009c\2\2\u047d"+
		"\u047e\7\u00dc\2\2\u047e\u04cd\3\2\2\2\u047f\u0480\7\21\2\2\u0480\u0481"+
		"\7\u00e8\2\2\u0481\u0482\5\u00b8]\2\u0482\u0483\7\u009c\2\2\u0483\u0484"+
		"\7\u00e2\2\2\u0484\u0485\7\30\2\2\u0485\u0486\7J\2\2\u0486\u04cd\3\2\2"+
		"\2\u0487\u0488\7\21\2\2\u0488\u0489\7\u00e8\2\2\u0489\u048a\5\u00b8]\2"+
		"\u048a\u048b\7\u00d8\2\2\u048b\u048c\7\u00dc\2\2\u048c\u048d\7\u008d\2"+
		"\2\u048d\u04cd\3\2\2\2\u048e\u048f\7\21\2\2\u048f\u0490\7\u00e8\2\2\u0490"+
		"\u0491\5\u00b8]\2\u0491\u0492\7U\2\2\u0492\u0493\7\u00ad\2\2\u0493\u04cd"+
		"\3\2\2\2\u0494\u0495\7\21\2\2\u0495\u0496\7\u00e8\2\2\u0496\u0497\5\u00b8"+
		"]\2\u0497\u0498\7\26\2\2\u0498\u0499\7\u00ad\2\2\u0499\u04cd\3\2\2\2\u049a"+
		"\u049b\7\21\2\2\u049b\u049c\7\u00e8\2\2\u049c\u049d\5\u00b8]\2\u049d\u049e"+
		"\7\u00fb\2\2\u049e\u049f\7\u00ad\2\2\u049f\u04cd\3\2\2\2\u04a0\u04a1\7"+
		"\21\2\2\u04a1\u04a2\7\u00e8\2\2\u04a2\u04a3\5\u00b8]\2\u04a3\u04a4\7\u00f1"+
		"\2\2\u04a4\u04cd\3\2\2\2\u04a5\u04a6\7\21\2\2\u04a6\u04a7\7\u00e8\2\2"+
		"\u04a7\u04a9\5\u00b8]\2\u04a8\u04aa\5*\26\2\u04a9\u04a8\3\2\2\2\u04a9"+
		"\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\7\61\2\2\u04ac\u04cd\3"+
		"\2\2\2\u04ad\u04ae\7\21\2\2\u04ae\u04af\7\u00e8\2\2\u04af\u04b1\5\u00b8"+
		"]\2\u04b0\u04b2\5*\26\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2"+
		"\u04b3\3\2\2\2\u04b3\u04b4\7\64\2\2\u04b4\u04cd\3\2\2\2\u04b5\u04b6\7"+
		"\21\2\2\u04b6\u04b7\7\u00e8\2\2\u04b7\u04b9\5\u00b8]\2\u04b8\u04ba\5*"+
		"\26\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb"+
		"\u04bc\7\u00d8\2\2\u04bc\u04bd\7`\2\2\u04bd\u04cd\3\2\2\2\u04be\u04bf"+
		"\7\21\2\2\u04bf\u04c0\7\u00e8\2\2\u04c0\u04c2\5\u00b8]\2\u04c1\u04c3\5"+
		"*\26\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4"+
		"\u04c5\7\u00c3\2\2\u04c5\u04c6\7.\2\2\u04c6\u04cd\3\2\2\2\u04c7\u04c8"+
		"\7\u00e0\2\2\u04c8\u04cd\7\u00f3\2\2\u04c9\u04cd\7\60\2\2\u04ca\u04cd"+
		"\7\u00cc\2\2\u04cb\u04cd\7I\2\2\u04cc\u0424\3\2\2\2\u04cc\u0426\3\2\2"+
		"\2\u04cc\u0428\3\2\2\2\u04cc\u042c\3\2\2\2\u04cc\u0430\3\2\2\2\u04cc\u0432"+
		"\3\2\2\2\u04cc\u0437\3\2\2\2\u04cc\u0439\3\2\2\2\u04cc\u043b\3\2\2\2\u04cc"+
		"\u043e\3\2\2\2\u04cc\u0440\3\2\2\2\u04cc\u0442\3\2\2\2\u04cc\u0444\3\2"+
		"\2\2\u04cc\u0447\3\2\2\2\u04cc\u0449\3\2\2\2\u04cc\u044b\3\2\2\2\u04cc"+
		"\u044d\3\2\2\2\u04cc\u044f\3\2\2\2\u04cc\u0451\3\2\2\2\u04cc\u0453\3\2"+
		"\2\2\u04cc\u0455\3\2\2\2\u04cc\u0457\3\2\2\2\u04cc\u0459\3\2\2\2\u04cc"+
		"\u045b\3\2\2\2\u04cc\u045e\3\2\2\2\u04cc\u0461\3\2\2\2\u04cc\u0467\3\2"+
		"\2\2\u04cc\u046d\3\2\2\2\u04cc\u0473\3\2\2\2\u04cc\u0479\3\2\2\2\u04cc"+
		"\u047f\3\2\2\2\u04cc\u0487\3\2\2\2\u04cc\u048e\3\2\2\2\u04cc\u0494\3\2"+
		"\2\2\u04cc\u049a\3\2\2\2\u04cc\u04a0\3\2\2\2\u04cc\u04a5\3\2\2\2\u04cc"+
		"\u04ad\3\2\2\2\u04cc\u04b5\3\2\2\2\u04cc\u04be\3\2\2\2\u04cc\u04c7\3\2"+
		"\2\2\u04cc\u04c9\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cb\3\2\2\2\u04cd"+
		"\27\3\2\2\2\u04ce\u04d0\7\67\2\2\u04cf\u04d1\7\u00ec\2\2\u04d0\u04cf\3"+
		"\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d3\3\2\2\2\u04d2\u04d4\7Z\2\2\u04d3"+
		"\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d9\7\u00e8"+
		"\2\2\u04d6\u04d7\7q\2\2\u04d7\u04d8\7\u009c\2\2\u04d8\u04da\7V\2\2\u04d9"+
		"\u04d6\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\5\u00b6"+
		"\\\2\u04dc\31\3\2\2\2\u04dd\u04de\7\67\2\2\u04de\u04e0\7\u00a4\2\2\u04df"+
		"\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\7\u00c3"+
		"\2\2\u04e2\u04e3\7\u00e8\2\2\u04e3\u04e4\5\u00b6\\\2\u04e4\33\3\2\2\2"+
		"\u04e5\u04e6\7)\2\2\u04e6\u04e7\7 \2\2\u04e7\u04eb\5\u009eP\2\u04e8\u04e9"+
		"\7\u00df\2\2\u04e9\u04ea\7 \2\2\u04ea\u04ec\5\u00a2R\2\u04eb\u04e8\3\2"+
		"\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\7}\2\2\u04ee"+
		"\u04ef\7\u0127\2\2\u04ef\u04f0\7\37\2\2\u04f0\35\3\2\2\2\u04f1\u04f2\7"+
		"\u00dc\2\2\u04f2\u04f3\7 \2\2\u04f3\u04f4\5\u009eP\2\u04f4\u04f7\7\u00a0"+
		"\2\2\u04f5\u04f8\5D#\2\u04f6\u04f8\5F$\2\u04f7\u04f5\3\2\2\2\u04f7\u04f6"+
		"\3\2\2\2\u04f8\u04fc\3\2\2\2\u04f9\u04fa\7\u00e2\2\2\u04fa\u04fb\7\30"+
		"\2\2\u04fb\u04fd\7J\2\2\u04fc\u04f9\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd"+
		"\37\3\2\2\2\u04fe\u04ff\7\u008d\2\2\u04ff\u0500\7\u0123\2\2\u0500!\3\2"+
		"\2\2\u0501\u0502\7/\2\2\u0502\u0503\7\u0123\2\2\u0503#\3\2\2\2\u0504\u0506"+
		"\5\64\33\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2"+
		"\u0507\u0508\5V,\2\u0508\u0509\5R*\2\u0509%\3\2\2\2\u050a\u050b\7z\2\2"+
		"\u050b\u050d\7\u00ac\2\2\u050c\u050e\7\u00e8\2\2\u050d\u050c\3\2\2\2\u050d"+
		"\u050e\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0516\5\u00b6\\\2\u0510\u0514"+
		"\5*\26\2\u0511\u0512\7q\2\2\u0512\u0513\7\u009c\2\2\u0513\u0515\7V\2\2"+
		"\u0514\u0511\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0510"+
		"\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519\3\2\2\2\u0518\u051a\5\u009eP"+
		"\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u0548\3\2\2\2\u051b\u051c"+
		"\7z\2\2\u051c\u051e\7}\2\2\u051d\u051f\7\u00e8\2\2\u051e\u051d\3\2\2\2"+
		"\u051e\u051f\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0522\5\u00b6\\\2\u0521"+
		"\u0523\5*\26\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0527\3\2"+
		"\2\2\u0524\u0525\7q\2\2\u0525\u0526\7\u009c\2\2\u0526\u0528\7V\2\2\u0527"+
		"\u0524\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u052a\3\2\2\2\u0529\u052b\5\u009e"+
		"P\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u0548\3\2\2\2\u052c"+
		"\u052d\7z\2\2\u052d\u052f\7\u00ac\2\2\u052e\u0530\7\u008c\2\2\u052f\u052e"+
		"\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\7K\2\2\u0532"+
		"\u0534\7\u0123\2\2\u0533\u0535\5\u00b2Z\2\u0534\u0533\3\2\2\2\u0534\u0535"+
		"\3\2\2\2\u0535\u0537\3\2\2\2\u0536\u0538\5H%\2\u0537\u0536\3\2\2\2\u0537"+
		"\u0538\3\2\2\2\u0538\u0548\3\2\2\2\u0539\u053a\7z\2\2\u053a\u053c\7\u00ac"+
		"\2\2\u053b\u053d\7\u008c\2\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d"+
		"\u053e\3\2\2\2\u053e\u0540\7K\2\2\u053f\u0541\7\u0123\2\2\u0540\u053f"+
		"\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0545\58\35\2\u0543"+
		"\u0544\7\u00a3\2\2\u0544\u0546\5<\37\2\u0545\u0543\3\2\2\2\u0545\u0546"+
		"\3\2\2\2\u0546\u0548\3\2\2\2\u0547\u050a\3\2\2\2\u0547\u051b\3\2\2\2\u0547"+
		"\u052c\3\2\2\2\u0547\u0539\3\2\2\2\u0548\'\3\2\2\2\u0549\u054b\5*\26\2"+
		"\u054a\u054c\5 \21\2\u054b\u054a\3\2\2\2\u054b\u054c\3\2\2\2\u054c)\3"+
		"\2\2\2\u054d\u054e\7\u00ad\2\2\u054e\u054f\7\4\2\2\u054f\u0554\5,\27\2"+
		"\u0550\u0551\7\6\2\2\u0551\u0553\5,\27\2\u0552\u0550\3\2\2\2\u0553\u0556"+
		"\3\2\2\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0557\3\2\2\2\u0556"+
		"\u0554\3\2\2\2\u0557\u0558\7\5\2\2\u0558+\3\2\2\2\u0559\u055c\5\u0110"+
		"\u0089\2\u055a\u055b\7\u0111\2\2\u055b\u055d\5\u00d4k\2\u055c\u055a\3"+
		"\2\2\2\u055c\u055d\3\2\2\2\u055d-\3\2\2\2\u055e\u055f\t\20\2\2\u055f/"+
		"\3\2\2\2\u0560\u0566\5\u010a\u0086\2\u0561\u0566\7\u0123\2\2\u0562\u0566"+
		"\5\u00d6l\2\u0563\u0566\5\u00d8m\2\u0564\u0566\5\u00dan\2\u0565\u0560"+
		"\3\2\2\2\u0565\u0561\3\2\2\2\u0565\u0562\3\2\2\2\u0565\u0563\3\2\2\2\u0565"+
		"\u0564\3\2\2\2\u0566\61\3\2\2\2\u0567\u056c\5\u0110\u0089\2\u0568\u0569"+
		"\7\7\2\2\u0569\u056b\5\u0110\u0089\2\u056a\u0568\3\2\2\2\u056b\u056e\3"+
		"\2\2\2\u056c\u056a\3\2\2\2\u056c\u056d\3\2\2\2\u056d\63\3\2\2\2\u056e"+
		"\u056c\3\2\2\2\u056f\u0570\7\u010e\2\2\u0570\u0575\5\66\34\2\u0571\u0572"+
		"\7\6\2\2\u0572\u0574\5\66\34\2\u0573\u0571\3\2\2\2\u0574\u0577\3\2\2\2"+
		"\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\65\3\2\2\2\u0577\u0575"+
		"\3\2\2\2\u0578\u057a\5\u010c\u0087\2\u0579\u057b\5\u009eP\2\u057a\u0579"+
		"\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057d\3\2\2\2\u057c\u057e\7\30\2\2"+
		"\u057d\u057c\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580"+
		"\7\4\2\2\u0580\u0581\5$\23\2\u0581\u0582\7\5\2\2\u0582\67\3\2\2\2\u0583"+
		"\u0584\7\u0106\2\2\u0584\u0585\5\u00b6\\\2\u05859\3\2\2\2\u0586\u0587"+
		"\7\u00a3\2\2\u0587\u0594\5<\37\2\u0588\u0589\7\u00ae\2\2\u0589\u058a\7"+
		" \2\2\u058a\u0594\5\u00c0a\2\u058b\u0594\5\36\20\2\u058c\u0594\5\34\17"+
		"\2\u058d\u0594\5\u00b2Z\2\u058e\u0594\5H%\2\u058f\u0594\5 \21\2\u0590"+
		"\u0594\5\"\22\2\u0591\u0592\7\u00eb\2\2\u0592\u0594\5<\37\2\u0593\u0586"+
		"\3\2\2\2\u0593\u0588\3\2\2\2\u0593\u058b\3\2\2\2\u0593\u058c\3\2\2\2\u0593"+
		"\u058d\3\2\2\2\u0593\u058e\3\2\2\2\u0593\u058f\3\2\2\2\u0593\u0590\3\2"+
		"\2\2\u0593\u0591\3\2\2\2\u0594\u0597\3\2\2\2\u0595\u0593\3\2\2\2\u0595"+
		"\u0596\3\2\2\2\u0596;\3\2\2\2\u0597\u0595\3\2\2\2\u0598\u0599\7\4\2\2"+
		"\u0599\u059e\5> \2\u059a\u059b\7\6\2\2\u059b\u059d\5> \2\u059c\u059a\3"+
		"\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059c\3\2\2\2\u059e\u059f\3\2\2\2\u059f"+
		"\u05a1\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1\u05a2\7\5\2\2\u05a2=\3\2\2\2"+
		"\u05a3\u05a8\5@!\2\u05a4\u05a6\7\u0111\2\2\u05a5\u05a4\3\2\2\2\u05a5\u05a6"+
		"\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a9\5B\"\2\u05a8\u05a5\3\2\2\2\u05a8"+
		"\u05a9\3\2\2\2\u05a9?\3\2\2\2\u05aa\u05af\5\u0110\u0089\2\u05ab\u05ac"+
		"\7\7\2\2\u05ac\u05ae\5\u0110\u0089\2\u05ad\u05ab\3\2\2\2\u05ae\u05b1\3"+
		"\2\2\2\u05af\u05ad\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b4\3\2\2\2\u05b1"+
		"\u05af\3\2\2\2\u05b2\u05b4\7\u0123\2\2\u05b3\u05aa\3\2\2\2\u05b3\u05b2"+
		"\3\2\2\2\u05b4A\3\2\2\2\u05b5\u05ba\7\u0127\2\2\u05b6\u05ba\7\u0129\2"+
		"\2\u05b7\u05ba\5\u00dco\2\u05b8\u05ba\7\u0123\2\2\u05b9\u05b5\3\2\2\2"+
		"\u05b9\u05b6\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05b8\3\2\2\2\u05baC\3"+
		"\2\2\2\u05bb\u05bc\7\4\2\2\u05bc\u05c1\5\u00d4k\2\u05bd\u05be\7\6\2\2"+
		"\u05be\u05c0\5\u00d4k\2\u05bf\u05bd\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1"+
		"\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c4\3\2\2\2\u05c3\u05c1\3\2"+
		"\2\2\u05c4\u05c5\7\5\2\2\u05c5E\3\2\2\2\u05c6\u05c7\7\4\2\2\u05c7\u05cc"+
		"\5D#\2\u05c8\u05c9\7\6\2\2\u05c9\u05cb\5D#\2\u05ca\u05c8\3\2\2\2\u05cb"+
		"\u05ce\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05cf\3\2"+
		"\2\2\u05ce\u05cc\3\2\2\2\u05cf\u05d0\7\5\2\2\u05d0G\3\2\2\2\u05d1\u05d2"+
		"\7\u00e2\2\2\u05d2\u05d3\7\30\2\2\u05d3\u05d8\5J&\2\u05d4\u05d5\7\u00e2"+
		"\2\2\u05d5\u05d6\7 \2\2\u05d6\u05d8\5L\'\2\u05d7\u05d1\3\2\2\2\u05d7\u05d4"+
		"\3\2\2\2\u05d8I\3\2\2\2\u05d9\u05da\7y\2\2\u05da\u05db\7\u0123\2\2\u05db"+
		"\u05dc\7\u00a8\2\2\u05dc\u05df\7\u0123\2\2\u05dd\u05df\5\u0110\u0089\2"+
		"\u05de\u05d9\3\2\2\2\u05de\u05dd\3\2\2\2\u05dfK\3\2\2\2\u05e0\u05e4\7"+
		"\u0123\2\2\u05e1\u05e2\7\u010e\2\2\u05e2\u05e3\7\u00d6\2\2\u05e3\u05e5"+
		"\5<\37\2\u05e4\u05e1\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5M\3\2\2\2\u05e6"+
		"\u05e7\5\u0110\u0089\2\u05e7\u05e8\7\u0123\2\2\u05e8O\3\2\2\2\u05e9\u05ea"+
		"\5&\24\2\u05ea\u05eb\5V,\2\u05eb\u05ec\5R*\2\u05ec\u061d\3\2\2\2\u05ed"+
		"\u05ef\5|?\2\u05ee\u05f0\5T+\2\u05ef\u05ee\3\2\2\2\u05f0\u05f1\3\2\2\2"+
		"\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u061d\3\2\2\2\u05f3\u05f4"+
		"\7E\2\2\u05f4\u05f5\7g\2\2\u05f5\u05f6\5\u00b6\\\2\u05f6\u05f8\5\u00b0"+
		"Y\2\u05f7\u05f9\5t;\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u061d"+
		"\3\2\2\2\u05fa\u05fb\7\u0103\2\2\u05fb\u05fc\5\u00b6\\\2\u05fc\u05fd\5"+
		"\u00b0Y\2\u05fd\u05ff\5f\64\2\u05fe\u0600\5t;\2\u05ff\u05fe\3\2\2\2\u05ff"+
		"\u0600\3\2\2\2\u0600\u061d\3\2\2\2\u0601\u0602\7\u0094\2\2\u0602\u0603"+
		"\7}\2\2\u0603\u0604\5\u00b6\\\2\u0604\u0605\5\u00b0Y\2\u0605\u060b\7\u0106"+
		"\2\2\u0606\u060c\5\u00b6\\\2\u0607\u0608\7\4\2\2\u0608\u0609\5$\23\2\u0609"+
		"\u060a\7\5\2\2\u060a\u060c\3\2\2\2\u060b\u0606\3\2\2\2\u060b\u0607\3\2"+
		"\2\2\u060c\u060d\3\2\2\2\u060d\u060e\5\u00b0Y\2\u060e\u060f\7\u00a0\2"+
		"\2\u060f\u0613\5\u00ccg\2\u0610\u0612\5h\65\2\u0611\u0610\3\2\2\2\u0612"+
		"\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0619\3\2"+
		"\2\2\u0615\u0613\3\2\2\2\u0616\u0618\5j\66\2\u0617\u0616\3\2\2\2\u0618"+
		"\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061d\3\2"+
		"\2\2\u061b\u0619\3\2\2\2\u061c\u05e9\3\2\2\2\u061c\u05ed\3\2\2\2\u061c"+
		"\u05f3\3\2\2\2\u061c\u05fa\3\2\2\2\u061c\u0601\3\2\2\2\u061dQ\3\2\2\2"+
		"\u061e\u061f\7\u00a5\2\2\u061f\u0620\7 \2\2\u0620\u0625\5Z.\2\u0621\u0622"+
		"\7\6\2\2\u0622\u0624\5Z.\2\u0623\u0621\3\2\2\2\u0624\u0627\3\2\2\2\u0625"+
		"\u0623\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0629\3\2\2\2\u0627\u0625\3\2"+
		"\2\2\u0628\u061e\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u0634\3\2\2\2\u062a"+
		"\u062b\7(\2\2\u062b\u062c\7 \2\2\u062c\u0631\5\u00c8e\2\u062d\u062e\7"+
		"\6\2\2\u062e\u0630\5\u00c8e\2\u062f\u062d\3\2\2\2\u0630\u0633\3\2\2\2"+
		"\u0631\u062f\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0635\3\2\2\2\u0633\u0631"+
		"\3\2\2\2\u0634\u062a\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0640\3\2\2\2\u0636"+
		"\u0637\7M\2\2\u0637\u0638\7 \2\2\u0638\u063d\5\u00c8e\2\u0639\u063a\7"+
		"\6\2\2\u063a\u063c\5\u00c8e\2\u063b\u0639\3\2\2\2\u063c\u063f\3\2\2\2"+
		"\u063d\u063b\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0641\3\2\2\2\u063f\u063d"+
		"\3\2\2\2\u0640\u0636\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u064c\3\2\2\2\u0642"+
		"\u0643\7\u00de\2\2\u0643\u0644\7 \2\2\u0644\u0649\5Z.\2\u0645\u0646\7"+
		"\6\2\2\u0646\u0648\5Z.\2\u0647\u0645\3\2\2\2\u0648\u064b\3\2\2\2\u0649"+
		"\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2"+
		"\2\2\u064c\u0642\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064f\3\2\2\2\u064e"+
		"\u0650\5\u00fc\177\2\u064f\u064e\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0656"+
		"\3\2\2\2\u0651\u0654\7\u0088\2\2\u0652\u0655\7\20\2\2\u0653\u0655\5\u00c8"+
		"e\2\u0654\u0652\3\2\2\2\u0654\u0653\3\2\2\2\u0655\u0657\3\2\2\2\u0656"+
		"\u0651\3\2\2\2\u0656\u0657\3\2\2\2\u0657S\3\2\2\2\u0658\u0659\5&\24\2"+
		"\u0659\u065a\5^\60\2\u065aU\3\2\2\2\u065b\u065c\b,\1\2\u065c\u065d\5X"+
		"-\2\u065d\u0675\3\2\2\2\u065e\u065f\f\5\2\2\u065f\u0660\6,\3\2\u0660\u0662"+
		"\t\21\2\2\u0661\u0663\5\u0090I\2\u0662\u0661\3\2\2\2\u0662\u0663\3\2\2"+
		"\2\u0663\u0664\3\2\2\2\u0664\u0674\5V,\6\u0665\u0666\f\4\2\2\u0666\u0667"+
		"\6,\5\2\u0667\u0669\7{\2\2\u0668\u066a\5\u0090I\2\u0669\u0668\3\2\2\2"+
		"\u0669\u066a\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u0674\5V,\5\u066c\u066d"+
		"\f\3\2\2\u066d\u066e\6,\7\2\u066e\u0670\t\22\2\2\u066f\u0671\5\u0090I"+
		"\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0674"+
		"\5V,\4\u0673\u065e\3\2\2\2\u0673\u0665\3\2\2\2\u0673\u066c\3\2\2\2\u0674"+
		"\u0677\3\2\2\2\u0675\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676W\3\2\2\2"+
		"\u0677\u0675\3\2\2\2\u0678\u0682\5`\61\2\u0679\u0682\5\\/\2\u067a\u067b"+
		"\7\u00e8\2\2\u067b\u0682\5\u00b6\\\2\u067c\u0682\5\u00acW\2\u067d\u067e"+
		"\7\4\2\2\u067e\u067f\5$\23\2\u067f\u0680\7\5\2\2\u0680\u0682\3\2\2\2\u0681"+
		"\u0678\3\2\2\2\u0681\u0679\3\2\2\2\u0681\u067a\3\2\2\2\u0681\u067c\3\2"+
		"\2\2\u0681\u067d\3\2\2\2\u0682Y\3\2\2\2\u0683\u0685\5\u00c8e\2\u0684\u0686"+
		"\t\23\2\2\u0685\u0684\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0689\3\2\2\2"+
		"\u0687\u0688\7\u009e\2\2\u0688\u068a\t\24\2\2\u0689\u0687\3\2\2\2\u0689"+
		"\u068a\3\2\2\2\u068a[\3\2\2\2\u068b\u068d\5|?\2\u068c\u068e\5^\60\2\u068d"+
		"\u068c\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u068d\3\2\2\2\u068f\u0690\3\2"+
		"\2\2\u0690]\3\2\2\2\u0691\u0693\5b\62\2\u0692\u0694\5t;\2\u0693\u0692"+
		"\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0696\5R*\2\u0696"+
		"\u06ad\3\2\2\2\u0697\u069b\5d\63\2\u0698\u069a\5\u008eH\2\u0699\u0698"+
		"\3\2\2\2\u069a\u069d\3\2\2\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c"+
		"\u069f\3\2\2\2\u069d\u069b\3\2\2\2\u069e\u06a0\5t;\2\u069f\u069e\3\2\2"+
		"\2\u069f\u06a0\3\2\2\2\u06a0\u06a2\3\2\2\2\u06a1\u06a3\5~@\2\u06a2\u06a1"+
		"\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\3\2\2\2\u06a4\u06a6\5v<\2\u06a5"+
		"\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a8\3\2\2\2\u06a7\u06a9\5\u00fc"+
		"\177\2\u06a8\u06a7\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa"+
		"\u06ab\5R*\2\u06ab\u06ad\3\2\2\2\u06ac\u0691\3\2\2\2\u06ac\u0697\3\2\2"+
		"\2\u06ad_\3\2\2\2\u06ae\u06b0\5b\62\2\u06af\u06b1\5|?\2\u06b0\u06af\3"+
		"\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b5\3\2\2\2\u06b2\u06b4\5\u008eH\2"+
		"\u06b3\u06b2\3\2\2\2\u06b4\u06b7\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b5\u06b6"+
		"\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b8\u06ba\5t;\2\u06b9"+
		"\u06b8\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bc\3\2\2\2\u06bb\u06bd\5~"+
		"@\2\u06bc\u06bb\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06bf\3\2\2\2\u06be"+
		"\u06c0\5v<\2\u06bf\u06be\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c2\3\2\2"+
		"\2\u06c1\u06c3\5\u00fc\177\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3"+
		"\u06db\3\2\2\2\u06c4\u06c6\5d\63\2\u06c5\u06c7\5|?\2\u06c6\u06c5\3\2\2"+
		"\2\u06c6\u06c7\3\2\2\2\u06c7\u06cb\3\2\2\2\u06c8\u06ca\5\u008eH\2\u06c9"+
		"\u06c8\3\2\2\2\u06ca\u06cd\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cb\u06cc\3\2"+
		"\2\2\u06cc\u06cf\3\2\2\2\u06cd\u06cb\3\2\2\2\u06ce\u06d0\5t;\2\u06cf\u06ce"+
		"\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d2\3\2\2\2\u06d1\u06d3\5~@\2\u06d2"+
		"\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d5\3\2\2\2\u06d4\u06d6\5v"+
		"<\2\u06d5\u06d4\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d8\3\2\2\2\u06d7"+
		"\u06d9\5\u00fc\177\2\u06d8\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06db"+
		"\3\2\2\2\u06da\u06ae\3\2\2\2\u06da\u06c4\3\2\2\2\u06dba\3\2\2\2\u06dc"+
		"\u06dd\7\u00d2\2\2\u06dd\u06de\7\u00f5\2\2\u06de\u06e0\7\4\2\2\u06df\u06e1"+
		"\5\u0090I\2\u06e0\u06df\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e2\3\2\2"+
		"\2\u06e2\u06e3\5\u00caf\2\u06e3\u06e4\7\5\2\2\u06e4\u06f0\3\2\2\2\u06e5"+
		"\u06e7\7\u0092\2\2\u06e6\u06e8\5\u0090I\2\u06e7\u06e6\3\2\2\2\u06e7\u06e8"+
		"\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06f0\5\u00caf\2\u06ea\u06ec\7\u00be"+
		"\2\2\u06eb\u06ed\5\u0090I\2\u06ec\u06eb\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed"+
		"\u06ee\3\2\2\2\u06ee\u06f0\5\u00caf\2\u06ef\u06dc\3\2\2\2\u06ef\u06e5"+
		"\3\2\2\2\u06ef\u06ea\3\2\2\2\u06f0\u06f2\3\2\2\2\u06f1\u06f3\5\u00b2Z"+
		"\2\u06f2\u06f1\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f6\3\2\2\2\u06f4\u06f5"+
		"\7\u00bc\2\2\u06f5\u06f7\7\u0123\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f7\3"+
		"\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06f9\7\u0106\2\2\u06f9\u0706\7\u0123"+
		"\2\2\u06fa\u0704\7\30\2\2\u06fb\u0705\5\u00a0Q\2\u06fc\u0705\5\u00f2z"+
		"\2\u06fd\u0700\7\4\2\2\u06fe\u0701\5\u00a0Q\2\u06ff\u0701\5\u00f2z\2\u0700"+
		"\u06fe\3\2\2\2\u0700\u06ff\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\7\5"+
		"\2\2\u0703\u0705\3\2\2\2\u0704\u06fb\3\2\2\2\u0704\u06fc\3\2\2\2\u0704"+
		"\u06fd\3\2\2\2\u0705\u0707\3\2\2\2\u0706\u06fa\3\2\2\2\u0706\u0707\3\2"+
		"\2\2\u0707\u0709\3\2\2\2\u0708\u070a\5\u00b2Z\2\u0709\u0708\3\2\2\2\u0709"+
		"\u070a\3\2\2\2\u070a\u070d\3\2\2\2\u070b\u070c\7\u00bb\2\2\u070c\u070e"+
		"\7\u0123\2\2\u070d\u070b\3\2\2\2\u070d\u070e\3\2\2\2\u070ec\3\2\2\2\u070f"+
		"\u0713\7\u00d2\2\2\u0710\u0712\5x=\2\u0711\u0710\3\2\2\2\u0712\u0715\3"+
		"\2\2\2\u0713\u0711\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0717\3\2\2\2\u0715"+
		"\u0713\3\2\2\2\u0716\u0718\5\u0090I\2\u0717\u0716\3\2\2\2\u0717\u0718"+
		"\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071a\5\u00be`\2\u071ae\3\2\2\2\u071b"+
		"\u071c\7\u00d8\2\2\u071c\u071d\5p9\2\u071dg\3\2\2\2\u071e\u071f\7\u010b"+
		"\2\2\u071f\u0722\7\u0093\2\2\u0720\u0721\7\23\2\2\u0721\u0723\5\u00cc"+
		"g\2\u0722\u0720\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0724\3\2\2\2\u0724"+
		"\u0725\7\u00ee\2\2\u0725\u0726\5l\67\2\u0726i\3\2\2\2\u0727\u0728\7\u010b"+
		"\2\2\u0728\u0729\7\u009c\2\2\u0729\u072c\7\u0093\2\2\u072a\u072b\7\23"+
		"\2\2\u072b\u072d\5\u00ccg\2\u072c\u072a\3\2\2\2\u072c\u072d\3\2\2\2\u072d"+
		"\u072e\3\2\2\2\u072e\u072f\7\u00ee\2\2\u072f\u0730\5n8\2\u0730k\3\2\2"+
		"\2\u0731\u0739\7E\2\2\u0732\u0733\7\u0103\2\2\u0733\u0734\7\u00d8\2\2"+
		"\u0734\u0739\7\u011b\2\2\u0735\u0736\7\u0103\2\2\u0736\u0737\7\u00d8\2"+
		"\2\u0737\u0739\5p9\2\u0738\u0731\3\2\2\2\u0738\u0732\3\2\2\2\u0738\u0735"+
		"\3\2\2\2\u0739m\3\2\2\2\u073a\u073b\7z\2\2\u073b\u074d\7\u011b\2\2\u073c"+
		"\u073d\7z\2\2\u073d\u073e\7\4\2\2\u073e\u073f\5\u00b4[\2\u073f\u0740\7"+
		"\5\2\2\u0740\u0741\7\u0107\2\2\u0741\u0742\7\4\2\2\u0742\u0747\5\u00c8"+
		"e\2\u0743\u0744\7\6\2\2\u0744\u0746\5\u00c8e\2\u0745\u0743\3\2\2\2\u0746"+
		"\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074a\3\2"+
		"\2\2\u0749\u0747\3\2\2\2\u074a\u074b\7\5\2\2\u074b\u074d\3\2\2\2\u074c"+
		"\u073a\3\2\2\2\u074c\u073c\3\2\2\2\u074do\3\2\2\2\u074e\u0753\5r:\2\u074f"+
		"\u0750\7\6\2\2\u0750\u0752\5r:\2\u0751\u074f\3\2\2\2\u0752\u0755\3\2\2"+
		"\2\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754q\3\2\2\2\u0755\u0753"+
		"\3\2\2\2\u0756\u0757\5\u00b6\\\2\u0757\u0758\7\u0111\2\2\u0758\u0759\5"+
		"\u00c8e\2\u0759s\3\2\2\2\u075a\u075b\7\u010c\2\2\u075b\u075c\5\u00ccg"+
		"\2\u075cu\3\2\2\2\u075d\u075e\7o\2\2\u075e\u075f\5\u00ccg\2\u075fw\3\2"+
		"\2\2\u0760\u0761\7\b\2\2\u0761\u0768\5z>\2\u0762\u0764\7\6\2\2\u0763\u0762"+
		"\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0767\5z>\2\u0766"+
		"\u0763\3\2\2\2\u0767\u076a\3\2\2\2\u0768\u0766\3\2\2\2\u0768\u0769\3\2"+
		"\2\2\u0769\u076b\3\2\2\2\u076a\u0768\3\2\2\2\u076b\u076c\7\t\2\2\u076c"+
		"y\3\2\2\2\u076d\u077b\5\u0110\u0089\2\u076e\u076f\5\u0110\u0089\2\u076f"+
		"\u0770\7\4\2\2\u0770\u0775\5\u00d2j\2\u0771\u0772\7\6\2\2\u0772\u0774"+
		"\5\u00d2j\2\u0773\u0771\3\2\2\2\u0774\u0777\3\2\2\2\u0775\u0773\3\2\2"+
		"\2\u0775\u0776\3\2\2\2\u0776\u0778\3\2\2\2\u0777\u0775\3\2\2\2\u0778\u0779"+
		"\7\5\2\2\u0779\u077b\3\2\2\2\u077a\u076d\3\2\2\2\u077a\u076e\3\2\2\2\u077b"+
		"{\3\2\2\2\u077c\u077d\7g\2\2\u077d\u0782\5\u0092J\2\u077e\u077f\7\6\2"+
		"\2\u077f\u0781\5\u0092J\2\u0780\u077e\3\2\2\2\u0781\u0784\3\2\2\2\u0782"+
		"\u0780\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u0788\3\2\2\2\u0784\u0782\3\2"+
		"\2\2\u0785\u0787\5\u008eH\2\u0786\u0785\3\2\2\2\u0787\u078a\3\2\2\2\u0788"+
		"\u0786\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078c\3\2\2\2\u078a\u0788\3\2"+
		"\2\2\u078b\u078d\5\u0088E\2\u078c\u078b\3\2\2\2\u078c\u078d\3\2\2\2\u078d"+
		"}\3\2\2\2\u078e\u078f\7m\2\2\u078f\u0790\7 \2\2\u0790\u0795\5\u0080A\2"+
		"\u0791\u0792\7\6\2\2\u0792\u0794\5\u0080A\2\u0793\u0791\3\2\2\2\u0794"+
		"\u0797\3\2\2\2\u0795\u0793\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u07b6\3\2"+
		"\2\2\u0797\u0795\3\2\2\2\u0798\u0799\7m\2\2\u0799\u079a\7 \2\2\u079a\u079f"+
		"\5\u00c8e\2\u079b\u079c\7\6\2\2\u079c\u079e\5\u00c8e\2\u079d\u079b\3\2"+
		"\2\2\u079e\u07a1\3\2\2\2\u079f\u079d\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0"+
		"\u07b3\3\2\2\2\u07a1\u079f\3\2\2\2\u07a2\u07a3\7\u010e\2\2\u07a3\u07b4"+
		"\7\u00cd\2\2\u07a4\u07a5\7\u010e\2\2\u07a5\u07b4\79\2\2\u07a6\u07a7\7"+
		"n\2\2\u07a7\u07a8\7\u00da\2\2\u07a8\u07a9\7\4\2\2\u07a9\u07ae\5\u0086"+
		"D\2\u07aa\u07ab\7\6\2\2\u07ab\u07ad\5\u0086D\2\u07ac\u07aa\3\2\2\2\u07ad"+
		"\u07b0\3\2\2\2\u07ae\u07ac\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b1\3\2"+
		"\2\2\u07b0\u07ae\3\2\2\2\u07b1\u07b2\7\5\2\2\u07b2\u07b4\3\2\2\2\u07b3"+
		"\u07a2\3\2\2\2\u07b3\u07a4\3\2\2\2\u07b3\u07a6\3\2\2\2\u07b3\u07b4\3\2"+
		"\2\2\u07b4\u07b6\3\2\2\2\u07b5\u078e\3\2\2\2\u07b5\u0798\3\2\2\2\u07b6"+
		"\177\3\2\2\2\u07b7\u07ba\5\u0082B\2\u07b8\u07ba\5\u00c8e\2\u07b9\u07b7"+
		"\3\2\2\2\u07b9\u07b8\3\2\2\2\u07ba\u0081\3\2\2\2\u07bb\u07bc\t\25\2\2"+
		"\u07bc\u07bd\7\4\2\2\u07bd\u07c2\5\u0086D\2\u07be\u07bf\7\6\2\2\u07bf"+
		"\u07c1\5\u0086D\2\u07c0\u07be\3\2\2\2\u07c1\u07c4\3\2\2\2\u07c2\u07c0"+
		"\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c5\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c5"+
		"\u07c6\7\5\2\2\u07c6\u07d5\3\2\2\2\u07c7\u07c8\7n\2\2\u07c8\u07c9\7\u00da"+
		"\2\2\u07c9\u07ca\7\4\2\2\u07ca\u07cf\5\u0084C\2\u07cb\u07cc\7\6\2\2\u07cc"+
		"\u07ce\5\u0084C\2\u07cd\u07cb\3\2\2\2\u07ce\u07d1\3\2\2\2\u07cf\u07cd"+
		"\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d2\3\2\2\2\u07d1\u07cf\3\2\2\2\u07d2"+
		"\u07d3\7\5\2\2\u07d3\u07d5\3\2\2\2\u07d4\u07bb\3\2\2\2\u07d4\u07c7\3\2"+
		"\2\2\u07d5\u0083\3\2\2\2\u07d6\u07d9\5\u0082B\2\u07d7\u07d9\5\u0086D\2"+
		"\u07d8\u07d6\3\2\2\2\u07d8\u07d7\3\2\2\2\u07d9\u0085\3\2\2\2\u07da\u07e3"+
		"\7\4\2\2\u07db\u07e0\5\u00c8e\2\u07dc\u07dd\7\6\2\2\u07dd\u07df\5\u00c8"+
		"e\2\u07de\u07dc\3\2\2\2\u07df\u07e2\3\2\2\2\u07e0\u07de\3\2\2\2\u07e0"+
		"\u07e1\3\2\2\2\u07e1\u07e4\3\2\2\2\u07e2\u07e0\3\2\2\2\u07e3\u07db\3\2"+
		"\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e8\7\5\2\2\u07e6"+
		"\u07e8\5\u00c8e\2\u07e7\u07da\3\2\2\2\u07e7\u07e6\3\2\2\2\u07e8\u0087"+
		"\3\2\2\2\u07e9\u07ea\7\u00b1\2\2\u07ea\u07eb\7\4\2\2\u07eb\u07ec\5\u00be"+
		"`\2\u07ec\u07ed\7c\2\2\u07ed\u07ee\5\u008aF\2\u07ee\u07ef\7t\2\2\u07ef"+
		"\u07f0\7\4\2\2\u07f0\u07f5\5\u008cG\2\u07f1\u07f2\7\6\2\2\u07f2\u07f4"+
		"\5\u008cG\2\u07f3\u07f1\3\2\2\2\u07f4\u07f7\3\2\2\2\u07f5\u07f3\3\2\2"+
		"\2\u07f5\u07f6\3\2\2\2\u07f6\u07f8\3\2\2\2\u07f7\u07f5\3\2\2\2\u07f8\u07f9"+
		"\7\5\2\2\u07f9\u07fa\7\5\2\2\u07fa\u0089\3\2\2\2\u07fb\u0808\5\u0110\u0089"+
		"\2\u07fc\u07fd\7\4\2\2\u07fd\u0802\5\u0110\u0089\2\u07fe\u07ff\7\6\2\2"+
		"\u07ff\u0801\5\u0110\u0089\2\u0800\u07fe\3\2\2\2\u0801\u0804\3\2\2\2\u0802"+
		"\u0800\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0805\3\2\2\2\u0804\u0802\3\2"+
		"\2\2\u0805\u0806\7\5\2\2\u0806\u0808\3\2\2\2\u0807\u07fb\3\2\2\2\u0807"+
		"\u07fc\3\2\2\2\u0808\u008b\3\2\2\2\u0809\u080e\5\u00c8e\2\u080a\u080c"+
		"\7\30\2\2\u080b\u080a\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080d\3\2\2\2"+
		"\u080d\u080f\5\u0110\u0089\2\u080e\u080b\3\2\2\2\u080e\u080f\3\2\2\2\u080f"+
		"\u008d\3\2\2\2\u0810\u0811\7\u0083\2\2\u0811\u0813\7\u0108\2\2\u0812\u0814"+
		"\7\u00a7\2\2\u0813\u0812\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0815\3\2\2"+
		"\2\u0815\u0816\5\u010a\u0086\2\u0816\u081f\7\4\2\2\u0817\u081c\5\u00c8"+
		"e\2\u0818\u0819\7\6\2\2\u0819\u081b\5\u00c8e\2\u081a\u0818\3\2\2\2\u081b"+
		"\u081e\3\2\2\2\u081c\u081a\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u0820\3\2"+
		"\2\2\u081e\u081c\3\2\2\2\u081f\u0817\3\2\2\2\u081f\u0820\3\2\2\2\u0820"+
		"\u0821\3\2\2\2\u0821\u0822\7\5\2\2\u0822\u082e\5\u0110\u0089\2\u0823\u0825"+
		"\7\30\2\2\u0824\u0823\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u0826\3\2\2\2"+
		"\u0826\u082b\5\u0110\u0089\2\u0827\u0828\7\6\2\2\u0828\u082a\5\u0110\u0089"+
		"\2\u0829\u0827\3\2\2\2\u082a\u082d\3\2\2\2\u082b\u0829\3\2\2\2\u082b\u082c"+
		"\3\2\2\2\u082c\u082f\3\2\2\2\u082d\u082b\3\2\2\2\u082e\u0824\3\2\2\2\u082e"+
		"\u082f\3\2\2\2\u082f\u008f\3\2\2\2\u0830\u0831\t\26\2\2\u0831\u0091\3"+
		"\2\2\2\u0832\u0834\7\u0083\2\2\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2"+
		"\u0834\u0835\3\2\2\2\u0835\u0839\5\u00aaV\2\u0836\u0838\5\u0094K\2\u0837"+
		"\u0836\3\2\2\2\u0838\u083b\3\2\2\2\u0839\u0837\3\2\2\2\u0839\u083a\3\2"+
		"\2\2\u083a\u0093\3\2\2\2\u083b\u0839\3\2\2\2\u083c\u083d\5\u0096L\2\u083d"+
		"\u083f\7\u0080\2\2\u083e\u0840\7\u0083\2\2\u083f\u083e\3\2\2\2\u083f\u0840"+
		"\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u0843\5\u00aaV\2\u0842\u0844\5\u0098"+
		"M\2\u0843\u0842\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u084e\3\2\2\2\u0845"+
		"\u0846\7\u009a\2\2\u0846\u0847\5\u0096L\2\u0847\u0849\7\u0080\2\2\u0848"+
		"\u084a\7\u0083\2\2\u0849\u0848\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084b"+
		"\3\2\2\2\u084b\u084c\5\u00aaV\2\u084c\u084e\3\2\2\2\u084d\u083c\3\2\2"+
		"\2\u084d\u0845\3\2\2\2\u084e\u0095\3\2\2\2\u084f\u0851\7w\2\2\u0850\u084f"+
		"\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0868\3\2\2\2\u0852\u0868\78\2\2";
	private static final String _serializedATNSegment1 =
		"\u0853\u0855\7\u0086\2\2\u0854\u0856\7\u00a7\2\2\u0855\u0854\3\2\2\2\u0855"+
		"\u0856\3\2\2\2\u0856\u0868\3\2\2\2\u0857\u0859\7\u0086\2\2\u0858\u0857"+
		"\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085a\3\2\2\2\u085a\u0868\7\u00d3\2"+
		"\2\u085b\u085d\7\u00c8\2\2\u085c\u085e\7\u00a7\2\2\u085d\u085c\3\2\2\2"+
		"\u085d\u085e\3\2\2\2\u085e\u0868\3\2\2\2\u085f\u0861\7h\2\2\u0860\u0862"+
		"\7\u00a7\2\2\u0861\u0860\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0868\3\2\2"+
		"\2\u0863\u0865\7\u0086\2\2\u0864\u0863\3\2\2\2\u0864\u0865\3\2\2\2\u0865"+
		"\u0866\3\2\2\2\u0866\u0868\7\24\2\2\u0867\u0850\3\2\2\2\u0867\u0852\3"+
		"\2\2\2\u0867\u0853\3\2\2\2\u0867\u0858\3\2\2\2\u0867\u085b\3\2\2\2\u0867"+
		"\u085f\3\2\2\2\u0867\u0864\3\2\2\2\u0868\u0097\3\2\2\2\u0869\u086a\7\u00a0"+
		"\2\2\u086a\u086e\5\u00ccg\2\u086b\u086c\7\u0106\2\2\u086c\u086e\5\u009e"+
		"P\2\u086d\u0869\3\2\2\2\u086d\u086b\3\2\2\2\u086e\u0099\3\2\2\2\u086f"+
		"\u0870\7\u00ea\2\2\u0870\u0872\7\4\2\2\u0871\u0873\5\u009cO\2\u0872\u0871"+
		"\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0875\7\5\2\2\u0875"+
		"\u009b\3\2\2\2\u0876\u0878\7\u011a\2\2\u0877\u0876\3\2\2\2\u0877\u0878"+
		"\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u087a\t\27\2\2\u087a\u088f\7\u00b0"+
		"\2\2\u087b\u087c\5\u00c8e\2\u087c\u087d\7\u00cf\2\2\u087d\u088f\3\2\2"+
		"\2\u087e\u087f\7\36\2\2\u087f\u0880\7\u0127\2\2\u0880\u0881\7\u00a6\2"+
		"\2\u0881\u0882\7\u009f\2\2\u0882\u088b\7\u0127\2\2\u0883\u0889\7\u00a0"+
		"\2\2\u0884\u088a\5\u0110\u0089\2\u0885\u0886\5\u010a\u0086\2\u0886\u0887"+
		"\7\4\2\2\u0887\u0888\7\5\2\2\u0888\u088a\3\2\2\2\u0889\u0884\3\2\2\2\u0889"+
		"\u0885\3\2\2\2\u088a\u088c\3\2\2\2\u088b\u0883\3\2\2\2\u088b\u088c\3\2"+
		"\2\2\u088c\u088f\3\2\2\2\u088d\u088f\5\u00c8e\2\u088e\u0877\3\2\2\2\u088e"+
		"\u087b\3\2\2\2\u088e\u087e\3\2\2\2\u088e\u088d\3\2\2\2\u088f\u009d\3\2"+
		"\2\2\u0890\u0891\7\4\2\2\u0891\u0892\5\u00a0Q\2\u0892\u0893\7\5\2\2\u0893"+
		"\u009f\3\2\2\2\u0894\u0899\5\u010c\u0087\2\u0895\u0896\7\6\2\2\u0896\u0898"+
		"\5\u010c\u0087\2\u0897\u0895\3\2\2\2\u0898\u089b\3\2\2\2\u0899\u0897\3"+
		"\2\2\2\u0899\u089a\3\2\2\2\u089a\u00a1\3\2\2\2\u089b\u0899\3\2\2\2\u089c"+
		"\u089d\7\4\2\2\u089d\u08a2\5\u00a4S\2\u089e\u089f\7\6\2\2\u089f\u08a1"+
		"\5\u00a4S\2\u08a0\u089e\3\2\2\2\u08a1\u08a4\3\2\2\2\u08a2\u08a0\3\2\2"+
		"\2\u08a2\u08a3\3\2\2\2\u08a3\u08a5\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a5\u08a6"+
		"\7\5\2\2\u08a6\u00a3\3\2\2\2\u08a7\u08a9\5\u010c\u0087\2\u08a8\u08aa\t"+
		"\23\2\2\u08a9\u08a8\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u00a5\3\2\2\2\u08ab"+
		"\u08ac\7\4\2\2\u08ac\u08b1\5\u00a8U\2\u08ad\u08ae\7\6\2\2\u08ae\u08b0"+
		"\5\u00a8U\2\u08af\u08ad\3\2\2\2\u08b0\u08b3\3\2\2\2\u08b1\u08af\3\2\2"+
		"\2\u08b1\u08b2\3\2\2\2\u08b2\u08b4\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b4\u08b5"+
		"\7\5\2\2\u08b5\u00a7\3\2\2\2\u08b6\u08b8\5\u0110\u0089\2\u08b7\u08b9\5"+
		"\"\22\2\u08b8\u08b7\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u00a9\3\2\2\2\u08ba"+
		"\u08bc\5\u00b6\\\2\u08bb\u08bd\5\u009aN\2\u08bc\u08bb\3\2\2\2\u08bc\u08bd"+
		"\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08bf\5\u00b0Y\2\u08bf\u08d3\3\2\2"+
		"\2\u08c0\u08c1\7\4\2\2\u08c1\u08c2\5$\23\2\u08c2\u08c4\7\5\2\2\u08c3\u08c5"+
		"\5\u009aN\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c6\3\2\2"+
		"\2\u08c6\u08c7\5\u00b0Y\2\u08c7\u08d3\3\2\2\2\u08c8\u08c9\7\4\2\2\u08c9"+
		"\u08ca\5\u0092J\2\u08ca\u08cc\7\5\2\2\u08cb\u08cd\5\u009aN\2\u08cc\u08cb"+
		"\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce\u08cf\5\u00b0Y"+
		"\2\u08cf\u08d3\3\2\2\2\u08d0\u08d3\5\u00acW\2\u08d1\u08d3\5\u00aeX\2\u08d2"+
		"\u08ba\3\2\2\2\u08d2\u08c0\3\2\2\2\u08d2\u08c8\3\2\2\2\u08d2\u08d0\3\2"+
		"\2\2\u08d2\u08d1\3\2\2\2\u08d3\u00ab\3\2\2\2\u08d4\u08d5\7\u0107\2\2\u08d5"+
		"\u08da\5\u00c8e\2\u08d6\u08d7\7\6\2\2\u08d7\u08d9\5\u00c8e\2\u08d8\u08d6"+
		"\3\2\2\2\u08d9\u08dc\3\2\2\2\u08da\u08d8\3\2\2\2\u08da\u08db\3\2\2\2\u08db"+
		"\u08dd\3\2\2\2\u08dc\u08da\3\2\2\2\u08dd\u08de\5\u00b0Y\2\u08de\u00ad"+
		"\3\2\2\2\u08df\u08e0\5\u0108\u0085\2\u08e0\u08e9\7\4\2\2\u08e1\u08e6\5"+
		"\u00c8e\2\u08e2\u08e3\7\6\2\2\u08e3\u08e5\5\u00c8e\2\u08e4\u08e2\3\2\2"+
		"\2\u08e5\u08e8\3\2\2\2\u08e6\u08e4\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08ea"+
		"\3\2\2\2\u08e8\u08e6\3\2\2\2\u08e9\u08e1\3\2\2\2\u08e9\u08ea\3\2\2\2\u08ea"+
		"\u08eb\3\2\2\2\u08eb\u08ec\7\5\2\2\u08ec\u08ed\5\u00b0Y\2\u08ed\u00af"+
		"\3\2\2\2\u08ee\u08f0\7\30\2\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3\2\2\2"+
		"\u08f0\u08f1\3\2\2\2\u08f1\u08f3\5\u0112\u008a\2\u08f2\u08f4\5\u009eP"+
		"\2\u08f3\u08f2\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u08f6\3\2\2\2\u08f5\u08ef"+
		"\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u00b1\3\2\2\2\u08f7\u08f8\7\u00ce\2"+
		"\2\u08f8\u08f9\7e\2\2\u08f9\u08fa\7\u00d5\2\2\u08fa\u08fe\7\u0123\2\2"+
		"\u08fb\u08fc\7\u010e\2\2\u08fc\u08fd\7\u00d6\2\2\u08fd\u08ff\5<\37\2\u08fe"+
		"\u08fb\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0929\3\2\2\2\u0900\u0901\7\u00ce"+
		"\2\2\u0901\u0902\7e\2\2\u0902\u090c\7F\2\2\u0903\u0904\7^\2\2\u0904\u0905"+
		"\7\u00ed\2\2\u0905\u0906\7 \2\2\u0906\u090a\7\u0123\2\2\u0907\u0908\7"+
		"S\2\2\u0908\u0909\7 \2\2\u0909\u090b\7\u0123\2\2\u090a\u0907\3\2\2\2\u090a"+
		"\u090b\3\2\2\2\u090b\u090d\3\2\2\2\u090c\u0903\3\2\2\2\u090c\u090d\3\2"+
		"\2\2\u090d\u0913\3\2\2\2\u090e\u090f\7,\2\2\u090f\u0910\7\177\2\2\u0910"+
		"\u0911\7\u00ed\2\2\u0911\u0912\7 \2\2\u0912\u0914\7\u0123\2\2\u0913\u090e"+
		"\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u091a\3\2\2\2\u0915\u0916\7\u0092\2"+
		"\2\u0916\u0917\7\u0081\2\2\u0917\u0918\7\u00ed\2\2\u0918\u0919\7 \2\2"+
		"\u0919\u091b\7\u0123\2\2\u091a\u0915\3\2\2\2\u091a\u091b\3\2\2\2\u091b"+
		"\u0920\3\2\2\2\u091c\u091d\7\u0089\2\2\u091d\u091e\7\u00ed\2\2\u091e\u091f"+
		"\7 \2\2\u091f\u0921\7\u0123\2\2\u0920\u091c\3\2\2\2\u0920\u0921\3\2\2"+
		"\2\u0921\u0926\3\2\2\2\u0922\u0923\7\u009d\2\2\u0923\u0924\7D\2\2\u0924"+
		"\u0925\7\30\2\2\u0925\u0927\7\u0123\2\2\u0926\u0922\3\2\2\2\u0926\u0927"+
		"\3\2\2\2\u0927\u0929\3\2\2\2\u0928\u08f7\3\2\2\2\u0928\u0900\3\2\2\2\u0929"+
		"\u00b3\3\2\2\2\u092a\u092f\5\u00b6\\\2\u092b\u092c\7\6\2\2\u092c\u092e"+
		"\5\u00b6\\\2\u092d\u092b\3\2\2\2\u092e\u0931\3\2\2\2\u092f\u092d\3\2\2"+
		"\2\u092f\u0930\3\2\2\2\u0930\u00b5\3\2\2\2\u0931\u092f\3\2\2\2\u0932\u0937"+
		"\5\u010c\u0087\2\u0933\u0934\7\7\2\2\u0934\u0936\5\u010c\u0087\2\u0935"+
		"\u0933\3\2\2\2\u0936\u0939\3\2\2\2\u0937\u0935\3\2\2\2\u0937\u0938\3\2"+
		"\2\2\u0938\u00b7\3\2\2\2\u0939\u0937\3\2\2\2\u093a\u093b\5\u010c\u0087"+
		"\2\u093b\u093c\7\7\2\2\u093c\u093e\3\2\2\2\u093d\u093a\3\2\2\2\u093d\u093e"+
		"\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0940\5\u010c\u0087\2\u0940\u00b9\3"+
		"\2\2\2\u0941\u0942\5\u010c\u0087\2\u0942\u0943\7\7\2\2\u0943\u0945\3\2"+
		"\2\2\u0944\u0941\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0946\3\2\2\2\u0946"+
		"\u0947\5\u010c\u0087\2\u0947\u00bb\3\2\2\2\u0948\u0950\5\u00c8e\2\u0949"+
		"\u094b\7\30\2\2\u094a\u0949\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094e\3"+
		"\2\2\2\u094c\u094f\5\u010c\u0087\2\u094d\u094f\5\u009eP\2\u094e\u094c"+
		"\3\2\2\2\u094e\u094d\3\2\2\2\u094f\u0951\3\2\2\2\u0950\u094a\3\2\2\2\u0950"+
		"\u0951\3\2\2\2\u0951\u00bd\3\2\2\2\u0952\u0957\5\u00bc_\2\u0953\u0954"+
		"\7\6\2\2\u0954\u0956\5\u00bc_\2\u0955\u0953\3\2\2\2\u0956\u0959\3\2\2"+
		"\2\u0957\u0955\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u00bf\3\2\2\2\u0959\u0957"+
		"\3\2\2\2\u095a\u095b\7\4\2\2\u095b\u0960\5\u00c2b\2\u095c\u095d\7\6\2"+
		"\2\u095d\u095f\5\u00c2b\2\u095e\u095c\3\2\2\2\u095f\u0962\3\2\2\2\u0960"+
		"\u095e\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0963\3\2\2\2\u0962\u0960\3\2"+
		"\2\2\u0963\u0964\7\5\2\2\u0964\u00c1\3\2\2\2\u0965\u0968\5\u00c4c\2\u0966"+
		"\u0968\5\u00f4{\2\u0967\u0965\3\2\2\2\u0967\u0966\3\2\2\2\u0968\u00c3"+
		"\3\2\2\2\u0969\u0977\5\u010a\u0086\2\u096a\u096b\5\u0110\u0089\2\u096b"+
		"\u096c\7\4\2\2\u096c\u0971\5\u00c6d\2\u096d\u096e\7\6\2\2\u096e\u0970"+
		"\5\u00c6d\2\u096f\u096d\3\2\2\2\u0970\u0973\3\2\2\2\u0971\u096f\3\2\2"+
		"\2\u0971\u0972\3\2\2\2\u0972\u0974\3\2\2\2\u0973\u0971\3\2\2\2\u0974\u0975"+
		"\7\5\2\2\u0975\u0977\3\2\2\2\u0976\u0969\3\2\2\2\u0976\u096a\3\2\2\2\u0977"+
		"\u00c5\3\2\2\2\u0978\u097b\5\u010a\u0086\2\u0979\u097b\5\u00d4k\2\u097a"+
		"\u0978\3\2\2\2\u097a\u0979\3\2\2\2\u097b\u00c7\3\2\2\2\u097c\u097d\5\u00cc"+
		"g\2\u097d\u00c9\3\2\2\2\u097e\u0983\5\u00c8e\2\u097f\u0980\7\6\2\2\u0980"+
		"\u0982\5\u00c8e\2\u0981\u097f\3\2\2\2\u0982\u0985\3\2\2\2\u0983\u0981"+
		"\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u00cb\3\2\2\2\u0985\u0983\3\2\2\2\u0986"+
		"\u0987\bg\1\2\u0987\u0988\7\u009c\2\2\u0988\u0993\5\u00ccg\7\u0989\u098a"+
		"\7V\2\2\u098a\u098b\7\4\2\2\u098b\u098c\5$\23\2\u098c\u098d\7\5\2\2\u098d"+
		"\u0993\3\2\2\2\u098e\u0990\5\u00d0i\2\u098f\u0991\5\u00ceh\2\u0990\u098f"+
		"\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0993\3\2\2\2\u0992\u0986\3\2\2\2\u0992"+
		"\u0989\3\2\2\2\u0992\u098e\3\2\2\2\u0993\u099c\3\2\2\2\u0994\u0995\f\4"+
		"\2\2\u0995\u0996\7\23\2\2\u0996\u099b\5\u00ccg\5\u0997\u0998\f\3\2\2\u0998"+
		"\u0999\7\u00a4\2\2\u0999\u099b\5\u00ccg\4\u099a\u0994\3\2\2\2\u099a\u0997"+
		"\3\2\2\2\u099b\u099e\3\2\2\2\u099c\u099a\3\2\2\2\u099c\u099d\3\2\2\2\u099d"+
		"\u00cd\3\2\2\2\u099e\u099c\3\2\2\2\u099f\u09a1\7\u009c\2\2\u09a0\u099f"+
		"\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a3\7\34\2\2"+
		"\u09a3\u09a4\5\u00d0i\2\u09a4\u09a5\7\23\2\2\u09a5\u09a6\5\u00d0i\2\u09a6"+
		"\u09f2\3\2\2\2\u09a7\u09a9\7\u009c\2\2\u09a8\u09a7\3\2\2\2\u09a8\u09a9"+
		"\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa\u09ab\7t\2\2\u09ab\u09ac\7\4\2\2\u09ac"+
		"\u09b1\5\u00c8e\2\u09ad\u09ae\7\6\2\2\u09ae\u09b0\5\u00c8e\2\u09af\u09ad"+
		"\3\2\2\2\u09b0\u09b3\3\2\2\2\u09b1\u09af\3\2\2\2\u09b1\u09b2\3\2\2\2\u09b2"+
		"\u09b4\3\2\2\2\u09b3\u09b1\3\2\2\2\u09b4\u09b5\7\5\2\2\u09b5\u09f2\3\2"+
		"\2\2\u09b6\u09b8\7\u009c\2\2\u09b7\u09b6\3\2\2\2\u09b7\u09b8\3\2\2\2\u09b8"+
		"\u09b9\3\2\2\2\u09b9\u09ba\7t\2\2\u09ba\u09bb\7\4\2\2\u09bb\u09bc\5$\23"+
		"\2\u09bc\u09bd\7\5\2\2\u09bd\u09f2\3\2\2\2\u09be\u09c0\7\u009c\2\2\u09bf"+
		"\u09be\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1\u09c2\7\u00c9"+
		"\2\2\u09c2\u09f2\5\u00d0i\2\u09c3\u09c5\7\u009c\2\2\u09c4\u09c3\3\2\2"+
		"\2\u09c4\u09c5\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u09c7\7\u0087\2\2\u09c7"+
		"\u09d5\t\30\2\2\u09c8\u09c9\7\4\2\2\u09c9\u09d6\7\5\2\2\u09ca\u09cb\7"+
		"\4\2\2\u09cb\u09d0\5\u00c8e\2\u09cc\u09cd\7\6\2\2\u09cd\u09cf\5\u00c8"+
		"e\2\u09ce\u09cc\3\2\2\2\u09cf\u09d2\3\2\2\2\u09d0\u09ce\3\2\2\2\u09d0"+
		"\u09d1\3\2\2\2\u09d1\u09d3\3\2\2\2\u09d2\u09d0\3\2\2\2\u09d3\u09d4\7\5"+
		"\2\2\u09d4\u09d6\3\2\2\2\u09d5\u09c8\3\2\2\2\u09d5\u09ca\3\2\2\2\u09d6"+
		"\u09f2\3\2\2\2\u09d7\u09d9\7\u009c\2\2\u09d8\u09d7\3\2\2\2\u09d8\u09d9"+
		"\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\7\u0087\2\2\u09db\u09de\5\u00d0"+
		"i\2\u09dc\u09dd\7R\2\2\u09dd\u09df\7\u0123\2\2\u09de\u09dc\3\2\2\2\u09de"+
		"\u09df\3\2\2\2\u09df\u09f2\3\2\2\2\u09e0\u09e2\7~\2\2\u09e1\u09e3\7\u009c"+
		"\2\2\u09e2\u09e1\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4"+
		"\u09f2\7\u009d\2\2\u09e5\u09e7\7~\2\2\u09e6\u09e8\7\u009c\2\2\u09e7\u09e6"+
		"\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09f2\t\31\2\2"+
		"\u09ea\u09ec\7~\2\2\u09eb\u09ed\7\u009c\2\2\u09ec\u09eb\3\2\2\2\u09ec"+
		"\u09ed\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09ef\7L\2\2\u09ef\u09f0\7g\2"+
		"\2\u09f0\u09f2\5\u00d0i\2\u09f1\u09a0\3\2\2\2\u09f1\u09a8\3\2\2\2\u09f1"+
		"\u09b7\3\2\2\2\u09f1\u09bf\3\2\2\2\u09f1\u09c4\3\2\2\2\u09f1\u09d8\3\2"+
		"\2\2\u09f1\u09e0\3\2\2\2\u09f1\u09e5\3\2\2\2\u09f1\u09ea\3\2\2\2\u09f2"+
		"\u00cf\3\2\2\2\u09f3\u09f4\bi\1\2\u09f4\u09f8\5\u00d2j\2\u09f5\u09f6\t"+
		"\32\2\2\u09f6\u09f8\5\u00d0i\t\u09f7\u09f3\3\2\2\2\u09f7\u09f5\3\2\2\2"+
		"\u09f8\u0a0e\3\2\2\2\u09f9\u09fa\f\b\2\2\u09fa\u09fb\t\33\2\2\u09fb\u0a0d"+
		"\5\u00d0i\t\u09fc\u09fd\f\7\2\2\u09fd\u09fe\t\34\2\2\u09fe\u0a0d\5\u00d0"+
		"i\b\u09ff\u0a00\f\6\2\2\u0a00\u0a01\7\u011f\2\2\u0a01\u0a0d\5\u00d0i\7"+
		"\u0a02\u0a03\f\5\2\2\u0a03\u0a04\7\u0122\2\2\u0a04\u0a0d\5\u00d0i\6\u0a05"+
		"\u0a06\f\4\2\2\u0a06\u0a07\7\u0120\2\2\u0a07\u0a0d\5\u00d0i\5\u0a08\u0a09"+
		"\f\3\2\2\u0a09\u0a0a\5\u00d6l\2\u0a0a\u0a0b\5\u00d0i\4\u0a0b\u0a0d\3\2"+
		"\2\2\u0a0c\u09f9\3\2\2\2\u0a0c\u09fc\3\2\2\2\u0a0c\u09ff\3\2\2\2\u0a0c"+
		"\u0a02\3\2\2\2\u0a0c\u0a05\3\2\2\2\u0a0c\u0a08\3\2\2\2\u0a0d\u0a10\3\2"+
		"\2\2\u0a0e\u0a0c\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u00d1\3\2\2\2\u0a10"+
		"\u0a0e\3\2\2\2\u0a11\u0a12\bj\1\2\u0a12\u0ace\t\35\2\2\u0a13\u0a15\7#"+
		"\2\2\u0a14\u0a16\5\u00fa~\2\u0a15\u0a14\3\2\2\2\u0a16\u0a17\3\2\2\2\u0a17"+
		"\u0a15\3\2\2\2\u0a17\u0a18\3\2\2\2\u0a18\u0a1b\3\2\2\2\u0a19\u0a1a\7P"+
		"\2\2\u0a1a\u0a1c\5\u00c8e\2\u0a1b\u0a19\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c"+
		"\u0a1d\3\2\2\2\u0a1d\u0a1e\7Q\2\2\u0a1e\u0ace\3\2\2\2\u0a1f\u0a20\7#\2"+
		"\2\u0a20\u0a22\5\u00c8e\2\u0a21\u0a23\5\u00fa~\2\u0a22\u0a21\3\2\2\2\u0a23"+
		"\u0a24\3\2\2\2\u0a24\u0a22\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25\u0a28\3\2"+
		"\2\2\u0a26\u0a27\7P\2\2\u0a27\u0a29\5\u00c8e\2\u0a28\u0a26\3\2\2\2\u0a28"+
		"\u0a29\3\2\2\2\u0a29\u0a2a\3\2\2\2\u0a2a\u0a2b\7Q\2\2\u0a2b\u0ace\3\2"+
		"\2\2\u0a2c\u0a2d\t\36\2\2\u0a2d\u0a2e\7\4\2\2\u0a2e\u0a2f\5\u00c8e\2\u0a2f"+
		"\u0a30\7\30\2\2\u0a30\u0a31\5\u00ecw\2\u0a31\u0a32\7\5\2\2\u0a32\u0ace"+
		"\3\2\2\2\u0a33\u0a34\7\u00e4\2\2\u0a34\u0a3d\7\4\2\2\u0a35\u0a3a\5\u00bc"+
		"_\2\u0a36\u0a37\7\6\2\2\u0a37\u0a39\5\u00bc_\2\u0a38\u0a36\3\2\2\2\u0a39"+
		"\u0a3c\3\2\2\2\u0a3a\u0a38\3\2\2\2\u0a3a\u0a3b\3\2\2\2\u0a3b\u0a3e\3\2"+
		"\2\2\u0a3c\u0a3a\3\2\2\2\u0a3d\u0a35\3\2\2\2\u0a3d\u0a3e\3\2\2\2\u0a3e"+
		"\u0a3f\3\2\2\2\u0a3f\u0ace\7\5\2\2\u0a40\u0a41\7a\2\2\u0a41\u0a42\7\4"+
		"\2\2\u0a42\u0a45\5\u00c8e\2\u0a43\u0a44\7r\2\2\u0a44\u0a46\7\u009e\2\2"+
		"\u0a45\u0a43\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u0a47\3\2\2\2\u0a47\u0a48"+
		"\7\5\2\2\u0a48\u0ace\3\2\2\2\u0a49\u0a4a\7\u0082\2\2\u0a4a\u0a4b\7\4\2"+
		"\2\u0a4b\u0a4e\5\u00c8e\2\u0a4c\u0a4d\7r\2\2\u0a4d\u0a4f\7\u009e\2\2\u0a4e"+
		"\u0a4c\3\2\2\2\u0a4e\u0a4f\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50\u0a51\7\5"+
		"\2\2\u0a51\u0ace\3\2\2\2\u0a52\u0a53\7\u00b3\2\2\u0a53\u0a54\7\4\2\2\u0a54"+
		"\u0a55\5\u00d0i\2\u0a55\u0a56\7t\2\2\u0a56\u0a57\5\u00d0i\2\u0a57\u0a58"+
		"\7\5\2\2\u0a58\u0ace\3\2\2\2\u0a59\u0ace\5\u00d4k\2\u0a5a\u0ace\7\u011b"+
		"\2\2\u0a5b\u0a5c\5\u010a\u0086\2\u0a5c\u0a5d\7\7\2\2\u0a5d\u0a5e\7\u011b"+
		"\2\2\u0a5e\u0ace\3\2\2\2\u0a5f\u0a60\7\4\2\2\u0a60\u0a63\5\u00bc_\2\u0a61"+
		"\u0a62\7\6\2\2\u0a62\u0a64\5\u00bc_\2\u0a63\u0a61\3\2\2\2\u0a64\u0a65"+
		"\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66\u0a67\3\2\2\2\u0a67"+
		"\u0a68\7\5\2\2\u0a68\u0ace\3\2\2\2\u0a69\u0a6a\7\4\2\2\u0a6a\u0a6b\5$"+
		"\23\2\u0a6b\u0a6c\7\5\2\2\u0a6c\u0ace\3\2\2\2\u0a6d\u0a6e\5\u0108\u0085"+
		"\2\u0a6e\u0a7a\7\4\2\2\u0a6f\u0a71\5\u0090I\2\u0a70\u0a6f\3\2\2\2\u0a70"+
		"\u0a71\3\2\2\2\u0a71\u0a72\3\2\2\2\u0a72\u0a77\5\u00c8e\2\u0a73\u0a74"+
		"\7\6\2\2\u0a74\u0a76\5\u00c8e\2\u0a75\u0a73\3\2\2\2\u0a76\u0a79\3\2\2"+
		"\2\u0a77\u0a75\3\2\2\2\u0a77\u0a78\3\2\2\2\u0a78\u0a7b\3\2\2\2\u0a79\u0a77"+
		"\3\2\2\2\u0a7a\u0a70\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a7c\3\2\2\2\u0a7c"+
		"\u0a83\7\5\2\2\u0a7d\u0a7e\7_\2\2\u0a7e\u0a7f\7\4\2\2\u0a7f\u0a80\7\u010c"+
		"\2\2\u0a80\u0a81\5\u00ccg\2\u0a81\u0a82\7\5\2\2\u0a82\u0a84\3\2\2\2\u0a83"+
		"\u0a7d\3\2\2\2\u0a83\u0a84\3\2\2\2\u0a84\u0a87\3\2\2\2\u0a85\u0a86\t\37"+
		"\2\2\u0a86\u0a88\7\u009e\2\2\u0a87\u0a85\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88"+
		"\u0a8b\3\2\2\2\u0a89\u0a8a\7\u00a9\2\2\u0a8a\u0a8c\5\u0100\u0081\2\u0a8b"+
		"\u0a89\3\2\2\2\u0a8b\u0a8c\3\2\2\2\u0a8c\u0ace\3\2\2\2\u0a8d\u0a8e\5\u0110"+
		"\u0089\2\u0a8e\u0a8f\7\n\2\2\u0a8f\u0a90\5\u00c8e\2\u0a90\u0ace\3\2\2"+
		"\2\u0a91\u0a92\7\4\2\2\u0a92\u0a95\5\u0110\u0089\2\u0a93\u0a94\7\6\2\2"+
		"\u0a94\u0a96\5\u0110\u0089\2\u0a95\u0a93\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97"+
		"\u0a95\3\2\2\2\u0a97\u0a98\3\2\2\2\u0a98\u0a99\3\2\2\2\u0a99\u0a9a\7\5"+
		"\2\2\u0a9a\u0a9b\7\n\2\2\u0a9b\u0a9c\5\u00c8e\2\u0a9c\u0ace\3\2\2\2\u0a9d"+
		"\u0ace\5\u0110\u0089\2\u0a9e\u0a9f\7\4\2\2\u0a9f\u0aa0\5\u00c8e\2\u0aa0"+
		"\u0aa1\7\5\2\2\u0aa1\u0ace\3\2\2\2\u0aa2\u0aa3\7[\2\2\u0aa3\u0aa4\7\4"+
		"\2\2\u0aa4\u0aa5\5\u0110\u0089\2\u0aa5\u0aa6\7g\2\2\u0aa6\u0aa7\5\u00d0"+
		"i\2\u0aa7\u0aa8\7\5\2\2\u0aa8\u0ace\3\2\2\2\u0aa9\u0aaa\t \2\2\u0aaa\u0aab"+
		"\7\4\2\2\u0aab\u0aac\5\u00d0i\2\u0aac\u0aad\t!\2\2\u0aad\u0ab0\5\u00d0"+
		"i\2\u0aae\u0aaf\t\"\2\2\u0aaf\u0ab1\5\u00d0i\2\u0ab0\u0aae\3\2\2\2\u0ab0"+
		"\u0ab1\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab3\7\5\2\2\u0ab3\u0ace\3\2"+
		"\2\2\u0ab4\u0ab5\7\u00f6\2\2\u0ab5\u0ab7\7\4\2\2\u0ab6\u0ab8\t#\2\2\u0ab7"+
		"\u0ab6\3\2\2\2\u0ab7\u0ab8\3\2\2\2\u0ab8\u0aba\3\2\2\2\u0ab9\u0abb\5\u00d0"+
		"i\2\u0aba\u0ab9\3\2\2\2\u0aba\u0abb\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc"+
		"\u0abd\7g\2\2\u0abd\u0abe\5\u00d0i\2\u0abe\u0abf\7\5\2\2\u0abf\u0ace\3"+
		"\2\2\2\u0ac0\u0ac1\7\u00ab\2\2\u0ac1\u0ac2\7\4\2\2\u0ac2\u0ac3\5\u00d0"+
		"i\2\u0ac3\u0ac4\7\u00b2\2\2\u0ac4\u0ac5\5\u00d0i\2\u0ac5\u0ac6\7g\2\2"+
		"\u0ac6\u0ac9\5\u00d0i\2\u0ac7\u0ac8\7c\2\2\u0ac8\u0aca\5\u00d0i\2\u0ac9"+
		"\u0ac7\3\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u0acb\3\2\2\2\u0acb\u0acc\7\5"+
		"\2\2\u0acc\u0ace\3\2\2\2\u0acd\u0a11\3\2\2\2\u0acd\u0a13\3\2\2\2\u0acd"+
		"\u0a1f\3\2\2\2\u0acd\u0a2c\3\2\2\2\u0acd\u0a33\3\2\2\2\u0acd\u0a40\3\2"+
		"\2\2\u0acd\u0a49\3\2\2\2\u0acd\u0a52\3\2\2\2\u0acd\u0a59\3\2\2\2\u0acd"+
		"\u0a5a\3\2\2\2\u0acd\u0a5b\3\2\2\2\u0acd\u0a5f\3\2\2\2\u0acd\u0a69\3\2"+
		"\2\2\u0acd\u0a6d\3\2\2\2\u0acd\u0a8d\3\2\2\2\u0acd\u0a91\3\2\2\2\u0acd"+
		"\u0a9d\3\2\2\2\u0acd\u0a9e\3\2\2\2\u0acd\u0aa2\3\2\2\2\u0acd\u0aa9\3\2"+
		"\2\2\u0acd\u0ab4\3\2\2\2\u0acd\u0ac0\3\2\2\2\u0ace\u0ad9\3\2\2\2\u0acf"+
		"\u0ad0\f\n\2\2\u0ad0\u0ad1\7\13\2\2\u0ad1\u0ad2\5\u00d0i\2\u0ad2\u0ad3"+
		"\7\f\2\2\u0ad3\u0ad8\3\2\2\2\u0ad4\u0ad5\f\b\2\2\u0ad5\u0ad6\7\7\2\2\u0ad6"+
		"\u0ad8\5\u0110\u0089\2\u0ad7\u0acf\3\2\2\2\u0ad7\u0ad4\3\2\2\2\u0ad8\u0adb"+
		"\3\2\2\2\u0ad9\u0ad7\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u00d3\3\2\2\2\u0adb"+
		"\u0ad9\3\2\2\2\u0adc\u0ae9\7\u009d\2\2\u0add\u0ae9\5\u00dep\2\u0ade\u0adf"+
		"\5\u0110\u0089\2\u0adf\u0ae0\7\u0123\2\2\u0ae0\u0ae9\3\2\2\2\u0ae1\u0ae9"+
		"\5\u0116\u008c\2\u0ae2\u0ae9\5\u00dco\2\u0ae3\u0ae5\7\u0123\2\2\u0ae4"+
		"\u0ae3\3\2\2\2\u0ae5\u0ae6\3\2\2\2\u0ae6\u0ae4\3\2\2\2\u0ae6\u0ae7\3\2"+
		"\2\2\u0ae7\u0ae9\3\2\2\2\u0ae8\u0adc\3\2\2\2\u0ae8\u0add\3\2\2\2\u0ae8"+
		"\u0ade\3\2\2\2\u0ae8\u0ae1\3\2\2\2\u0ae8\u0ae2\3\2\2\2\u0ae8\u0ae4\3\2"+
		"\2\2\u0ae9\u00d5\3\2\2\2\u0aea\u0aeb\t$\2\2\u0aeb\u00d7\3\2\2\2\u0aec"+
		"\u0aed\t%\2\2\u0aed\u00d9\3\2\2\2\u0aee\u0aef\t&\2\2\u0aef\u00db\3\2\2"+
		"\2\u0af0\u0af1\t\'\2\2\u0af1\u00dd\3\2\2\2\u0af2\u0af5\7|\2\2\u0af3\u0af6"+
		"\5\u00e0q\2\u0af4\u0af6\5\u00e4s\2\u0af5\u0af3\3\2\2\2\u0af5\u0af4\3\2"+
		"\2\2\u0af5\u0af6\3\2\2\2\u0af6\u00df\3\2\2\2\u0af7\u0af9\5\u00e2r\2\u0af8"+
		"\u0afa\5\u00e6t\2\u0af9\u0af8\3\2\2\2\u0af9\u0afa\3\2\2\2\u0afa\u00e1"+
		"\3\2\2\2\u0afb\u0afc\5\u00e8u\2\u0afc\u0afd\5\u0110\u0089\2\u0afd\u0aff"+
		"\3\2\2\2\u0afe\u0afb\3\2\2\2\u0aff\u0b00\3\2\2\2\u0b00\u0afe\3\2\2\2\u0b00"+
		"\u0b01\3\2\2\2\u0b01\u00e3\3\2\2\2\u0b02\u0b05\5\u00e6t\2\u0b03\u0b06"+
		"\5\u00e2r\2\u0b04\u0b06\5\u00e6t\2\u0b05\u0b03\3\2\2\2\u0b05\u0b04\3\2"+
		"\2\2\u0b05\u0b06\3\2\2\2\u0b06\u00e5\3\2\2\2\u0b07\u0b08\5\u00e8u\2\u0b08"+
		"\u0b09\5\u0110\u0089\2\u0b09\u0b0a\7\u00f0\2\2\u0b0a\u0b0b\5\u0110\u0089"+
		"\2\u0b0b\u00e7\3\2\2\2\u0b0c\u0b0e\t(\2\2\u0b0d\u0b0c\3\2\2\2\u0b0d\u0b0e"+
		"\3\2\2\2\u0b0e\u0b0f\3\2\2\2\u0b0f\u0b10\t)\2\2\u0b10\u00e9\3\2\2\2\u0b11"+
		"\u0b15\7a\2\2\u0b12\u0b13\7\17\2\2\u0b13\u0b15\5\u010c\u0087\2\u0b14\u0b11"+
		"\3\2\2\2\u0b14\u0b12\3\2\2\2\u0b15\u00eb\3\2\2\2\u0b16\u0b17\7\27\2\2"+
		"\u0b17\u0b18\7\u0115\2\2\u0b18\u0b19\5\u00ecw\2\u0b19\u0b1a\7\u0117\2"+
		"\2\u0b1a\u0b45\3\2\2\2\u0b1b\u0b1c\7\u0092\2\2\u0b1c\u0b1d\7\u0115\2\2"+
		"\u0b1d\u0b1e\5\u00ecw\2\u0b1e\u0b1f\7\6\2\2\u0b1f\u0b20\5\u00ecw\2\u0b20"+
		"\u0b21\7\u0117\2\2\u0b21\u0b45\3\2\2\2\u0b22\u0b29\7\u00e4\2\2\u0b23\u0b25"+
		"\7\u0115\2\2\u0b24\u0b26\5\u00f6|\2\u0b25\u0b24\3\2\2\2\u0b25\u0b26\3"+
		"\2\2\2\u0b26\u0b27\3\2\2\2\u0b27\u0b2a\7\u0117\2\2\u0b28\u0b2a\7\u0113"+
		"\2\2\u0b29\u0b23\3\2\2\2\u0b29\u0b28\3\2\2\2\u0b2a\u0b45\3\2\2\2\u0b2b"+
		"\u0b2c\7|\2\2\u0b2c\u0b2f\t*\2\2\u0b2d\u0b2e\7\u00f0\2\2\u0b2e\u0b30\7"+
		"\u0096\2\2\u0b2f\u0b2d\3\2\2\2\u0b2f\u0b30\3\2\2\2\u0b30\u0b45\3\2\2\2"+
		"\u0b31\u0b32\7|\2\2\u0b32\u0b35\t+\2\2\u0b33\u0b34\7\u00f0\2\2\u0b34\u0b36"+
		"\t,\2\2\u0b35\u0b33\3\2\2\2\u0b35\u0b36\3\2\2\2\u0b36\u0b45\3\2\2\2\u0b37"+
		"\u0b42\5\u0110\u0089\2\u0b38\u0b39\7\4\2\2\u0b39\u0b3e\7\u0127\2\2\u0b3a"+
		"\u0b3b\7\6\2\2\u0b3b\u0b3d\7\u0127\2\2\u0b3c\u0b3a\3\2\2\2\u0b3d\u0b40"+
		"\3\2\2\2\u0b3e\u0b3c\3\2\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f\u0b41\3\2\2\2\u0b40"+
		"\u0b3e\3\2\2\2\u0b41\u0b43\7\5\2\2\u0b42\u0b38\3\2\2\2\u0b42\u0b43\3\2"+
		"\2\2\u0b43\u0b45\3\2\2\2\u0b44\u0b16\3\2\2\2\u0b44\u0b1b\3\2\2\2\u0b44"+
		"\u0b22\3\2\2\2\u0b44\u0b2b\3\2\2\2\u0b44\u0b31\3\2\2\2\u0b44\u0b37\3\2"+
		"\2\2\u0b45\u00ed\3\2\2\2\u0b46\u0b4b\5\u00f0y\2\u0b47\u0b48\7\6\2\2\u0b48"+
		"\u0b4a\5\u00f0y\2\u0b49\u0b47\3\2\2\2\u0b4a\u0b4d\3\2\2\2\u0b4b\u0b49"+
		"\3\2\2\2\u0b4b\u0b4c\3\2\2\2\u0b4c\u00ef\3\2\2\2\u0b4d\u0b4b\3\2\2\2\u0b4e"+
		"\u0b4f\5\u00b6\\\2\u0b4f\u0b52\5\u00ecw\2\u0b50\u0b51\7\u009c\2\2\u0b51"+
		"\u0b53\7\u009d\2\2\u0b52\u0b50\3\2\2\2\u0b52\u0b53\3\2\2\2\u0b53\u0b55"+
		"\3\2\2\2\u0b54\u0b56\5\"\22\2\u0b55\u0b54\3\2\2\2\u0b55\u0b56\3\2\2\2"+
		"\u0b56\u0b58\3\2\2\2\u0b57\u0b59\5\u00eav\2\u0b58\u0b57\3\2\2\2\u0b58"+
		"\u0b59\3\2\2\2\u0b59\u00f1\3\2\2\2\u0b5a\u0b5f\5\u00f4{\2\u0b5b\u0b5c"+
		"\7\6\2\2\u0b5c\u0b5e\5\u00f4{\2\u0b5d\u0b5b\3\2\2\2\u0b5e\u0b61\3\2\2"+
		"\2\u0b5f\u0b5d\3\2\2\2\u0b5f\u0b60\3\2\2\2\u0b60\u00f3\3\2\2\2\u0b61\u0b5f"+
		"\3\2\2\2\u0b62\u0b63\5\u010c\u0087\2\u0b63\u0b66\5\u00ecw\2\u0b64\u0b65"+
		"\7\u009c\2\2\u0b65\u0b67\7\u009d\2\2\u0b66\u0b64\3\2\2\2\u0b66\u0b67\3"+
		"\2\2\2\u0b67\u0b69\3\2\2\2\u0b68\u0b6a\5\"\22\2\u0b69\u0b68\3\2\2\2\u0b69"+
		"\u0b6a\3\2\2\2\u0b6a\u00f5\3\2\2\2\u0b6b\u0b70\5\u00f8}\2\u0b6c\u0b6d"+
		"\7\6\2\2\u0b6d\u0b6f\5\u00f8}\2\u0b6e\u0b6c\3\2\2\2\u0b6f\u0b72\3\2\2"+
		"\2\u0b70\u0b6e\3\2\2\2\u0b70\u0b71\3\2\2\2\u0b71\u00f7\3\2\2\2\u0b72\u0b70"+
		"\3\2\2\2\u0b73\u0b75\5\u0110\u0089\2\u0b74\u0b76\7\r\2\2\u0b75\u0b74\3"+
		"\2\2\2\u0b75\u0b76\3\2\2\2\u0b76\u0b77\3\2\2\2\u0b77\u0b7a\5\u00ecw\2"+
		"\u0b78\u0b79\7\u009c\2\2\u0b79\u0b7b\7\u009d\2\2\u0b7a\u0b78\3\2\2\2\u0b7a"+
		"\u0b7b\3\2\2\2\u0b7b\u0b7d\3\2\2\2\u0b7c\u0b7e\5\"\22\2\u0b7d\u0b7c\3"+
		"\2\2\2\u0b7d\u0b7e\3\2\2\2\u0b7e\u00f9\3\2\2\2\u0b7f\u0b80\7\u010b\2\2"+
		"\u0b80\u0b81\5\u00c8e\2\u0b81\u0b82\7\u00ee\2\2\u0b82\u0b83\5\u00c8e\2"+
		"\u0b83\u00fb\3\2\2\2\u0b84\u0b85\7\u010d\2\2\u0b85\u0b8a\5\u00fe\u0080"+
		"\2\u0b86\u0b87\7\6\2\2\u0b87\u0b89\5\u00fe\u0080\2\u0b88\u0b86\3\2\2\2"+
		"\u0b89\u0b8c\3\2\2\2\u0b8a\u0b88\3\2\2\2\u0b8a\u0b8b\3\2\2\2\u0b8b\u00fd"+
		"\3\2\2\2\u0b8c\u0b8a\3\2\2\2\u0b8d\u0b8e\5\u010c\u0087\2\u0b8e\u0b8f\7"+
		"\30\2\2\u0b8f\u0b90\5\u0100\u0081\2\u0b90\u00ff\3\2\2\2\u0b91\u0bc0\5"+
		"\u010c\u0087\2\u0b92\u0b93\7\4\2\2\u0b93\u0b94\5\u010c\u0087\2\u0b94\u0b95"+
		"\7\5\2\2\u0b95\u0bc0\3\2\2\2\u0b96\u0bb9\7\4\2\2\u0b97\u0b98\7(\2\2\u0b98"+
		"\u0b99\7 \2\2\u0b99\u0b9e\5\u00c8e\2\u0b9a\u0b9b\7\6\2\2\u0b9b\u0b9d\5"+
		"\u00c8e\2\u0b9c\u0b9a\3\2\2\2\u0b9d\u0ba0\3\2\2\2\u0b9e\u0b9c\3\2\2\2"+
		"\u0b9e\u0b9f\3\2\2\2\u0b9f\u0bba\3\2\2\2\u0ba0\u0b9e\3\2\2\2\u0ba1\u0ba2"+
		"\t-\2\2\u0ba2\u0ba3\7 \2\2\u0ba3\u0ba8\5\u00c8e\2\u0ba4\u0ba5\7\6\2\2"+
		"\u0ba5\u0ba7\5\u00c8e\2\u0ba6\u0ba4\3\2\2\2\u0ba7\u0baa\3\2\2\2\u0ba8"+
		"\u0ba6\3\2\2\2\u0ba8\u0ba9\3\2\2\2\u0ba9\u0bac\3\2\2\2\u0baa\u0ba8\3\2"+
		"\2\2\u0bab\u0ba1\3\2\2\2\u0bab\u0bac\3\2\2\2\u0bac\u0bb7\3\2\2\2\u0bad"+
		"\u0bae\t.\2\2\u0bae\u0baf\7 \2\2\u0baf\u0bb4\5Z.\2\u0bb0\u0bb1\7\6\2\2"+
		"\u0bb1\u0bb3\5Z.\2\u0bb2\u0bb0\3\2\2\2\u0bb3\u0bb6\3\2\2\2\u0bb4\u0bb2"+
		"\3\2\2\2\u0bb4\u0bb5\3\2\2\2\u0bb5\u0bb8\3\2\2\2\u0bb6\u0bb4\3\2\2\2\u0bb7"+
		"\u0bad\3\2\2\2\u0bb7\u0bb8\3\2\2\2\u0bb8\u0bba\3\2\2\2\u0bb9\u0b97\3\2"+
		"\2\2\u0bb9\u0bab\3\2\2\2\u0bba\u0bbc\3\2\2\2\u0bbb\u0bbd\5\u0102\u0082"+
		"\2\u0bbc\u0bbb\3\2\2\2\u0bbc\u0bbd\3\2\2\2\u0bbd\u0bbe\3\2\2\2\u0bbe\u0bc0"+
		"\7\5\2\2\u0bbf\u0b91\3\2\2\2\u0bbf\u0b92\3\2\2\2\u0bbf\u0b96\3\2\2\2\u0bc0"+
		"\u0101\3\2\2\2\u0bc1\u0bc2\7\u00ba\2\2\u0bc2\u0bd2\5\u0104\u0083\2\u0bc3"+
		"\u0bc4\7\u00cf\2\2\u0bc4\u0bd2\5\u0104\u0083\2\u0bc5\u0bc6\7\u00ba\2\2"+
		"\u0bc6\u0bc7\7\34\2\2\u0bc7\u0bc8\5\u0104\u0083\2\u0bc8\u0bc9\7\23\2\2"+
		"\u0bc9\u0bca\5\u0104\u0083\2\u0bca\u0bd2\3\2\2\2\u0bcb\u0bcc\7\u00cf\2"+
		"\2\u0bcc\u0bcd\7\34\2\2\u0bcd\u0bce\5\u0104\u0083\2\u0bce\u0bcf\7\23\2"+
		"\2\u0bcf\u0bd0\5\u0104\u0083\2\u0bd0\u0bd2\3\2\2\2\u0bd1\u0bc1\3\2\2\2"+
		"\u0bd1\u0bc3\3\2\2\2\u0bd1\u0bc5\3\2\2\2\u0bd1\u0bcb\3\2\2\2\u0bd2\u0103"+
		"\3\2\2\2\u0bd3\u0bd4\7\u00fc\2\2\u0bd4\u0bdb\t/\2\2\u0bd5\u0bd6\7:\2\2"+
		"\u0bd6\u0bdb\7\u00ce\2\2\u0bd7\u0bd8\5\u00c8e\2\u0bd8\u0bd9\t/\2\2\u0bd9"+
		"\u0bdb\3\2\2\2\u0bda\u0bd3\3\2\2\2\u0bda\u0bd5\3\2\2\2\u0bda\u0bd7\3\2"+
		"\2\2\u0bdb\u0105\3\2\2\2\u0bdc\u0be1\5\u010a\u0086\2\u0bdd\u0bde\7\6\2"+
		"\2\u0bde\u0be0\5\u010a\u0086\2\u0bdf\u0bdd\3\2\2\2\u0be0\u0be3\3\2\2\2"+
		"\u0be1\u0bdf\3\2\2\2\u0be1\u0be2\3\2\2\2\u0be2\u0107\3\2\2\2\u0be3\u0be1"+
		"\3\2\2\2\u0be4\u0be9\5\u010a\u0086\2\u0be5\u0be9\7_\2\2\u0be6\u0be9\7"+
		"\u0086\2\2\u0be7\u0be9\7\u00c8\2\2\u0be8\u0be4\3\2\2\2\u0be8\u0be5\3\2"+
		"\2\2\u0be8\u0be6\3\2\2\2\u0be8\u0be7\3\2\2\2\u0be9\u0109\3\2\2\2\u0bea"+
		"\u0bef\5\u0110\u0089\2\u0beb\u0bec\7\7\2\2\u0bec\u0bee\5\u0110\u0089\2"+
		"\u0bed\u0beb\3\2\2\2\u0bee\u0bf1\3\2\2\2\u0bef\u0bed\3\2\2\2\u0bef\u0bf0"+
		"\3\2\2\2\u0bf0\u010b\3\2\2\2\u0bf1\u0bef\3\2\2\2\u0bf2\u0bf3\5\u0110\u0089"+
		"\2\u0bf3\u0bf4\5\u010e\u0088\2\u0bf4\u010d\3\2\2\2\u0bf5\u0bf6\7\u011a"+
		"\2\2\u0bf6\u0bf8\5\u0110\u0089\2\u0bf7\u0bf5\3\2\2\2\u0bf8\u0bf9\3\2\2"+
		"\2\u0bf9\u0bf7\3\2\2\2\u0bf9\u0bfa\3\2\2\2\u0bfa\u0bfd\3\2\2\2\u0bfb\u0bfd"+
		"\3\2\2\2\u0bfc\u0bf7\3\2\2\2\u0bfc\u0bfb\3\2\2\2\u0bfd\u010f\3\2\2\2\u0bfe"+
		"\u0c02\5\u0112\u008a\2\u0bff\u0c00\6\u0089\22\2\u0c00\u0c02\5\u011c\u008f"+
		"\2\u0c01\u0bfe\3\2\2\2\u0c01\u0bff\3\2\2\2\u0c02\u0111\3\2\2\2\u0c03\u0c0a"+
		"\7\u012d\2\2\u0c04\u0c0a\5\u0114\u008b\2\u0c05\u0c06\6\u008a\23\2\u0c06"+
		"\u0c0a\5\u011a\u008e\2\u0c07\u0c08\6\u008a\24\2\u0c08\u0c0a\5\u011e\u0090"+
		"\2\u0c09\u0c03\3\2\2\2\u0c09\u0c04\3\2\2\2\u0c09\u0c05\3\2\2\2\u0c09\u0c07"+
		"\3\2\2\2\u0c0a\u0113\3\2\2\2\u0c0b\u0c0c\7\u012e\2\2\u0c0c\u0115\3\2\2"+
		"\2\u0c0d\u0c0f\6\u008c\25\2\u0c0e\u0c10\7\u011a\2\2\u0c0f\u0c0e\3\2\2"+
		"\2\u0c0f\u0c10\3\2\2\2\u0c10\u0c11\3\2\2\2\u0c11\u0c39\7\u0128\2\2\u0c12"+
		"\u0c14\6\u008c\26\2\u0c13\u0c15\7\u011a\2\2\u0c14\u0c13\3\2\2\2\u0c14"+
		"\u0c15\3\2\2\2\u0c15\u0c16\3\2\2\2\u0c16\u0c39\7\u0129\2\2\u0c17\u0c19"+
		"\6\u008c\27\2\u0c18\u0c1a\7\u011a\2\2\u0c19\u0c18\3\2\2\2\u0c19\u0c1a"+
		"\3\2\2\2\u0c1a\u0c1b\3\2\2\2\u0c1b\u0c39\t\60\2\2\u0c1c\u0c1e\7\u011a"+
		"\2\2\u0c1d\u0c1c\3\2\2\2\u0c1d\u0c1e\3\2\2\2\u0c1e\u0c1f\3\2\2\2\u0c1f"+
		"\u0c39\7\u0127\2\2\u0c20\u0c22\7\u011a\2\2\u0c21\u0c20\3\2\2\2\u0c21\u0c22"+
		"\3\2\2\2\u0c22\u0c23\3\2\2\2\u0c23\u0c39\7\u0124\2\2\u0c24\u0c26\7\u011a"+
		"\2\2\u0c25\u0c24\3\2\2\2\u0c25\u0c26\3\2\2\2\u0c26\u0c27\3\2\2\2\u0c27"+
		"\u0c39\7\u0125\2\2\u0c28\u0c2a\7\u011a\2\2\u0c29\u0c28\3\2\2\2\u0c29\u0c2a"+
		"\3\2\2\2\u0c2a\u0c2b\3\2\2\2\u0c2b\u0c39\7\u0126\2\2\u0c2c\u0c2e\7\u011a"+
		"\2\2\u0c2d\u0c2c\3\2\2\2\u0c2d\u0c2e\3\2\2\2\u0c2e\u0c2f\3\2\2\2\u0c2f"+
		"\u0c39\7\u012b\2\2\u0c30\u0c32\7\u011a\2\2\u0c31\u0c30\3\2\2\2\u0c31\u0c32"+
		"\3\2\2\2\u0c32\u0c33\3\2\2\2\u0c33\u0c39\7\u012a\2\2\u0c34\u0c36\7\u011a"+
		"\2\2\u0c35\u0c34\3\2\2\2\u0c35\u0c36\3\2\2\2\u0c36\u0c37\3\2\2\2\u0c37"+
		"\u0c39\7\u012c\2\2\u0c38\u0c0d\3\2\2\2\u0c38\u0c12\3\2\2\2\u0c38\u0c17"+
		"\3\2\2\2\u0c38\u0c1d\3\2\2\2\u0c38\u0c21\3\2\2\2\u0c38\u0c25\3\2\2\2\u0c38"+
		"\u0c29\3\2\2\2\u0c38\u0c2d\3\2\2\2\u0c38\u0c31\3\2\2\2\u0c38\u0c35\3\2"+
		"\2\2\u0c39\u0117\3\2\2\2\u0c3a\u0c3b\7\u00fa\2\2\u0c3b\u0c42\5\u00ecw"+
		"\2\u0c3c\u0c42\5\"\22\2\u0c3d\u0c42\5\u00eav\2\u0c3e\u0c3f\t\61\2\2\u0c3f"+
		"\u0c40\7\u009c\2\2\u0c40\u0c42\7\u009d\2\2\u0c41\u0c3a\3\2\2\2\u0c41\u0c3c"+
		"\3\2\2\2\u0c41\u0c3d\3\2\2\2\u0c41\u0c3e\3\2\2\2\u0c42\u0119\3\2\2\2\u0c43"+
		"\u0c44\t\62\2\2\u0c44\u011b\3\2\2\2\u0c45\u0c46\t\63\2\2\u0c46\u011d\3"+
		"\2\2\2\u0c47\u0c48\t\64\2\2\u0c48\u011f\3\2\2\2\u01a1\u0124\u013d\u0142"+
		"\u014a\u0152\u0154\u0168\u016c\u0172\u0175\u0178\u017f\u0182\u0186\u0189"+
		"\u0190\u019b\u019d\u01a5\u01a8\u01ac\u01af\u01b5\u01c0\u01c6\u01cb\u020b"+
		"\u0214\u0218\u021e\u0222\u0227\u022d\u0239\u0241\u0247\u0254\u0259\u0269"+
		"\u0270\u0274\u027a\u0289\u028d\u0293\u0299\u029c\u029f\u02a5\u02a9\u02b1"+
		"\u02b3\u02bc\u02bf\u02c8\u02cd\u02d3\u02da\u02dd\u02e3\u02ee\u02f1\u02f5"+
		"\u02fa\u02ff\u0306\u0309\u030c\u0313\u0318\u0321\u0329\u032f\u0332\u0335"+
		"\u033b\u033f\u0343\u0347\u0349\u0351\u0359\u035f\u0365\u0368\u036c\u036f"+
		"\u0373\u038f\u0392\u0396\u039c\u039f\u03a2\u03a8\u03b0\u03b5\u03bb\u03c1"+
		"\u03c9\u03d0\u03d8\u03e9\u03f7\u03fa\u0400\u0409\u0412\u0419\u041e\u042a"+
		"\u042e\u0435\u04a9\u04b1\u04b9\u04c2\u04cc\u04d0\u04d3\u04d9\u04df\u04eb"+
		"\u04f7\u04fc\u0505\u050d\u0514\u0516\u0519\u051e\u0522\u0527\u052a\u052f"+
		"\u0534\u0537\u053c\u0540\u0545\u0547\u054b\u0554\u055c\u0565\u056c\u0575"+
		"\u057a\u057d\u0593\u0595\u059e\u05a5\u05a8\u05af\u05b3\u05b9\u05c1\u05cc"+
		"\u05d7\u05de\u05e4\u05f1\u05f8\u05ff\u060b\u0613\u0619\u061c\u0625\u0628"+
		"\u0631\u0634\u063d\u0640\u0649\u064c\u064f\u0654\u0656\u0662\u0669\u0670"+
		"\u0673\u0675\u0681\u0685\u0689\u068f\u0693\u069b\u069f\u06a2\u06a5\u06a8"+
		"\u06ac\u06b0\u06b5\u06b9\u06bc\u06bf\u06c2\u06c6\u06cb\u06cf\u06d2\u06d5"+
		"\u06d8\u06da\u06e0\u06e7\u06ec\u06ef\u06f2\u06f6\u0700\u0704\u0706\u0709"+
		"\u070d\u0713\u0717\u0722\u072c\u0738\u0747\u074c\u0753\u0763\u0768\u0775"+
		"\u077a\u0782\u0788\u078c\u0795\u079f\u07ae\u07b3\u07b5\u07b9\u07c2\u07cf"+
		"\u07d4\u07d8\u07e0\u07e3\u07e7\u07f5\u0802\u0807\u080b\u080e\u0813\u081c"+
		"\u081f\u0824\u082b\u082e\u0833\u0839\u083f\u0843\u0849\u084d\u0850\u0855"+
		"\u0858\u085d\u0861\u0864\u0867\u086d\u0872\u0877\u0889\u088b\u088e\u0899"+
		"\u08a2\u08a9\u08b1\u08b8\u08bc\u08c4\u08cc\u08d2\u08da\u08e6\u08e9\u08ef"+
		"\u08f3\u08f5\u08fe\u090a\u090c\u0913\u091a\u0920\u0926\u0928\u092f\u0937"+
		"\u093d\u0944\u094a\u094e\u0950\u0957\u0960\u0967\u0971\u0976\u097a\u0983"+
		"\u0990\u0992\u099a\u099c\u09a0\u09a8\u09b1\u09b7\u09bf\u09c4\u09d0\u09d5"+
		"\u09d8\u09de\u09e2\u09e7\u09ec\u09f1\u09f7\u0a0c\u0a0e\u0a17\u0a1b\u0a24"+
		"\u0a28\u0a3a\u0a3d\u0a45\u0a4e\u0a65\u0a70\u0a77\u0a7a\u0a83\u0a87\u0a8b"+
		"\u0a97\u0ab0\u0ab7\u0aba\u0ac9\u0acd\u0ad7\u0ad9\u0ae6\u0ae8\u0af5\u0af9"+
		"\u0b00\u0b05\u0b0d\u0b14\u0b25\u0b29\u0b2f\u0b35\u0b3e\u0b42\u0b44\u0b4b"+
		"\u0b52\u0b55\u0b58\u0b5f\u0b66\u0b69\u0b70\u0b75\u0b7a\u0b7d\u0b8a\u0b9e"+
		"\u0ba8\u0bab\u0bb4\u0bb7\u0bb9\u0bbc\u0bbf\u0bd1\u0bda\u0be1\u0be8\u0bef"+
		"\u0bf9\u0bfc\u0c01\u0c09\u0c0f\u0c14\u0c19\u0c1d\u0c21\u0c25\u0c29\u0c2d"+
		"\u0c31\u0c35\u0c38\u0c41";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}