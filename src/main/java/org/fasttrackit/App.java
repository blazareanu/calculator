package org.fasttrackit;

public class App {
        public static void main(String[] args) {

            //din tema anterioara H4;

            Formula sum = new Formula();

            double firstFormula = sum.firstCalc(5.9, 10.2);
            System.out.println("The result will be " + firstFormula);


            //apelare H5;
            Formula firstcalc = new Formula();
        firstcalc.firstCalc(2.6,10.6);
        firstcalc.firstCalc(2,9);




            Formula calc2 = new Formula();

            double secondFormula = calc2.secondCalc(2, 20, 15, 63);
            System.out.println("The result will be " + secondFormula);


        }

    }
