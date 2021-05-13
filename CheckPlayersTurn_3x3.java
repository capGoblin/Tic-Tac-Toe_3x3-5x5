import java.util.Scanner;
import java.util.Random;

public class CheckPlayersTurn_3x3 extends CheckWinner_3x3 {
  public final Scanner in = new Scanner(System.in);
  private Random rand = new Random();
   
  public void firstPlayerTurn(char[][] board, Scanner in) {
    System.out.print("First Player's Turn (1 - 9): ");
    int input = in.nextInt();
    switch(input) {
      case 1:
      if(board[0][0]== ' ') {
        board[0][0] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 2:
      if(board[0][1]== ' ') {
        board[0][1] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 3:
      if(board[0][2]== ' ') {
        board[0][2] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 4:
      if(board[1][0]== ' ') {
        board[1][0] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 5:
      if(board[1][1]== ' ') {
        board[1][1] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 6:
      if(board[1][2]== ' ') {
        board[1][2] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 7:
      if(board[2][0]== ' ') {
        board[2][0] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 8:
      if(board[2][1]== ' ') {
        board[2][1] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 9:
      if(board[2][2]== ' ') {
        board[2][2] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
    }
  } 

  public void secondPlayerTurn(char[][] board, Scanner in) {
    System.out.print("Second Player's Turn (1 - 9): ");
    int input = in.nextInt();
    switch(input) {
      case 1:
      if(board[0][0]== ' ') {
        board[0][0] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 2:
      if(board[0][1]== ' ') {
        board[0][1] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 3:
      if(board[0][2]== ' ') {
        board[0][2] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 4:
      if(board[1][0]== ' ') {
        board[1][0] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 5:
      if(board[1][1]== ' ') {
        board[1][1] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 6:
      if(board[1][2]== ' ') {
        board[1][2] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 7:
      if(board[2][0]== ' ') {
        board[2][0] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 8:
      if(board[2][1]== ' ') {
        board[2][1] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 9:
      if(board[2][2]== ' ') {
        board[2][2] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;      
    }
  }   

  public void computerTurn(char[][] board) {
    
    int input = rand.nextInt(9) + 1;
    switch(input) {
      case 1:
      if(board[0][0] == ' ') {
        board[0][0] ='O';
      } else {computerTurn(board);} 
      break;
      case 2:
      if(board[0][1] == ' ') {
        board[0][1] ='O';
      } else {computerTurn(board);}
      break;
      case 3:
      if(board[0][2] == ' ') {
        board[0][2] ='O';
      } else {computerTurn(board);}
      break;
      case 4:
      if(board[1][0] == ' ') {
        board[1][0] ='O';
      } else {computerTurn(board);}
      break;
      case 5:
      if(board[1][1] == ' ') {
        board[1][1] ='O';
      } else {computerTurn(board);}
      break;
      case 6:
      if(board[1][2] == ' ') {
        board[1][2] ='O';
      } else {computerTurn(board);}
      break;
      case 7:
      if(board[2][0] == ' ') {
        board[2][0] ='O';
      } else {computerTurn(board);}
      break;
      case 8:
      if(board[2][1] == ' ') {
        board[2][1] ='O';
      } else {computerTurn(board);}
      break;
      case 9:
      if(board[2][2] == ' ') {
        board[2][2] ='O';
      } else {computerTurn(board);}
      break;
    }
    System.out.println("Computer chose: " + input);
  }

  public void playerTurn(char[][] board, Scanner in) {
    System.out.print("Player's Turn (1 - 9): ");
    int input = in.nextInt();
    switch(input) {
      case 1:
      if(board[0][0]== ' ') {
        board[0][0] ='X';
      } else {System.out.println("Invalid Move Try Again!");playerTurn(board, in);}
      break;
      case 2:
      if(board[0][1]== ' ') {
        board[0][1] ='X';
      } else {System.out.println("Invalid Move Try Again!");playerTurn(board, in);}
      break;
      case 3:
      if(board[0][2]== ' ') {
        board[0][2] ='X';
      } else {System.out.println("Invalid Move Try Again!");playerTurn(board, in);}
      break;
      case 4:
      if(board[1][0]== ' ') {
        board[1][0] ='X';
      } else {System.out.println("Invalid Move Try Again!");playerTurn(board, in);}
      break;
      case 5:
      if(board[1][1]== ' ') {
        board[1][1] ='X';
      } else {System.out.println("Invalid Move Try Again!");playerTurn(board, in);}
      break;
      case 6:
      if(board[1][2]== ' ') {
        board[1][2] ='X';
      } else {System.out.println("Invalid Move Try Again!");playerTurn(board, in);}
      break;
      case 7:
      if(board[2][0]== ' ') {
        board[2][0] ='X';
      } else {System.out.println("Invalid Move Try Again!");playerTurn(board, in);}
      break;
      case 8:
      if(board[2][1]== ' ') {
        board[2][1] ='X';
      } else {System.out.println("Invalid Move Try Again!");playerTurn(board, in);}
      break;
      case 9:
      if(board[2][2]== ' ') {
        board[2][2] ='X';
      } else {System.out.println("Invalid Move Try Again!");playerTurn(board, in);}
      break;      
    }
  }
         
}