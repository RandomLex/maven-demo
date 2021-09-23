package by.itacademy.jee.mavendemo.calc;

import java.util.List;

public final class Calculator {

    private Calculator() {
        //preventing utility instantiation
    }

    public static int sum(List<Integer> ints) {
        return ints.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
