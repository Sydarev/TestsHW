package org.example;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public BinaryOperator<Integer> divide = (x, y) -> {
        if (y == 0) return 0;
        else return x / y;
    };

    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> ads = x -> x > 0 ? x : x * (-1);

    public Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
