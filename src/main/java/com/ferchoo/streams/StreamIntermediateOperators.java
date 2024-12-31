package com.ferchoo.streams;

import com.ferchoo.util.BasicVideogame;
import com.ferchoo.util.Database;
import com.ferchoo.util.Review;
import com.ferchoo.util.Videogame;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperators {

    public static void main(String[] args) {
        Stream<Videogame> vds = Database.videogames.stream();

//        distinctOp(vds);
//        limitOp(vds);
//        skipOp(vds);
//        filterOp(vds);
//        mapOp(vds);
//        flatMapOp(vds);
//        mapVSFlatMapOps(vds);
//        peekOp(vds);
//        sortOp(vds);
//        takeWhileOp(vds);
        dropWhileOp(vds);
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

    static void mapOp(Stream<Videogame> st) {
        List<BasicVideogame> r = st
                .map(v -> {
                    return BasicVideogame.builder()
                            .name(v.getName())
                            .price(v.getPrice())
                            .console(v.getConsole())
                            .build();
                }).collect(Collectors.toList());

        r.forEach(System.out::println);

        List<String> titles = r.stream()
                .map(BasicVideogame::getName)
                .collect(Collectors.toList());
        titles.forEach(System.out::println);
    }

    static void flatMapOp(Stream<Videogame> st) {
        List<Review> r = st.flatMap(v -> v.getReviews().stream()).collect(Collectors.toList());
        System.out.println(r);
    }

    static void mapVSFlatMapOps(Stream<Videogame> st) {
//        var totalReviews = st.map(v -> v.getReviews().size()).collect(Collectors.toList());
        Long totalReviews = st.flatMap(v -> v.getReviews().stream()).count();
        System.out.println(totalReviews);
    }

    static void peekOp(Stream<Videogame> st) {
        st.peek(v -> v.setName("")).forEach(System.out::println);
    }

    static void sortOp(Stream<Videogame> st) {
        List<Videogame> listSorted = st
                .sorted(Comparator.comparingInt(v -> v.getReviews().size()))
                .collect(Collectors.toList());
//        System.out.println(listSorted);
        listSorted.forEach(System.out::println);
    }

    static void takeWhileOp(Stream<Videogame> st) {
        List<Videogame> r = st
                .sorted(Comparator.comparing(Videogame::getName))
                .takeWhile(v->!v.getName().startsWith("M"))
                .collect(Collectors.toList());
//        System.out.println(listSorted);
        r.forEach(System.out::println);
    }

    static void dropWhileOp(Stream<Videogame> st) {
        List<Videogame> r = st
                .sorted(Comparator.comparing(Videogame::getName))
                .dropWhile(v->!v.getName().startsWith("M"))
                .collect(Collectors.toList());
//        System.out.println(listSorted);
        r.forEach(System.out::println);
    }


}
