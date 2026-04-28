package Srcc.basics;

import java.util.*;

class ComparableStudent implements Comparable<ComparableStudent> {

    private int id;
    private String name;

    public ComparableStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(ComparableStudent o) {
        return Integer.compare(this.id, o.id); // sort by ID
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        List<ComparableStudent> list = new ArrayList<>();

        list.add(new ComparableStudent(5, "Rahul"));
        list.add(new ComparableStudent(2, "Suman"));
        list.add(new ComparableStudent(9, "Aditi"));

        Collections.sort(list);

        System.out.println(list);
    }
}