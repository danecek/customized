/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author danecek
 */
public class MainStreams {

    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();
        Collections.addAll(li, 1, 2, 3, 4, 5);
        li.stream().forEach(System.out::println);
        new MyStream<>(li).map(e -> e * e).forEach(System.out::println);

        System.out.println("stream sum: " + new MyStream<>(li).reduce(0, (a, e) -> a + e));
        System.out.println("stream product: " + new MyStream<>(li).reduce(1, (a, e) -> a * e));

        List<Integer> rev = new ArrayList<>();
        System.out.println("stream reverse: " + new MyStream<>(li).<List<Integer>>reduce(rev, (a, e) -> {
            a.add(0, e);
            return a;
        }, null));
        Predicate<Person> allPilots
                = p -> p.getAge() >= 23 && p.getAge() <= 65;

        Predicate<Person> allPilots2
                = new Predicate<Person>() {
            @Override
            public boolean test(Person p) {
                return p.getAge() >= 23 && p.getAge() <= 65;
                //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };
        System.out.println(allPilots2.test(new Person(0)));

    }
}
