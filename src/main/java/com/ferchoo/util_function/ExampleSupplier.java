package com.ferchoo.util_function;

import lombok.ToString;

import java.util.Random;
import java.util.function.Supplier;

public class ExampleSupplier {

    static Supplier<Integer> rnum = () -> new Random().nextInt(100);
    static Supplier<MyProd> ps = () -> new MyProd(100, "tv");

    public static void main(String[] args) {
        System.out.println(rnum.get());
        System.out.println(rnum.get());
        System.out.println(ps.get());
    }
}

@ToString
class MyProd {
    Integer price;
    String name;

    public MyProd(Integer price, String name) {
        this.price = price;
        this.name = name;
    }
}
