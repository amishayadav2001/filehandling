package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "FileHandling.txt"; 
        
        try {
            int lines = 0;
            int characters = 0;
            int words = 0;
            
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\amisha.yadav\\Desktop\\FileHandling.txt"));
            
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
                words += countWords(line);
            }
            
            reader.close();
            
            System.out.println("Number of lines: " + lines);
            System.out.println("Number of characters: " + characters);
            System.out.println("Number of words: " + words);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
    
    private static int countWords(String line) {
        String[] words = line.split("\\s+");
        return words.length;
    }
}
