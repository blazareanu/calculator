package org.fasttrackit;

public class App {
        public static void main(String[] args) {


            Formula sum = new Formula();

            double firstFormula = sum.firstCalc(10.5, 10.2);
            System.out.println("The result will be " + firstFormula);


           int firstFormula1= sum.firstCalc1(10, 2);
           System.out.println("The result will be " + firstFormula1);



            Formula calc2 = new Formula();

            double secondFormula = calc2.secondCalc(2, 20, 15, 63);
            System.out.println("The result will be " + secondFormula);


        }

    }
