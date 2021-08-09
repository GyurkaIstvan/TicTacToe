package ticTacToe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ticTacToe.TicTacToe;

class TicTacToeTest {

	@Test
	void testEvaluateAtStart() {
		char[][] gameBoard = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		assertEquals("Board created.", TicTacToe.evaluate(gameBoard));
	}

	@Test
	void testEvaluateXWonWithVerticalLine() {
		char[][] gameBoard = { { 'X', ' ', ' ' }, { 'X', 'O', ' ' }, { 'X', ' ', 'O' } };
		assertEquals("Player X won with a vertical line.", TicTacToe.evaluate(gameBoard));

	}

}
