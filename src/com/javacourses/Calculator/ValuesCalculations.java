package com.javacourses.Calculator;

/**
 * Created by Oleg on 01.02.14.
 */
public class ValuesCalculations {
    double val1;
    String sVal1;
    double val2;
    String sVal2;

    public double plus() {
        val1=0;
        val2=0;
        if (!sVal1.isEmpty() && !sVal2.isEmpty()) {
            val1=Double.parseDouble(sVal1);
            val2=Double.parseDouble(sVal2);
        }
        return val1+val2;
    }

}
