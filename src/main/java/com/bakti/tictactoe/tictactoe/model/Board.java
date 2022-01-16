package com.bakti.tictactoe.tictactoe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private List<List<String>> bCoord = new ArrayList<List<String>>();

	public List<List<String>> getbCoord() {
		return bCoord;
	}

	public void setbCoord(List<List<String>> bCoord) {
		this.bCoord = bCoord;
	}

	/**
	 * 
	 * @param boardSize setup list for board with the coordinates value -1 as no
	 *                  coordinate is occupied yet
	 */
	public Board(int boardSize) {
		super();
		List<String> xCoord = new ArrayList<String>();
		for (int i = 0; i < boardSize; i++) {
			xCoord.add("");
		}
		List<String> yCoord = new ArrayList<String>();
		for (int i = 0; i < boardSize; i++) {
			yCoord.addAll(xCoord);
		}
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param value set the board coordinate with value 0 for O and 1 for X
	 */
	public boolean setCoordValue(int x, int y, String value) {
		int boardSize = bCoord.size();
		boolean isCoordOccupied = bCoord.get(x).get(y).isEmpty() ? false : true;
		if (x < boardSize && y < boardSize && !isCoordOccupied) {
			bCoord.get(x).set(y, value);
			return true;
		} else {
			return false;
		}
	}

	public String checkWinner() {
		// TODO Auto-generated method stub
		return "draw";
	}

}
