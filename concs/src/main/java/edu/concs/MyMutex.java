/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.concs;

/**
 *
 * @author danecek
 */
public class MyMutex implements AutoCloseable {
    
    boolean locked = false;
    
    synchronized void lock() throws InterruptedException {
        if (locked) wait();
        locked = true;
    }
    
    synchronized void unlock() {
        locked = false;
        notify();        
    }

    @Override
    public void close() throws Exception {
        unlock();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
