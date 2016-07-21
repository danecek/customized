/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.concs;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class MyThread  extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; true; i++) {
         
            
            System.out.printf("%d. %s%n", i, this.getName());
            try {
                sleep(100);
            } catch (InterruptedException ex) {  }
        }
    }
    
    
    
}
