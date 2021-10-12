/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex46;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class WordFreqFinder {

    public static void main(String[] args) throws FileNotFoundException {

        ReadFile rf = new ReadFile();

        rf.readfile();

        HashMap<String, Integer> map = rf.getMap();

        PrintHistogram pr = new PrintHistogram(map);

        pr.printScreen();
    }
}