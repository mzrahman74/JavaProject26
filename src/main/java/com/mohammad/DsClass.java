package com.mohammad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DsClass {
    public static void main(String[] args){

    }
    /*
    An ArrayList is a resizable array that can grow as needed.
     */
    public static void method_one() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
    System.out.println(cars);
    }
    /*
    HashSet is a collection where every element is unique and no duplicates are allowed.
     */
    public static void method_two() {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
    System.out.println(cars);
    }
    /*
    HashMap stores key-value pairs which are great when you want to store values and find them by key and value
     */
    public static void method_three() {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
    System.out.println(capitalCities);
    }
}
