package org.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Exercise 1: Hashset
        Restaurant rest1 = new Restaurant("Koku kitchen", 9);
        Restaurant rest2 = new Restaurant("Thai noodles", 8);
        Restaurant restCopy = new Restaurant("Koku kitchen", 9);
        Restaurant restCopyName = new Restaurant("Thai noodles", 4);

        HashSet<Restaurant> restaurants = new HashSet<>();
        restaurants.add(rest1);
        restaurants.add(rest2);
        restaurants.add(restCopy);
        restaurants.add(restCopyName);

        restaurants.forEach(x -> {
            System.out.println(x.toString());
        });

        System.out.println();

        // Exercise 2: Sorted by name: using TreeSet
        Set<Restaurant> sortedRestaurants = new TreeSet<>();
        sortedRestaurants.add(rest1);
        sortedRestaurants.add(rest2);
        sortedRestaurants.add(restCopy);
        sortedRestaurants.add(restCopyName);

        sortedRestaurants.forEach(x -> {
            System.out.println(x.toString());
        });
    }
}