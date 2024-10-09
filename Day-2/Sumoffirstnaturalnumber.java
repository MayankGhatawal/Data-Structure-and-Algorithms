import java.util.*;

public class Sumoffirstnaturalnumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of First Natural");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of First Natural is: " + sum);
    }
}
