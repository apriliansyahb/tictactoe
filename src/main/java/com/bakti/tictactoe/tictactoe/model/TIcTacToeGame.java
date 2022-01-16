package com.bakti.tictactoe.tictactoe.model;

public class TIcTacToeGame {

	private Board board;
	private int boardSize;
	private String player;
	private boolean concluded = false;
	private String winner;

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public int getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public boolean isConcluded() {
		return concluded;
	}

	public void setConcluded(boolean concluded) {
		this.concluded = concluded;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	private void changePlayer() {
		if (player.equalsIgnoreCase("X")) {
			this.player = "O";
		} else
			this.player = "X";
	}

	private void start() {
		board = new Board(this.boardSize);
		player = "X";
	}

	public String move(int x, int y) {
		winner = board.move(x, y, player);
		if (winner == null) {
			changePlayer();
		}else {
			concluded = true;
		}
		
		return winner;
	}

//	private void checkWinner() {
//		String winner = board.checkWinner();
//		if (winner != null) {
//			concluded = true;
//
//			if (!"draw".equals(winner)) {
//				this.winner = winner;
//			}
//		}
//	}

	public TIcTacToeGame(int boardSize) {
		super();
		this.boardSize = boardSize;
		start();
	}

}
