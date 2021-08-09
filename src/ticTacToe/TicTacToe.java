package ticTacToe;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String evalResult = "";
		char[][] gameBoard = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		char player = 'X';

		evalResult = evaluate(gameBoard);
		System.out.println(evalResult);
		printBoard(gameBoard);

	}

	static String evaluate(char[][] boardArray) {

		char winner = 'X';

		printBoard(boardArray);
		System.out.println("-------------------");

		// Check for empty just created board
		if (boardCreated(boardArray)) {
			return "Board created.";
		}

		winner = verticalLine(boardArray);
		if (winner != ' ') {
			return "Player " + winner + " won with a vertical line.";
		}

		winner = horizontalLine(boardArray);
		if (winner != ' ') {
			return "Player " + winner + " won with a horizontal line.";
		}

		winner = diagonalLine(boardArray);
		if (winner != ' ') {
			return "Player " + winner + " won with a diagonal line.";
		}

		if (gameEndedDraw(boardArray)) {
			return "Game ended with a draw.";
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

	public static boolean boardCreated(char[][] boardArray) {
		if ((boardArray[0][0] == ' ' && boardArray[0][1] == ' ' && boardArray[0][2] == ' ')
				&& (boardArray[1][0] == ' ' && boardArray[1][1] == ' ' && boardArray[1][2] == ' ')
				&& (boardArray[2][0] == ' ' && boardArray[2][1] == ' ' && boardArray[2][2] == ' ')) {
			return true;

		}
		return false;
	}

	public static char verticalLine(char[][] boardArray) {

		for (int i = 0; i < 3; i++) {
			if (boardArray[0][i] != ' '
					&& (boardArray[0][i] == boardArray[1][i] && boardArray[0][i] == boardArray[2][i])) {
				return boardArray[0][i];
			}
		}
		return ' ';
	}

	public static char horizontalLine(char[][] boardArray) {

		for (int i = 0; i < 3; i++) {
			if (boardArray[i][0] != ' '
					&& (boardArray[i][0] == boardArray[i][1] && boardArray[i][0] == boardArray[i][2])) {
				return boardArray[i][0];
			}
		}
		return ' ';
	}

	public static char diagonalLine(char[][] boardArray) {

		if (boardArray[1][1] != ' ' && ((boardArray[0][0] == boardArray[1][1] && boardArray[2][2] == boardArray[1][1])
				|| (boardArray[2][0] == boardArray[1][1] && boardArray[0][2] == boardArray[1][1]))) {
			return boardArray[1][1];

		}
		return ' ';
	}

	public static boolean gameEndedDraw(char[][] boardArray) {

		if ((boardArray[0][0] != ' ' && boardArray[0][1] != ' ' && boardArray[0][2] != ' ')
				&& (boardArray[1][0] != ' ' && boardArray[1][1] != ' ' && boardArray[1][2] != ' ')
				&& (boardArray[2][0] != ' ' && boardArray[2][1] != ' ' && boardArray[2][2] != ' ')) {
			return true;
		}
		return false;
	}

}
