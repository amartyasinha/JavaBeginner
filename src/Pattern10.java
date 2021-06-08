//          *
//        *   *
//      *   *   *
//    *   *   *   *
//    *   *   *   *
//      *   *   *
//        *   * 
//          *
import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to Print Pattern");
        System.out.print("Enter n: ");

        int n = sc.nextInt();

        for (int i = 1; i<=(n/2); i++){
            for (int j = 1; j<=n; j++){
                System.out.print("  * ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("  * ");
            }
            for (int j = n; j>=i; j--){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}