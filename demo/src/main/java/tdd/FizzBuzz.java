package tdd;

/**
 * Hello world!
 *
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String calcFizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return "";
    }
}
