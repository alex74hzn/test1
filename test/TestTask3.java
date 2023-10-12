package com.example.task.test;

public class TestTask3 {
   
    public static void main(String[] args) {
        int n;
        double x;
        double[] results;
        double e = Math.E;
        n = 20;
        x = 0.5;
        results = new double[n];
        calculate(n, x);
        printArray(results);
    }
    public static void calculate(int n, double x){
        double sqrt = Math.sqrt(n * Math.PI);
        for(int k = 1; k <= n;){
            double sum = (Math.sin((k * x) / 2) + Math.sin((k * x - 1) / 2)) / Math.pow(e, (x - 1 / k));
            results[k-1] = sqrt * sum;
            k++;
        }

    }

    public static void printArray(double[] array) {
        String tableRowDelimiter = ("+-----------------------+\n");

        System.out.print(tableRowDelimiter);
        System.out.printf("| %4s |\t%10s\t|\n","№", "f(x)");
        System.out.print(tableRowDelimiter);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("| %4d |\t%10.6f\t|\n",i+1,array[i]);
            System.out.print(tableRowDelimiter);
        }
    }
}
