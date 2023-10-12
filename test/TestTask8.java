package com.example.task.test;

public class TestTask8 {
    //Составить программу, вычисляющую значения функции до тех пор, пока не
    //будет пройден нуль функции. Значения аргумента x должны составлять
    //возрастающую арифметическую програссию с заданным начальным членом
    //0.1 и разностью 0.1. Для того, чтобы не произошло зацикливания, установить
    //предел изменения аргумента x = 10.
   
    public static void main(String[] args) {
        double x;
        double step;
        double result;
        x = 0.1;
        step = 0.1;
       doTaskWithWhile();
       // doTaskWithFor();
    }
    public static void doTaskWithWhile(){
        while(x < 10 && result >= 0){
            result = Math.pow(x, 2) - Math.pow(Math.E, 2  * x) + 4;
            System.out.printf("x = %2.1f;  res = %3.2f\n", x ,result);
            x = x + step;
        }
    }
    public static void doTaskWithFor(){
        for(; x <=10; x = x + step){
            result = Math.pow(x, 2) - Math.pow(Math.E, 2  * x) + 4;
            System.out.printf("x = %2.1f;  f = %3.2f\n", x ,result);
            if(result < 0){
                break;
            }
        }
    }
}
