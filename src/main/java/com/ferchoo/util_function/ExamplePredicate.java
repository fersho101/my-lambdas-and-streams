package com.ferchoo.util_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {

    static Predicate<Integer> isGreaterThan100 = n -> n > 100;
    static Predicate<Integer> isLessThan10 = n -> n < 10;
    static Predicate<Integer> isBetween10and100 = isGreaterThan100.or(isLessThan10);
    public static void main(String[] args) {
        List<Integer> numbs = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 50, 100, 150, 200));

//        numbs.removeIf(n -> n > 100);
        numbs.removeIf(isBetween10and100);
        System.out.println(numbs);
        numbs.removeIf(isBetween10and100.negate());
        System.out.println(numbs);
    }
}
