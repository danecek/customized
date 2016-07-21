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
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(getClass().getName());
        }
    }
    
}
