import java.util.Scanner;
public class ToPlayMultiplayer5x5 {
  public static void multiplayer () {
    char[][] board = {{' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' '}};
    printBoard(board);
    while(true) {
      Scanner in = new Scanner(System.in);
      if(isItTie(board)) {
        break;
      }          
      firstPlayerTurn(board, in);
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
    if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' && board[0][3] == 'X' && board[0][4] == 'X')|| (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' && board[1][3] == 'X' && board[1][4] == 'X') || (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' && board[2][3] == 'X' && board[2][4] == 'X') || (board[3][0] == 'X' && board[3][1] == 'X' && board[3][2] == 'X' && board[3][3] == 'X' && board[3][4] == 'X') || (board[4][0] == 'X' && board[4][1] == 'X' && board[4][2] == 'X' && board[4][3] == 'X' && board[4][4] == 'X')) {
      System.out.println("FuNtastic! First Player Won!");
      return true;
    }
    if ((board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' && board[3][0] == 'X' && board[4][0] == 'X' ) || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' && board[3][1] == 'X' && board[4][1] == 'X' )|| (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X' && board[3][2] == 'X' && board[4][2] == 'X' ) || (board[0][3] == 'X' && board[1][3] == 'X' && board[2][3] == 'X' && board[3][3] == 'X' && board[4][3] == 'X' ) || (board[0][4] == 'X' && board[1][4] == 'X' && board[2][4] == 'X' && board[3][4] == 'X' && board[4][4] == 'X')) {
      System.out.println("FuNtastic! First Player Won!");
      return true;
    }
    if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' && board[3][3] == 'X' && board[4][4] == 'X' )||( board[0][4] == 'X' && board[1][3] == 'X' && board[2][2] == 'X' && board[3][1] == 'X' && board[4][0] == 'X'  )) {
      System.out.println("FuNtastic! First Player Won!");
      return true;
    }

    return false;        
  }
  private static boolean isSecondPlayerWon(char[][] board) {
    if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' && board[0][3] == 'X' && board[0][4] == 'X')|| (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' && board[1][3] == 'X' && board[1][4] == 'X') || (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' && board[2][3] == 'X' && board[2][4] == 'X') || (board[3][0] == 'X' && board[3][1] == 'X' && board[3][2] == 'X' && board[3][3] == 'X' && board[3][4] == 'X') || (board[4][0] == 'X' && board[4][1] == 'X' && board[4][2] == 'X' && board[4][3] == 'X' && board[4][4] == 'X')) {
      System.out.println("FuNtastic! Second Player Won!");
      return true;
    }
    if ((board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' && board[3][0] == 'X' && board[4][0] == 'X' ) || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' && board[3][1] == 'X' && board[4][1] == 'X' )|| (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X' && board[3][2] == 'X' && board[4][2] == 'X' ) || (board[0][3] == 'X' && board[1][3] == 'X' && board[2][3] == 'X' && board[3][3] == 'X' && board[4][3] == 'X' ) || (board[0][4] == 'X' && board[1][4] == 'X' && board[2][4] == 'X' && board[3][4] == 'X' && board[4][4] == 'X')) {
      System.out.println("FuNtastic! Second Player Won!");
      return true;
    }
    if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' && board[3][3] == 'X' && board[4][4] == 'X' )||( board[0][4] == 'X' && board[1][3] == 'X' && board[2][2] == 'X' && board[3][1] == 'X' && board[4][0] == 'X'  )) {
      System.out.println("FuNtastic! Second Player Won!");
      return true;
    }

    return false;        
  }  
  private static void firstPlayerTurn(char[][] board, Scanner in) {
    System.out.print("First Player's Turn (1 - 25): ");
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
      if(board[0][3]== ' ') {
        board[0][3] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 5:
      if(board[0][4]== ' ') {
        board[0][4] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 6:
      if(board[1][0]== ' ') {
        board[1][0] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 7:
      if(board[1][1]== ' ') {
        board[1][1] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 8:
      if(board[1][2]== ' ') {
        board[1][2] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 9:
      if(board[1][3]== ' ') {
        board[1][3] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 10:
      if(board[1][4]== ' ') {
        board[1][4] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 11:
      if(board[2][0]== ' ') {
        board[2][0] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 12:
      if(board[2][1]== ' ') {
        board[2][1] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 13:
      if(board[2][2]== ' ') {
        board[2][2] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 14:
      if(board[2][3]== ' ') {
        board[2][3] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 15:
      if(board[2][4]== ' ') {
        board[2][4] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 16:
      if(board[3][0]== ' ') {
        board[3][0] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 17:
      if(board[3][1]== ' ') {
        board[3][1] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 18:
      if(board[3][2]== ' ') {
        board[3][2] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 19:
      if(board[3][3]== ' ') {
        board[3][3] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 20:
      if(board[3][4]== ' ') {
        board[3][4] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 21:
      if(board[4][0]== ' ') {
        board[4][0] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 22:
      if(board[4][1]== ' ') {
        board[4][1] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 23:
      if(board[4][2]== ' ') {
        board[4][2] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 24:
      if(board[4][3]== ' ') {
        board[4][3] ='X';
      } else {System.out.println("Invalid Move Try Again!");firstPlayerTurn(board, in);}
      break;
      case 25:
      if(board[4][4]== ' ') {
        board[4][4] ='X';
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
      if(board[0][3]== ' ') {
        board[0][3] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 5:
      if(board[0][4]== ' ') {
        board[0][4] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 6:
      if(board[1][0]== ' ') {
        board[1][0] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 7:
      if(board[1][1]== ' ') {
        board[1][1] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 8:
      if(board[1][2]== ' ') {
        board[1][2] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 9:
      if(board[1][3]== ' ') {
        board[1][3] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 10:
      if(board[1][4]== ' ') {
        board[1][4] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 11:
      if(board[2][0]== ' ') {
        board[2][0] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 12:
      if(board[2][1]== ' ') {
        board[2][1] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 13:
      if(board[2][2]== ' ') {
        board[2][2] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 14:
      if(board[2][3]== ' ') {
        board[2][3] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 15:
      if(board[2][4]== ' ') {
        board[2][4] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 16:
      if(board[3][0]== ' ') {
        board[3][0] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 17:
      if(board[3][1]== ' ') {
        board[3][1] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 18:
      if(board[3][2]== ' ') {
        board[3][2] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 19:
      if(board[3][3]== ' ') {
        board[3][3] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 20:
      if(board[3][4]== ' ') {
        board[3][4] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 21:
      if(board[4][0]== ' ') {
        board[4][0] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 22:
      if(board[4][1]== ' ') {
        board[4][1] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 23:
      if(board[4][2]== ' ') {
        board[4][2] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 24:
      if(board[4][3]== ' ') {
        board[4][3] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;
      case 25:
      if(board[4][4]== ' ') {
        board[4][4] ='O';
      } else {System.out.println("Invalid Move Try Again!");secondPlayerTurn(board, in);}
      break;                        
    }
  }   
  private static void printBoard(char[][] board) {
    System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|" + board[0][3] + "|" + board[0][4]);
    System.out.println("-+-+-+-+-");
    System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|" + board[1][3] + "|" + board[1][4]);
    System.out.println("-+-+-+-+-");
    System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|" + board[2][3] + "|" + board[2][4]);
    System.out.println("-+-+-+-+-");
    System.out.println(board[3][0] + "|" + board[3][1] + "|" + board[3][2] + "|" + board[3][3] + "|" + board[3][4]);
    System.out.println("-+-+-+-+-");
    System.out.println(board[4][0] + "|" + board[4][1] + "|" + board[4][2] + "|" + board[4][3] + "|" + board[4][4]);        
  }  
}