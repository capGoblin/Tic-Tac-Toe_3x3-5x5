import java.util.Scanner;

public class ToPlayMultiplayer_3x3 {
  private CheckPlayersTurn_3x3 obj;

  public ToPlayMultiplayer_3x3(CheckPlayersTurn_3x3 obj) {
    this.obj = obj;
  }

  public void multiplayer_3x3 (char[][] board, Scanner in) {
    Board_3x3.printBoard(board);
    while(true) {
      obj.firstPlayerTurn(board, in);
      Board_3x3.printBoard(board);
      if (obj.isFirstPlayerWon(board) || obj.isItTie(board)) {
        break;
      }
      obj.secondPlayerTurn(board, in);
      Board_3x3.printBoard(board);
      if (obj.isSecondPlayerWon(board) || obj.isItTie(board)) {
        break;
      }      
    }   
  }
}