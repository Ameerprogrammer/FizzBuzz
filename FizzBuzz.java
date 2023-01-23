//Ameer Ahmed

//Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".

public class Program {
    public static String fizzBuzz(int n) {
        String output = "";
            if(n % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if(n % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(n % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                return Integer.toString(n);
            }
        return output;
    }
        public static void main (String[] args){
            fizzBuzz(15);
            fizzBuzz(3);
            fizzBuzz(5);
            fizzBuzz(2);
        }
    }
