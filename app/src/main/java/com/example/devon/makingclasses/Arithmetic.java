package com.example.devon.makingclasses;

public class Arithmetic {
    private int mOperand1;
    private int mOperand2;

    public Arithmetic() {//Default Constructor that sets default values
        mOperand1=2;
        mOperand2=3;
    }
    public Arithmetic(int operand1, int operand2)
    {
        mOperand1 = operand1;
        mOperand2 = operand2;
    }
    public  String toString() {
        return "Arithmetic Instance: mOperand1 - " + mOperand1 + "; mOperand2 = " + mOperand2 + ".";
    }
    public int add()
    {
        return mOperand1 + mOperand2;
    }
    public int subtract()
    {
        return mOperand1 - mOperand2;
    }
    public int divide()
    {
        return mOperand1/mOperand2;
    }
    public int multiply()
    {
        return mOperand1*mOperand2;
    }

    public int getmOperand1() {
        return mOperand1;
    }

    public void setmOperand1(int mOperand1) {
        this.mOperand1 = mOperand1;
    }

    public int getmOperand2() {
        return mOperand2;
    }

    public void setmOperand2(int mOperand2) {
        this.mOperand2 = mOperand2;
    }
    public static int add(int operand1, int operand2){
        return operand1 + operand2;
    }

    public static int subtract(int operand1, int operand2){
        return operand1 - operand2;
    }

    public static int multiply(int operand1, int operand2)
    {
        return operand1*operand2;
    }

    public static double divide(int operand1, int operand2)
    {
        return (double)operand1/operand2;
    }
}
