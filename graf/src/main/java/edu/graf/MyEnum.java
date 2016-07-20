/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.graf;

/**
 *
 * @author danecek
 */
public class MyEnum {
    
    public static final MyEnum ONE = new MyEnum(0);
    public static final MyEnum TWO = new MyEnum(1);
    public static final MyEnum THREE = new MyEnum(2);
    
    int ord;

    public MyEnum(int ord) {
        this.ord = ord;
    }
    
    
}
