package com.sparta.svilen;

import java.util.HashMap;

public class HashMapLoops

{
    HashMapData hashmapdata = new HashMapData();
    
    public static void hashMapIteration(HashMap<String, Integer> theCards)
        
        
    {
        for (HashMap.Entry<String, Integer> entry : theCards.entrySet())

        {

            Printer.valueOfKey(entry);

        }
    }

    public static void hashMapaddition(HashMap<String, Integer> theCards)


    {
        
        for (HashMap.Entry<String, Integer> entry : theCards.entrySet())

        {

            Printer.valueOfKey(entry , 1);

        }
    }
}
