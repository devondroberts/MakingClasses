package com.example.devon.makingclasses;

public class TaxArithmetic extends Arithmetic {

    public double calculateTax(double purchaseAmt, double taxRate)
    {
        return purchaseAmt*(taxRate/100);
    }
    public double calculateTax(double taxRate)
    {
        return (getmOperand1() + getmOperand2()) * (taxRate/100);
    }
}
