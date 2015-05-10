/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Administrator
 */
public class PropEx {

    public static void main(String[] args) throws IOException {
        Properties p = System.getProperties();

        for (Object key : p.keySet()) {

            System.out.println(key + " -> " + p.get(key));

        }

        File f = File.createTempFile("mojplik", ".txt");
        f.deleteOnExit();
        System.out.println(f);

    }

}
