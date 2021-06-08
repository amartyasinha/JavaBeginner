import java.util.*; // can also use import java.util.Scanner and import java.util.Random together;

public class RockPaperScissor {
    public static void main(String[] args) {

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        char repeat;

        do{
            System.out.println("1 is Rock, 2 is Paper, 3 is Scissor");
            System.out.print("Enter your choice: ");
            int num = sc.nextInt();

            int x = 1;
            while(true){
                x = rn.nextInt(4);
                if(x > 0){ break; }
            }
            System.out.printf("Computer has chosen %d\n", x);

            if(num == x){ System.out.println("Draw"); }

            else if(num == 1){
                if (x == 2){ System.out.println("Computer Wins"); }
                if (x == 3){ System.out.println("User Wins"); }
            }

            else if(num == 2){
                if (x == 1){ System.out.println("User Wins"); }
                if (x == 3){ System.out.println("Computer Wins"); }
            }

            else if(num == 3){
                if (x == 1){ System.out.println("Computer Wins"); }
                if (x == 2){ System.out.println("User Wins"); }
            }

            else{ System.out.println("Wrong Input"); }

            System.out.print("Do you want to Play Again? Y/N: ");
            repeat = sc.next().charAt(0);
        }while(repeat == 'Y' || repeat == 'y');
    }
}
