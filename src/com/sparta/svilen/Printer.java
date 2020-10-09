package com.sparta.svilen;

import java.util.HashMap;

public class Printer {
    public static void print(Object object) {
        System.out.println(object);
    }

    public static void printInitialHashMap(HashMap<String, Integer> hashMap) {
        System.out.println("The initial HashMap looks like this: " + hashMap);
    }

    public static void printClonedHashMap(Object hashMapClone) {
        System.out.println("The cloned HashMap looks like this: " + hashMapClone);
    }
}
