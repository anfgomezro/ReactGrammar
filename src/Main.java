import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main
{
    public static void main( String[] args)
    {
        try{
            JavaScriptLexer lexer;

            if (args.length>0)
                lexer = new JavaScriptLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new JavaScriptLexer(CharStreams.fromStream(System.in));

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaScriptParser parser = new JavaScriptParser(tokens);

            JavaScriptParser.ProgramContext programContext = parser.program();
            MyVisitor myVisitor = new MyVisitor();
            myVisitor.visit(programContext);
            System.out.println("Tags in program: "+myVisitor.getTags());
            System.out.println("If in program: "+myVisitor.getIfs());
            System.out.println("Methods in program: "+myVisitor.getMethod());
            System.out.println("Arrow Functions in program: "+ myVisitor.getArrow());
            System.out.println("var declaration in program: "+myVisitor.getVar());
            System.out.println("For's in program: "+myVisitor.getForS());
            System.out.println("While's in program: "+ myVisitor.getWhileS());
            //ParseTree tree = parser.program();
            //System.out.println(tree.toStringTree(parser));

            System.out.println("El analisis sintactico ha finalizado correctamente.");

        }catch ( Exception e){
            System.out.println("Error : "+ e);
        }
    }
}