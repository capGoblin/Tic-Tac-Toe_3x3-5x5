import java.util.Scanner;

public class PrintChoices {
  private static final Scanner in = new Scanner(System.in);
  private static int input;

  public static void printChoices() {
    System.out.println();
    System.out.println("TIC-TAC-TOE 3x3 & 5x5");
    System.out.println("---------------------");
    System.out.println();
    System.out.println("Press 3 To Play 3x3 Tic-Tac-Toe");
    System.out.println("Press 5 To Play 5x5 Tic-Tac-Toe");
    System.out.println("Press 0 To Exit Program");
    System.out.print("What's Your Choice?: ");
    input = in.nextInt();
    if(input == 3) {ToPlay_3x3.main_play_3x3();}
    if(input == 5) {ToPlay_5x5.main_play_5x5();}
    if(input == 0) {System.out.println("Thanks For Playing This Crapp!..."); System.exit(0);}
    else{Main.main(null);}

  }
}