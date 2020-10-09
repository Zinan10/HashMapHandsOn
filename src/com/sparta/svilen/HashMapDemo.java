package com.sparta.svilen;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public void Start() {
        //HashMap Initialisation
        HashMap<String, Integer> cards = new HashMap<>(); //String and Integer parameters required
        HashMap<String, Integer> cardsDummy = new HashMap<>();

        //HashMap put() method
        //Adds data into the HashMap
//        cards.put("2", 2);
//        cards.put("3", 3);
//        cards.put("J", 10);

//        Printer.print(cards);

        //Copies all the data from an existing HashMap
        cardsDummy.putAll(cards);
        Printer.print(cardsDummy);

        //Hashmap clear() method
        //Removes every item inside the HashMap
//        cards.clear();

        //HashMap isEmpty() method
//        Printer.print(cards.isEmpty());

//        Printer.print(cards);

        //Add all data
        HashMapData.addCards(cards); //Passing in a reference to the object; Hence no return required
//        Printer.print(cards); //Displaying what's added

        //Returns the size of the HashMap
//        Printer.print(cards.size());

        //HashMap get() method
        //Uses KEY as argument; Returns value
//        Printer.print(cards.get("K"));

        //HashMap containsKey() method
        //Returns true if one or more key is mapped to a specified key; false if not
//        Printer.print(cards.containsKey("k")); //Returns? (show data)
//        Printer.print(cards.containsKey("5")); //Returns?

        //HashMap containsValue() method
        //Return true if one or more values is mapped to a specified value; false if not
//        Printer.print(cards.containsValue("5")); //Returns? (change)

        //Displaying the HashMap
//        Printer.printInitialHashMap(cards);

        //Displaying the cloned HashMap
//        Printer.printClonedHashMap(cards.clone());

        // ---------- Set functionality ----------
        //Returns a "Set" data structure with the same elements as the HashMap
//        Printer.print(cards.entrySet()); //Notice the brackets!

        //Returns a set view of the keys
//        Printer.print(cards.keySet());





    }
}

/*

putAll(Map M): It is used to copy all of the elements from one map into another.​

Object remove(Object key): It is used to remove the values for any particular key in the Map.​

Collection values(): It is used to return a Collection view of the values in the HashMap.​

​

for (String i : capitalCities.keySet()) {​
        System.out.println(i);​
    }
     */