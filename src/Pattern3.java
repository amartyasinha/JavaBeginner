//4  4  4  4
//3  3  3
//2  2
//1
//1
//2  2
//3  3  3
//4  4  4  4
import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to Print Pattern");
        System.out.print("Enter n: ");

        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            for (int j = n; j>=i; j--){
                System.out.print((n-i+1) + "  ");
            }
            System.out.println();
        }

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}