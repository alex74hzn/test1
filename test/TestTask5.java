package com.example.task.test;

public class TestTask5 {
    public static double x;
    public static double y;
    public static double dx;
    public static double a;
    public static double[] results1;
    public static double[] results2;
    public static double[] exes;
    public static final double E = Math.E;

    public static void main(String[] args) {
        int n = 30;
        a = 1;
        x = -2 * a;
        dx = (a / 5);

        calculate(n);
       // printSimpleTable(exes,results1, results2);
        printArray(exes,results1, results2);
    }
    public static void calculate(int n){
       int sizeOfPositiveX;
       int sizeOfNegativeX = 0;
       double xx = x;

       for(int s = 0; s < n; s++){
           if(xx <= 0){
               sizeOfNegativeX++;
               xx= xx + dx;
           }
           else{ break;}
       }
       sizeOfPositiveX = n - sizeOfNegativeX;
        results1 = new double[sizeOfNegativeX];
        results2 = new double[sizeOfPositiveX];
        exes = new double[n];
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < n; i++){
            exes[i] = x;
            if(x <= 0){
                y = a/2 * (Math.pow(E,x / a) + Math.pow(E, -x / a));
                results1[counter1] = y;
                counter1++;
            }
            else{
                if(results2.length > 0) {
                    y = Math.pow(4 * a, 3) / (Math.pow(x, 2) + Math.pow(4 * a, 2));
                    results2[counter2] = y;
                    counter2++;
                }
            }
            x = x + dx;
        }
    }
    public static void printArray(double[] xArray,double[] array1,double[] array2) {
        if(array1.length <=0){array1 = null;}
        if(array2.length <=0){array2 = null;}
        String tableRowDelimiter = ("+-----------------------------------------------+\n");
        System.out.print(tableRowDelimiter);
        System.out.printf("|\t%10s\t|\t%10s\t|\t%10s\t|\n","X", "x<=0", "x>0");
        System.out.print(tableRowDelimiter);
        int xi = 0;
        for (int i = 0; i < array1.length; i++) {
                System.out.printf("|\t%10.6f\t|\t%10.6f\t|\t%10s\t|\n", xArray[xi], array1[i], "");
                xi++;
            System.out.print(tableRowDelimiter);
            }
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("|\t%10.6f\t|\t%10s\t|\t%10.6f\t|\n", xArray[xi], "", array2[i]);
            xi++;
            System.out.print(tableRowDelimiter);
        }
    }
    public static void printSimpleTable(double[] xArray,double[] array1,double[] array2) {
        if(array1.length <=0){array1 = null;}
        if(array2.length <=0){array2 = null;}
        String tableRowDelimiter = ("+-------------------------------+\n");
        System.out.print(tableRowDelimiter);
        System.out.printf("|\t%10s\t|\t%10s\t|\n","X", "Y");
        System.out.print(tableRowDelimiter);
        int xi = 0;
        for (int i = 0; i < array1.length; i++) {
                System.out.printf("|\t%10.6f\t|\t%10.6f\t|\n", xArray[xi], array1[i]);
                xi++;
            System.out.print(tableRowDelimiter);
            }
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("|\t%10.6f\t|\t%10.6f\t|\n", xArray[xi], array2[i]);
            xi++;
            System.out.print(tableRowDelimiter);
        }
    }
}
