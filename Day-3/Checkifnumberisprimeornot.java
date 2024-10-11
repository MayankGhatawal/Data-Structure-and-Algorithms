import java.util.*;

public class Checkifnumberisprimeornot {
    public static void main(String[] args) {
        System.out.println("Check if number is prime or not");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= number-1; i++){
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
