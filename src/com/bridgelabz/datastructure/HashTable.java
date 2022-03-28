package com.bridgelabz.datastructure;

import  java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> marks = new Hashtable<>();

        // Put names and marks in the hash table
        marks.put("Vivansh",65);
        marks.put("Atul",80);
        marks.put("Sunil",90);
        marks.put("RK",75);
        marks.put("Sanket",70);
        marks.put("Swapnil",60);


        System.out.println("=========================================================");
        System.out.println("The Student marks hash table:  \n" + marks + "\n\n");

        String maxKey = "";
        int maxMark = 0;
        for (String key : marks.keySet()){
            // for all keys in the keyset
            if (maxMark < marks.get(key)){
                maxKey = key;
                maxMark = marks.get(key);
            }
        }
        System.out.println("=========================================================");
        System.out.println("The Student " + maxKey + " got highest marks, marks: " + maxMark);
    }
}
