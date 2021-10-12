/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex45;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFinder {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the output file : ");
        String outputfile = s.next();

        ReadFile rf = new ReadFile();

        rf.readile();

        ArrayList<String> list = rf.getdata();

        WriteFile wr = new WriteFile(outputfile, list);

        wr.writefile();

        System.out.println("\nThe Number of Modifications are : "+wr.getModification());
    }
}