// Generated from com/purbon/kafka/policy/RegoLexer.g4 by ANTLR 4.7.1
package com.purbon.kafka.policy;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegoLexer extends Lexer {
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
		COMMENTS_AND_FORMATTING=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "COMMENTS_AND_FORMATTING"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Comment", "DoubleQuote", "BackTick", "QuotedString", "RawString", "String", 
		"UnicodeEscape", "Bool", "Null", "As", "Default", "Else", "Import", "Package", 
		"Not", "With", "Set", "LSBrace", "LCBrace", "LParan", "RSBrace", "RCBrace", 
		"RParan", "Mid", "FactorOperator", "Plus", "Minus", "ArithOperator", "RelationOperator", 
		"EqOper", "Comma", "Semicolon", "Colon", "Ampersand", "Dot", "WhiteSpace", 
		"LineEnd", "WindowsLineEnd", "E", "Real", "UnsignedNumber", "AsciiLetter", 
		"DecimalDigit", "Char", "EscapeSequence", "SingleCharEscape", "Name"
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


	public RegoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RegoLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			Comment_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			WhiteSpace_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			LineEnd_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Comment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			_channel = COMMENTS_AND_FORMATTING;
			break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			_channel = COMMENTS_AND_FORMATTING;
			break;
		}
	}
	private void LineEnd_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			_channel = COMMENTS_AND_FORMATTING;
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0142\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\7\2e\n\2\f\2\16\2h\13\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\7\5r\n\5\f\5\16\5u\13\5\3\5\3\5\3\6\3\6"+
		"\7\6{\n\6\f\6\16\6~\13\6\3\6\3\6\3\7\3\7\5\7\u0084\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0095\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u00df\n\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00ea\n\36\3\37\3\37\3\37"+
		"\5\37\u00ef\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3(\3(\3)\7)\u010a\n)\f)\16)\u010d\13)\3)\3)\6)\u0111"+
		"\n)\r)\16)\u0112\3)\6)\u0116\n)\r)\16)\u0117\3)\5)\u011b\n)\5)\u011d\n"+
		")\3*\3*\3*\3*\5*\u0123\n*\3*\3*\5*\u0127\n*\3+\3+\3,\3,\3-\3-\3-\5-\u0130"+
		"\n-\3.\3.\5.\u0134\n.\3/\3/\3/\5/\u0139\n/\3\60\3\60\3\60\7\60\u013e\n"+
		"\60\f\60\16\60\u0141\13\60\2\2\61\3\3\5\2\7\2\t\2\13\2\r\4\17\2\21\5\23"+
		"\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25"+
		"\63\26\65\2\67\29\27;\30=\31?\32A\33C\34E\35G\36I\37K M!O\2Q\2S\"U\2W"+
		"\2Y\2[\2]\2_#\3\2\20\4\2^^``\5\2\f\f\17\17``\3\2bb\5\2\62;CHch\5\2\'\'"+
		",,\61\61\4\2>>@@\4\2\13\13\"\"\3\2\f\f\3\2\17\17\4\2GGgg\5\2C\\aac|\3"+
		"\2\62;\5\2\2!$$^^\t\2\61\61^^ddhhppttvv\2\u014c\2\3\3\2\2\2\2\r\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2S\3"+
		"\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13x\3\2"+
		"\2\2\r\u0083\3\2\2\2\17\u0085\3\2\2\2\21\u0094\3\2\2\2\23\u0096\3\2\2"+
		"\2\25\u009b\3\2\2\2\27\u009e\3\2\2\2\31\u00a6\3\2\2\2\33\u00ab\3\2\2\2"+
		"\35\u00b2\3\2\2\2\37\u00ba\3\2\2\2!\u00be\3\2\2\2#\u00c3\3\2\2\2%\u00c8"+
		"\3\2\2\2\'\u00ca\3\2\2\2)\u00cc\3\2\2\2+\u00ce\3\2\2\2-\u00d0\3\2\2\2"+
		"/\u00d2\3\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2\2\65\u00d8\3\2\2\2\67"+
		"\u00da\3\2\2\29\u00de\3\2\2\2;\u00e9\3\2\2\2=\u00ee\3\2\2\2?\u00f0\3\2"+
		"\2\2A\u00f2\3\2\2\2C\u00f4\3\2\2\2E\u00f6\3\2\2\2G\u00f8\3\2\2\2I\u00fa"+
		"\3\2\2\2K\u00fe\3\2\2\2M\u0102\3\2\2\2O\u0106\3\2\2\2Q\u011c\3\2\2\2S"+
		"\u011e\3\2\2\2U\u0128\3\2\2\2W\u012a\3\2\2\2Y\u012f\3\2\2\2[\u0133\3\2"+
		"\2\2]\u0138\3\2\2\2_\u013a\3\2\2\2ab\t\2\2\2bf\7%\2\2ce\t\3\2\2dc\3\2"+
		"\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\b\2\2\2j\4\3"+
		"\2\2\2kl\7$\2\2l\6\3\2\2\2mn\7b\2\2n\b\3\2\2\2os\5\5\3\2pr\5Y-\2qp\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\5\5\3\2w\n\3"+
		"\2\2\2x|\5\7\4\2y{\n\4\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~|\3\2\2\2\177\u0080\5\7\4\2\u0080\f\3\2\2\2\u0081\u0084\5\t\5"+
		"\2\u0082\u0084\5\13\6\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\16\3\2\2\2\u0085\u0086\7w\2\2\u0086\u0087\t\5\2\2\u0087\u0088\t\5\2\2"+
		"\u0088\u0089\t\5\2\2\u0089\u008a\t\5\2\2\u008a\20\3\2\2\2\u008b\u008c"+
		"\7v\2\2\u008c\u008d\7t\2\2\u008d\u008e\7w\2\2\u008e\u0095\7g\2\2\u008f"+
		"\u0090\7h\2\2\u0090\u0091\7c\2\2\u0091\u0092\7n\2\2\u0092\u0093\7u\2\2"+
		"\u0093\u0095\7g\2\2\u0094\u008b\3\2\2\2\u0094\u008f\3\2\2\2\u0095\22\3"+
		"\2\2\2\u0096\u0097\7p\2\2\u0097\u0098\7w\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7n\2\2\u009a\24\3\2\2\2\u009b\u009c\7c\2\2\u009c\u009d\7u\2\2\u009d"+
		"\26\3\2\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7h\2\2\u00a1"+
		"\u00a2\7c\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7v\2\2"+
		"\u00a5\30\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7"+
		"u\2\2\u00a9\u00aa\7g\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad"+
		"\7o\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7t\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7e\2\2\u00b5\u00b6\7m\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7i\2\2"+
		"\u00b8\u00b9\7g\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7"+
		"q\2\2\u00bc\u00bd\7v\2\2\u00bd \3\2\2\2\u00be\u00bf\7y\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7j\2\2\u00c2\"\3\2\2\2\u00c3\u00c4"+
		"\7u\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7*\2\2\u00c7"+
		"$\3\2\2\2\u00c8\u00c9\7]\2\2\u00c9&\3\2\2\2\u00ca\u00cb\7}\2\2\u00cb("+
		"\3\2\2\2\u00cc\u00cd\7*\2\2\u00cd*\3\2\2\2\u00ce\u00cf\7_\2\2\u00cf,\3"+
		"\2\2\2\u00d0\u00d1\7\177\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7+\2\2\u00d3\60"+
		"\3\2\2\2\u00d4\u00d5\7~\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\t\6\2\2\u00d7"+
		"\64\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9\66\3\2\2\2\u00da\u00db\7/\2\2\u00db"+
		"8\3\2\2\2\u00dc\u00df\5\65\33\2\u00dd\u00df\5\67\34\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00dd\3\2\2\2\u00df:\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1\u00ea"+
		"\7?\2\2\u00e2\u00e3\7#\2\2\u00e3\u00ea\7?\2\2\u00e4\u00e5\7>\2\2\u00e5"+
		"\u00ea\7?\2\2\u00e6\u00e7\7@\2\2\u00e7\u00ea\7?\2\2\u00e8\u00ea\t\7\2"+
		"\2\u00e9\u00e0\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e6"+
		"\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea<\3\2\2\2\u00eb\u00ec\7<\2\2\u00ec\u00ef"+
		"\7?\2\2\u00ed\u00ef\7?\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		">\3\2\2\2\u00f0\u00f1\7.\2\2\u00f1@\3\2\2\2\u00f2\u00f3\7=\2\2\u00f3B"+
		"\3\2\2\2\u00f4\u00f5\7<\2\2\u00f5D\3\2\2\2\u00f6\u00f7\7(\2\2\u00f7F\3"+
		"\2\2\2\u00f8\u00f9\7\60\2\2\u00f9H\3\2\2\2\u00fa\u00fb\t\b\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fd\b%\3\2\u00fdJ\3\2\2\2\u00fe\u00ff\t\t\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\b&\4\2\u0101L\3\2\2\2\u0102\u0103\t\n\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\b\'\5\2\u0105N\3\2\2\2\u0106\u0107\t\13\2\2\u0107"+
		"P\3\2\2\2\u0108\u010a\5W,\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u0110\7\60\2\2\u010f\u0111\5W,\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011d\3\2"+
		"\2\2\u0114\u0116\5W,\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u011b\7\60\2\2"+
		"\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u010b"+
		"\3\2\2\2\u011c\u0115\3\2\2\2\u011dR\3\2\2\2\u011e\u0126\5Q)\2\u011f\u0122"+
		"\5O(\2\u0120\u0123\5\65\33\2\u0121\u0123\5\67\34\2\u0122\u0120\3\2\2\2"+
		"\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\5Q)\2\u0125\u0127\3\2\2\2\u0126\u011f\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"T\3\2\2\2\u0128\u0129\t\f\2\2\u0129V\3\2\2\2\u012a\u012b\t\r\2\2\u012b"+
		"X\3\2\2\2\u012c\u0130\n\16\2\2\u012d\u012e\7^\2\2\u012e\u0130\5[.\2\u012f"+
		"\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u0130Z\3\2\2\2\u0131\u0134\5]/\2\u0132"+
		"\u0134\5\17\b\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\\\3\2\2"+
		"\2\u0135\u0139\t\17\2\2\u0136\u0139\5\5\3\2\u0137\u0139\5\7\4\2\u0138"+
		"\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139^\3\2\2\2"+
		"\u013a\u013f\5U+\2\u013b\u013e\5U+\2\u013c\u013e\5W,\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140`\3\2\2\2\u0141\u013f\3\2\2\2\27\2fs|\u0083\u0094"+
		"\u00de\u00e9\u00ee\u010b\u0112\u0117\u011a\u011c\u0122\u0126\u012f\u0133"+
		"\u0138\u013d\u013f\6\3\2\2\3%\3\3&\4\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}