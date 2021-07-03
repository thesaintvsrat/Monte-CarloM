package com.company;

public class Point {
    private double x, y;

    Point() {
        this.x = this.y = 0;
    }

    Point(int x1, int y1) {
        this.x = x1;
        this.y = y1;
    }

    @Override
    public String toString() {
        return "Point: " + this.x + ' ' + this.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void randp(Canvas canvas) {
        this.x = -2 + (double) (Math.random() * canvas.len);
        this.y = -2 + (double) (Math.random() * canvas.wid);
    }
}
