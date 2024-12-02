package com.ferchoo.lambdas;

@FunctionalInterface
public interface Printer<T> {
    void print(T toPrint);
}
