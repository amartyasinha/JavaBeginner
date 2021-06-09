import java.util.*; // can also use import java.util.Scanner and import java.util.Random together;

public class RockPaperScissor {
    public static void main(String[] args) {

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
//        char repeat;
        int round = 0;
        int comp = 0;
        int usr = 0;
        int draw = 0;

        System.out.println("It is a Rock, Paper, Scissor Game");
        System.out.print("Enter total number of rounds: ");
        int totalRound = sc.nextInt();

        do {
            round++;
            System.out.println("\n1 is Rock, 2 is Paper, 3 is Scissor");
            System.out.print("Enter your choice: ");
            int num = sc.nextInt();

            int x = 1;
            while (true) {
                x = rn.nextInt(4);
                if (x > 0) {
                    break;
                }
            }
            System.out.printf("Computer has chosen %d\n", x);

            if (num == x) {
                System.out.println("Draw");
                draw++;
            } else if (num == 1) {
                if (x == 2) {
                    System.out.println("Computer Wins");
                    comp++;
                }
                if (x == 3) {
                    System.out.println("User Wins");
                    usr++;
                }
            } else if (num == 2) {
                if (x == 1) {
                    System.out.println("User Wins");
                    usr++;
                }
                if (x == 3) {
                    System.out.println("Computer Wins");
                    comp++;
                }
            } else if (num == 3) {
                if (x == 1) {
                    System.out.println("Computer Wins");
                    comp++;
                }
                if (x == 2) {
                    System.out.println("User Wins");
                    usr++;
                }
            } else {
                System.out.println("Wrong Input");
            }

//            System.out.print("Do you want to Play Again? Y/N: ");
//            repeat = sc.next().charAt(0);
//        }while(repeat == 'Y' || repeat == 'y');
        }while(round<totalRound);

        System.out.println("Final Result: ");
        System.out.printf("User Won %d times\n", usr);
        System.out.printf("Computer Won %d times\n", comp);
        System.out.printf("Total Draw: %d times\n", draw);

        if (usr > comp) {
            System.out.println("User Won the Match!");
        } else if (comp > draw) {
            System.out.println("Computer Wont the Match!");
        } else {
            System.out.println("Match Draw!");
        }
    }
}
