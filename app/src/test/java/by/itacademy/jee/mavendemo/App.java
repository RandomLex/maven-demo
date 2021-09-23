package by.itacademy.jee.mavendemo;

/**
 * Calculator
 *
 */
public class App {

    private App() {
        //shouldn't be instantiated
    }

    public static void main( String[] args ) {
        System.out.println(sum(3, 4));
    }

    public static int sum(int a, int b) {
        return a + b;
    }


}
