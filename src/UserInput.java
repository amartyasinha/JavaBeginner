import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to take User Details");
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your age " + name + "?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Tell me your College name:");
        String college = sc.nextLine();
        System.out.println("Enter your contact no.: ");
        long contact = sc.nextLong();

        System.out.printf("Hello %S, you are %d years old.\nGlad that you are going to %s.\nI'll call you on %d when I'll be free.", name, age, college, contact);
        System.out.println("\n\nThanks for using this program!");
    }
}