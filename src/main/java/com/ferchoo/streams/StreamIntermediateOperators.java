package com.ferchoo.streams;

import com.ferchoo.util.Database;
import com.ferchoo.util.Videogame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperators {

    public static void main(String[] args) {
        Stream<Videogame> vds = Database.videogames.stream();

//        distinctOp(vds);
//        limitOp(vds);
//        skipOp(vds);
        filterOp(vds);

    }


    static void distinctOp(Stream<Videogame> st) {
        System.out.println(st.distinct().count());
    }

    static void limitOp(Stream<Videogame> st) {
        List<Videogame> r = st.limit(5).collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    static void skipOp(Stream<Videogame> st) {
        List<Videogame> r = st.skip(5).collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    static void filterOp(Stream<Videogame> st) {
        List<Videogame> r = st
                .filter(v -> v.getPrice() > 12.0)
                .filter(v -> !v.getIsDiscount())
                .filter(v -> v.getOfficialWebsite().contains("forza"))
                .collect(Collectors.toList());
        r.forEach(System.out::println);
    }
}
