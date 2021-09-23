package by.itacademy.jee.mavendemo;

import by.itacademy.jee.mavendemo.calc.Calculator;

import java.util.List;

/**
 * Calculator
 *
 */
public class App {

    private App() {
        //shouldn't be instantiated
    }

    public static void main( String[] args ) {
        System.out.println(Calculator.sum(List.of(7, 1, 4)));
    }

}
