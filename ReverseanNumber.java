import java.util.*;

public class ReverseanNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse an Number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Number");
        int num = sc.nextInt();

        int reverse = 0;
        while (num > 0) {
            int remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;
        }
        System.out.println("The Reverse of the Number is: " + reverse);
    }
}
