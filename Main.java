import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("\n-------------------- Tic Tac Toe 3x3 & 5x5 --------------------\n");
    System.out.println("Press 3 To Play 3x3 Tic-Tac-Toe");
    System.out.println("Press 5 To Play 5x5 Tic-Tac-Toe");
    System.out.println("Press 0 To Exit Program");
    System.out.print("What's Your Choice?: ");
    Scanner in = new Scanner(System.in);
    int input = in.nextInt();
    if(input == 3) {Grid3x3.main(null);}
    if(input == 5) {Grid5x5.main(null);}
    if(input == 0) { System.out.println("Thanks For Playing This Crapp!..."); System.exit(0);}
    else{Main.main(null);}
  }
}