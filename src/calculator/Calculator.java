package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the Operation you want to Preform(+, -, *, /, %): ");
        char sign = sc.next().charAt(0);

        try {
            double ans = MathOperator.calculation(num1, sign, num2);
            System.out.println(ans);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thanks for using this Program!");
        }
    }
}
