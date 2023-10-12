package com.example.task.test;



public class TestTask1 {
    
    public static void main(String[] args) {
        double result;
        double e  = Math.E;
        double x = 0.5;
        result = calculate( e, x);
        System.out.println(result);

    }
    public static double calculate(double e, double x){
        double res = 0;
        double sqrt = Math.sqrt(Math.pow(e,(2.2 * x)));
        double sinus =   Math.sin((Math.PI * x) / (x + 2.0 / 3.0));
        res = sqrt - Math.abs(sinus)+ 1.7;
        return res;
    }
}
