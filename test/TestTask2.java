package com.example.task.test;

public class TestTask2 {
    public static void main(String[] args) {
        double e = Math.E;
        double[] ixes;
        double[] results;
        String message;
        int n = 10;
        double a = 0.5;
        double b = 1.0;
        ixes = new double[n];
        results = new double[n];
        getX(n, a, b);
        printArray(ixes, results);
    }
    public static void getX(int n, double a, double b){
        if(n <= 0 || a < 0 || b <= 0 || b <= a){
            message = "Неверные параметры!";
            throw new RuntimeException(message);
        }

        double x = a;
        double step = (b - a) / n;
        for(int i = 0; i < n; i++){
            ixes[i] = x;
            results[i] = calculate(e,x);
            x = x + step;
        }
    }
    public static double calculate(double e, double x){
        double res = 0;
        double sqrt = Math.sqrt(Math.pow(e,(2.2 * x)));
        double sinus =   Math.sin((Math.PI * x) / (x + 2.0 / 3.0));
        res = sqrt - Math.abs(sinus)+ 1.7;
        return res;
    }

    public static void printArray(double[] array1,double[] array2) {
        String tableRowDelimiter = ("+---------------------------------------+\n");

        System.out.print(tableRowDelimiter);
        System.out.printf("| %4s |\t%10s\t|\t%10s\t|\n","№","x", "f(x)");
        System.out.print(tableRowDelimiter);

        for (int i = 0; i < array1.length; i++) {
            System.out.printf("| %4d |\t%10.6f\t|\t%10.6f\t|\n",i+1,array1[i],array2[i]);
            System.out.print(tableRowDelimiter);
        }
    }
}
