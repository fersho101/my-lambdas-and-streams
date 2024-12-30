package com.ferchoo.streams;

import com.ferchoo.util.Database;
import com.ferchoo.util.Videogame;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ConstructorsStreams {
    public static void main(String[] args) {
        Stream<Videogame> myStream = Database.videogames.stream();

        System.out.println(myStream);

        myStream.forEach(System.out::println);

        System.out.println("Arreglo tradicional");
        Integer[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Stream<Integer> integerStream = Arrays.stream(myArray);
        integerStream.forEach(System.out::println);

        System.out.println("___");
        Stream.of("Hola", "Mundo").forEach(System.out::println);

        System.out.println("___");
        DoubleStream myDoubleStream = DoubleStream.of(20.2, 20.4, 20.5);
        myDoubleStream.forEach(System.out::println);
    }

}
