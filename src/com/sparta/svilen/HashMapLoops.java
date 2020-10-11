package com.sparta.svilen;

import java.util.HashMap;

public class HashMapLoops {
    
    public static void hashMapIteration(HashMap<String, Integer> theCards)
    {
        for (HashMap.Entry<String, Integer> entry : theCards.entrySet()) {
            Printer.valueOfKey(entry);
        }
    }

    public static void hashMapAddition(HashMap<String, Integer> theCards) {
        for (HashMap.Entry<String, Integer> entry : theCards.entrySet()) {
            Printer.valueOfKey(entry , 1);
        }
    }
}

/*
TODO: USE keySet()
for (String i : capitalCities.keySet()) {
        System.out.println(i);
    }
 */