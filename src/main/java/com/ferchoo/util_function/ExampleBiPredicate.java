package com.ferchoo.util_function;

import java.util.function.BiPredicate;

public class ExampleBiPredicate {
    static BiPredicate<String, String> myEquals = (s1, s2) -> s1.concat(s2).equalsIgnoreCase("HelloWorld");

    public static void main(String[] args) {
        String s1 = "HelloW";
        String s2 = "orld";
        System.out.println(myEquals.test(s1, s2));
    }
}
