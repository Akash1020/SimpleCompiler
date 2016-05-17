import compiler.lexer.Lexer;
import compiler.node.Start;
import compiler.parser.Parser;
import compiler.Compiler;

import java.io.FileReader;
import java.io.PushbackReader;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
            /* Form our AST */
                Lexer lexer = new Lexer(new PushbackReader(
                        new FileReader(args[0]), 1024));
                Parser parser = new Parser(lexer);
                Start ast = parser.parse() ;

            /* Get our Interpreter going. */
                Compiler interp = new Compiler() ;
                ast.apply(interp) ;
            }
            catch (Exception e) {
                System.out.println (e) ;
            }
        } else {
            System.err.println("usage: java simpleAdder inputFile");
            System.exit(1);
        }
    }
}
