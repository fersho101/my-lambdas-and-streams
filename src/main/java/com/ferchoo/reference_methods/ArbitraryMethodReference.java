package com.ferchoo.reference_methods;

import java.util.function.BiPredicate;

public class ArbitraryMethodReference {
    public static void main(String[] args) {
//        BiPredicate<String, String> eq = (str1, str2) -> str1.equals(str2);
        BiPredicate<String, String> eq = String::equalsIgnoreCase;
        boolean isEq = eq.test("a", "e");
        System.out.println(isEq);
    }
}
