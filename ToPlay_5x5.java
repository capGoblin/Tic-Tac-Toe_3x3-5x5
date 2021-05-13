import java.util.Scanner;

public class ToPlay_5x5 {
  private static final Scanner in = new Scanner(System.in);
  private static int choice;

  public static void main_play_5x5 () {
    var obj = new CheckPlayersTurn_5x5();

    var multi = new ToPlayMultiplayer_5x5(obj);
    var comp = new ToPlayWithComputer_5x5(obj);

    System.out.println();
    System.out.println("Press 1 To Play Multiplayer in 5x5");
    System.out.println("Press 2 To Play With Computer in 5x5");
    System.out.println("Press 3 To Go Back");
    System.out.println("Press 0 To Exit Program in 5x5");
    System.out.print("What's Your Choice?: ");
    choice = in.nextInt();
    if (choice == 1) { multi.multiplayer_5x5(Board_5x5.board, obj.in);}
    else if (choice == 2) { comp.Computer_5x5(Board_5x5.board, obj.in);}
    else if (choice == 3) {PrintChoices.printChoices();}
    else if (choice == 0) { System.out.println("Thanks For Playing This Crapp!..."); System.exit(0);}
    else{ToPlay_5x5.main_play_5x5();}
  }
}