import java.util.Scanner;

public class ToPlayMultiplayer_5x5 {
  private CheckPlayersTurn_5x5 obj;

  public ToPlayMultiplayer_5x5(CheckPlayersTurn_5x5 obj) {
    this.obj = obj;
  }

  public void multiplayer_5x5 (char[][] board, Scanner in) {
    Board_5x5.printBoard(board);
    while(true) {
      obj.firstPlayerTurn(board, in);
      if (obj.isFirstPlayerWon(board) || obj.isItTie(board)) {
        break;
      }      
      obj.firstPlayerTurn(board, in);
      if (obj.isFirstPlayerWon(board) || obj.isItTie(board)) {
        break;
      }      
      Board_5x5.printBoard(board);
      obj.secondPlayerTurn(board, in);
      if (obj.isSecondPlayerWon(board) || obj.isItTie(board)) {
        break;
      }
      obj.secondPlayerTurn(board, in);       
      if (obj.isSecondPlayerWon(board) || obj.isItTie(board)) {
        break;
      }      
      Board_5x5.printBoard(board);           
    }       
  }
}