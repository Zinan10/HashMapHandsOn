package com.sparta.svilen;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public void Start() {
        //HashMap Initialisation
        HashMap<String, Integer> cards = new HashMap<>(); //String and Integer parameters required

        //HashMap put() method
        cards.put("2", 2);
        cards.put("3", 3);
        cards.put("J", 10);

        Printer.print(cards);

        //Clear
        cards.clear();

        Printer.print(cards);

        //Adding data
        HashMapData.addCards(cards); //Passing in a reference to the object; Hence no return required

        Printer.print(cards);



    }
}

/*
    void clear(): Used to remove all mappings from a map.​

boolean containsKey(Object key): Used to return True if for a specified key, mapping is present in the map.​

boolean containsValue(Object value): Used to return true if one or more key is mapped to a specified value.​

Object clone(): It is used to return a shallow copy of the mentioned hash map.​

boolean isEmpty(): Used to check whether the map is empty or not. Returns true if the map is empty.​

Set entrySet(): It is used to return a set view of the hash map.​

Object get(Object key): It is used to retrieve or fetch the value mapped by a particular key.​

Set keySet(): It is used to return a set view of the keys.​

int size(): It is used to return the size of a map.​

Object put(Object key, Object value): It is used to insert a particular mapping of key-value pair into a map.​

putAll(Map M): It is used to copy all of the elements from one map into another.​

Object remove(Object key): It is used to remove the values for any particular key in the Map.​

Collection values(): It is used to return a Collection view of the values in the HashMap.​

​

for (String i : capitalCities.keySet()) {​
        System.out.println(i);​
    }
     */