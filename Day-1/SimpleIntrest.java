import java.util.*;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Value [P]: ");
        Float p = sc.nextFloat();
        System.out.print("Enter the Rate Value [R]: ");
        Float r = sc.nextFloat();
        System.out.print("Enter the Time Value [T]: ");
        Float t = sc.nextFloat();

        // logic part
        float simpleInterest = (p * r * t) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
