package se.lexicon;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExercises {

    public static void ex01() {

        ArrayList<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        System.out.println(weekdays);
    }

    public static void ex02(){

        ArrayList<String> weekdays = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        Iterator<String> iterator = weekdays.iterator();
        while (iterator.hasNext()){
            String days = iterator.next();
            System.out.println(days);

        }

    }

    public static void ex03(){

        ArrayList<String> weekdays = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday", "Friday", "Saturday", "Sunday"));
        System.out.println(weekdays);
        System.out.println(weekdays.size());

        weekdays.add(3,"Thursday");

        System.out.println(weekdays);
        System.out.println(weekdays.size());

    }

    public static void ex04(){

        ArrayList<String> weekdays = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println(weekdays);
        System.out.println(weekdays.size());

        ArrayList<String> startOfWeek = new ArrayList<>( weekdays.subList(0, 3 ));

        System.out.println(startOfWeek);
        System.out.println(startOfWeek.size());

    }
}
