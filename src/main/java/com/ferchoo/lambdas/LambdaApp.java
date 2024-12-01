package com.ferchoo.lambdas;

public class LambdaApp {
    public static void main(String[] args) {

//        Math substract = new Math() {
//            @Override
//            public Double execute(Double a, Double b) {
//                return a - b;
//            }
//        };

        Math substract = (a, b) -> a -b;

        Math multiply = (a, b) -> a * b;

        Math divide = (a, b) -> {
            System.out.println("start");
            return a / b;
        };

        System.out.println(substract.execute(15.0, 5.0));
        System.out.println(multiply.execute(2.0, 4.0));
        System.out.println(divide.execute(10.0, 2.5));
        System.out.println(substract.sum(30.0, 2.0));

    }
}
