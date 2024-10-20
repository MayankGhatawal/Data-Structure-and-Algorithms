import java.util.*;

public class createCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float firstNumber = sc.nextFloat();
        float secondNumber = sc.nextFloat();
        String selectType = sc.nextLine();

        if (selectType.equalsIgnoreCase("add")) {
            System.out.println("Result: " + (firstNumber + secondNumber));
        }
        else if(selectType.equalsIgnoreCase("mul")){
            System.out.println("Result: " + (firstNumber * secondNumber));
        }
        else if(selectType.equalsIgnoreCase("sub")){
            System.out.println("Result: " + (firstNumber - secondNumber));
        }
        else if(selectType.equalsIgnoreCase("div")){
            if(secondNumber != 0){
                System.out.println("Result: " + (firstNumber / secondNumber));
            }
            else{
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
        }
    }

