/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr;

import java.io.File;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class WordCounterTest {

    public WordCounterTest() {
    }

    /**
     * Test of countWordsInFile method, of class WordCounter.
     */
    @Test
    public void testCountWordsInFile() throws Exception {

        WordCounter wc = new WordCounter();

        Map<String, Integer> res = wc.countWordsInFile(new File("alamakota.txt"));

        for (Map.Entry<String, Integer> entry : res.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
