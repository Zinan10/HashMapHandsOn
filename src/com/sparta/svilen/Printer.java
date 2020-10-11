package com.sparta.svilen;

import java.util.HashMap;
import java.util.Map;

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

    public static void printKeyValue(String key, Integer value) {
        System.out.println("The value for '" + key + "' is... " + value);
    }

    //Emmanuel
    public static void valueOfKey(Map.Entry<String, Integer> entry) {
        System.out.println(" The value of this key " + entry.getKey()+ " is " + entry.getValue());
    }

    public static void valueOfKey(Map.Entry<String, Integer> entry , int addUp) {
        System.out.println(" The value of the old key " + entry.getKey() + " + " + addUp + " is " + (entry.getValue() + addUp));
    }

    public static void print10Count(Map.Entry<String, Integer> entry) {
        System.out.println("The " + entry.getKey() + " card has a value of 10");
    }

    public static void printKeys(Map.Entry<String, Integer> entry) {
        System.out.println(" The " + entry.getValue() + " Value has a key of: " + entry.getKey());
    }
}
