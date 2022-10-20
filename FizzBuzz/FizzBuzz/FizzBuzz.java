public class FizzBuzz
{
    public static void main(String[] args) {
        double b;
        double c;
        
        for (int a = 0; a <= 100; a++) {
            b = (double) a / 3;
            c = (double) a / 5;
            if (Math.round(b) == b && Math.round(c) == c) {
                System.out.println("FizzBuzz");
            } else if (Math.round(b) == b) {
                System.out.println("Fizz");
            } else if (Math.round(c) == c) {
                System.out.println("Buzz");
            } else {
            System.out.println(a);
        }
    }
    }
}