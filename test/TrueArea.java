package com.example.task.test;

public class TrueArea {
    private int minX1 = -2;
    private int maxX1 = 0;
    private int minY1 = 0;
    private int maxY1 = 2;
    private int minX2 = -2;
    private int maxX2 = 0;
    private int minY2 = 0;
    private int maxY2 = 2;

    public TrueArea(int minX1, int maxX1, int minY1, int maxY1, int minX2, int maxX2, int minY2, int maxY2) {
        this.minX1 = minX1;
        this.maxX1 = maxX1;
        this.minY1 = minY1;
        this.maxY1 = maxY1;
        this.minX2 = minX2;
        this.maxX2 = maxX2;
        this.minY2 = minY2;
        this.maxY2 = maxY2;
    }

    public int getMinX1() {
        return minX1;
    }

    public int getMaxX1() {
        return maxX1;
    }

    public int getMinY1() {
        return minY1;
    }

    public int getMaxY1() {
        return maxY1;
    }

    public int getMinX2() {
        return minX2;
    }

    public int getMaxX2() {
        return maxX2;
    }

    public int getMinY2() {
        return minY2;
    }

    public int getMaxY2() {
        return maxY2;
    }

    public TrueArea() {
        this.minX1 = -2;
        this.maxX1 = 0;
        this.minY1 = 0;
        this.maxY1 = 2;
        this.minX2 = 0;
        this.maxX2 = 2;
        this.minY2 = -1;
        this.maxY2 = 1;
    }
}