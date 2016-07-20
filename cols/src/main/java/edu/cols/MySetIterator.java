/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cols;

import java.util.Iterator;

/**
 *
 * @author danecek
 */
public class MySetIterator implements Iterator<Integer> {
    
    MySet mySet;

    public MySetIterator(MySet mySet) {
        this.mySet = mySet;
    }

    int i = 0;

    @Override
    public boolean hasNext() {
        return i < mySet.size();
        //               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer next() {
        return null;//mySet.data[i++];
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
