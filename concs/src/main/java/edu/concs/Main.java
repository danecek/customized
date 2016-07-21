/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.concs;

import java.util.concurrent.Semaphore;

/**
 *
 * @author danecek
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        new Thread(new MyRunnable()).start();
        MyThread v1 = new MyThread("Tom");
        v1.start();
        v1.join();
        new MyThread("Bob").start();
        new MyThread("Greg").start();
        MyMutex m = new MyMutex();
        try (
                MyMutex mm = m) {
            m.lock();
        }
        // m.unlock();

        Semaphore s = new Semaphore(1);
        try {
            s.acquire();
        } finally {
            s.release();
        }

    }
}
