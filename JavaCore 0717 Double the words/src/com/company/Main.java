package com.company;

import sun.awt.windows.WPrinterJob;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*

0717 Double the words
1. Enter 10 words from the keyboard into the list of lines.
2. The doubleValues method should double the words according to the principle a, b, c -> a, a, b, b, c, c.
3. Display the result on the screen, each value from a new line.

Requirements:
1. Declare a variable like list of strings and immediately initialize ee.
2. Read 10 lines from the keyboard and add them to the list.
3. The doubleValues method should double the list elements according to the principle a, b, c -> a, a, b, b, c, c ..
4. Display the resulting list on the screen, each item on a new line.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i, list.get(i));
        }
        return list;
    }
}







