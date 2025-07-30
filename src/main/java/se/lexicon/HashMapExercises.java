package se.lexicon;

import java.security.Key;
import java.util.HashMap;

public class HashMapExercises {

    public static void ex09(){

        HashMap<Integer, String> car = new HashMap<>();

        car.put(1, "volvo");
        car.put(2, "Saab");
        car.put(3, "Mercedes");

        System.out.println(car);

    }

    public static void ex10(){

        HashMap<Integer, String> car = new HashMap<>();

        car.put(1, "volvo");
        car.put(2, "Saab");
        car.put(3, "Mercedes");


        System.out.println(car.keySet());

    }

    public static void ex11(){

        HashMap<Integer, String> car = new HashMap<>();

        car.put(1, "volvo");
        car.put(2, "Saab");
        car.put(3, "Mercedes");


        System.out.println(car.values());

    }

}
