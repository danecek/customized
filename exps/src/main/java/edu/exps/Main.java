/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.exps;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    static int mp(String n) throws Exception {
        try {
            return Integer.parseInt(n);
        } catch (NumberFormatException nfe) {
            LOG.log(Level.SEVERE, null, nfe);
            throw nfe;
        //    throw new Exception(nfe);
        }
    }

    public static void main(String[] args) throws Exception {
        assert args.length>1;
        int i = mp(args[0]);
        System.out.println(i * i);
    }
}
