import java.util.Scanner;

public class ToPlay_3x3 {
  private static final Scanner in = new Scanner(System.in);
  private static int choice;

  public static void main_play_3x3 () {
    var obj = new CheckPlayersTurn_3x3();

    var multi = new ToPlayMultiplayer_3x3(obj);
    var comp = new ToPlayWithComputer_3x3(obj); 

    System.out.println();
    System.out.println("Press 1 To Play Multiplayer in 3x3");
    System.out.println("Press 2 To Play With Computer in 3x3");
    System.out.println("Press 3 To Go Back");
    System.out.println("Press 0 To Exit Program in 3x3");
    System.out.print("What's Your Choice?: ");
    choice = in.nextInt();
    if (choice == 1) { multi.multiplayer_3x3(Board_3x3.board, obj.in);}
    else if (choice == 2) { comp.Computer_3x3(Board_3x3.board, obj.in);}
    else if (choice == 3) {PrintChoices.printChoices();}
    else if (choice == 0) { System.out.println("Thanks For Playing This Crapp!..."); System.exit(0);}
    else{ToPlay_3x3.main_play_3x3();}      
  }
}