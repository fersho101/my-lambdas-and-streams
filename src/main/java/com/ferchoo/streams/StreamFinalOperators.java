package com.ferchoo.streams;

import com.ferchoo.util.Database;
import com.ferchoo.util.Videogame;

import java.util.stream.Stream;

public class StreamFinalOperators {

    public static void main(String[] args) {
        Stream<Videogame> vg = Database.videogames.stream();
//        countOperator(vg);
        forEachOperator(vg);
    }

    static void countOperator(Stream<Videogame> stream) {
        System.out.println(stream.count());
    }

    static void forEachOperator(Stream<Videogame> stream) {
        stream.forEach(System.out::println);
    }

}
