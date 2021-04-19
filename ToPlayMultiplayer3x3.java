import java.util.Scanner;
public class ToPlayMultiplayer3x3 {
  public static void multiplayer () {
    char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    printBoard(board);
    while(true) {
      Scanner in = new Scanner(System.in);
      if(isItTie(board)) {
        break;
      }      
      firstPlayerTurn(board, in);
      printBoard(board);
      if (isFirstPlayerWon(board)){
        break;
      }
      if(isItTie(board)) {
        break;
      }      
      secondPlayerTurn(board, in);
      printBoard(board);
      if (isSecondPlayerWon(board)){
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
  private static boolean isFirstPlayerWon(char[][] board) {
    if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' )|| (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' )||( board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')) {
      System.out.println("FuNtastic! First Player Won!");
      return true;
    }
    if ((board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ) || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' )|| (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')) {
      System.out.println("FuNtastic! First Player Won!");
      return true;
    }
    if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' )||( board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X' )) {
      System.out.println("FuNtastic! First Player Won!");
      return true;
    }
    return false;        
  }
  private static boolean isSecondPlayerWon(char[][] board) {
    if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' )|| (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' )||( board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')) {
      System.out.println("FuNtastic! Second Player Won!");
      return true;
    }
    if ((board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' ) || (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' )|| (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')) {
      System.out.println("FuNtastic! Second Player Won!");
      return true;
    }
    if ((board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' )||( board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O' )) {
      System.out.println("FuNtastic! Second Player Won!");
      return true;
    }
    return false;        
  }
  private static void firstPlayerTurn(char[][] board, Scanner in) {
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
  private static void secondPlayerTurn(char[][] board, Scanner in) {
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

  private static void printBoard(char[][] board) {
    System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
    System.out.println("-+-+-");
    System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
    System.out.println("-+-+-");
    System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
  }  
}