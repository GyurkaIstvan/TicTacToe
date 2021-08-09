package ticTacToe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ticTacToe.TicTacToe;

class TicTacToeTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	
	@Test
	void testEvaluateAtStart() {
		char[][] gameBoard = { 	{ ' ', ' ', ' ' },
								{ ' ', ' ', ' ' },
								{ ' ', ' ', ' ' } };
		assertEquals("Board created.", TicTacToe.evaluate(gameBoard));
	}
	
	
}
