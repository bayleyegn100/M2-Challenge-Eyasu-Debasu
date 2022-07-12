package com.company.monthandmonthservice.models;

import javax.validation.constraints.NotEmpty;
import java.util.Objects;
public class MathSolution {

    @NotEmpty(message = "You must enter a value for operand1.")
    private String operand1;
    @NotEmpty(message = "You must enter a value for operand2.")

    private String operand2;
    private String operation;
    private double answer;

    public MathSolution(String operand1, String operand2, String operation, int answer) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.answer = answer;
    }

    public MathSolution(){}

    public double getOperand1() {
        return Double.parseDouble(operand1);
    }

    public void setOperand1(String operand1){
        this.operand1 = operand1;
   }

    public double getOperand2() {
        return Double.parseDouble(operand2);
    }

    public void setOperand2(String operand2) {
        this.operand2 = operand2;
}
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer() {

       if(Double.parseDouble(operand2) == 0 && this.operation == "divide"){
           throw new IllegalArgumentException("we can not divide a number by 0(zero).");
       }

       if(this.operation == "add"){
           this.answer = Double.parseDouble(operand1) + Double.parseDouble(operand2);
       } else if(this.operation == "subtract"){
           this.answer = Double.parseDouble(operand1) - Double.parseDouble(operand2);
       } else if(this.operation == "multiply"){
           this.answer = Double.parseDouble(operand1) * Double.parseDouble(operand2);
       } else if(this.operation == "divide"){
           this.answer = Double.parseDouble(operand1) / Double.parseDouble(operand2);
       }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathSolution that = (MathSolution) o;
        return operand1 == that.operand1 && operand2 == that.operand2 && answer == that.answer && Objects.equals(operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operation, answer);
    }

    @Override
    public String toString() {
        return "MathSolution{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", operation='" + operation + '\'' +
                ", answer=" + answer +
                '}';
    }
}
