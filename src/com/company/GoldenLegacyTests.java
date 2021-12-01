package com.company;

import static org.junit.Assert.*;

public class GoldenLegacyTests {


    public void testZero()
    {
        Calculator test = new Calculator();
        test.zero();
        assertEquals(0,test.getAcc());
    }
}
class Calculator
{
    private int acc;

    public void zero(){
        acc = 0;
    }
    public int getAcc(){
        return acc;
    }
}