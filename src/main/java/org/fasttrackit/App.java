package org.fasttrackit;

public class App {
        public static void main(String[] args) {

            //1st calculation

            //from previous homework H4;

            Formula sum = new Formula();

            double firstFormula = sum.firstCalc(5.9, 10.2);
            System.out.println("The result will be " + firstFormula);


            //apelare H5;
            Formula firstcalc1 = new Formula();

        firstcalc1.firstCalc(2.6,10.6);
        firstcalc1.firstCalc(2,9);


            //2nd calculation

            Formula calc22 = new Formula();

            double secondFormula = calc22.secondCalc(2, 20, 15, 63);
            System.out.println("The result will be " + secondFormula);

            //apelare in H5
        }

    }
