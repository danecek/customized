/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iostreams;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class Main {

    static void toUTF(String in, String out) throws IOException {
        try (
                BufferedReader fr = new BufferedReader(new FileReader(in));
                PrintWriter osw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(out),
                        Charset.forName("utf-8")))) {
            for (String l = fr.readLine(); l != null; l = fr.readLine()) {
                osw.println(l);
            }

        }
    }

    static void writeData(String bs, int... data) throws IOException {
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(bs))) {
            for (int d : data) {
                dos.writeInt(d);
            }
        }
    }

    static List<Integer> readData(String bs) throws IOException {
        List<Integer> d = new ArrayList<>();
        try (
                DataInputStream dos = new DataInputStream(new FileInputStream(bs))) {
            for (;;) {
                d.add(dos.readInt());
            }
        } catch (EOFException ex) {

        }
        return d;
    }

    static int chsum(String path) throws IOException {
        int cs = 0;
        try (FileInputStream fis = new FileInputStream(path)) {
            for (int i = fis.read(); i >= 0; i = fis.read()) {
                cs += i;
            }
        }
        return cs;
    }

    public static void main(String[] args) throws IOException {
        toUTF("pom.xml", "pom2.xml");
        writeData("cisla.bin", 1, 2, 3, 4);
        System.out.println(readData("cisla.bin"));
        try {
            System.out.println(chsum("pom.xml"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
