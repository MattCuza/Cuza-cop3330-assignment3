/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex46;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class PrintHistogram {

    private HashMap<String, Integer> map;

    public PrintHistogram( HashMap<String, Integer> map) {
        this.map = map;
    }

    public void printScreen() {

        String keys[] = new String[map.size()];

        Integer values[] = new Integer[map.size()];

        int k=0;

        for (Entry<String, Integer> entry : map.entrySet()) {
            keys[k] = entry.getKey();
            values[k++] = entry.getValue();
        }

        int tempvalues[] = new int[map.size()];

        String tempkeys[] = new String[map.size()];

        for(int i=0;i<values.length;i++) {
            tempvalues[i] = values[i];
        }

        Arrays.sort(values, Collections.reverseOrder());

        for(int i=0; i<map.size();i++) {

            int value = values[i];

            for(int j=0; j<tempvalues.length;j++) {

                if(value == tempvalues[j]) {

                    tempkeys[i] = keys[j];

                    break;
                }
            }
        }
        System.out.println();

        for(int i=0;i<map.size();i++) {

            int value = map.get(tempkeys[i]);

            System.out.print(tempkeys[i]+" : \t");

            for(int j=0; j<value; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}