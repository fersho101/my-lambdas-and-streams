package com.ferchoo.util_function;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class ExampleUnaryOperator {
    static Function<String, String> funToUpper = String::toUpperCase;
    static UnaryOperator<String> unaryToUpper = String::toUpperCase;

    static UnaryOperator<Integer> n = n -> n * n;
    static IntUnaryOperator m = n -> n * n;

    public static void main(String[] args) {
        String ars = "lambdas";

        System.out.println(funToUpper.apply(ars));
        System.out.println(unaryToUpper.apply(ars));
        System.out.println(n.apply(3));
        System.out.println(m.applyAsInt(5));
    }
}
