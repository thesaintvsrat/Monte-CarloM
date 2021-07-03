package com.company;

public class Figure extends Shape {
    Figure() {
        this.wid = this.len = 0;
    }

    Figure(int w, int l) {
        this.len = l;
        this.wid = w;
    }

    public double findsqr(Canvas canvas, int pcounter) {
        double res = 0.0;
        int count = 0;
        int i = 0;
        System.out.println("Pcounter: " + pcounter + '\n');
        Point p = new Point();
        while (i != pcounter) {
            p.randp(canvas);
            if ((p.getX() + p.getY() < 3) && (2 * p.getX() - 3 * p.getY() > 1) && (Math.pow(p.getX(), 2) + 1 < 5)) {
                ++count;
            }
            ++i;
        }
        System.out.println("Point in figure: " + count + '\n');
        res = canvas.getSqr() * ((double) count / pcounter);
        this.sqr = res;
        System.out.println("Findsqr: " + res + '\n');
        return res;
    }
}
