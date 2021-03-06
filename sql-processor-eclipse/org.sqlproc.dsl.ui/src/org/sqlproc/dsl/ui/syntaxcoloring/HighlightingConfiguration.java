package org.sqlproc.dsl.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class HighlightingConfiguration extends DefaultHighlightingConfiguration {

    public final static String PUNCTATION = "punctation";
    public final static String TYPE = "type";
    public static final String DEFAULT = "default";
    public final static String NAME = "name";
    public static final String COMMENT = "comment";
    public static final String CONSTANT = "constant";
    public static final String IDENTIFIER = "identifier";
    public static final String COLUMN = "column";
    public static final String DATABASE_COLUMN = "dbcolumn";
    public static final String DATABASE_TABLE = "dbtable";
    public final static String FILTER = "filter";
    public final static String META_TYPE = "metatype";
    public final static String META_IDENT = "metaident";

    public void configure(IHighlightingConfigurationAcceptor acceptor) {
        // super.configure(acceptor);
        acceptor.acceptDefaultHighlighting(PUNCTATION, "Control characters", punctationStyle());
        acceptor.acceptDefaultHighlighting(TYPE, "Artifact type", typeStyle());
        acceptor.acceptDefaultHighlighting(COMMENT, "Comment", commentStyle());
        acceptor.acceptDefaultHighlighting(DEFAULT, "Default", defaultStyle());
        acceptor.acceptDefaultHighlighting(CONSTANT, "Constant", constantStyle());
        acceptor.acceptDefaultHighlighting(IDENTIFIER, "Identifier", identifierStyle());
        acceptor.acceptDefaultHighlighting(COLUMN, "Column", columnStyle());
        acceptor.acceptDefaultHighlighting(DATABASE_COLUMN, "Database column", databaseColumnStyle());
        acceptor.acceptDefaultHighlighting(DATABASE_TABLE, "Database table", databaseTableStyle());
        acceptor.acceptDefaultHighlighting(NAME, "Artifact name", nameStyle());
        acceptor.acceptDefaultHighlighting(FILTER, "Filters", filterStyle());
        acceptor.acceptDefaultHighlighting(META_TYPE, "Meta type", metaTypeStyle());
        acceptor.acceptDefaultHighlighting(META_IDENT, "Meta identifier", metaIdentStyle());
    }

    public TextStyle punctationStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setColor(new RGB(100, 100, 100));
        return textStyle;
    }

    public TextStyle typeStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setStyle(SWT.ITALIC);
        return textStyle;
    }

    public TextStyle constantStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setColor(new RGB(42, 0, 255));
        return textStyle;
    }

    public TextStyle columnStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setColor(new RGB(42, 0, 255));
        return textStyle;
    }

    public TextStyle identifierStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setColor(new RGB(42, 0, 255));
        return textStyle;
    }

    public TextStyle databaseColumnStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setColor(new RGB(165, 42, 42));
        return textStyle;
    }

    public TextStyle databaseTableStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setColor(new RGB(165, 42, 42));
        return textStyle;
    }

    public TextStyle metatTypeStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setColor(new RGB(139, 105, 20));
        return textStyle;
    }

    public TextStyle commentStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setColor(new RGB(63, 127, 95));
        return textStyle;
    }

    public TextStyle defaultStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.NORMAL);
        // textStyle.setBackgroundColor(new RGB(255, 255, 255));
        textStyle.setColor(new RGB(0, 0, 0));
        return textStyle;
    }

    public TextStyle nameStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setColor(new RGB(127, 0, 85));
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
    }

    public TextStyle filterStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setStyle(SWT.ITALIC);
        return textStyle;
    }

    public TextStyle metaTypeStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setColor(new RGB(210, 105, 30));
        return textStyle;
    }

    public TextStyle metaIdentStyle() {
        TextStyle textStyle = defaultStyle();
        textStyle.setColor(new RGB(34, 139, 34));
        return textStyle;
    }
}
