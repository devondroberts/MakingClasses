package com.example.devon.makingclasses;

import junit.framework.TestCase;

public class ArithmeticTest extends TestCase
{

        Arithmetic a;
        Arithmetic b;
        TaxArithmetic ta;
        Arithmetic c;

        @Override
        public void setUp()throws Exception{
            super.setUp();
            a = new Arithmetic();
            b = new Arithmetic(5,10);
            ta=new TaxArithmetic();
            c=new Arithmetic();
        }
        public void testCalculateTax() {
            assertEquals(ta.calculateTax(10.0, 6.0), 0.60);
        }
        public void testCalculateTax2()
        {
            assertEquals(ta.calculateTax(10.0),.50);
        }
        public void testArithmeticAdd() {
            assertEquals(Arithmetic.add(2, 2),4);
            assertEquals(Arithmetic.add(2, -5),-3);
            assertEquals(ta.add(), 5);
        }
        public void testArithmeticSubtract() {
        assertEquals(ta.subtract(), -1);
        assertEquals(Arithmetic.subtract(2,-5),7);
        }
        public void testArithmeticMultiply() {
            assertEquals(ta.multiply(), 6);
            assertEquals(Arithmetic.multiply(2,-5),-10);
        }
        public void testArithmeticDivide() {
            assertEquals(ta.divide(), 2/3);
            assertEquals(Arithmetic.divide(2,-5),-(2/5.0));
        }

        @Override
        public void tearDown() throws Exception{
            super.tearDown();
        }

}
