// Generated from taja.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tajaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, TYPE_INT=23, TYPE_FLOAT=24, 
		TYPE_BOOLEAN=25, TYPE_CHAR=26, WHILE=27, IF=28, ELSE=29, SWITCH=30, CASE=31, 
		CLASS=32, CONSTRUCTOR=33, FUNCTION=34, DEFAULT=35, BREAK=36, RETURN=37, 
		CONTINUE=38, FOR=39, ID=40, INT=41, FLOAT=42, CHAR=43, BOOL=44, WS=45;
	public static final int
		RULE_start = 0, RULE_function_definition = 1, RULE_function_call = 2, 
		RULE_class_definition = 3, RULE_class_statements = 4, RULE_constructor = 5, 
		RULE_arguments = 6, RULE_statements = 7, RULE_statement = 8, RULE_switchStatements = 9, 
		RULE_switchStatement = 10, RULE_labelStatement = 11, RULE_jumpStatement = 12, 
		RULE_selectionStatement = 13, RULE_ternaryArguments = 14, RULE_iterStatement = 15, 
		RULE_whileStatement = 16, RULE_assignments = 17, RULE_assignment_typed = 18, 
		RULE_assignment_empty = 19, RULE_assignment_call = 20, RULE_assignment = 21, 
		RULE_assignment_change = 22, RULE_types = 23, RULE_call = 24, RULE_call_arguments = 25, 
		RULE_expressions = 26, RULE_expression = 27, RULE_summ = 28, RULE_mult = 29, 
		RULE_atomic = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "function_definition", "function_call", "class_definition", 
			"class_statements", "constructor", "arguments", "statements", "statement", 
			"switchStatements", "switchStatement", "labelStatement", "jumpStatement", 
			"selectionStatement", "ternaryArguments", "iterStatement", "whileStatement", 
			"assignments", "assignment_typed", "assignment_empty", "assignment_call", 
			"assignment", "assignment_change", "types", "call", "call_arguments", 
			"expressions", "expression", "summ", "mult", "atomic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "'{'", "'}'", "';'", "','", "':'", "'?'", 
			"'='", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", 
			"'+'", "'-'", "'*'", "'/'", "'int'", "'float'", "'bool'", "'char'", "'while'", 
			"'if'", "'else'", "'switch'", "'case'", "'class'", "'constructor'", "'function'", 
			"'default'", "'break'", "'return'", "'continue'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "TYPE_INT", 
			"TYPE_FLOAT", "TYPE_BOOLEAN", "TYPE_CHAR", "WHILE", "IF", "ELSE", "SWITCH", 
			"CASE", "CLASS", "CONSTRUCTOR", "FUNCTION", "DEFAULT", "BREAK", "RETURN", 
			"CONTINUE", "FOR", "ID", "INT", "FLOAT", "CHAR", "BOOL", "WS"
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
	public String getGrammarFileName() { return "taja.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tajaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tajaParser.EOF, 0); }
		public List<Class_definitionContext> class_definition() {
			return getRuleContexts(Class_definitionContext.class);
		}
		public Class_definitionContext class_definition(int i) {
			return getRuleContext(Class_definitionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(62);
				class_definition();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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

	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(tajaParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(tajaParser.ID, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(FUNCTION);
			setState(71);
			match(ID);
			setState(72);
			match(T__0);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(73);
				arguments();
				}
			}

			setState(76);
			match(T__1);
			setState(77);
			statements();
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tajaParser.ID, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			setState(80);
			match(T__2);
			setState(81);
			call();
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

	public static class Class_definitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(tajaParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(tajaParser.ID, 0); }
		public List<Class_statementsContext> class_statements() {
			return getRuleContexts(Class_statementsContext.class);
		}
		public Class_statementsContext class_statements(int i) {
			return getRuleContext(Class_statementsContext.class,i);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitClass_definition(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(CLASS);
			setState(84);
			match(ID);
			setState(85);
			match(T__3);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTRUCTOR) | (1L << FUNCTION) | (1L << ID))) != 0)) {
				{
				{
				setState(86);
				class_statements();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(T__4);
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

	public static class Class_statementsContext extends ParserRuleContext {
		public Assignment_typedContext assignment_typed() {
			return getRuleContext(Assignment_typedContext.class,0);
		}
		public Assignment_emptyContext assignment_empty() {
			return getRuleContext(Assignment_emptyContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Class_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterClass_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitClass_statements(this);
		}
	}

	public final Class_statementsContext class_statements() throws RecognitionException {
		Class_statementsContext _localctx = new Class_statementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_statements);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				assignment_typed();
				setState(95);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				assignment_empty();
				setState(98);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				constructor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				function_definition();
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(tajaParser.CONSTRUCTOR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(CONSTRUCTOR);
			setState(105);
			match(T__0);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(106);
				arguments();
				}
			}

			setState(109);
			match(T__1);
			setState(110);
			match(T__3);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(111);
					statement();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(117);
			match(T__4);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(tajaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tajaParser.ID, i);
		}
		public List<Assignment_emptyContext> assignment_empty() {
			return getRuleContexts(Assignment_emptyContext.class);
		}
		public Assignment_emptyContext assignment_empty(int i) {
			return getRuleContext(Assignment_emptyContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arguments);
		try {
			int _alt;
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(ID);
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(120);
						match(T__6);
						setState(121);
						match(ID);
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				assignment_empty();
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(128);
						match(T__6);
						setState(129);
						assignment_empty();
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__3);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << FOR) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				{
				setState(138);
				statement();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(T__4);
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
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterStatementContext iterStatement() {
			return getRuleContext(IterStatementContext.class,0);
		}
		public LabelStatementContext labelStatement() {
			return getRuleContext(LabelStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				assignments();
				setState(147);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				selectionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				iterStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				labelStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				jumpStatement();
				setState(153);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				expression();
				setState(156);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				call();
				setState(159);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				function_call();
				setState(162);
				match(T__5);
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

	public static class SwitchStatementsContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(tajaParser.CASE, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<SwitchStatementContext> switchStatement() {
			return getRuleContexts(SwitchStatementContext.class);
		}
		public SwitchStatementContext switchStatement(int i) {
			return getRuleContext(SwitchStatementContext.class,i);
		}
		public SwitchStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterSwitchStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitSwitchStatements(this);
		}
	}

	public final SwitchStatementsContext switchStatements() throws RecognitionException {
		SwitchStatementsContext _localctx = new SwitchStatementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_switchStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__3);
			setState(167);
			match(CASE);
			setState(168);
			atomic();
			setState(169);
			match(T__7);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(170);
				switchStatement();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__4);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public LabelStatementContext labelStatement() {
			return getRuleContext(LabelStatementContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_switchStatement);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				assignments();
				setState(179);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				jumpStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				call();
				setState(183);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				labelStatement();
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

	public static class LabelStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tajaParser.ID, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CASE() { return getToken(tajaParser.CASE, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(tajaParser.DEFAULT, 0); }
		public LabelStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterLabelStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitLabelStatement(this);
		}
	}

	public final LabelStatementContext labelStatement() throws RecognitionException {
		LabelStatementContext _localctx = new LabelStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_labelStatement);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(ID);
				setState(189);
				match(T__7);
				setState(190);
				statement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(CASE);
				setState(192);
				atomic();
				setState(193);
				match(T__7);
				setState(194);
				statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(DEFAULT);
				setState(197);
				match(T__7);
				setState(198);
				statement();
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(tajaParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(tajaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jumpStatement);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(BREAK);
				setState(202);
				match(T__5);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(RETURN);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
					{
					setState(204);
					expression();
					}
				}

				setState(207);
				match(T__5);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(tajaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(tajaParser.ELSE, 0); }
		public TerminalNode SWITCH() { return getToken(tajaParser.SWITCH, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<SwitchStatementsContext> switchStatements() {
			return getRuleContexts(SwitchStatementsContext.class);
		}
		public SwitchStatementsContext switchStatements(int i) {
			return getRuleContext(SwitchStatementsContext.class,i);
		}
		public List<TernaryArgumentsContext> ternaryArguments() {
			return getRuleContexts(TernaryArgumentsContext.class);
		}
		public TernaryArgumentsContext ternaryArguments(int i) {
			return getRuleContext(TernaryArgumentsContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectionStatement);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(IF);
				setState(211);
				match(T__0);
				setState(212);
				expression();
				setState(213);
				match(T__1);
				setState(214);
				statements();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(215);
					match(ELSE);
					setState(216);
					statements();
					}
				}

				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(SWITCH);
				setState(220);
				match(T__0);
				setState(221);
				atomic();
				setState(222);
				match(T__1);
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(223);
					switchStatements();
					}
					}
					setState(226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				expression();
				setState(229);
				match(T__8);
				setState(230);
				ternaryArguments();
				setState(231);
				match(T__7);
				setState(232);
				ternaryArguments();
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

	public static class TernaryArgumentsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TernaryArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterTernaryArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitTernaryArguments(this);
		}
	}

	public final TernaryArgumentsContext ternaryArguments() throws RecognitionException {
		TernaryArgumentsContext _localctx = new TernaryArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ternaryArguments);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				call();
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

	public static class IterStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(tajaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(tajaParser.FOR, 0); }
		public Assignment_typedContext assignment_typed() {
			return getRuleContext(Assignment_typedContext.class,0);
		}
		public Assignment_changeContext assignment_change() {
			return getRuleContext(Assignment_changeContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public IterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterIterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitIterStatement(this);
		}
	}

	public final IterStatementContext iterStatement() throws RecognitionException {
		IterStatementContext _localctx = new IterStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iterStatement);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(WHILE);
				setState(241);
				match(T__0);
				setState(242);
				expression();
				setState(243);
				match(T__1);
				setState(244);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(FOR);
				setState(247);
				match(T__0);
				setState(248);
				assignment_typed();
				setState(249);
				match(T__6);
				setState(250);
				expression();
				setState(251);
				match(T__6);
				setState(252);
				assignment_change();
				setState(253);
				match(T__1);
				setState(254);
				statements();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__3);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << FOR) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				{
				setState(259);
				statement();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(T__4);
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

	public static class AssignmentsContext extends ParserRuleContext {
		public Assignment_typedContext assignment_typed() {
			return getRuleContext(Assignment_typedContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Assignment_changeContext assignment_change() {
			return getRuleContext(Assignment_changeContext.class,0);
		}
		public Assignment_emptyContext assignment_empty() {
			return getRuleContext(Assignment_emptyContext.class,0);
		}
		public Assignment_callContext assignment_call() {
			return getRuleContext(Assignment_callContext.class,0);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitAssignments(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignments);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				assignment_typed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				assignment_change();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				assignment_empty();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				assignment_call();
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

	public static class Assignment_typedContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tajaParser.ID, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public Assignment_typedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_typed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterAssignment_typed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitAssignment_typed(this);
		}
	}

	public final Assignment_typedContext assignment_typed() throws RecognitionException {
		Assignment_typedContext _localctx = new Assignment_typedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment_typed);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(ID);
				setState(275);
				match(T__7);
				setState(276);
				types();
				setState(277);
				match(T__9);
				setState(278);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(ID);
				setState(281);
				match(T__7);
				setState(282);
				types();
				setState(283);
				match(T__9);
				setState(284);
				atomic();
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

	public static class Assignment_emptyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tajaParser.ID, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public Assignment_emptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterAssignment_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitAssignment_empty(this);
		}
	}

	public final Assignment_emptyContext assignment_empty() throws RecognitionException {
		Assignment_emptyContext _localctx = new Assignment_emptyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(ID);
			setState(289);
			match(T__7);
			setState(290);
			types();
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

	public static class Assignment_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tajaParser.ID, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Assignment_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterAssignment_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitAssignment_call(this);
		}
	}

	public final Assignment_callContext assignment_call() throws RecognitionException {
		Assignment_callContext _localctx = new Assignment_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ID);
			setState(293);
			match(T__9);
			setState(294);
			call();
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
		public TerminalNode ID() { return getToken(tajaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
			setState(297);
			match(T__9);
			setState(298);
			expression();
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

	public static class Assignment_changeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(tajaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tajaParser.ID, i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Assignment_changeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_change; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterAssignment_change(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitAssignment_change(this);
		}
	}

	public final Assignment_changeContext assignment_change() throws RecognitionException {
		Assignment_changeContext _localctx = new Assignment_changeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment_change);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(ID);
				setState(301);
				match(T__9);
				setState(302);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				assignment();
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

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(tajaParser.TYPE_INT, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(tajaParser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_BOOLEAN() { return getToken(tajaParser.TYPE_BOOLEAN, 0); }
		public TerminalNode TYPE_CHAR() { return getToken(tajaParser.TYPE_CHAR, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_BOOLEAN) | (1L << TYPE_CHAR))) != 0)) ) {
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tajaParser.ID, 0); }
		public Call_argumentsContext call_arguments() {
			return getRuleContext(Call_argumentsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(ID);
			setState(309);
			match(T__0);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(310);
				call_arguments();
				}
			}

			setState(313);
			match(T__1);
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

	public static class Call_argumentsContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Call_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterCall_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitCall_arguments(this);
		}
	}

	public final Call_argumentsContext call_arguments() throws RecognitionException {
		Call_argumentsContext _localctx = new Call_argumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_call_arguments);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				expressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				arguments();
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

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitExpressions(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			expression();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(320);
				match(T__6);
				setState(321);
				expression();
				}
				}
				setState(326);
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

	public static class ExpressionContext extends ParserRuleContext {
		public SummContext left;
		public Token op;
		public ExpressionContext right;
		public SummContext summ() {
			return getRuleContext(SummContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			((ExpressionContext)_localctx).left = summ();
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(328);
					((ExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
						((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(329);
					((ExpressionContext)_localctx).right = expression();
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class SummContext extends ParserRuleContext {
		public MultContext left;
		public Token op;
		public SummContext right;
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public List<SummContext> summ() {
			return getRuleContexts(SummContext.class);
		}
		public SummContext summ(int i) {
			return getRuleContext(SummContext.class,i);
		}
		public SummContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterSumm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitSumm(this);
		}
	}

	public final SummContext summ() throws RecognitionException {
		SummContext _localctx = new SummContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_summ);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			((SummContext)_localctx).left = mult();
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336);
					((SummContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__18 || _la==T__19) ) {
						((SummContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(337);
					((SummContext)_localctx).right = summ();
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class MultContext extends ParserRuleContext {
		public AtomicContext left;
		public Token op;
		public MultContext right;
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mult);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			((MultContext)_localctx).left = atomic();
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					((MultContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__21) ) {
						((MultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(345);
					((MultContext)_localctx).right = mult();
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class AtomicContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tajaParser.ID, 0); }
		public TerminalNode INT() { return getToken(tajaParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(tajaParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(tajaParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(tajaParser.FLOAT, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).enterAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tajaListener ) ((tajaListener)listener).exitAtomic(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atomic);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				call();
				setState(357);
				match(T__5);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\5\7n\n\7\3\7\3\7\3\7\7"+
		"\7s\n\7\f\7\16\7v\13\7\3\7\3\7\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13"+
		"\b\3\b\3\b\3\b\7\b\u0085\n\b\f\b\16\b\u0088\13\b\5\b\u008a\n\b\3\t\3\t"+
		"\7\t\u008e\n\t\f\t\16\t\u0091\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a7\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00ae\n\13\f\13\16\13\u00b1\13\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bd\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00ca\n\r\3\16\3\16\3\16\3\16\5\16\u00d0\n\16\3\16\5"+
		"\16\u00d3\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00dc\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\6\17\u00e3\n\17\r\17\16\17\u00e4\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00ed\n\17\3\20\3\20\5\20\u00f1\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0103\n\21\3\22\3\22\7\22\u0107\n\22\f\22\16\22\u010a\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0113\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0121\n\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0133\n\30"+
		"\3\31\3\31\3\32\3\32\3\32\5\32\u013a\n\32\3\32\3\32\3\33\3\33\5\33\u0140"+
		"\n\33\3\34\3\34\3\34\7\34\u0145\n\34\f\34\16\34\u0148\13\34\3\35\3\35"+
		"\3\35\7\35\u014d\n\35\f\35\16\35\u0150\13\35\3\36\3\36\3\36\7\36\u0155"+
		"\n\36\f\36\16\36\u0158\13\36\3\37\3\37\3\37\7\37\u015d\n\37\f\37\16\37"+
		"\u0160\13\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u016a\n \3 \5t~\u0086\2!\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\6\3\2\31"+
		"\34\3\2\r\24\3\2\25\26\3\2\27\30\2\u017f\2C\3\2\2\2\4H\3\2\2\2\6Q\3\2"+
		"\2\2\bU\3\2\2\2\nh\3\2\2\2\fj\3\2\2\2\16\u0089\3\2\2\2\20\u008b\3\2\2"+
		"\2\22\u00a6\3\2\2\2\24\u00a8\3\2\2\2\26\u00bc\3\2\2\2\30\u00c9\3\2\2\2"+
		"\32\u00d2\3\2\2\2\34\u00ec\3\2\2\2\36\u00f0\3\2\2\2 \u0102\3\2\2\2\"\u0104"+
		"\3\2\2\2$\u0112\3\2\2\2&\u0120\3\2\2\2(\u0122\3\2\2\2*\u0126\3\2\2\2,"+
		"\u012a\3\2\2\2.\u0132\3\2\2\2\60\u0134\3\2\2\2\62\u0136\3\2\2\2\64\u013f"+
		"\3\2\2\2\66\u0141\3\2\2\28\u0149\3\2\2\2:\u0151\3\2\2\2<\u0159\3\2\2\2"+
		">\u0169\3\2\2\2@B\5\b\5\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3"+
		"\2\2\2EC\3\2\2\2FG\7\2\2\3G\3\3\2\2\2HI\7$\2\2IJ\7*\2\2JL\7\3\2\2KM\5"+
		"\16\b\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\4\2\2OP\5\20\t\2P\5\3\2\2\2"+
		"QR\7*\2\2RS\7\5\2\2ST\5\62\32\2T\7\3\2\2\2UV\7\"\2\2VW\7*\2\2W[\7\6\2"+
		"\2XZ\5\n\6\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2"+
		"\2\2^_\7\7\2\2_\t\3\2\2\2`a\5&\24\2ab\7\b\2\2bi\3\2\2\2cd\5(\25\2de\7"+
		"\b\2\2ei\3\2\2\2fi\5\f\7\2gi\5\4\3\2h`\3\2\2\2hc\3\2\2\2hf\3\2\2\2hg\3"+
		"\2\2\2i\13\3\2\2\2jk\7#\2\2km\7\3\2\2ln\5\16\b\2ml\3\2\2\2mn\3\2\2\2n"+
		"o\3\2\2\2op\7\4\2\2pt\7\6\2\2qs\5\22\n\2rq\3\2\2\2sv\3\2\2\2tu\3\2\2\2"+
		"tr\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\7\2\2x\r\3\2\2\2y~\7*\2\2z{\7\t\2\2"+
		"{}\7*\2\2|z\3\2\2\2}\u0080\3\2\2\2~\177\3\2\2\2~|\3\2\2\2\177\u008a\3"+
		"\2\2\2\u0080~\3\2\2\2\u0081\u0086\5(\25\2\u0082\u0083\7\t\2\2\u0083\u0085"+
		"\5(\25\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0089y\3\2\2\2"+
		"\u0089\u0081\3\2\2\2\u008a\17\3\2\2\2\u008b\u008f\7\6\2\2\u008c\u008e"+
		"\5\22\n\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093"+
		"\7\7\2\2\u0093\21\3\2\2\2\u0094\u0095\5$\23\2\u0095\u0096\7\b\2\2\u0096"+
		"\u00a7\3\2\2\2\u0097\u00a7\5\34\17\2\u0098\u00a7\5 \21\2\u0099\u00a7\5"+
		"\30\r\2\u009a\u009b\5\32\16\2\u009b\u009c\7\b\2\2\u009c\u00a7\3\2\2\2"+
		"\u009d\u009e\58\35\2\u009e\u009f\7\b\2\2\u009f\u00a7\3\2\2\2\u00a0\u00a1"+
		"\5\62\32\2\u00a1\u00a2\7\b\2\2\u00a2\u00a7\3\2\2\2\u00a3\u00a4\5\6\4\2"+
		"\u00a4\u00a5\7\b\2\2\u00a5\u00a7\3\2\2\2\u00a6\u0094\3\2\2\2\u00a6\u0097"+
		"\3\2\2\2\u00a6\u0098\3\2\2\2\u00a6\u0099\3\2\2\2\u00a6\u009a\3\2\2\2\u00a6"+
		"\u009d\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\23\3\2\2"+
		"\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\7!\2\2\u00aa\u00ab\5> \2\u00ab\u00af"+
		"\7\n\2\2\u00ac\u00ae\5\26\f\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b3\7\7\2\2\u00b3\25\3\2\2\2\u00b4\u00b5\5$\23\2\u00b5"+
		"\u00b6\7\b\2\2\u00b6\u00bd\3\2\2\2\u00b7\u00bd\5\32\16\2\u00b8\u00b9\5"+
		"\62\32\2\u00b9\u00ba\7\b\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\5\30\r\2"+
		"\u00bc\u00b4\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\27\3\2\2\2\u00be\u00bf\7*\2\2\u00bf\u00c0\7\n\2\2\u00c0"+
		"\u00ca\5\22\n\2\u00c1\u00c2\7!\2\2\u00c2\u00c3\5> \2\u00c3\u00c4\7\n\2"+
		"\2\u00c4\u00c5\5\22\n\2\u00c5\u00ca\3\2\2\2\u00c6\u00c7\7%\2\2\u00c7\u00c8"+
		"\7\n\2\2\u00c8\u00ca\5\22\n\2\u00c9\u00be\3\2\2\2\u00c9\u00c1\3\2\2\2"+
		"\u00c9\u00c6\3\2\2\2\u00ca\31\3\2\2\2\u00cb\u00cc\7&\2\2\u00cc\u00d3\7"+
		"\b\2\2\u00cd\u00cf\7\'\2\2\u00ce\u00d0\58\35\2\u00cf\u00ce\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\7\b\2\2\u00d2\u00cb\3\2"+
		"\2\2\u00d2\u00cd\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\7\36\2\2\u00d5\u00d6"+
		"\7\3\2\2\u00d6\u00d7\58\35\2\u00d7\u00d8\7\4\2\2\u00d8\u00db\5\20\t\2"+
		"\u00d9\u00da\7\37\2\2\u00da\u00dc\5\20\t\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00ed\3\2\2\2\u00dd\u00de\7 \2\2\u00de\u00df\7\3\2\2\u00df"+
		"\u00e0\5> \2\u00e0\u00e2\7\4\2\2\u00e1\u00e3\5\24\13\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00ed\3\2\2\2\u00e6\u00e7\58\35\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9\5"+
		"\36\20\2\u00e9\u00ea\7\n\2\2\u00ea\u00eb\5\36\20\2\u00eb\u00ed\3\2\2\2"+
		"\u00ec\u00d4\3\2\2\2\u00ec\u00dd\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ed\35"+
		"\3\2\2\2\u00ee\u00f1\58\35\2\u00ef\u00f1\5\62\32\2\u00f0\u00ee\3\2\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\37\3\2\2\2\u00f2\u00f3\7\35\2\2\u00f3\u00f4"+
		"\7\3\2\2\u00f4\u00f5\58\35\2\u00f5\u00f6\7\4\2\2\u00f6\u00f7\5\"\22\2"+
		"\u00f7\u0103\3\2\2\2\u00f8\u00f9\7)\2\2\u00f9\u00fa\7\3\2\2\u00fa\u00fb"+
		"\5&\24\2\u00fb\u00fc\7\t\2\2\u00fc\u00fd\58\35\2\u00fd\u00fe\7\t\2\2\u00fe"+
		"\u00ff\5.\30\2\u00ff\u0100\7\4\2\2\u0100\u0101\5\20\t\2\u0101\u0103\3"+
		"\2\2\2\u0102\u00f2\3\2\2\2\u0102\u00f8\3\2\2\2\u0103!\3\2\2\2\u0104\u0108"+
		"\7\6\2\2\u0105\u0107\5\22\n\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010c\7\7\2\2\u010c#\3\2\2\2\u010d\u0113\5&\24\2\u010e"+
		"\u0113\5,\27\2\u010f\u0113\5.\30\2\u0110\u0113\5(\25\2\u0111\u0113\5*"+
		"\26\2\u0112\u010d\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113%\3\2\2\2\u0114\u0115\7*\2\2\u0115"+
		"\u0116\7\n\2\2\u0116\u0117\5\60\31\2\u0117\u0118\7\f\2\2\u0118\u0119\5"+
		"8\35\2\u0119\u0121\3\2\2\2\u011a\u011b\7*\2\2\u011b\u011c\7\n\2\2\u011c"+
		"\u011d\5\60\31\2\u011d\u011e\7\f\2\2\u011e\u011f\5> \2\u011f\u0121\3\2"+
		"\2\2\u0120\u0114\3\2\2\2\u0120\u011a\3\2\2\2\u0121\'\3\2\2\2\u0122\u0123"+
		"\7*\2\2\u0123\u0124\7\n\2\2\u0124\u0125\5\60\31\2\u0125)\3\2\2\2\u0126"+
		"\u0127\7*\2\2\u0127\u0128\7\f\2\2\u0128\u0129\5\62\32\2\u0129+\3\2\2\2"+
		"\u012a\u012b\7*\2\2\u012b\u012c\7\f\2\2\u012c\u012d\58\35\2\u012d-\3\2"+
		"\2\2\u012e\u012f\7*\2\2\u012f\u0130\7\f\2\2\u0130\u0133\7*\2\2\u0131\u0133"+
		"\5,\27\2\u0132\u012e\3\2\2\2\u0132\u0131\3\2\2\2\u0133/\3\2\2\2\u0134"+
		"\u0135\t\2\2\2\u0135\61\3\2\2\2\u0136\u0137\7*\2\2\u0137\u0139\7\3\2\2"+
		"\u0138\u013a\5\64\33\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\7\4\2\2\u013c\63\3\2\2\2\u013d\u0140\5\66\34\2\u013e"+
		"\u0140\5\16\b\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\65\3\2\2"+
		"\2\u0141\u0146\58\35\2\u0142\u0143\7\t\2\2\u0143\u0145\58\35\2\u0144\u0142"+
		"\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\67\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014e\5:\36\2\u014a\u014b\t\3\2"+
		"\2\u014b\u014d\58\35\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f9\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0156\5<\37\2\u0152\u0153\t\4\2\2\u0153\u0155\5:\36\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		";\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015e\5> \2\u015a\u015b\t\5\2\2\u015b"+
		"\u015d\5<\37\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f=\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u016a"+
		"\7*\2\2\u0162\u016a\7+\2\2\u0163\u016a\7.\2\2\u0164\u016a\7-\2\2\u0165"+
		"\u016a\7,\2\2\u0166\u0167\5\62\32\2\u0167\u0168\7\b\2\2\u0168\u016a\3"+
		"\2\2\2\u0169\u0161\3\2\2\2\u0169\u0162\3\2\2\2\u0169\u0163\3\2\2\2\u0169"+
		"\u0164\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u016a?\3\2\2\2"+
		"\"CL[hmt~\u0086\u0089\u008f\u00a6\u00af\u00bc\u00c9\u00cf\u00d2\u00db"+
		"\u00e4\u00ec\u00f0\u0102\u0108\u0112\u0120\u0132\u0139\u013f\u0146\u014e"+
		"\u0156\u015e\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}