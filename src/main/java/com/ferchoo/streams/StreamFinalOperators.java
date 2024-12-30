package com.ferchoo.streams;

import com.ferchoo.util.Database;
import com.ferchoo.util.Videogame;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFinalOperators {

    public static void main(String[] args) {
        Stream<Videogame> vg = Database.videogames.stream();
//        countOperator(vg);
//        forEachOperator(vg);
//        anyMatchOperator(vg);
//        allMatchOperator(vg);
//        noneMatchOperator(vg);
//        findFirstOperator(vg);
//        findAnyOperator(vg);
//        reduceOperator(vg);
//        maxOperator(vg);
        minOperator(vg);
    }

    static void countOperator(Stream<Videogame> stream) {
        System.out.println(stream.count());
    }

    static void forEachOperator(Stream<Videogame> stream) {
        stream.forEach(System.out::println);
    }

    static void anyMatchOperator(Stream<Videogame> stream) {
        boolean r = stream.anyMatch(v -> v.getTotalSold() > 1_000_000);
        System.out.println(r);
    }

    static void allMatchOperator(Stream<Videogame> stream) {
        boolean r = stream.allMatch(v -> v.getTotalSold() < 1_000_000);
        System.out.println(r);
    }

    static void noneMatchOperator(Stream<Videogame> stream) {
        boolean r = stream.noneMatch(v -> v.getReviews().isEmpty());
        System.out.println(r);
    }

    static void findFirstOperator(Stream<Videogame> stream) {
        Optional<Videogame> r = stream.findFirst();
//        System.out.println(r);
        System.out.println(r.isEmpty());
    }

    static void findAnyOperator(Stream<Videogame> stream) {
        Optional<Videogame> r = stream.findAny();
//        System.out.println(r);
        System.out.println(r.isEmpty());
    }

    static void reduceOperator(Stream<Videogame> stream) {
        Optional<Integer> r = stream
                .filter(Videogame::getIsDiscount)
                .map(Videogame::getTotalSold)
                .reduce(Integer::sum);
        System.out.println(r);
    }

    static void maxOperator(Stream<Videogame> stream) {
//        Optional<Videogame> r = stream.max((a,b)-> a.getName().compareTo(b.getName()));
        Optional<Videogame> r = stream.max(Comparator.comparing(Videogame::getName));
        System.out.println(r.get().getName());
    }

    static void minOperator(Stream<Videogame> stream) {
        Optional<Videogame> r = stream.min(Comparator.comparing(Videogame::getName));
        System.out.println(r.get().getName());
    }

}
