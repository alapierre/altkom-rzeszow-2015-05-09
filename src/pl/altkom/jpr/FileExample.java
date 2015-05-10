/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class FileExample {

    public static void main(String[] args) {

        longVersion();
    }

    private static void longVersion() throws RuntimeException {
        File file = new File("alamakota.txt");

        System.out.println(file.exists());

        try {
            file.createNewFile();
        } catch (IOException ex) {
            //System.out.println("nie udało się utworzyć pliku");
            //System.exit(1);
            throw new RuntimeException("nie udało się utworzyć pliku");
        }

        FileWriter writter = null;

        try {

            writter = new FileWriter(file);
            writter.append("ala ma kota a kot ma ale");

        } catch (IOException ex) {
            throw new RuntimeException("nie udało się pisać do pliku");
        } finally {
            try {
                if (writter != null) {
                    writter.close();
                }
            } catch (IOException ex) {

            }
        }
    }

    private static void shortVersion() throws RuntimeException {

        File file = new File("alamakota.txt");

        System.out.println(file.exists());

        try {
            file.createNewFile();
        } catch (IOException ex) {
            //System.out.println("nie udało się utworzyć pliku");
            //System.exit(1);
            throw new RuntimeException("nie udało się utworzyć pliku");
        }

        try (FileWriter writter = new FileWriter(file)) {

            writter.append("ala ma kota a kot ma ale");

        } catch (IOException ex) {
            throw new RuntimeException("nie udało się pisać do pliku");
        }
    }

}
