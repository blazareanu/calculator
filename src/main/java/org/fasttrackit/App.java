package org.fasttrackit;

public class App {
        public static void main(String[] args) {


            Formula calc1 = new Formula();

            double firstFormula = calc1.firstCalc(10, 10);
            System.out.println("The result will be " + firstFormula);


            Formula calc2 = new Formula();

            double secondFormula = calc2.secondCalc(2, 20, 15, 63);
            System.out.println("The result will be " + secondFormula);
        }
    }
