import java.util.Scanner;
import java.util.Random;
public class ToPlayWithComputer3x3 {
  public static void Computer () {
    char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    printBoard(board);
    while (true) {
      Scanner in = new Scanner(System.in);
      if(isItTie(board)) {
        break;
      }       
      playerTurn(board, in);
      printBoard(board);
      if (isPlayerWon(board)){
        break;
      }
      if(isItTie(board)) {
        break;
      }       
      computerTurn(board);
      printBoard(board);      
      if (isComputerWon(board)){
        break;
      }
    }
  }
  private static boolean isItTie(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
    System.out.println("The Game ended in a Tie!");
		return true;
  }     
  private static boolean isPlayerWon(char[][] board) {
    if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' )|| (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' )||( board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')) {
      System.out.println("Marvelous! You Killed the Computer!\n");
      Grid3x3.main(null);
      return true;
    }
    if ((board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ) || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' )|| (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')) {
      System.out.println("Marvelous! You Killed the Computer!\n");
      Grid3x3.main(null);
      return true;
    }
    if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' )||( board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X' )) {
      System.out.println("Marvelous! You Killed the Computer!\n");
      Grid3x3.main(null); 
      return true;
    }
    System.out.println("Tie");
    return false;        
  }  
  private static void playerTurn(char[][] board, Scanner in) {
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
  private static boolean isComputerWon(char[][] board) {
    if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' )|| (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' )||( board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')) {
      System.out.println("Computer Won!");
      return true;
    }
    if ((board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' ) || (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' )|| (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')) {
      System.out.println("Computer Won!");
      return true;
    }
    if ((board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' )||( board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O' )) {
      System.out.println("Computer Won!");
      return true;
    }
    System.out.println("Tie!");
    return false;        
  }  
  private static void computerTurn(char[][] board) {
    Random rand = new Random();
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
    System.out.println("\nComputer chose " + input);
  }
  private static void printBoard(char[][] board) {
    System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
    System.out.println("-+-+-");
    System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
    System.out.println("-+-+-");
    System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
  }    
}