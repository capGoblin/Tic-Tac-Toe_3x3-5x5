import java.util.Scanner;
public class Grid3x3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Press 1 To Play Multiplayer in 3x3");
    System.out.println("Press 2 To Play With Computer in 3x3");
    System.out.println("Press 3 To Exit Program in 3x3");
    System.out.print("What's Your Choice?: ");
    int choice = in.nextInt();
    if (choice == 1) { ToPlayMultiplayer3x3.multiplayer();}
    else if (choice == 2) { ToPlayWithComputer3x3.Computer();}
    else if (choice == 3) { System.out.println("Thanks For Playing This Crapp!..."); System. exit(0);}
    else{Grid3x3.main(null);}
  }
}