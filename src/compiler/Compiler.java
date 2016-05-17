package compiler;

import compiler.analysis.DepthFirstAdapter;
import compiler.node.AProgram;

/**
 * Created by Krzysztof Chruściel.
 */
public class Compiler extends DepthFirstAdapter {

    public void caseAProgram(AProgram node) {
        String lhs = node.getLeft().getText().trim();
        String rhs = node.getRight().getText().trim();
        int result = (new Integer(lhs)).intValue() + (new Integer(rhs)).intValue();
        System.out.println(lhs + "+" + rhs + "=" + result);
    }
}
