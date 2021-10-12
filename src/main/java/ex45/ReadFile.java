/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class ReadFile{

    private ArrayList<String> list;
    private Scanner sc;

    public ReadFile() throws FileNotFoundException {

        list = new ArrayList<String>();

        File file = new File("src/main/java/ex45/exercise45_input");
        sc = new Scanner(file);
    }

    public void readile() {

        try
        {
            int i=0;
            while( sc.hasNext() )
            {

                String filedata = sc.nextLine();

                list.add(filedata);
            }
        }
        finally
        {
            sc.close();
        }
    }

    public ArrayList<String> getdata() {

        return list;

    }
}
