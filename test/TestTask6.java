package com.example.task.test;

import java.util.Random;

public class TestTask6 {
    //Целочисленная функция f(K) = K3 - 25K2 +50K+1000 определена только для
    //целых значений аргумента K. Составить программу вычисления значений
    //функции f(K) для 20 значений алгумента K в интервале (-30, 60) с выводом
    //лишь тех значений, которые удовлетворяют заданному условию, и подсчетом
    //количества остальных ее значений. В качестве начальных значений укажите
    //A=3*103, B=6*104 , M=4. Условие для определения выводимых значений f(K)

    public static void main(String[] args) {
        double t1;
        double t2;
        double t3;
        double t4;
        int[] kNums;
        int kSize;
        int intervalMin;
        int intervalMax;
        double[] trueValues;
        double[] falseValues;
    
        double a;
        double b;
        double m;
        
        init();
        initExtremums();
        getFx();
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);
        printIntArray(kNums);
        printArray("Значения соответствующие условию: ",trueValues);
        System.out.println();
        printArray("Значения не соответствующие условию: ",falseValues);
    }
    public static void init(){
        a = 3 * Math.pow(10, 3);
        b = 6 * Math.pow(10, 4);
        m = 4;
        intervalMin = 30;
        intervalMax = 60;
        kSize = 20;
        kNums = generateArr(kSize, intervalMin, intervalMax);
    }
    public static void initExtremums(){
        t1 = Math.sqrt(a + b + m);
        t2 = m * Math.sqrt(a + b);
        t3 = Math.sqrt(a * b * m);
        t4 = m * Math.sqrt(a * b);
    }
    public  static void getFx(){
        int trues = 0;
        int falses = 0;
        for(int i = 0; i < kSize; i++){
            int k = kNums[i];
            double result = Math.pow(k,3) - 25 * Math.pow(k, 2) + 50 * k + 1000;
            if(result > t1 && result < t2 || result > t3 && result < t4 ){
                trues++;
            }
            else{
                falses++;
            }
        }
        trueValues = new double[trues];
        falseValues = new double[falses];
        int t = 0;
        int f = 0;
        for(int i = 0; i < kSize; i++){
            int k = kNums[i];
            double result = Math.pow(k,3) - 25 * Math.pow(k, 2) + 50 * k + 1000;
            if(result > t1 && result < t2 || result > t3 && result < t4 ){
                trueValues[t] = result;
                t++;
            }
            else{
                falseValues[f] = result;
                f++;
            }
        }
    }

    public static int[] generateArr(int arraySize, int bound1, int bound2) {
        Random generator = new Random();
        int[] arr = new int[arraySize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(bound2 +bound1) - bound1;
        }
        return arr;
    }

    public static void printArray(String msg, double[] array) {
        System.out.println(msg);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.print('\n');
    }

    public static void printIntArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.print('\n');
    }
}
