package com.ferchoo.util_function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExampleBinaryOperator {

    public static void main(String[] args) {
        BiFunction<String, String, String> normalizerFunc = (a, b) -> a.toUpperCase() + " - " + b.toLowerCase();
        BinaryOperator<String> normalizer = (a, b) -> a.toLowerCase() + " -- " + b.toUpperCase();
        System.out.println(normalizerFunc.apply("hola", "Mundo"));
        System.out.println(normalizer.apply("HOLA", "mundo"));
    }
}
