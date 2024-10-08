import java.util.*;

public class Sumsubpro {
    // Summition/Substract/Product function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number/Integer Value: ");
        float a = sc.nextFloat();
        System.out.print("Enter Second Number/Integer Value: ");
        float b = sc.nextFloat();
        float sum = a + b;
        float sub = a - b;
        float pro = a * b;
        System.out.println("Total Sum: " + sum);
        System.out.println("Total Difference: " + sub);
        System.out.println("Total Product: " + pro);
    }
}
