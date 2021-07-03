package com.company;

public abstract class Shape {
    protected int wid, len;
    protected double sqr;

    @Override
    public String toString() {
        return "Size(in pixels): " + len + '\n' + wid + '\n';
    }
}
