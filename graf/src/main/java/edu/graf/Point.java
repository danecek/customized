/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.graf;

//import java.lang.*;
/**
 *
 * @author danecek
 */
public class Point implements Comparable<Point> { //extends Object {

    static int numPoints = 0;

    private int x;
    private int y;

    int[] cislax = new int[10];

    {

    }

    {
        for (int i = 0; i < cislax.length; i++) {
            cisla[i] = i;

        }
    }

    static int[] cisla = new int[10];

    static {
        for (int i = 0; i < cisla.length; i++) {
            cisla[i] = i;

        }
    }

    public static final Point ORIGIN = new Point(0);

    public Point(int x) {
        this(x, 0);
    }

    public Point(int x, int yy) {
        // super();
        this.x = x;
        y = yy;
        numPoints++;
    }

    static boolean isOrigin(Point p) {
        //   return p.equals(ORIGIN);
        return p.isOrigin();
    }

    boolean isOrigin() {
        return this.equals(ORIGIN);
        // return Point.isOrigin(this);
    }

    @Override
    public int hashCode() {
        return this.getX() ^ this.getY();
    }

    @Override
    public boolean equals(Object obj) {
        // return this==obj;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        final Point other = (Point) obj;
        return compareTo(other) == 0;

//        
//        if (this.getX() != other.getX()) {
//            return false;
//        }
//        if (this.getY() != other.getY()) {
//            return false;
//        }
//        return true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public int compareTo(Point o) {
        if (x == o.x) {
            return y - o.y;
        }
        return x - o.x;
    }

}
