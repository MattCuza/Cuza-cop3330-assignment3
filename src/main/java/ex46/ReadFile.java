/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadFile {

    private Scanner sc;
    private File file;
    private HashMap<String, Integer> map;

    public ReadFile() throws FileNotFoundException {

        file = new File("src/main/java/ex46/exercise46_input");
        sc = new Scanner(file);
        map = new HashMap<String,Integer>();

    }

    public void readfile() {
        try
        {
            while( sc.hasNext() )
            {

                String input = sc.nextLine();

                String arr[] = input.split(" ");

                for(int i=0;i<arr.length;i++) {
                    String key = arr[i];

                    if(map.containsKey(key)) {
                        int value = map.get(key);

                        value++;

                        map.put(key, value);
                    }
                    else {
                        map.put(key, 1);
                    }
                }
            }
        }
        finally
        {
            sc.close();
        }
    }

    public HashMap<String, Integer> getMap(){
        return map;
    }
}