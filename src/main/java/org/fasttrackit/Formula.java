package org.fasttrackit;

public class Formula {


    // First calculation

    private int sum ;
    private int calc2;


    public double firstCalc(double x, double y) {
        System.out.println(" Apelam " +  x + " + " +  y );

        double sum = x + y;
        System.out.println(" The result will be " + sum);
        return sum;

    }


    public int firstCalc(int y, int x) {
        System.out.println(" Apelam " + y + " + " + x );
        int sum = y + x;
        System.out.println(" The result will be " + sum);
        return sum;

    }


     //Second calculation

    public double secondCalc (double a, double b, double c, double d) {
        System.out.println("Vom calcula o inmultire intre cele 4 numere " + a + " * " + b + " * " + c + " * "+ d);

        double calc2 = a * b * c * d;
        System.out.println(" The result will be " + calc2);
        return calc2;
    }

        public int secondCalc (int x, int y, int z, int k){
            System.out.println("Vom calcula o inmultire intre cele 4 numere " + x + " * " + y +  " * " + z + " * "+ k);

            int calc2 = x*y*z*k;
            System.out.println(" The result will be " + calc2);
            return calc2;
        }
    }

