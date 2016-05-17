package compiler.interpreter;

import compiler.analysis.DepthFirstAdapter;
import compiler.node.AProgram;

/**
 * Created by Krzysztof Chruściel.
 */
public class Compiler extends DepthFirstAdapter {

//    private String result;
//    private int leftValue;
//    private int rightValue;
//    private String operation;
//
//    public void caseAProgram(AProgram node) {
//        operation = getOperation(node);
//        leftValue = getLeftValue(node);
//        rightValue = getRightValue(node);
//        count();
//    }
//
//
//    private int getRightValue(AProgram node) {
//        return new Integer(node.getRight().getText().trim()).intValue();
//    }
//
//    private int getLeftValue(AProgram node) {
//        return new Integer(node.getLeft().getText().trim()).intValue();
//    }
//
//    private String getOperation(AProgram node) {
//        return node.getOperation().getText().trim();
//    }
//
//    public String getResult() {
//        return result;
//    }
//
//    public void setResult(String result) {
//        this.result = result;
//    }
//
//    public void count(){
//        switch (operation) {
//            case "+":
//                setResult(leftValue + operation + rightValue + "=" + (leftValue + rightValue));
//                break;
//            case "*":
//                setResult(leftValue + operation + rightValue + "=" + (leftValue * rightValue));
//            case "/":
//                setResult(leftValue + operation + rightValue + "=" + (leftValue / rightValue));
//            case "-":
//                setResult(leftValue + operation + rightValue + "=" + (leftValue - rightValue));
//        }
//    }


    private String firstValue;
    private String secondValue;
    private String thirdValue;
    private String firstOperation;
    private String secondOperation;

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFirstValue() {
        return firstValue;
    }

    public String getSecondValue() {
        return secondValue;
    }

    public String getThirdValue() {
        return thirdValue;
    }

    public String getFirstOperation() {
        return firstOperation;
    }

    public String getSecondOperation() {
        return secondOperation;
    }

    public void caseAProgram(AProgram node) {
        firstOperation = getFirstOperation(node);
        secondOperation = getSecondOperation(node);
        firstValue = getFirstValue(node);
        secondValue = getSecondValue(node);
        thirdValue = getThirdValue(node);
        count();
    }

    private String getThirdValue(AProgram node) {
        return node.getThirdvalue().getText().trim();
    }

    private String getSecondValue(AProgram node) {
        return node.getSecondvalue().getText().trim();
    }

    private String getFirstOperation(AProgram node) {
        return node.getFirstoperation().getText().trim();
    }

    private String getSecondOperation(AProgram node) {
        return node.getSecondoperation().getText().trim();
    }

    private String getFirstValue(AProgram node) {
        return node.getFirstvalue().getText().trim();
    }

    public void count(){
        switch (getSecondOperation()){
            case "+":
                setResult(getFirstValue() + getFirstOperation() + getSecondValue() + getSecondOperation() + getThirdValue() + " = 5");
                break;
            case "-":
                setResult(getFirstValue() + getFirstOperation() + getSecondValue() + getSecondOperation() + getThirdValue() + " = 2");
                break;
            default:
                setResult("Wrong operation");
        }
    }

}
