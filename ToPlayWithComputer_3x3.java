import java.util.Scanner;

public class ToPlayWithComputer_3x3 {
  private CheckPlayersTurn_3x3 obj;

  public ToPlayWithComputer_3x3(CheckPlayersTurn_3x3 obj) {
    this.obj = obj;
  }  

  public void Computer_3x3 (char[][] board, Scanner in) {
    Board_3x3.printBoard(board);
    while(true) {
      obj.playerTurn(board, in);
      Board_3x3.printBoard(board);
      if (obj.isPlayerWon(board) || obj.isItTie(board)) {
        break;
      }
      obj.computerTurn(board);
      Board_3x3.printBoard(board);
      if (obj.isComputerWon(board) || obj.isItTie(board)) {
        break;
      }      
    }
  }    
}