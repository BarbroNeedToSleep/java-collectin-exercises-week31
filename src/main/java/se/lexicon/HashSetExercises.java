package se.lexicon;

import java.util.*;

public class HashSetExercises {

    public static void ex5() {

        HashSet<String> weekdays = new HashSet<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println(weekdays);

    }

    public static void ex6(){

        HashSet<String> weekdays = new HashSet<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println(weekdays);

        ArrayList<String > days = new ArrayList<>(weekdays);
        System.out.println(days);

    }

    public static void ex7(){

        HashSet<String> numberNames = new HashSet<>(List.of("AOne", "BTwo", "CThree", "DFore"));
        System.out.println(numberNames);

        ArrayList<String > number = new ArrayList<>(numberNames);
        System.out.println(number);

        Collections.sort(number);
        System.out.println(number);


    }

    public static void ex8(){

        HashSet<String> numberNames = new HashSet<>(List.of("AOne", "BTwo", "CThree", "DFore"));
        System.out.println(numberNames);

        TreeSet<String> names = new TreeSet<>(numberNames);
        System.out.println(names);
    }
}
