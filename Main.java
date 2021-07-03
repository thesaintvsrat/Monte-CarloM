package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Figure f = new Figure();
        Canvas canvas = new Canvas();
        System.out.println("Canvas: \n" + canvas.toString());
        Scanner in = new Scanner(System.in);
        int count;
        double res;
        res = f.findsqr(canvas, 1);
        res = f.findsqr(canvas, 10);
        res = f.findsqr(canvas, 100);
        res = f.findsqr(canvas, 1000);
        res = f.findsqr(canvas, 10000);
    }
}