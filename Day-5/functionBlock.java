import java.util.Scanner;

public class functionBlock {

    public static int calculateSum(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int sum = calculateSum(firstNumber, secondNumber);
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}
