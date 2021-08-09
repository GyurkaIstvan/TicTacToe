package ticTacToe;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String evalResult = "";
		char[][] gameBoard = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

		evalResult = evaluate(gameBoard);

	}

	static String evaluate(char[][] boardArray) {
		if ((boardArray[0][0] == ' ' && boardArray[0][1] == ' ' && boardArray[0][2] == ' ')
				&& (boardArray[1][0] == ' ' && boardArray[1][1] == ' ' && boardArray[1][2] == ' ')
				&& (boardArray[2][0] == ' ' && boardArray[2][1] == ' ' && boardArray[2][2] == ' ')) {

			return "Board created.";
		}
		return "";
	}

}
