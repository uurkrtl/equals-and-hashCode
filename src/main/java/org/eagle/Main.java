package org.eagle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(100L);
        Person person2 = new Person(100L);
        Person person3 = new Person(101L);
        Person person4 = new Person(102L);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        Set<Person> personSet = new HashSet<>();
        personSet.addAll(personList);

        System.out.println("List size: " + personList.size());
        System.out.println("Hash set size: " + personSet.size());
        System.out.println("Is firstPerson equals secondPerson: " + person1.equals(person2));
        System.out.println("Is firstPerson equals fourthPerson: " + person1.equals(person4));
    }
}