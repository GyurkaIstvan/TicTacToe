package ticTacToe;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String evalResult = "";
		char[][] gameBoard = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

	
		evalResult = evaluate(gameBoard);
		System.out.println(evalResult);
		printBoard(gameBoard);
		

	}

	static String evaluate(char[][] boardArray) {
		
		printBoard(boardArray);
		System.out.println("-------------------");
		
		if ((boardArray[0][0] == ' ' && boardArray[0][1] == ' ' && boardArray[0][2] == ' ')
				&& (boardArray[1][0] == ' ' && boardArray[1][1] == ' ' && boardArray[1][2] == ' ')
				&& (boardArray[2][0] == ' ' && boardArray[2][1] == ' ' && boardArray[2][2] == ' ')) {

			return "Board created.";
		}
		
		for (int i = 0; i < 3; i++) {
			if (boardArray[0][i] != ' '
					&& (boardArray[0][i] == boardArray[1][i] && boardArray[0][i] == boardArray[2][i])) {
				return "Player " + boardArray[0][i] + " won with a vertical line.";
			}
		}
		
		
		return "";
	}
	
	public static void printBoard(char[][] boardArray) {  
		
		int i = 0;
		
		for (i = 0; i < 2; i++) {
			System.out.println(boardArray[i][0] + "|" + boardArray[i][1] + "|" + boardArray[i][2]);
			System.out.println("-+-+-");
		}
		System.out.println(boardArray[i][0] + "|" + boardArray[i][1] + "|" + boardArray[i][2]); 
	} 

}
