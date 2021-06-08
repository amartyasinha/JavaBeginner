import java.util.Scanner;

class MyException extends Exception{

    public MyException(String s){
        super(s);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to divide two numbers (with Exception Handling)");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int c;

        try {
            if (b == 0)
                throw new MyException("Cannot Divide by Zero");
            c = a/b;
            System.out.println("The result is "+c);

        } catch (MyException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thanks for using this Program with Exception Handling");
        }
    }
}
