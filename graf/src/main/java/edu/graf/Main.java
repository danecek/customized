/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.graf;

import static edu.graf.Barvy.B;
import java.awt.Color;
import java.util.Arrays;

/**
 *
 * @author danecek
 */
public class Main {

    public static void main(String[] args) {
//        System.out.println(Point.numPoints);
//        System.out.println(Point.isOrigin(Point.ORIGIN));
//
//        
//        System.out.println(new Point(1, 2));
//        ColorPoint cp = new ColorPoint(0, 0, Color.YELLOW);
//        System.out.println(cp);
//        cp.setColor(Color.BLUE);
//        System.out.println(Point.isOrigin(cp));
//        System.out.println(cp.isOrigin());
//        System.out.println(Point.numPoints);
//        int i = new Integer(5).intValue();
//        System.out.println("********************************8");
//        Barvy b = B;
//        b.ordinal();
//        System.out.println(Barvy.valueOf("B").ordinal());
//        System.out.println(Arrays.toString(Barvy.values()));
        MyStream ms = new MyStream(1,2,3);
        ms.forEach(System.out::println);
    }

}
