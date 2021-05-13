import java.util.Scanner;

public class ToPlayWithComputer_5x5 {
  private CheckPlayersTurn_5x5 obj;

  public ToPlayWithComputer_5x5(CheckPlayersTurn_5x5 obj) {
    this.obj = obj;
  }  

  public void Computer_5x5 (char[][] board, Scanner in) {
    Board_5x5.printBoard(board);
    while(true) {
      obj.playerTurn(board, in);
      if (obj.isPlayerWon(board) || obj.isItTie(board)) {
        break;
      }
      obj.playerTurn(board, in);      
      if (obj.isPlayerWon(board) || obj.isItTie(board)) {
        break;
      }
      Board_5x5.printBoard(board);
      obj.computerTurn(board);
      if (obj.isComputerWon(board) || obj.isItTie(board)) {
        break;
      }
      obj.computerTurn(board);
      if (obj.isComputerWon(board) || obj.isItTie(board)) {
        break;
      }
      Board_5x5.printBoard(board);    
    }
  }    
}