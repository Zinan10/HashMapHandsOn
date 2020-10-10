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
        cards.put("2", 2);
        cards.put("3", 3);
        cards.put("4", 4);
        cards.put("J", 10);

        Printer.print(cards);

        //HashMap replace() method
        //Replaces the value, when given the key
//        cards.replace("4", 8);

        //HashMap remove() method
        cards.remove("3");

        Printer.print(cards);

        //Copies all the data from an existing HashMap
//        cardsDummy.putAll(cards);
//        Printer.print(cardsDummy);

        //Hashmap clear() method
        //Removes every item inside the HashMap
        cards.clear();

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

        //Returns a Collection view of the values in the HashMap
//        Printer.print(cards.values()); //Brackets again!



    }
}

/*

compute(K key, BiFunction<K, V> remappingFunction): This method Attempts to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).

computeIfAbsent(K key, Function<K> mappingFunction): This method If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null.​

computeIfPresent(K key, BiFunction<K, V> remappingFunction): This method If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.​

forEach(BiConsumer<K, V> action): This method Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.​

getOrDefault(Object key, V defaultValue): This method returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.​

merge(K key, V value, BiFunction<K, V> remappingFunction): This method If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.​

putIfAbsent(K key, V value): This method If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.​

replaceAll(BiFunction<K, V> function): This method replaces each entry’s value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.

     */