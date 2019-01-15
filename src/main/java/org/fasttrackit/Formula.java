package org.fasttrackit;

public class Formula {


    // First calculation

    private int sum ;


    public double firstCalc(double x, double y) {
        System.out.println(" Apelam " +  x + " + " +  y );

        double sum = x + y;
        return sum;


    }


    public int firstCalc(int y, int x) {
        System.out.println(" Apelam " + y + " + " + x );
        int sum = y + x;
        return sum;
    }


//Second calculation

    public double secondCalc (double a, double b, double c, double d){

        double calc2= a*b*c*d;
        return calc2;
    }
}
