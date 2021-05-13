public class CheckWinner_3x3 {
  public boolean isFirstPlayerWon(char[][] board) {
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

  public boolean isSecondPlayerWon(char[][] board) {
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

  public boolean isComputerWon(char[][] board) {
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
    return false;        
  }

  public boolean isPlayerWon(char[][] board) {
    if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' )|| (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' )||( board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')) {
      System.out.println("Marvelous! You Killed the Computer!");
      return true;
    }
    if ((board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ) || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' )|| (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')) {
      System.out.println("Marvelous! You Killed the Computer!");
      return true;
    }
    if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' )||( board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X' )) {
      System.out.println("Marvelous! You Killed the Computer!");
      return true;
    }
    return false;        
  }       

  public boolean isItTie(char[][] board) {
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
}