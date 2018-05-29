public class MyVisitor extends  JavaScriptParserBaseVisitor<String>{

    private int tags;
    private int ifs;
    private int method;
    private int arrow;
    private int whileS;
    private int forS;
    private int var;

    public MyVisitor(){
        tags =0;
        ifs =0;
        method=0;
        arrow=0;

        whileS=0;
        forS=0;
        var=0;
    }

    public int getWhileS() {
        return whileS;
    }

    public int getForS() {
        return forS;
    }

    public int getVar() {
        return var;
    }

    public int getTags() {
        return tags;
    }

    public int getMethod() {
        return method;
    }

    public int getArrow() {
        return arrow;
    }

    public int getIfs() {
        return ifs;

    }

    @Override
    public String visitTag(JavaScriptParser.TagContext ctx) {
        tags++;
        return visitChildren(ctx);

    }

    @Override
    public String visitIfStatement(JavaScriptParser.IfStatementContext ctx) {
        ifs++;
        return visitChildren(ctx);
    }

    @Override
    public String visitMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx) {
        method++;
        return visitChildren(ctx);
    }

    @Override
    public String visitArrowFunctionExpression(JavaScriptParser.ArrowFunctionExpressionContext ctx) {
        arrow++;
        return visitChildren(ctx);
    }

    @Override
    public String visitWhileStatement(JavaScriptParser.WhileStatementContext ctx) {
        whileS++;
        return visitChildren(ctx);
    }

    @Override
    public String visitForStatement(JavaScriptParser.ForStatementContext ctx) {
        forS++;
        return visitChildren(ctx);
    }

    @Override public String visitForVarStatement(JavaScriptParser.ForVarStatementContext ctx) {
        forS++;
        return visitChildren(ctx);
    }

    @Override public String visitForInStatement(JavaScriptParser.ForInStatementContext ctx) {
        forS++;
        return visitChildren(ctx);
    }


    @Override public String visitForVarInStatement(JavaScriptParser.ForVarInStatementContext ctx) {
        forS++;
        return visitChildren(ctx);
    }

    @Override
    public String visitVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx) {
        var++;
        return visitChildren(ctx);
    }

}
