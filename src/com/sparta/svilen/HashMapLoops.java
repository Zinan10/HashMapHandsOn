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

    public static void hashMap10Count(HashMap<String, Integer> theCards) {
        for (HashMap.Entry<String, Integer> entry : theCards.entrySet()) {
            if(entry.getValue().equals(10)) {
                Printer.print10Count(entry);
            }
        }
    }

    public static void hashMapKeyPrint(HashMap<String, Integer> theCards) {
        for (HashMap.Entry<String, Integer> entry : theCards.entrySet()) {
            Printer.printKeys(entry);
        }
    }

}