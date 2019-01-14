package org.fasttrackit;

import java.lang.reflect.Field;
import java.text.Normalizer;

public class App
{
    public static double main(String[] args ) {
        Formula calc1 = new Formula();

        double firstFormula = calc1.firstCalc(10, 10);
        System.out.println("The result will be " + firstFormula);
        return firstFormula;

        
    }
}
