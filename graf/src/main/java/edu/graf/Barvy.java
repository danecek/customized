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
public enum Barvy {
    R(1, 0, 0),
    G(0, 1, 0),
    B(0, 0, 1);

    int r;
    int g;
    int b;

    private Barvy(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

}
