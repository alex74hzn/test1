package com.example.task.test;

import java.util.Random;

public class TestTask4 {
    public static Point[] points;
    public static Point[] truePoints;
    public static Point[] wrongPoints;

    public static void main(String[] args) {
        int size = 10;

        points = new Point[size];
        int[] arrayBound = new int[] {-3, 3};
        double[] arrX = generateArr(size, arrayBound);
        double[] arrY = generateArr(size, arrayBound);

        // или так:
        //double[] arrX = new double[]{-1.8, 1.9, 3.2, 0.8};
        //double[] arrY = new double[]{0.3, 3.5, 2.2, -0.6};

        checkPoints(arrX,arrY);
        printResult();
    }

    public static void checkPoints(double[] arrX,double[] arrY){
        TrueArea ta = new TrueArea();
        int tPoints = 0;
        int wPoints = 0;
        for(int i = 0; i < arrX.length; i++){
            Point point = new Point(arrX[i], arrY[i]);
            if(point.getX() > ta.getMinX1() && point.getX() < ta.getMaxX1() &&
                    point.getY() > ta.getMinY1() && point.getY() < ta.getMaxY2() ||
                    point.getX() > ta.getMinX2() && point.getX() < ta.getMaxX2() &&
                            point.getY() > ta.getMinY2() && point.getY() < ta.getMaxY2())
            {
                tPoints++;
            }
            else{
                wPoints++;

            }
        }

        truePoints = new Point[tPoints];
        wrongPoints = new Point[wPoints];
        int t = 0;
        int w = 0;
        for(int j = 0; j < arrX.length; j++){
            points[j] = new Point(arrX[j], arrY[j]);
            if(points[j].getX() > ta.getMinX1() && points[j].getX() < ta.getMaxX1() &&
                points[j].getY() > ta.getMinY1() && points[j].getY() < ta.getMaxY2() ||
                points[j].getX() > ta.getMinX2() && points[j].getX() < ta.getMaxX2() &&
                points[j].getY() > ta.getMinY2() && points[j].getY() < ta.getMaxY2() )
            {
                truePoints[t] = new Point(points[j].getX(), points[j].getY());
                t++;
            }
            else{

                wrongPoints[w] = new Point(points[j].getX(), points[j].getY());
                w++;

            }

        }
    }

    public static double[] generateArr(int arraySize, int[] bound) {

        Random generator = new Random();
        double[] arr = new double[arraySize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextDouble(bound[0],bound[1]);
        }
        return arr;
    }

    public static void printResult(){
        if(points.length > 0){
            System.out.print("Points : ");
            for (Point p:points) {

                System.out.printf("[ %2.1f,%2.1f ]", p.getX(),p.getY());

            }
            System.out.print('\n');
        }
        else{
            System.out.println("Points are empty! ");
        }
        if(truePoints.length > 0){
            System.out.print("truePoints : ");
            for (Point p:truePoints) {

                System.out.printf("[ %2.1f; %2.1f ]", p.getX(),p.getY());

            }
            System.out.print('\n');
        }
        else{
            System.out.println("truePoints are empty! ");
        }
        if(wrongPoints.length > 0){
            System.out.print("wrongPoints : ");
            for (Point p:wrongPoints) {

                System.out.printf("[ %2.1f; %2.1f ]", p.getX(),p.getY());

            }
            System.out.print('\n');
        }
        else{
            System.out.println("wrongPoints are empty! ");
        }
    }
}