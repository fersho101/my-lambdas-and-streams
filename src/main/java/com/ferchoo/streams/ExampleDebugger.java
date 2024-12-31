package com.ferchoo.streams;

import com.ferchoo.util.Database;
import com.ferchoo.util.Review;
import com.ferchoo.util.Videogame;

import java.util.Comparator;
import java.util.stream.Stream;

public class ExampleDebugger {
    public static void main(String[] args) {

        Stream<Videogame> vgs = Database.videogames.stream();

        var myArr = vgs
                .distinct()
                .sorted(Comparator.comparing(Videogame::getTotalSold))
                .flatMap(v -> v.getReviews().stream()
                        .map(Review::getComment))
                .filter(comm -> comm.contains("best"))
                .map("Good comment"::concat)
                .toArray();
        System.out.println(myArr);
    }
}
