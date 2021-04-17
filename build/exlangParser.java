// Generated from exlang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, TYPE_INT=22, TYPE_FLOAT=23, TYPE_BOOLEAN=24, 
		TYPE_CHAR=25, WHILE=26, REPEAT=27, IF=28, ELSE=29, SWITCH=30, CASE=31, 
		CLASS=32, CONSTRUCTOR=33, FUNCTION=34, DEFAULT=35, BREAK=36, RETURN=37, 
		CONTINUE=38, FOR=39, ID=40, INT=41, FLOAT=42, CHAR=43, BOOL=44, WS=45;
	public static final int
		RULE_start = 0, RULE_function_definition = 1, RULE_class_definition = 2, 
		RULE_class_statements = 3, RULE_constructor = 4, RULE_arguments = 5, RULE_statements = 6, 
		RULE_statement = 7, RULE_switchStatements = 8, RULE_switchStatement = 9, 
		RULE_labelStatement = 10, RULE_jumpStatement = 11, RULE_selectionStatement = 12, 
		RULE_ternaryArguments = 13, RULE_iterStatement = 14, RULE_whileStatement = 15, 
		RULE_assignments = 16, RULE_assignment_typed = 17, RULE_assignment = 18, 
		RULE_assignment_change = 19, RULE_types = 20, RULE_call = 21, RULE_expressions = 22, 
		RULE_expression = 23, RULE_arguments_exp = 24, RULE_summ = 25, RULE_mult = 26, 
		RULE_arguments_repeat = 27, RULE_atomic = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "function_definition", "class_definition", "class_statements", 
			"constructor", "arguments", "statements", "statement", "switchStatements", 
			"switchStatement", "labelStatement", "jumpStatement", "selectionStatement", 
			"ternaryArguments", "iterStatement", "whileStatement", "assignments", 
			"assignment_typed", "assignment", "assignment_change", "types", "call", 
			"expressions", "expression", "arguments_exp", "summ", "mult", "arguments_repeat", 
			"atomic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "':'", "'?'", "'='", 
			"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'+'", 
			"'-'", "'*'", "'/'", "'int'", "'float'", "'bool'", "'char'", "'while'", 
			"'repeat'", "'if'", "'else'", "'switch'", "'case'", "'class'", "'constructor'", 
			"'function'", "'default'", "'break'", "'return'", "'continue'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "TYPE_INT", 
			"TYPE_FLOAT", "TYPE_BOOLEAN", "TYPE_CHAR", "WHILE", "REPEAT", "IF", "ELSE", 
			"SWITCH", "CASE", "CLASS", "CONSTRUCTOR", "FUNCTION", "DEFAULT", "BREAK", 
			"RETURN", "CONTINUE", "FOR", "ID", "INT", "FLOAT", "CHAR", "BOOL", "WS"
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
	public String getGrammarFileName() { return "exlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public exlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(exlangParser.EOF, 0); }
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(58);
				function_definition();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
		public TerminalNode FUNCTION() { return getToken(exlangParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(FUNCTION);
			setState(67);
			match(ID);
			setState(68);
			match(T__0);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(69);
				arguments();
				}
			}

			setState(72);
			match(T__1);
			setState(73);
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

	public static class Class_definitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(exlangParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public Class_statementsContext class_statements() {
			return getRuleContext(Class_statementsContext.class,0);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitClass_definition(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CLASS);
			setState(76);
			match(ID);
			setState(77);
			match(T__2);
			setState(78);
			class_statements();
			setState(79);
			match(T__3);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Assignment_typedContext assignment_typed() {
			return getRuleContext(Assignment_typedContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public Class_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterClass_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitClass_statements(this);
		}
	}

	public final Class_statementsContext class_statements() throws RecognitionException {
		Class_statementsContext _localctx = new Class_statementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_statements);
		int _la;
		try {
			int _alt;
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(81);
					assignment();
					}
				}

				setState(84);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(85);
					assignment_typed();
					}
				}

				setState(88);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRUCTOR) {
					{
					setState(89);
					constructor();
					}
				}

				setState(92);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(93);
						function_definition();
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(99);
				match(T__4);
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
		public TerminalNode CONSTRUCTOR() { return getToken(exlangParser.CONSTRUCTOR, 0); }
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(CONSTRUCTOR);
			setState(103);
			match(T__0);
			setState(104);
			arguments();
			setState(105);
			match(T__1);
			setState(106);
			match(T__2);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(107);
					statement();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(113);
			match(T__3);
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
		public List<TerminalNode> ID() { return getTokens(exlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(exlangParser.ID, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(116);
				match(T__5);
				setState(117);
				match(ID);
				}
				}
				setState(122);
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__2);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << REPEAT) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << FOR) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				{
				setState(124);
				statement();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(T__3);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				assignments();
				setState(133);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				selectionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				iterStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				labelStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				jumpStatement();
				setState(139);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				expression();
				setState(142);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				call();
				setState(145);
				match(T__4);
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
		public TerminalNode CASE() { return getToken(exlangParser.CASE, 0); }
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterSwitchStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitSwitchStatements(this);
		}
	}

	public final SwitchStatementsContext switchStatements() throws RecognitionException {
		SwitchStatementsContext _localctx = new SwitchStatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switchStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__2);
			setState(150);
			match(CASE);
			setState(151);
			atomic();
			setState(152);
			match(T__6);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(153);
				switchStatement();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(T__3);
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_switchStatement);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				assignments();
				setState(162);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				jumpStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				call();
				setState(166);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
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
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CASE() { return getToken(exlangParser.CASE, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(exlangParser.DEFAULT, 0); }
		public LabelStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterLabelStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitLabelStatement(this);
		}
	}

	public final LabelStatementContext labelStatement() throws RecognitionException {
		LabelStatementContext _localctx = new LabelStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_labelStatement);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ID);
				setState(172);
				match(T__6);
				setState(173);
				statement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(CASE);
				setState(175);
				atomic();
				setState(176);
				match(T__6);
				setState(177);
				statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(DEFAULT);
				setState(180);
				match(T__6);
				setState(181);
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
		public TerminalNode BREAK() { return getToken(exlangParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(exlangParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jumpStatement);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(BREAK);
				setState(185);
				match(T__4);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(RETURN);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
					{
					setState(187);
					expression();
					}
				}

				setState(190);
				match(T__4);
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
		public TerminalNode IF() { return getToken(exlangParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(exlangParser.ELSE, 0); }
		public TerminalNode SWITCH() { return getToken(exlangParser.SWITCH, 0); }
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectionStatement);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(IF);
				setState(194);
				match(T__0);
				setState(195);
				expression();
				setState(196);
				match(T__1);
				setState(197);
				statements();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(198);
					match(ELSE);
					setState(199);
					statements();
					}
				}

				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(SWITCH);
				setState(203);
				match(T__0);
				setState(204);
				atomic();
				setState(205);
				match(T__1);
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					switchStatements();
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				expression();
				setState(212);
				match(T__7);
				setState(213);
				ternaryArguments();
				setState(214);
				match(T__6);
				setState(215);
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterTernaryArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitTernaryArguments(this);
		}
	}

	public final TernaryArgumentsContext ternaryArguments() throws RecognitionException {
		TernaryArgumentsContext _localctx = new TernaryArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ternaryArguments);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
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
		public TerminalNode WHILE() { return getToken(exlangParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TerminalNode REPEAT() { return getToken(exlangParser.REPEAT, 0); }
		public Arguments_repeatContext arguments_repeat() {
			return getRuleContext(Arguments_repeatContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode FOR() { return getToken(exlangParser.FOR, 0); }
		public Assignment_typedContext assignment_typed() {
			return getRuleContext(Assignment_typedContext.class,0);
		}
		public Assignment_changeContext assignment_change() {
			return getRuleContext(Assignment_changeContext.class,0);
		}
		public IterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterIterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitIterStatement(this);
		}
	}

	public final IterStatementContext iterStatement() throws RecognitionException {
		IterStatementContext _localctx = new IterStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iterStatement);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(WHILE);
				setState(224);
				match(T__0);
				setState(225);
				expression();
				setState(226);
				match(T__1);
				setState(227);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(REPEAT);
				setState(230);
				match(T__0);
				setState(231);
				arguments_repeat();
				setState(232);
				match(T__1);
				setState(233);
				statements();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(FOR);
				setState(236);
				match(T__0);
				setState(237);
				assignment_typed();
				setState(238);
				match(T__5);
				setState(239);
				expression();
				setState(240);
				match(T__5);
				setState(241);
				assignment_change();
				setState(242);
				match(T__1);
				setState(243);
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__2);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << REPEAT) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << FOR) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				{
				setState(248);
				statement();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(T__3);
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
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitAssignments(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignments);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				assignment_typed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				assignment_change();
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
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_typedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_typed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterAssignment_typed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitAssignment_typed(this);
		}
	}

	public final Assignment_typedContext assignment_typed() throws RecognitionException {
		Assignment_typedContext _localctx = new Assignment_typedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment_typed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(ID);
			setState(262);
			match(T__6);
			setState(263);
			types();
			setState(264);
			match(T__8);
			setState(265);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ID);
			setState(268);
			match(T__8);
			setState(269);
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
		public List<TerminalNode> ID() { return getTokens(exlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(exlangParser.ID, i);
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterAssignment_change(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitAssignment_change(this);
		}
	}

	public final Assignment_changeContext assignment_change() throws RecognitionException {
		Assignment_changeContext _localctx = new Assignment_changeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment_change);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(ID);
				setState(272);
				match(T__8);
				setState(273);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
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
		public TerminalNode TYPE_INT() { return getToken(exlangParser.TYPE_INT, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(exlangParser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_BOOLEAN() { return getToken(exlangParser.TYPE_BOOLEAN, 0); }
		public TerminalNode TYPE_CHAR() { return getToken(exlangParser.TYPE_CHAR, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ID);
			setState(280);
			match(T__0);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(281);
				expressions();
				}
			}

			setState(284);
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitExpressions(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			expression();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(287);
				match(T__5);
				setState(288);
				expression();
				}
				}
				setState(293);
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			((ExpressionContext)_localctx).left = summ();
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					((ExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
						((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(296);
					((ExpressionContext)_localctx).right = expression();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class Arguments_expContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Arguments_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterArguments_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitArguments_exp(this);
		}
	}

	public final Arguments_expContext arguments_exp() throws RecognitionException {
		Arguments_expContext _localctx = new Arguments_expContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arguments_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			expression();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(303);
				match(T__5);
				setState(304);
				expression();
				}
				}
				setState(309);
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterSumm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitSumm(this);
		}
	}

	public final SummContext summ() throws RecognitionException {
		SummContext _localctx = new SummContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_summ);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			((SummContext)_localctx).left = mult();
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					((SummContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
						((SummContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(312);
					((SummContext)_localctx).right = summ();
					}
					} 
				}
				setState(317);
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
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mult);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((MultContext)_localctx).left = atomic();
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(319);
					((MultContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__19 || _la==T__20) ) {
						((MultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(320);
					((MultContext)_localctx).right = mult();
					}
					} 
				}
				setState(325);
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

	public static class Arguments_repeatContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(exlangParser.INT, 0); }
		public Arguments_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterArguments_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitArguments_repeat(this);
		}
	}

	public final Arguments_repeatContext arguments_repeat() throws RecognitionException {
		Arguments_repeatContext _localctx = new Arguments_repeatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arguments_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(INT);
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
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public TerminalNode INT() { return getToken(exlangParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(exlangParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(exlangParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(exlangParser.FLOAT, 0); }
		public Arguments_expContext arguments_exp() {
			return getRuleContext(Arguments_expContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).enterAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exlangListener ) ((exlangListener)listener).exitAtomic(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atomic);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				match(ID);
				setState(334);
				match(T__0);
				setState(335);
				arguments_exp();
				setState(336);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
				call();
				setState(339);
				match(T__4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\5\5U\n\5\3\5\3\5\5\5Y\n\5\3\5\3\5\5\5]\n\5\3\5\3\5\7\5a\n"+
		"\5\f\5\16\5d\13\5\3\5\5\5g\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16"+
		"\6r\13\6\3\6\3\6\3\7\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\b\3\b\7\b\u0080"+
		"\n\b\f\b\16\b\u0083\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0096\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u009d\n\n"+
		"\f\n\16\n\u00a0\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00ac\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b9\n"+
		"\f\3\r\3\r\3\r\3\r\5\r\u00bf\n\r\3\r\5\r\u00c2\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00cb\n\16\3\16\3\16\3\16\3\16\3\16\6\16\u00d2\n"+
		"\16\r\16\16\16\u00d3\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00dc\n\16\3\17"+
		"\3\17\5\17\u00e0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f8"+
		"\n\20\3\21\3\21\7\21\u00fc\n\21\f\21\16\21\u00ff\13\21\3\21\3\21\3\22"+
		"\3\22\3\22\5\22\u0106\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\5\25\u0116\n\25\3\26\3\26\3\27\3\27\3\27\5\27"+
		"\u011d\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u0124\n\30\f\30\16\30\u0127"+
		"\13\30\3\31\3\31\3\31\7\31\u012c\n\31\f\31\16\31\u012f\13\31\3\32\3\32"+
		"\3\32\7\32\u0134\n\32\f\32\16\32\u0137\13\32\3\33\3\33\3\33\7\33\u013c"+
		"\n\33\f\33\16\33\u013f\13\33\3\34\3\34\3\34\7\34\u0144\n\34\f\34\16\34"+
		"\u0147\13\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u0158\n\36\3\36\4bp\2\37\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\6\3\2\30\33\3\2\f\23\3\2\24"+
		"\25\3\2\26\27\2\u016d\2?\3\2\2\2\4D\3\2\2\2\6M\3\2\2\2\bf\3\2\2\2\nh\3"+
		"\2\2\2\fu\3\2\2\2\16}\3\2\2\2\20\u0095\3\2\2\2\22\u0097\3\2\2\2\24\u00ab"+
		"\3\2\2\2\26\u00b8\3\2\2\2\30\u00c1\3\2\2\2\32\u00db\3\2\2\2\34\u00df\3"+
		"\2\2\2\36\u00f7\3\2\2\2 \u00f9\3\2\2\2\"\u0105\3\2\2\2$\u0107\3\2\2\2"+
		"&\u010d\3\2\2\2(\u0115\3\2\2\2*\u0117\3\2\2\2,\u0119\3\2\2\2.\u0120\3"+
		"\2\2\2\60\u0128\3\2\2\2\62\u0130\3\2\2\2\64\u0138\3\2\2\2\66\u0140\3\2"+
		"\2\28\u0148\3\2\2\2:\u0157\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2"+
		"\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DE\7$\2\2EF\7*"+
		"\2\2FH\7\3\2\2GI\5\f\7\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\4\2\2KL\5\16"+
		"\b\2L\5\3\2\2\2MN\7\"\2\2NO\7*\2\2OP\7\5\2\2PQ\5\b\5\2QR\7\6\2\2R\7\3"+
		"\2\2\2SU\5&\24\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2Vg\7\7\2\2WY\5$\23\2XW\3"+
		"\2\2\2XY\3\2\2\2YZ\3\2\2\2Zg\7\7\2\2[]\5\n\6\2\\[\3\2\2\2\\]\3\2\2\2]"+
		"^\3\2\2\2^g\7\7\2\2_a\5\4\3\2`_\3\2\2\2ad\3\2\2\2bc\3\2\2\2b`\3\2\2\2"+
		"ce\3\2\2\2db\3\2\2\2eg\7\7\2\2fT\3\2\2\2fX\3\2\2\2f\\\3\2\2\2fb\3\2\2"+
		"\2g\t\3\2\2\2hi\7#\2\2ij\7\3\2\2jk\5\f\7\2kl\7\4\2\2lp\7\5\2\2mo\5\20"+
		"\t\2nm\3\2\2\2or\3\2\2\2pq\3\2\2\2pn\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\6"+
		"\2\2t\13\3\2\2\2uz\7*\2\2vw\7\b\2\2wy\7*\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2"+
		"\2\2z{\3\2\2\2{\r\3\2\2\2|z\3\2\2\2}\u0081\7\5\2\2~\u0080\5\20\t\2\177"+
		"~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\6\2\2\u0085\17\3\2\2"+
		"\2\u0086\u0087\5\"\22\2\u0087\u0088\7\7\2\2\u0088\u0096\3\2\2\2\u0089"+
		"\u0096\5\32\16\2\u008a\u0096\5\36\20\2\u008b\u0096\5\26\f\2\u008c\u008d"+
		"\5\30\r\2\u008d\u008e\7\7\2\2\u008e\u0096\3\2\2\2\u008f\u0090\5\60\31"+
		"\2\u0090\u0091\7\7\2\2\u0091\u0096\3\2\2\2\u0092\u0093\5,\27\2\u0093\u0094"+
		"\7\7\2\2\u0094\u0096\3\2\2\2\u0095\u0086\3\2\2\2\u0095\u0089\3\2\2\2\u0095"+
		"\u008a\3\2\2\2\u0095\u008b\3\2\2\2\u0095\u008c\3\2\2\2\u0095\u008f\3\2"+
		"\2\2\u0095\u0092\3\2\2\2\u0096\21\3\2\2\2\u0097\u0098\7\5\2\2\u0098\u0099"+
		"\7!\2\2\u0099\u009a\5:\36\2\u009a\u009e\7\t\2\2\u009b\u009d\5\24\13\2"+
		"\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2"+
		"\23\3\2\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a5\7\7\2\2\u00a5\u00ac\3\2\2"+
		"\2\u00a6\u00ac\5\30\r\2\u00a7\u00a8\5,\27\2\u00a8\u00a9\7\7\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ac\5\26\f\2\u00ab\u00a3\3\2\2\2\u00ab\u00a6\3"+
		"\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\25\3\2\2\2\u00ad"+
		"\u00ae\7*\2\2\u00ae\u00af\7\t\2\2\u00af\u00b9\5\20\t\2\u00b0\u00b1\7!"+
		"\2\2\u00b1\u00b2\5:\36\2\u00b2\u00b3\7\t\2\2\u00b3\u00b4\5\20\t\2\u00b4"+
		"\u00b9\3\2\2\2\u00b5\u00b6\7%\2\2\u00b6\u00b7\7\t\2\2\u00b7\u00b9\5\20"+
		"\t\2\u00b8\u00ad\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9"+
		"\27\3\2\2\2\u00ba\u00bb\7&\2\2\u00bb\u00c2\7\7\2\2\u00bc\u00be\7\'\2\2"+
		"\u00bd\u00bf\5\60\31\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\7\7\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2"+
		"\31\3\2\2\2\u00c3\u00c4\7\36\2\2\u00c4\u00c5\7\3\2\2\u00c5\u00c6\5\60"+
		"\31\2\u00c6\u00c7\7\4\2\2\u00c7\u00ca\5\16\b\2\u00c8\u00c9\7\37\2\2\u00c9"+
		"\u00cb\5\16\b\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00dc\3"+
		"\2\2\2\u00cc\u00cd\7 \2\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf\5:\36\2\u00cf"+
		"\u00d1\7\4\2\2\u00d0\u00d2\5\22\n\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00dc\3\2\2\2\u00d5"+
		"\u00d6\5\60\31\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\5\34\17\2\u00d8\u00d9"+
		"\7\t\2\2\u00d9\u00da\5\34\17\2\u00da\u00dc\3\2\2\2\u00db\u00c3\3\2\2\2"+
		"\u00db\u00cc\3\2\2\2\u00db\u00d5\3\2\2\2\u00dc\33\3\2\2\2\u00dd\u00e0"+
		"\5\60\31\2\u00de\u00e0\5,\27\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2"+
		"\u00e0\35\3\2\2\2\u00e1\u00e2\7\34\2\2\u00e2\u00e3\7\3\2\2\u00e3\u00e4"+
		"\5\60\31\2\u00e4\u00e5\7\4\2\2\u00e5\u00e6\5 \21\2\u00e6\u00f8\3\2\2\2"+
		"\u00e7\u00e8\7\35\2\2\u00e8\u00e9\7\3\2\2\u00e9\u00ea\58\35\2\u00ea\u00eb"+
		"\7\4\2\2\u00eb\u00ec\5\16\b\2\u00ec\u00f8\3\2\2\2\u00ed\u00ee\7)\2\2\u00ee"+
		"\u00ef\7\3\2\2\u00ef\u00f0\5$\23\2\u00f0\u00f1\7\b\2\2\u00f1\u00f2\5\60"+
		"\31\2\u00f2\u00f3\7\b\2\2\u00f3\u00f4\5(\25\2\u00f4\u00f5\7\4\2\2\u00f5"+
		"\u00f6\5\16\b\2\u00f6\u00f8\3\2\2\2\u00f7\u00e1\3\2\2\2\u00f7\u00e7\3"+
		"\2\2\2\u00f7\u00ed\3\2\2\2\u00f8\37\3\2\2\2\u00f9\u00fd\7\5\2\2\u00fa"+
		"\u00fc\5\20\t\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3"+
		"\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\7\6\2\2\u0101!\3\2\2\2\u0102\u0106\5$\23\2\u0103\u0106\5&\24\2"+
		"\u0104\u0106\5(\25\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104"+
		"\3\2\2\2\u0106#\3\2\2\2\u0107\u0108\7*\2\2\u0108\u0109\7\t\2\2\u0109\u010a"+
		"\5*\26\2\u010a\u010b\7\13\2\2\u010b\u010c\5\60\31\2\u010c%\3\2\2\2\u010d"+
		"\u010e\7*\2\2\u010e\u010f\7\13\2\2\u010f\u0110\5\60\31\2\u0110\'\3\2\2"+
		"\2\u0111\u0112\7*\2\2\u0112\u0113\7\13\2\2\u0113\u0116\7*\2\2\u0114\u0116"+
		"\5&\24\2\u0115\u0111\3\2\2\2\u0115\u0114\3\2\2\2\u0116)\3\2\2\2\u0117"+
		"\u0118\t\2\2\2\u0118+\3\2\2\2\u0119\u011a\7*\2\2\u011a\u011c\7\3\2\2\u011b"+
		"\u011d\5.\30\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u011f\7\4\2\2\u011f-\3\2\2\2\u0120\u0125\5\60\31\2\u0121\u0122"+
		"\7\b\2\2\u0122\u0124\5\60\31\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126/\3\2\2\2\u0127\u0125\3"+
		"\2\2\2\u0128\u012d\5\64\33\2\u0129\u012a\t\3\2\2\u012a\u012c\5\60\31\2"+
		"\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\61\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0135\5\60\31\2\u0131"+
		"\u0132\7\b\2\2\u0132\u0134\5\60\31\2\u0133\u0131\3\2\2\2\u0134\u0137\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\63\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u013d\5\66\34\2\u0139\u013a\t\4\2\2\u013a\u013c\5"+
		"\64\33\2\u013b\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\65\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0145\5:\36"+
		"\2\u0141\u0142\t\5\2\2\u0142\u0144\5\66\34\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\67\3\2\2"+
		"\2\u0147\u0145\3\2\2\2\u0148\u0149\7+\2\2\u01499\3\2\2\2\u014a\u0158\7"+
		"*\2\2\u014b\u0158\7+\2\2\u014c\u0158\7.\2\2\u014d\u0158\7-\2\2\u014e\u0158"+
		"\7,\2\2\u014f\u0150\7*\2\2\u0150\u0151\7\3\2\2\u0151\u0152\5\62\32\2\u0152"+
		"\u0153\7\4\2\2\u0153\u0158\3\2\2\2\u0154\u0155\5,\27\2\u0155\u0156\7\7"+
		"\2\2\u0156\u0158\3\2\2\2\u0157\u014a\3\2\2\2\u0157\u014b\3\2\2\2\u0157"+
		"\u014c\3\2\2\2\u0157\u014d\3\2\2\2\u0157\u014e\3\2\2\2\u0157\u014f\3\2"+
		"\2\2\u0157\u0154\3\2\2\2\u0158;\3\2\2\2!?HTX\\bfpz\u0081\u0095\u009e\u00ab"+
		"\u00b8\u00be\u00c1\u00ca\u00d3\u00db\u00df\u00f7\u00fd\u0105\u0115\u011c"+
		"\u0125\u012d\u0135\u013d\u0145\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}