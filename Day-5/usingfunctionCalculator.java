import java.util.*;

public class usingfunctionCalculator {

    public static int calculateSum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static double calculateAverage(int firstNumber, int secondNumber){
        return (firstNumber + secondNumber) / 2.0;
    }
    public static float calculateMul(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
    public static float calculateDiv(int firstNumber, int secondNumber){
        if(secondNumber == 0){
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (float) firstNumber / secondNumber;
    }
    public static float calculateSub(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public static int calculateFactor(int firstNumber, int secondNumber){
        
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
            Scanner sc = new Scanner(System.in);
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
            System.out.println("Enter operation type (sum, sub, mul, avg, div): ");
            String value = sc.next();
        
            float result = 0;
            boolean validOperation = true;

        if (value.equals("sum")) {
            calculateSum(firstNumber, secondNumber);
        } else if(value.equals("sub")) {
            calculateSub(firstNumber, secondNumber);
        } else if (value.equals("mul")) {
            calculateMul(firstNumber, secondNumber);
        } else if (value.equals("avg")){
            calculateAverage(firstNumber, secondNumber);
        }
        else if (value.equals("div")){
            calculateDiv(firstNumber, secondNumber);
        } else if (value.equals("fact")){
            calculateFactor(firstNumber, secondNumber);
        }
        else {
            System.out.println("Invalid operation type.");
            validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }

        sc.close();

    }
}
