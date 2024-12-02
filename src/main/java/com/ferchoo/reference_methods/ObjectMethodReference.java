package com.ferchoo.reference_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectMethodReference {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(10);
        IntStream repeat = IntStream.range(1, 11);
//        repeat.forEach(i -> nums.add(i));
        repeat.forEach(nums::add);
        System.out.println(nums);
    }
}
