import java.util.*;

public class IncomeTaxCalculator{
    public static void main(String[] args) {
        System.out.println("Welcome to Income Tax Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income");
        Float income = sc.nextFloat();

        if (income < 300000) {
            System.out.println("You are Free From Tax :)");
        } else if(income > 300000 && income < 1000000 ) {
            System.out.println("You paid 10% of tax of your Income :|");
        }
        else if(income > 1000000 && income < 4000000){
            System.out.println("You paid 20% of tax of your Income :/");
        }
        else{
            System.out.println("You paid 30% of tax of your Income :(");
        }
    }
}