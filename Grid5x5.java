import java.util.Scanner;
public class Grid5x5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Press 1 To Play Multiplayer in 5x5");
    System.out.println("Press 2 To Play With Computer in 5x5");
    System.out.println("Press 3 To Exit Program in 5x5");
    System.out.print("What's Your Choice?: ");
    int choice = in.nextInt();
    if (choice == 1) { ToPlayMultiplayer5x5.multiplayer();}
    else if (choice == 2) { ToPlayWithComputer5x5.computer();}
    else if (choice == 3) { System.out.println("Thanks For Playing This Crapp!..."); System.exit(0);}
    else{Grid5x5.main(null);}
  }
}