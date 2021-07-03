package com.company;

public class Canvas extends Shape {

    Canvas() {
        this.wid = 5;
        this.len = 2;
        this.sqr = this.len * this.wid;
    }

    public double getSqr() {
        return this.sqr;
    }

    @Override
    public String toString() {
        return super.toString() + this.sqr + '\n';
    }
}