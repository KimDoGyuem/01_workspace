package com.board.main;

public class Main {
	public static void main(String[] args) {
//		Board board = new Board();
		Board board = Board.getInstance();
		board.run();
	}
}
