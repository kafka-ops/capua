// Generated from com/purbon/kafka/policy/RegoParser.g4 by ANTLR 4.7.1
package com.purbon.kafka.policy;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comment=1, String=2, Bool=3, Null=4, As=5, Default=6, Else=7, Import=8, 
		Package=9, Not=10, With=11, Set=12, LSBrace=13, LCBrace=14, LParan=15, 
		RSBrace=16, RCBrace=17, RParan=18, Mid=19, FactorOperator=20, ArithOperator=21, 
		RelationOperator=22, EqOper=23, Comma=24, Semicolon=25, Colon=26, Ampersand=27, 
		Dot=28, WhiteSpace=29, LineEnd=30, WindowsLineEnd=31, UnsignedNumber=32, 
		Name=33;
	public static final int
		RULE_root = 0, RULE_stmt = 1, RULE_regoPackage = 2, RULE_importDirective = 3, 
		RULE_regoRules = 4, RULE_ruleHead = 5, RULE_ruleBody = 6, RULE_ruleExt = 7, 
		RULE_regoElse = 8, RULE_regoBody = 9, RULE_nonEmptyBraceEnclosedBody = 10, 
		RULE_query = 11, RULE_literal = 12, RULE_literalExpr = 13, RULE_withKeyword = 14, 
		RULE_functionCall = 15, RULE_exprTermPair = 16, RULE_termPair = 17, RULE_exprTermPairList = 18, 
		RULE_exprTerm = 19, RULE_exprTermList = 20, RULE_relationExpr = 21, RULE_bitwiseOrExpr = 22, 
		RULE_bitwiseAndExpr = 23, RULE_arithExpr = 24, RULE_factorExpr = 25, RULE_term = 26, 
		RULE_arrayComprehension = 27, RULE_setComprehension = 28, RULE_objectComprehension = 29, 
		RULE_object_ = 30, RULE_objectItem = 31, RULE_array_ = 32, RULE_set_ = 33, 
		RULE_emptySet = 34, RULE_nonEmptySet = 35, RULE_ref = 36, RULE_refOperand = 37, 
		RULE_refOperandDot = 38, RULE_refOperandCanonical = 39, RULE_scalar = 40;
	public static final String[] ruleNames = {
		"root", "stmt", "regoPackage", "importDirective", "regoRules", "ruleHead", 
		"ruleBody", "ruleExt", "regoElse", "regoBody", "nonEmptyBraceEnclosedBody", 
		"query", "literal", "literalExpr", "withKeyword", "functionCall", "exprTermPair", 
		"termPair", "exprTermPairList", "exprTerm", "exprTermList", "relationExpr", 
		"bitwiseOrExpr", "bitwiseAndExpr", "arithExpr", "factorExpr", "term", 
		"arrayComprehension", "setComprehension", "objectComprehension", "object_", 
		"objectItem", "array_", "set_", "emptySet", "nonEmptySet", "ref", "refOperand", 
		"refOperandDot", "refOperandCanonical", "scalar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'null'", "'as'", "'default'", "'else'", "'import'", 
		"'package'", "'not'", "'with'", "'set('", "'['", "'{'", "'('", "']'", 
		"'}'", "')'", "'|'", null, null, null, null, "','", "';'", "':'", "'&'", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Comment", "String", "Bool", "Null", "As", "Default", "Else", "Import", 
		"Package", "Not", "With", "Set", "LSBrace", "LCBrace", "LParan", "RSBrace", 
		"RCBrace", "RParan", "Mid", "FactorOperator", "ArithOperator", "RelationOperator", 
		"EqOper", "Comma", "Semicolon", "Colon", "Ampersand", "Dot", "WhiteSpace", 
		"LineEnd", "WindowsLineEnd", "UnsignedNumber", "Name"
	};
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
	public String getGrammarFileName() { return "RegoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RegoParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String) | (1L << Bool) | (1L << Null) | (1L << Default) | (1L << Import) | (1L << Package) | (1L << Not) | (1L << Set) | (1L << LSBrace) | (1L << LCBrace) | (1L << LParan) | (1L << ArithOperator) | (1L << UnsignedNumber) | (1L << Name))) != 0)) {
				{
				{
				setState(82);
				stmt();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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

	public static class StmtContext extends ParserRuleContext {
		public RegoPackageContext regoPackage() {
			return getRuleContext(RegoPackageContext.class,0);
		}
		public ImportDirectiveContext importDirective() {
			return getRuleContext(ImportDirectiveContext.class,0);
		}
		public RegoRulesContext regoRules() {
			return getRuleContext(RegoRulesContext.class,0);
		}
		public RegoBodyContext regoBody() {
			return getRuleContext(RegoBodyContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				regoPackage();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				importDirective();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				regoRules();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				regoBody();
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

	public static class RegoPackageContext extends ParserRuleContext {
		public TerminalNode Package() { return getToken(RegoParser.Package, 0); }
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public RegoPackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regoPackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRegoPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRegoPackage(this);
		}
	}

	public final RegoPackageContext regoPackage() throws RecognitionException {
		RegoPackageContext _localctx = new RegoPackageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_regoPackage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(Package);
			setState(97);
			ref();
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

	public static class ImportDirectiveContext extends ParserRuleContext {
		public RefContext import_target;
		public RefContext import_target_rename_as;
		public TerminalNode Import() { return getToken(RegoParser.Import, 0); }
		public List<RefContext> ref() {
			return getRuleContexts(RefContext.class);
		}
		public RefContext ref(int i) {
			return getRuleContext(RefContext.class,i);
		}
		public TerminalNode As() { return getToken(RegoParser.As, 0); }
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitImportDirective(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Import);
			setState(100);
			((ImportDirectiveContext)_localctx).import_target = ref();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(101);
				match(As);
				setState(102);
				((ImportDirectiveContext)_localctx).import_target_rename_as = ref();
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

	public static class RegoRulesContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(RegoParser.Default, 0); }
		public TerminalNode Name() { return getToken(RegoParser.Name, 0); }
		public TerminalNode EqOper() { return getToken(RegoParser.EqOper, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public RuleHeadContext ruleHead() {
			return getRuleContext(RuleHeadContext.class,0);
		}
		public List<RuleBodyContext> ruleBody() {
			return getRuleContexts(RuleBodyContext.class);
		}
		public RuleBodyContext ruleBody(int i) {
			return getRuleContext(RuleBodyContext.class,i);
		}
		public RegoRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regoRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRegoRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRegoRules(this);
		}
	}

	public final RegoRulesContext regoRules() throws RecognitionException {
		RegoRulesContext _localctx = new RegoRulesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_regoRules);
		try {
			int _alt;
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Default:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(Default);
				setState(106);
				match(Name);
				setState(107);
				match(EqOper);
				setState(108);
				term();
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				ruleHead();
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						ruleBody();
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class RuleHeadContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(RegoParser.Name, 0); }
		public TerminalNode LParan() { return getToken(RegoParser.LParan, 0); }
		public TerminalNode RParan() { return getToken(RegoParser.RParan, 0); }
		public TerminalNode LSBrace() { return getToken(RegoParser.LSBrace, 0); }
		public List<ExprTermContext> exprTerm() {
			return getRuleContexts(ExprTermContext.class);
		}
		public ExprTermContext exprTerm(int i) {
			return getRuleContext(ExprTermContext.class,i);
		}
		public TerminalNode RSBrace() { return getToken(RegoParser.RSBrace, 0); }
		public TerminalNode EqOper() { return getToken(RegoParser.EqOper, 0); }
		public ExprTermListContext exprTermList() {
			return getRuleContext(ExprTermListContext.class,0);
		}
		public RuleHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRuleHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRuleHead(this);
		}
	}

	public final RuleHeadContext ruleHead() throws RecognitionException {
		RuleHeadContext _localctx = new RuleHeadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ruleHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(Name);
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(119);
				match(LParan);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String) | (1L << Bool) | (1L << Null) | (1L << Not) | (1L << Set) | (1L << LSBrace) | (1L << LCBrace) | (1L << LParan) | (1L << ArithOperator) | (1L << UnsignedNumber) | (1L << Name))) != 0)) {
					{
					setState(120);
					exprTermList();
					}
				}

				setState(123);
				match(RParan);
				}
				break;
			}
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(126);
				match(LSBrace);
				setState(127);
				exprTerm();
				setState(128);
				match(RSBrace);
				}
				break;
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EqOper) {
				{
				setState(132);
				match(EqOper);
				setState(133);
				exprTerm();
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

	public static class RuleBodyContext extends ParserRuleContext {
		public NonEmptyBraceEnclosedBodyContext nonEmptyBraceEnclosedBody() {
			return getRuleContext(NonEmptyBraceEnclosedBodyContext.class,0);
		}
		public TerminalNode Else() { return getToken(RegoParser.Else, 0); }
		public TerminalNode EqOper() { return getToken(RegoParser.EqOper, 0); }
		public ExprTermContext exprTerm() {
			return getRuleContext(ExprTermContext.class,0);
		}
		public RuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRuleBody(this);
		}
	}

	public final RuleBodyContext ruleBody() throws RecognitionException {
		RuleBodyContext _localctx = new RuleBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ruleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(136);
				match(Else);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EqOper) {
					{
					setState(137);
					match(EqOper);
					setState(138);
					exprTerm();
					}
				}

				}
			}

			setState(143);
			nonEmptyBraceEnclosedBody();
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

	public static class RuleExtContext extends ParserRuleContext {
		public RegoElseContext regoElse() {
			return getRuleContext(RegoElseContext.class,0);
		}
		public NonEmptyBraceEnclosedBodyContext nonEmptyBraceEnclosedBody() {
			return getRuleContext(NonEmptyBraceEnclosedBodyContext.class,0);
		}
		public RuleExtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleExt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRuleExt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRuleExt(this);
		}
	}

	public final RuleExtContext ruleExt() throws RecognitionException {
		RuleExtContext _localctx = new RuleExtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ruleExt);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Else:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				regoElse();
				}
				break;
			case LCBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				nonEmptyBraceEnclosedBody();
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

	public static class RegoElseContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(RegoParser.Else, 0); }
		public TerminalNode EqOper() { return getToken(RegoParser.EqOper, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NonEmptyBraceEnclosedBodyContext nonEmptyBraceEnclosedBody() {
			return getRuleContext(NonEmptyBraceEnclosedBodyContext.class,0);
		}
		public RegoElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regoElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRegoElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRegoElse(this);
		}
	}

	public final RegoElseContext regoElse() throws RecognitionException {
		RegoElseContext _localctx = new RegoElseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_regoElse);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(Else);
				setState(150);
				match(EqOper);
				setState(151);
				term();
				setState(152);
				nonEmptyBraceEnclosedBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(Else);
				setState(155);
				nonEmptyBraceEnclosedBody();
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

	public static class RegoBodyContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public NonEmptyBraceEnclosedBodyContext nonEmptyBraceEnclosedBody() {
			return getRuleContext(NonEmptyBraceEnclosedBodyContext.class,0);
		}
		public RegoBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regoBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRegoBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRegoBody(this);
		}
	}

	public final RegoBodyContext regoBody() throws RecognitionException {
		RegoBodyContext _localctx = new RegoBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_regoBody);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				query();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				nonEmptyBraceEnclosedBody();
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

	public static class NonEmptyBraceEnclosedBodyContext extends ParserRuleContext {
		public TerminalNode LCBrace() { return getToken(RegoParser.LCBrace, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RCBrace() { return getToken(RegoParser.RCBrace, 0); }
		public NonEmptyBraceEnclosedBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyBraceEnclosedBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterNonEmptyBraceEnclosedBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitNonEmptyBraceEnclosedBody(this);
		}
	}

	public final NonEmptyBraceEnclosedBodyContext nonEmptyBraceEnclosedBody() throws RecognitionException {
		NonEmptyBraceEnclosedBodyContext _localctx = new NonEmptyBraceEnclosedBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nonEmptyBraceEnclosedBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LCBrace);
			setState(163);
			query();
			setState(164);
			match(RCBrace);
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
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(RegoParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(RegoParser.Semicolon, i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_query);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			literal();
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Semicolon) {
						{
						setState(167);
						match(Semicolon);
						}
					}

					setState(170);
					literal();
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralExprContext literalExpr() {
			return getRuleContext(LiteralExprContext.class,0);
		}
		public TerminalNode Not() { return getToken(RegoParser.Not, 0); }
		public List<WithKeywordContext> withKeyword() {
			return getRuleContexts(WithKeywordContext.class);
		}
		public WithKeywordContext withKeyword(int i) {
			return getRuleContext(WithKeywordContext.class,i);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(176);
				match(Not);
				}
				break;
			}
			setState(179);
			literalExpr();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==With) {
				{
				{
				setState(180);
				withKeyword();
				}
				}
				setState(185);
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

	public static class LiteralExprContext extends ParserRuleContext {
		public List<ExprTermContext> exprTerm() {
			return getRuleContexts(ExprTermContext.class);
		}
		public ExprTermContext exprTerm(int i) {
			return getRuleContext(ExprTermContext.class,i);
		}
		public List<TerminalNode> EqOper() { return getTokens(RegoParser.EqOper); }
		public TerminalNode EqOper(int i) {
			return getToken(RegoParser.EqOper, i);
		}
		public LiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitLiteralExpr(this);
		}
	}

	public final LiteralExprContext literalExpr() throws RecognitionException {
		LiteralExprContext _localctx = new LiteralExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			exprTerm();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EqOper) {
				{
				{
				setState(187);
				match(EqOper);
				setState(188);
				exprTerm();
				}
				}
				setState(193);
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

	public static class WithKeywordContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(RegoParser.With, 0); }
		public List<ExprTermContext> exprTerm() {
			return getRuleContexts(ExprTermContext.class);
		}
		public ExprTermContext exprTerm(int i) {
			return getRuleContext(ExprTermContext.class,i);
		}
		public TerminalNode As() { return getToken(RegoParser.As, 0); }
		public WithKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterWithKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitWithKeyword(this);
		}
	}

	public final WithKeywordContext withKeyword() throws RecognitionException {
		WithKeywordContext _localctx = new WithKeywordContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_withKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(With);
			setState(195);
			exprTerm();
			setState(196);
			match(As);
			setState(197);
			exprTerm();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public TerminalNode LParan() { return getToken(RegoParser.LParan, 0); }
		public TerminalNode RParan() { return getToken(RegoParser.RParan, 0); }
		public ExprTermListContext exprTermList() {
			return getRuleContext(ExprTermListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			ref();
			setState(200);
			match(LParan);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String) | (1L << Bool) | (1L << Null) | (1L << Not) | (1L << Set) | (1L << LSBrace) | (1L << LCBrace) | (1L << LParan) | (1L << ArithOperator) | (1L << UnsignedNumber) | (1L << Name))) != 0)) {
				{
				setState(201);
				exprTermList();
				}
			}

			setState(204);
			match(RParan);
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

	public static class ExprTermPairContext extends ParserRuleContext {
		public List<ExprTermContext> exprTerm() {
			return getRuleContexts(ExprTermContext.class);
		}
		public ExprTermContext exprTerm(int i) {
			return getRuleContext(ExprTermContext.class,i);
		}
		public TerminalNode Colon() { return getToken(RegoParser.Colon, 0); }
		public ExprTermPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprTermPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterExprTermPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitExprTermPair(this);
		}
	}

	public final ExprTermPairContext exprTermPair() throws RecognitionException {
		ExprTermPairContext _localctx = new ExprTermPairContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprTermPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			exprTerm();
			setState(207);
			match(Colon);
			setState(208);
			exprTerm();
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

	public static class TermPairContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode Colon() { return getToken(RegoParser.Colon, 0); }
		public TermPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterTermPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitTermPair(this);
		}
	}

	public final TermPairContext termPair() throws RecognitionException {
		TermPairContext _localctx = new TermPairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			term();
			setState(211);
			match(Colon);
			setState(212);
			term();
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

	public static class ExprTermPairListContext extends ParserRuleContext {
		public List<ExprTermPairContext> exprTermPair() {
			return getRuleContexts(ExprTermPairContext.class);
		}
		public ExprTermPairContext exprTermPair(int i) {
			return getRuleContext(ExprTermPairContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(RegoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(RegoParser.Comma, i);
		}
		public ExprTermPairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprTermPairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterExprTermPairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitExprTermPairList(this);
		}
	}

	public final ExprTermPairListContext exprTermPairList() throws RecognitionException {
		ExprTermPairListContext _localctx = new ExprTermPairListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprTermPairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			exprTermPair();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(215);
				match(Comma);
				setState(216);
				exprTermPair();
				}
				}
				setState(221);
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

	public static class ExprTermContext extends ParserRuleContext {
		public List<RelationExprContext> relationExpr() {
			return getRuleContexts(RelationExprContext.class);
		}
		public RelationExprContext relationExpr(int i) {
			return getRuleContext(RelationExprContext.class,i);
		}
		public List<TerminalNode> RelationOperator() { return getTokens(RegoParser.RelationOperator); }
		public TerminalNode RelationOperator(int i) {
			return getToken(RegoParser.RelationOperator, i);
		}
		public ExprTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitExprTerm(this);
		}
	}

	public final ExprTermContext exprTerm() throws RecognitionException {
		ExprTermContext _localctx = new ExprTermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			relationExpr();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RelationOperator) {
				{
				{
				setState(223);
				match(RelationOperator);
				setState(224);
				relationExpr();
				}
				}
				setState(229);
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

	public static class ExprTermListContext extends ParserRuleContext {
		public List<ExprTermContext> exprTerm() {
			return getRuleContexts(ExprTermContext.class);
		}
		public ExprTermContext exprTerm(int i) {
			return getRuleContext(ExprTermContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(RegoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(RegoParser.Comma, i);
		}
		public ExprTermListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprTermList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterExprTermList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitExprTermList(this);
		}
	}

	public final ExprTermListContext exprTermList() throws RecognitionException {
		ExprTermListContext _localctx = new ExprTermListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprTermList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			exprTerm();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(231);
				match(Comma);
				setState(232);
				exprTerm();
				}
				}
				setState(237);
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

	public static class RelationExprContext extends ParserRuleContext {
		public List<BitwiseOrExprContext> bitwiseOrExpr() {
			return getRuleContexts(BitwiseOrExprContext.class);
		}
		public BitwiseOrExprContext bitwiseOrExpr(int i) {
			return getRuleContext(BitwiseOrExprContext.class,i);
		}
		public List<TerminalNode> Mid() { return getTokens(RegoParser.Mid); }
		public TerminalNode Mid(int i) {
			return getToken(RegoParser.Mid, i);
		}
		public RelationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRelationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRelationExpr(this);
		}
	}

	public final RelationExprContext relationExpr() throws RecognitionException {
		RelationExprContext _localctx = new RelationExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relationExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			bitwiseOrExpr();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Mid) {
				{
				{
				setState(239);
				match(Mid);
				setState(240);
				bitwiseOrExpr();
				}
				}
				setState(245);
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

	public static class BitwiseOrExprContext extends ParserRuleContext {
		public List<BitwiseAndExprContext> bitwiseAndExpr() {
			return getRuleContexts(BitwiseAndExprContext.class);
		}
		public BitwiseAndExprContext bitwiseAndExpr(int i) {
			return getRuleContext(BitwiseAndExprContext.class,i);
		}
		public List<TerminalNode> Ampersand() { return getTokens(RegoParser.Ampersand); }
		public TerminalNode Ampersand(int i) {
			return getToken(RegoParser.Ampersand, i);
		}
		public BitwiseOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterBitwiseOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitBitwiseOrExpr(this);
		}
	}

	public final BitwiseOrExprContext bitwiseOrExpr() throws RecognitionException {
		BitwiseOrExprContext _localctx = new BitwiseOrExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bitwiseOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			bitwiseAndExpr();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ampersand) {
				{
				{
				setState(247);
				match(Ampersand);
				setState(248);
				bitwiseAndExpr();
				}
				}
				setState(253);
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

	public static class BitwiseAndExprContext extends ParserRuleContext {
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public List<TerminalNode> ArithOperator() { return getTokens(RegoParser.ArithOperator); }
		public TerminalNode ArithOperator(int i) {
			return getToken(RegoParser.ArithOperator, i);
		}
		public BitwiseAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseAndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterBitwiseAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitBitwiseAndExpr(this);
		}
	}

	public final BitwiseAndExprContext bitwiseAndExpr() throws RecognitionException {
		BitwiseAndExprContext _localctx = new BitwiseAndExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bitwiseAndExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			arithExpr();
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					match(ArithOperator);
					setState(256);
					arithExpr();
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class ArithExprContext extends ParserRuleContext {
		public List<FactorExprContext> factorExpr() {
			return getRuleContexts(FactorExprContext.class);
		}
		public FactorExprContext factorExpr(int i) {
			return getRuleContext(FactorExprContext.class,i);
		}
		public List<TerminalNode> FactorOperator() { return getTokens(RegoParser.FactorOperator); }
		public TerminalNode FactorOperator(int i) {
			return getToken(RegoParser.FactorOperator, i);
		}
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitArithExpr(this);
		}
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		ArithExprContext _localctx = new ArithExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arithExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			factorExpr();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FactorOperator) {
				{
				{
				setState(263);
				match(FactorOperator);
				setState(264);
				factorExpr();
				}
				}
				setState(269);
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

	public static class FactorExprContext extends ParserRuleContext {
		public TerminalNode LParan() { return getToken(RegoParser.LParan, 0); }
		public ExprTermContext exprTerm() {
			return getRuleContext(ExprTermContext.class,0);
		}
		public TerminalNode RParan() { return getToken(RegoParser.RParan, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterFactorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitFactorExpr(this);
		}
	}

	public final FactorExprContext factorExpr() throws RecognitionException {
		FactorExprContext _localctx = new FactorExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factorExpr);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LParan:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(LParan);
				setState(271);
				exprTerm();
				setState(272);
				match(RParan);
				}
				break;
			case String:
			case Bool:
			case Null:
			case Not:
			case Set:
			case LSBrace:
			case LCBrace:
			case ArithOperator:
			case UnsignedNumber:
			case Name:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public ArrayComprehensionContext arrayComprehension() {
			return getRuleContext(ArrayComprehensionContext.class,0);
		}
		public ObjectComprehensionContext objectComprehension() {
			return getRuleContext(ObjectComprehensionContext.class,0);
		}
		public SetComprehensionContext setComprehension() {
			return getRuleContext(SetComprehensionContext.class,0);
		}
		public Object_Context object_() {
			return getRuleContext(Object_Context.class,0);
		}
		public Array_Context array_() {
			return getRuleContext(Array_Context.class,0);
		}
		public Set_Context set_() {
			return getRuleContext(Set_Context.class,0);
		}
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode ArithOperator() { return getToken(RegoParser.ArithOperator, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public TerminalNode Not() { return getToken(RegoParser.Not, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_term);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				arrayComprehension();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				objectComprehension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				setComprehension();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				object_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				array_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				set_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithOperator) {
					{
					setState(283);
					match(ArithOperator);
					}
				}

				setState(286);
				scalar();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(287);
				functionCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(288);
					match(Not);
					}
				}

				setState(291);
				ref();
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

	public static class ArrayComprehensionContext extends ParserRuleContext {
		public TerminalNode LSBrace() { return getToken(RegoParser.LSBrace, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode Mid() { return getToken(RegoParser.Mid, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RSBrace() { return getToken(RegoParser.RSBrace, 0); }
		public ArrayComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterArrayComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitArrayComprehension(this);
		}
	}

	public final ArrayComprehensionContext arrayComprehension() throws RecognitionException {
		ArrayComprehensionContext _localctx = new ArrayComprehensionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayComprehension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(LSBrace);
			setState(295);
			term();
			setState(296);
			match(Mid);
			setState(297);
			query();
			setState(298);
			match(RSBrace);
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

	public static class SetComprehensionContext extends ParserRuleContext {
		public TerminalNode LCBrace() { return getToken(RegoParser.LCBrace, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode Mid() { return getToken(RegoParser.Mid, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RCBrace() { return getToken(RegoParser.RCBrace, 0); }
		public SetComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterSetComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitSetComprehension(this);
		}
	}

	public final SetComprehensionContext setComprehension() throws RecognitionException {
		SetComprehensionContext _localctx = new SetComprehensionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_setComprehension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(LCBrace);
			setState(301);
			term();
			setState(302);
			match(Mid);
			setState(303);
			query();
			setState(304);
			match(RCBrace);
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

	public static class ObjectComprehensionContext extends ParserRuleContext {
		public TerminalNode LCBrace() { return getToken(RegoParser.LCBrace, 0); }
		public TermPairContext termPair() {
			return getRuleContext(TermPairContext.class,0);
		}
		public TerminalNode Mid() { return getToken(RegoParser.Mid, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RCBrace() { return getToken(RegoParser.RCBrace, 0); }
		public ObjectComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterObjectComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitObjectComprehension(this);
		}
	}

	public final ObjectComprehensionContext objectComprehension() throws RecognitionException {
		ObjectComprehensionContext _localctx = new ObjectComprehensionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectComprehension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(LCBrace);
			setState(307);
			termPair();
			setState(308);
			match(Mid);
			setState(309);
			query();
			setState(310);
			match(RCBrace);
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

	public static class Object_Context extends ParserRuleContext {
		public TerminalNode LCBrace() { return getToken(RegoParser.LCBrace, 0); }
		public TerminalNode RCBrace() { return getToken(RegoParser.RCBrace, 0); }
		public List<ObjectItemContext> objectItem() {
			return getRuleContexts(ObjectItemContext.class);
		}
		public ObjectItemContext objectItem(int i) {
			return getRuleContext(ObjectItemContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(RegoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(RegoParser.Comma, i);
		}
		public Object_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterObject_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitObject_(this);
		}
	}

	public final Object_Context object_() throws RecognitionException {
		Object_Context _localctx = new Object_Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_object_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(LCBrace);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String) | (1L << Bool) | (1L << Null) | (1L << UnsignedNumber) | (1L << Name))) != 0)) {
				{
				setState(313);
				objectItem();
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(314);
						match(Comma);
						setState(315);
						objectItem();
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(321);
					match(Comma);
					}
				}

				}
			}

			setState(326);
			match(RCBrace);
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

	public static class ObjectItemContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(RegoParser.Colon, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public ObjectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterObjectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitObjectItem(this);
		}
	}

	public final ObjectItemContext objectItem() throws RecognitionException {
		ObjectItemContext _localctx = new ObjectItemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_objectItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
			case Bool:
			case Null:
			case UnsignedNumber:
				{
				setState(328);
				scalar();
				}
				break;
			case Name:
				{
				setState(329);
				ref();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(332);
			match(Colon);
			setState(333);
			term();
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

	public static class Array_Context extends ParserRuleContext {
		public TerminalNode LSBrace() { return getToken(RegoParser.LSBrace, 0); }
		public TerminalNode RSBrace() { return getToken(RegoParser.RSBrace, 0); }
		public ExprTermListContext exprTermList() {
			return getRuleContext(ExprTermListContext.class,0);
		}
		public Array_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterArray_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitArray_(this);
		}
	}

	public final Array_Context array_() throws RecognitionException {
		Array_Context _localctx = new Array_Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_array_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(LSBrace);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String) | (1L << Bool) | (1L << Null) | (1L << Not) | (1L << Set) | (1L << LSBrace) | (1L << LCBrace) | (1L << LParan) | (1L << ArithOperator) | (1L << UnsignedNumber) | (1L << Name))) != 0)) {
				{
				setState(336);
				exprTermList();
				}
			}

			setState(339);
			match(RSBrace);
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

	public static class Set_Context extends ParserRuleContext {
		public EmptySetContext emptySet() {
			return getRuleContext(EmptySetContext.class,0);
		}
		public NonEmptySetContext nonEmptySet() {
			return getRuleContext(NonEmptySetContext.class,0);
		}
		public Set_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterSet_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitSet_(this);
		}
	}

	public final Set_Context set_() throws RecognitionException {
		Set_Context _localctx = new Set_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_set_);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Set:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				emptySet();
				}
				break;
			case LCBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				nonEmptySet();
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

	public static class EmptySetContext extends ParserRuleContext {
		public TerminalNode Set() { return getToken(RegoParser.Set, 0); }
		public TerminalNode RParan() { return getToken(RegoParser.RParan, 0); }
		public EmptySetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptySet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterEmptySet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitEmptySet(this);
		}
	}

	public final EmptySetContext emptySet() throws RecognitionException {
		EmptySetContext _localctx = new EmptySetContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_emptySet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(Set);
			setState(346);
			match(RParan);
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

	public static class NonEmptySetContext extends ParserRuleContext {
		public TerminalNode LCBrace() { return getToken(RegoParser.LCBrace, 0); }
		public ExprTermListContext exprTermList() {
			return getRuleContext(ExprTermListContext.class,0);
		}
		public TerminalNode RCBrace() { return getToken(RegoParser.RCBrace, 0); }
		public NonEmptySetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptySet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterNonEmptySet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitNonEmptySet(this);
		}
	}

	public final NonEmptySetContext nonEmptySet() throws RecognitionException {
		NonEmptySetContext _localctx = new NonEmptySetContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nonEmptySet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(LCBrace);
			setState(349);
			exprTermList();
			setState(350);
			match(RCBrace);
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

	public static class RefContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(RegoParser.Name, 0); }
		public List<RefOperandContext> refOperand() {
			return getRuleContexts(RefOperandContext.class);
		}
		public RefOperandContext refOperand(int i) {
			return getRuleContext(RefOperandContext.class,i);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRef(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(Name);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					refOperand();
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class RefOperandContext extends ParserRuleContext {
		public RefOperandDotContext refOperandDot() {
			return getRuleContext(RefOperandDotContext.class,0);
		}
		public RefOperandCanonicalContext refOperandCanonical() {
			return getRuleContext(RefOperandCanonicalContext.class,0);
		}
		public RefOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRefOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRefOperand(this);
		}
	}

	public final RefOperandContext refOperand() throws RecognitionException {
		RefOperandContext _localctx = new RefOperandContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_refOperand);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dot:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				refOperandDot();
				}
				break;
			case LSBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				refOperandCanonical();
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

	public static class RefOperandDotContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(RegoParser.Dot, 0); }
		public TerminalNode Name() { return getToken(RegoParser.Name, 0); }
		public RefOperandDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refOperandDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRefOperandDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRefOperandDot(this);
		}
	}

	public final RefOperandDotContext refOperandDot() throws RecognitionException {
		RefOperandDotContext _localctx = new RefOperandDotContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_refOperandDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(Dot);
			setState(364);
			match(Name);
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

	public static class RefOperandCanonicalContext extends ParserRuleContext {
		public TerminalNode LSBrace() { return getToken(RegoParser.LSBrace, 0); }
		public ExprTermContext exprTerm() {
			return getRuleContext(ExprTermContext.class,0);
		}
		public TerminalNode RSBrace() { return getToken(RegoParser.RSBrace, 0); }
		public RefOperandCanonicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refOperandCanonical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterRefOperandCanonical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitRefOperandCanonical(this);
		}
	}

	public final RefOperandCanonicalContext refOperandCanonical() throws RecognitionException {
		RefOperandCanonicalContext _localctx = new RefOperandCanonicalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_refOperandCanonical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(LSBrace);
			setState(367);
			exprTerm();
			setState(368);
			match(RSBrace);
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

	public static class ScalarContext extends ParserRuleContext {
		public TerminalNode UnsignedNumber() { return getToken(RegoParser.UnsignedNumber, 0); }
		public TerminalNode String() { return getToken(RegoParser.String, 0); }
		public TerminalNode Bool() { return getToken(RegoParser.Bool, 0); }
		public TerminalNode Null() { return getToken(RegoParser.Null, 0); }
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegoParserListener ) ((RegoParserListener)listener).exitScalar(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String) | (1L << Bool) | (1L << Null) | (1L << UnsignedNumber))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\7\2"+
		"V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3a\n\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13\6"+
		"\5\6w\n\6\3\7\3\7\3\7\5\7|\n\7\3\7\5\7\177\n\7\3\7\3\7\3\7\3\7\5\7\u0085"+
		"\n\7\3\7\3\7\5\7\u0089\n\7\3\b\3\b\3\b\5\b\u008e\n\b\5\b\u0090\n\b\3\b"+
		"\3\b\3\t\3\t\5\t\u0096\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3"+
		"\13\3\13\5\13\u00a3\n\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00ab\n\r\3\r\7\r"+
		"\u00ae\n\r\f\r\16\r\u00b1\13\r\3\16\5\16\u00b4\n\16\3\16\3\16\7\16\u00b8"+
		"\n\16\f\16\16\16\u00bb\13\16\3\17\3\17\3\17\7\17\u00c0\n\17\f\17\16\17"+
		"\u00c3\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00cd\n\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00dc"+
		"\n\24\f\24\16\24\u00df\13\24\3\25\3\25\3\25\7\25\u00e4\n\25\f\25\16\25"+
		"\u00e7\13\25\3\26\3\26\3\26\7\26\u00ec\n\26\f\26\16\26\u00ef\13\26\3\27"+
		"\3\27\3\27\7\27\u00f4\n\27\f\27\16\27\u00f7\13\27\3\30\3\30\3\30\7\30"+
		"\u00fc\n\30\f\30\16\30\u00ff\13\30\3\31\3\31\3\31\7\31\u0104\n\31\f\31"+
		"\16\31\u0107\13\31\3\32\3\32\3\32\7\32\u010c\n\32\f\32\16\32\u010f\13"+
		"\32\3\33\3\33\3\33\3\33\3\33\5\33\u0116\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u011f\n\34\3\34\3\34\3\34\5\34\u0124\n\34\3\34\5\34\u0127"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u013f\n \f \16 \u0142\13 \3 "+
		"\5 \u0145\n \5 \u0147\n \3 \3 \3!\3!\5!\u014d\n!\3!\3!\3!\3\"\3\"\5\""+
		"\u0154\n\"\3\"\3\"\3#\3#\5#\u015a\n#\3$\3$\3$\3%\3%\3%\3%\3&\3&\7&\u0165"+
		"\n&\f&\16&\u0168\13&\3\'\3\'\5\'\u016c\n\'\3(\3(\3(\3)\3)\3)\3)\3*\3*"+
		"\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPR\2\3\4\2\4\6\"\"\2\u017d\2W\3\2\2\2\4`\3\2\2\2\6b\3\2\2\2"+
		"\be\3\2\2\2\nv\3\2\2\2\fx\3\2\2\2\16\u008f\3\2\2\2\20\u0095\3\2\2\2\22"+
		"\u009e\3\2\2\2\24\u00a2\3\2\2\2\26\u00a4\3\2\2\2\30\u00a8\3\2\2\2\32\u00b3"+
		"\3\2\2\2\34\u00bc\3\2\2\2\36\u00c4\3\2\2\2 \u00c9\3\2\2\2\"\u00d0\3\2"+
		"\2\2$\u00d4\3\2\2\2&\u00d8\3\2\2\2(\u00e0\3\2\2\2*\u00e8\3\2\2\2,\u00f0"+
		"\3\2\2\2.\u00f8\3\2\2\2\60\u0100\3\2\2\2\62\u0108\3\2\2\2\64\u0115\3\2"+
		"\2\2\66\u0126\3\2\2\28\u0128\3\2\2\2:\u012e\3\2\2\2<\u0134\3\2\2\2>\u013a"+
		"\3\2\2\2@\u014c\3\2\2\2B\u0151\3\2\2\2D\u0159\3\2\2\2F\u015b\3\2\2\2H"+
		"\u015e\3\2\2\2J\u0162\3\2\2\2L\u016b\3\2\2\2N\u016d\3\2\2\2P\u0170\3\2"+
		"\2\2R\u0174\3\2\2\2TV\5\4\3\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"XZ\3\2\2\2YW\3\2\2\2Z[\7\2\2\3[\3\3\2\2\2\\a\5\6\4\2]a\5\b\5\2^a\5\n\6"+
		"\2_a\5\24\13\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\5\3\2\2\2bc\7"+
		"\13\2\2cd\5J&\2d\7\3\2\2\2ef\7\n\2\2fi\5J&\2gh\7\7\2\2hj\5J&\2ig\3\2\2"+
		"\2ij\3\2\2\2j\t\3\2\2\2kl\7\b\2\2lm\7#\2\2mn\7\31\2\2nw\5\66\34\2os\5"+
		"\f\7\2pr\5\16\b\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us"+
		"\3\2\2\2vk\3\2\2\2vo\3\2\2\2w\13\3\2\2\2x~\7#\2\2y{\7\21\2\2z|\5*\26\2"+
		"{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\7\24\2\2~y\3\2\2\2~\177\3\2\2\2\177"+
		"\u0084\3\2\2\2\u0080\u0081\7\17\2\2\u0081\u0082\5(\25\2\u0082\u0083\7"+
		"\22\2\2\u0083\u0085\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0087\7\31\2\2\u0087\u0089\5(\25\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\r\3\2\2\2\u008a\u008d\7\t\2\2\u008b\u008c"+
		"\7\31\2\2\u008c\u008e\5(\25\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u0090\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\5\26\f\2\u0092\17\3\2\2\2\u0093\u0096\5\22\n\2\u0094"+
		"\u0096\5\26\f\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\21\3\2\2"+
		"\2\u0097\u0098\7\t\2\2\u0098\u0099\7\31\2\2\u0099\u009a\5\66\34\2\u009a"+
		"\u009b\5\26\f\2\u009b\u009f\3\2\2\2\u009c\u009d\7\t\2\2\u009d\u009f\5"+
		"\26\f\2\u009e\u0097\3\2\2\2\u009e\u009c\3\2\2\2\u009f\23\3\2\2\2\u00a0"+
		"\u00a3\5\30\r\2\u00a1\u00a3\5\26\f\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3\25\3\2\2\2\u00a4\u00a5\7\20\2\2\u00a5\u00a6\5\30\r\2\u00a6"+
		"\u00a7\7\23\2\2\u00a7\27\3\2\2\2\u00a8\u00af\5\32\16\2\u00a9\u00ab\7\33"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\5\32\16\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b4\7\f\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b9\5\34\17\2\u00b6\u00b8\5\36\20\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\33\3\2\2"+
		"\2\u00bb\u00b9\3\2\2\2\u00bc\u00c1\5(\25\2\u00bd\u00be\7\31\2\2\u00be"+
		"\u00c0\5(\25\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\35\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5"+
		"\7\r\2\2\u00c5\u00c6\5(\25\2\u00c6\u00c7\7\7\2\2\u00c7\u00c8\5(\25\2\u00c8"+
		"\37\3\2\2\2\u00c9\u00ca\5J&\2\u00ca\u00cc\7\21\2\2\u00cb\u00cd\5*\26\2"+
		"\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf"+
		"\7\24\2\2\u00cf!\3\2\2\2\u00d0\u00d1\5(\25\2\u00d1\u00d2\7\34\2\2\u00d2"+
		"\u00d3\5(\25\2\u00d3#\3\2\2\2\u00d4\u00d5\5\66\34\2\u00d5\u00d6\7\34\2"+
		"\2\u00d6\u00d7\5\66\34\2\u00d7%\3\2\2\2\u00d8\u00dd\5\"\22\2\u00d9\u00da"+
		"\7\32\2\2\u00da\u00dc\5\"\22\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\'\3\2\2\2\u00df\u00dd\3"+
		"\2\2\2\u00e0\u00e5\5,\27\2\u00e1\u00e2\7\30\2\2\u00e2\u00e4\5,\27\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6)\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ed\5(\25\2\u00e9\u00ea"+
		"\7\32\2\2\u00ea\u00ec\5(\25\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee+\3\2\2\2\u00ef\u00ed\3"+
		"\2\2\2\u00f0\u00f5\5.\30\2\u00f1\u00f2\7\25\2\2\u00f2\u00f4\5.\30\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6-\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fd\5\60\31\2\u00f9\u00fa"+
		"\7\35\2\2\u00fa\u00fc\5\60\31\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2"+
		"\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe/\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0105\5\62\32\2\u0101\u0102\7\27\2\2\u0102\u0104\5\62\32"+
		"\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\61\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010d\5\64\33\2\u0109"+
		"\u010a\7\26\2\2\u010a\u010c\5\64\33\2\u010b\u0109\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\63\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\7\21\2\2\u0111\u0112\5(\25\2\u0112\u0113\7"+
		"\24\2\2\u0113\u0116\3\2\2\2\u0114\u0116\5\66\34\2\u0115\u0110\3\2\2\2"+
		"\u0115\u0114\3\2\2\2\u0116\65\3\2\2\2\u0117\u0127\58\35\2\u0118\u0127"+
		"\5<\37\2\u0119\u0127\5:\36\2\u011a\u0127\5> \2\u011b\u0127\5B\"\2\u011c"+
		"\u0127\5D#\2\u011d\u011f\7\27\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0127\5R*\2\u0121\u0127\5 \21\2\u0122\u0124"+
		"\7\f\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\5J&\2\u0126\u0117\3\2\2\2\u0126\u0118\3\2\2\2\u0126\u0119\3\2\2"+
		"\2\u0126\u011a\3\2\2\2\u0126\u011b\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u011e"+
		"\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0123\3\2\2\2\u0127\67\3\2\2\2\u0128"+
		"\u0129\7\17\2\2\u0129\u012a\5\66\34\2\u012a\u012b\7\25\2\2\u012b\u012c"+
		"\5\30\r\2\u012c\u012d\7\22\2\2\u012d9\3\2\2\2\u012e\u012f\7\20\2\2\u012f"+
		"\u0130\5\66\34\2\u0130\u0131\7\25\2\2\u0131\u0132\5\30\r\2\u0132\u0133"+
		"\7\23\2\2\u0133;\3\2\2\2\u0134\u0135\7\20\2\2\u0135\u0136\5$\23\2\u0136"+
		"\u0137\7\25\2\2\u0137\u0138\5\30\r\2\u0138\u0139\7\23\2\2\u0139=\3\2\2"+
		"\2\u013a\u0146\7\20\2\2\u013b\u0140\5@!\2\u013c\u013d\7\32\2\2\u013d\u013f"+
		"\5@!\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\7\32"+
		"\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146"+
		"\u013b\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7\23"+
		"\2\2\u0149?\3\2\2\2\u014a\u014d\5R*\2\u014b\u014d\5J&\2\u014c\u014a\3"+
		"\2\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7\34\2\2\u014f"+
		"\u0150\5\66\34\2\u0150A\3\2\2\2\u0151\u0153\7\17\2\2\u0152\u0154\5*\26"+
		"\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156"+
		"\7\22\2\2\u0156C\3\2\2\2\u0157\u015a\5F$\2\u0158\u015a\5H%\2\u0159\u0157"+
		"\3\2\2\2\u0159\u0158\3\2\2\2\u015aE\3\2\2\2\u015b\u015c\7\16\2\2\u015c"+
		"\u015d\7\24\2\2\u015dG\3\2\2\2\u015e\u015f\7\20\2\2\u015f\u0160\5*\26"+
		"\2\u0160\u0161\7\23\2\2\u0161I\3\2\2\2\u0162\u0166\7#\2\2\u0163\u0165"+
		"\5L\'\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167K\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016c\5N(\2\u016a"+
		"\u016c\5P)\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016cM\3\2\2\2\u016d"+
		"\u016e\7\36\2\2\u016e\u016f\7#\2\2\u016fO\3\2\2\2\u0170\u0171\7\17\2\2"+
		"\u0171\u0172\5(\25\2\u0172\u0173\7\22\2\2\u0173Q\3\2\2\2\u0174\u0175\t"+
		"\2\2\2\u0175S\3\2\2\2)W`isv{~\u0084\u0088\u008d\u008f\u0095\u009e\u00a2"+
		"\u00aa\u00af\u00b3\u00b9\u00c1\u00cc\u00dd\u00e5\u00ed\u00f5\u00fd\u0105"+
		"\u010d\u0115\u011e\u0123\u0126\u0140\u0144\u0146\u014c\u0153\u0159\u0166"+
		"\u016b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}