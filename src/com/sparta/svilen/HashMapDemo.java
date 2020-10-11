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
//        cards.put("4", 5);
//        cards.put("J", 10);
//        Printer.print(cards);

        //Method put() Overrides
//        cards.put("4", 4);
//        Printer.print(cards);

        //HashMap putIfAbsent() method
//        cards.putIfAbsent("J", 50); //Creates new key/value pair if it doesn't exist
//        Printer.print(cards);

        //HashMap replace() method
        //Replaces the value, when given the key
//        cards.replace("4", 8);

        //HashMap remove() method
//        cards.remove("3");
//        Printer.print(cards);

        //Copies all the data from an existing HashMap; putAll() method
//        cardsDummy.putAll(cards);
//        Printer.print(cardsDummy);

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

        // ---------- Datatype Conversion Functionality ----------

        //Returns a "Set" data structure with the same elements as the HashMap
//        Printer.print(cards.entrySet()); //Notice the brackets!

        //Returns a "Set" data structure view of the keys only
//        Printer.print(cards.keySet());

        //Returns a Collection view of the values in the HashMap
//        Printer.print(cards.values()); //Brackets again!

        // ---------- Advanced Methods ----------

        //Remap the values using compute() method (BiFunction); lambda operator
//        for (int i = 0; i < 2; i++) {
//            cards.compute("A", (key, value) -> (key.equals("A") && value == 10) ? 1 : 10);
//            Printer.print(cards);
//        }

        //Method computeIfAbsent() only requires a key as a parameter as the value is supposedly missing or null
//        cards.computeIfAbsent("Joker", (k) -> cards.get("A"));
//        Printer.print(cards);

        //Performs operation if value for the key is present
//        cards.computeIfPresent("Knight", (k, val) -> 500);
//        Printer.print(cards);

        //HashMap forEach() method
//        cards.forEach((key, value) -> System.out.println("The value of key '" + key + "' is... " + value)); //Pre-Sparta Global way
//        cards.forEach((k, val) -> Printer.printKeyValue(k, val)); //One step close to the pros
//        cards.forEach(Printer::printKeyValue); //How the pros do it

        //HashMap getOrDefault() method
//        Printer.print(cards.getOrDefault("Ace", 1)); //So you don't get NullPointerExceptions

        //HashMap merge() method
//        cardsDummy.putAll(cards);
//        cards.forEach((key, value) -> {
//            try {
//                Integer.parseInt(key);
//                cardsDummy.merge(
//                        key,
//                        value,
//                        (val, val2) //Due to both HashMaps being the same...
//                                -> val.equals(val2)
//                                ? val + val2
//                                : val);
//            } catch (Exception ignored){}
//        });
//        Printer.print(cards);
//        Printer.print(cardsDummy); //Expand at your own risk

        //HashMap replaceAll() method
//        cards.replaceAll((key, value) -> ++value); //Increment all values by 1
//        Printer.print(cards);

        //Extra
//        cards.replaceAll((key, value) -> value++); //This will not work as the value increments after it gets assigned

    }
}