package compiler.interpreter;

import compiler.analysis.DepthFirstAdapter;
import compiler.node.AProgram;

/**
 * Created by Krzysztof Chruściel.
 */
public class Compiler extends DepthFirstAdapter {


    private String result;

    public void caseAProgram(AProgram node) {
        String lhs = node.getLeft().getText().trim();
        String rhs = node.getRight().getText().trim();
        int result = (new Integer(lhs)).intValue() + (new Integer(rhs)).intValue();
        setResult(lhs + "+" + rhs + "=" + result);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
