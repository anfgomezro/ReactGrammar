public class MyVisitor extends  JavaScriptParserBaseVisitor<String>{

    private int tags;
    private int ifs;
    private int method;
    private int arrow;

    public MyVisitor(){
        tags =0;
        ifs =0;
        method=0;
        arrow=0;
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

}
