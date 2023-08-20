package com.example.task.test;

import static java.lang.Math.*;

public class TestTask7 {
    //Составить программу вычисления таблицы значений заданной функции для
    //N значений X, меняющихся от Xнач c заданных шагом HX, и M зачений для Z,
    //меняющихся от Zнач  с шагом HZ.
    public  static int n;
    public  static int m;
    public  static double x;
    public  static double z;
    public  static double hx;
    public  static double hz;
    public  static double[] zets;
    public  static double[] exes;
    public  static double[][] mtx;


    public static void main(String[] args) {
        init();
        solveProblem();
        printMtxD();
    }
    public  static  void init()
    {
        n = 10;
        m = 8;
        x = 10.3;
        z = 8.1;
        hx = 4.5;
        hz = 6.2;
        exes = new double[n];
        zets = new double[m];
        mtx = new double[n][m];

    }

    public static void solveProblem(){
        for(int i = 0; i < exes.length; i++){
            double _z = z;
            for(int j = 0; j < zets.length; j++){
                mtx[i][j] = (sqrt(pow(_z, 2) + pow(x, 2))) * log(_z) + abs(log(_z)) / (sqrt(pow(x, 2) - pow(_z, 2)) + 3.2);
                if(i == 0){zets[j] = _z;}
                _z = _z + hz;
            }
            exes[i] = x;

            x = x + hx;

        }
    }

    public static void printMtxD() {
        String tableRowDelimiter = ("-----------+");
        System.out.print("+" + tableRowDelimiter);
        printDelim(zets.length);
        System.out.printf("|\t%6s\t|","x\\z");

        for (int i = 0; i < zets.length; i++) {

            System.out.printf("\t%6.2f\t|", zets[i]);

        }
        System.out.print('\n');
        System.out.print("+" + tableRowDelimiter);
        printDelim(zets.length);

        for(int i = 0; i < mtx.length; i++){
            System.out.printf("|\t%6.2f\t|",exes[i]);

            for(int j = 0; j < mtx[i].length; j++){
                System.out.printf("\t%6.2f\t|", mtx[i][j]);
            }
            System.out.print('\n');
            System.out.print("+" + tableRowDelimiter);
            printDelim(zets.length);
        }
    }
    public static void printDelim(int len){
        String tableRowDelimiter = ("-----------+");
        for (int d = 0; d < zets.length; d++) {
            System.out.print(tableRowDelimiter);
        }
        System.out.print('\n');
    }
}