//Ameer Ahmed

public class fizzBuzz {
    public static String fizzBuzz(int n) {

        if(n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

        else if(n % 3 == 0) {
            return "Fizz";
        }
        else if(n % 5 == 0) {
            return "Buzz";
        }
            return n + "";
    }
    public static void main (String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(4));
    }
}
