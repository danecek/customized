/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cols;

import edu.graf.Point;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author danecek
 */
public class Main {

    public static void main(String[] args) {

        Set<Point> pointSet = new TreeSet<>();//HashSet<>();
        Deque<Integer> fr = new ArrayDeque<>();//  LinkedList<>();
        fr.addFirst(1);
        fr.addLast(2);
        pointSet.add(new Point(1, 1));
        pointSet.add(new Point(3, 3));
        pointSet.add(new Point(2, 2));
        System.out.println(pointSet);

//        Map<String, Integer> cisla = new HashMap<>();
//        cisla.put("jedna", 1);
//        cisla.put("dva", 2);
//        System.out.println(cisla.get("dvax"));
//        for (String k : cisla.keySet()) {
//            System.out.println(k);
//            System.out.println(cisla.get(k));
//        }
//        for (Map.Entry<String, Integer> entry : cisla.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());            
//        }
//        MySet ms = new MySet();
//        ms.add(2);
//        ms.add(2);
//        ms.add(3);
//        System.out.println(ms);
//
//        for (Iterator<Integer> it = ms.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//        }
//        for (Integer i : ms)
//            System.out.println(i);
//        List<String> strs = new ArrayList<>();
//        strs.add("aaa");
//        strs.add("bbb");
//        for (String s : strs) {
//            System.out.println(s);
//        }
//        System.out.println(strs);
//        
//        for (Iterator<String> i = strs.iterator(); i.hasNext();) {
//            System.out.println(i.next());
//        }
        // strs.
    }
}
