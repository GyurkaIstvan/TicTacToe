package ticTacToe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ticTacToe.TicTacToe;

class TicTacToeTest {

	@Test
	void testEvaluateAtStart() {
		char[][] gameBoard = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		assertEquals("Board created.", TicTacToe.evaluate(gameBoard));
		System.out.println("Board created.");
	}

	@Test
	void testEvaluateXWonWithVerticalLine() {
		char[][] gameBoard = { { 'X', ' ', ' ' }, { 'X', 'O', ' ' }, { 'X', ' ', 'O' } };
		assertEquals("Player X won with a vertical line.", TicTacToe.evaluate(gameBoard));
		System.out.println("Player X won with a vertical line.");

	}

	@Test
	void testEvaluateOWonWithHorizontalLine() {
		char[][] gameBoard = { { 'X', ' ', 'X' }, { 'O', 'O', 'O' }, { 'X', ' ', ' ' } };
		assertEquals("Player O won with a horizontal line.", TicTacToe.evaluate(gameBoard));
		System.out.println("Player O won with a horizontal line.");
	}

	@Test
	void testEvaluateXWonWithDiagonalLine() {
		char[][] gameBoard = { { 'X', ' ', ' ' }, { 'O', 'X', ' ' }, { 'O', ' ', 'X' } };
		assertEquals("Player X won with a diagonal line.", TicTacToe.evaluate(gameBoard));
		System.out.println("Player X won with a diagonal line.");
	}

}
