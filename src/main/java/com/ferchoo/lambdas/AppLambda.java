package com.ferchoo.lambdas;

import java.util.List;

public class AppLambda {
    public static void main(String[] args) {
        List<String> countries = List.of("México", "Panama", "Chile", "Guatemala", "El Salvador", "Belice");

        for (String c : countries) {
            System.out.print(c + " * ");
        }
        System.out.println();

        countries.forEach(c -> System.out.print(c.toUpperCase() + " + "));
    }
}
