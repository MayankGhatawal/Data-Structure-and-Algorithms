import java.util.*;

public class Checkifnumberisprimeornot {
    public static void main(String[] args) {
        System.out.println("Check if number is prime or not");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number == number * 1 && number == 1 * number) {
            System.out.println("Number is prime : " + number);
        }else{
            System.out.println("Number is not prime");
        }
    }
}
