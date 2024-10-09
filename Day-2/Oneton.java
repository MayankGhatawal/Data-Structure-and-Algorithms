import java.util.*;

public class Oneton {
    public static void main(String[] args) {
        System.out.println("Welcome to the 1-n Number Counting");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int count = 0;
        while(count <= n){
            System.out.print(count+" ");
            count++;  // Increment the count by 1 each time
        }
        // System.out.println(count);
    }
}
