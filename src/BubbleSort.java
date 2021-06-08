import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("It is a Program to Preform Bubble Sort");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i<n; i++){
            System.out.printf("Enter element [%d]: ", i);
            array[i] = sc.nextInt();
        }

        System.out.print("Array you have entered is ");
        for (int i = 0; i<n; i++){
            if (i!=0) { System.out.print(", "); }
            System.out.print(array[i]);
        }

        int temp;

        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print("\nAll elements after Bubble Sort are ");
        for (int i = 0; i<n; i++){
            if (i!=0) { System.out.print(", "); }
            System.out.print(array[i]);
        }
    }
}
