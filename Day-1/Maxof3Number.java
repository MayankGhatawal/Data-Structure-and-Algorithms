import java.util.*;

public class Maxof3Number {
    public static void main(String[] args) {
        System.out.println("Welcome to Get Your Largest Number of Given 3 Number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        Float a = sc.nextFloat();
        System.out.print("Enter the Second Number: ");
        Float b = sc.nextFloat();
        System.out.print("Enter the Third Number: ");
        Float c = sc.nextFloat();

        if (a > b) {
            System.out.println(a);
        }
        else if (c > a){
            System.out.println(c);
        }
        else{
            System.out.println(b);
        }
    }
}
