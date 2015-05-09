/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Administrator
 */
public class WordCounter {
    
    public Map<String, Integer> countWordsInFile(File inputFile) throws IOException {
        
        Map<String, Integer> wordsMap = new TreeMap<>();
        
        try (BufferedReader reader = openFileForRead(inputFile, "UTF-8")) {
            String line;
        
            while((line = reader.readLine()) != null) {
                System.out.println(line);
                
                String[] words = line.trim().replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase().split("\\s+");
                
                for(String word : words) {
                    addWord(wordsMap, word);
                }
                
            }
        }
        
        return wordsMap;
    }

    private void addWord(Map<String, Integer> result, String word) {
        if(!word.isEmpty()) {
            if(result.containsKey(word)) {
                Integer wordCount = result.get(word);
                result.put(word, ++wordCount);
            } else {
                result.put(word, 1);
            }
        }
    }
    
    private BufferedReader openFileForRead(File file, String encoding) throws UnsupportedEncodingException {
        
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file), encoding));
            
            return reader;
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("Plik nie istnieje " + ex.getMessage(), ex);
        }
    }
    
}
