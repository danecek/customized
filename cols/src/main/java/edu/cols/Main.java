/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cols;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author danecek
 */
public class Main {

    public static void main(String[] args) {
        MySet ms = new MySet();
        ms.add(2);
        ms.add(2);
        ms.add(3);
        System.out.println(ms);

        for (Iterator<Integer> it = ms.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        for (Integer i : ms)
            System.out.println(i);
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
