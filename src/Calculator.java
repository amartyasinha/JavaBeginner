import java.util.Scanner;

class DivideByZero extends Exception{
    public DivideByZero(){
        super("Cannot Divide by Zero\n");
    }
}

class DivideByNeg extends Exception{
    public DivideByNeg(){
        super("Cannot Divide by Negative num\n");
    }
}

class BadOperator extends Exception{
    public BadOperator(){
        super("Wrong Operator Choice\n");
    }
}
public class Calculator {
    static double calculation(double num1, char sign, double num2) throws DivideByZero, DivideByNeg, BadOperator {
        double result;

        switch (sign){
            case '+' -> {
                result = num1 + num2;
            }
            case '-' -> {
                result = num1 - num2;
            }
            case '*' -> {
                result = num1 * num2;
            }
            case '/' -> {
                if (num2 == 0)
                    throw new DivideByZero();
                if (num2 < 0)
                    throw new DivideByNeg();
                result = num1 / num2;
            }
            case '%' -> {
                result = num1 % num2;
            }
            default -> throw new BadOperator();
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the Operation you want to Preform(+, -, *, /, %): ");
        char sign = sc.next().charAt(0);

        try {
            double ans = calculation(num1, sign, num2);
            System.out.println(ans);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thanks for using this Program!");
        }
    }
}