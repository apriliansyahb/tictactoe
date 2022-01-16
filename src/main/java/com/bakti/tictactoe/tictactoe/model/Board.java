package com.bakti.tictactoe.tictactoe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private List<List<String>> bCoord = new ArrayList<List<String>>();

	private int moveCount = 0;

	public List<List<String>> getbCoord() {
		return bCoord;
	}

	public void setbCoord(List<List<String>> bCoord) {
		this.bCoord = bCoord;
	}

	public Board(int boardSize) {
		super();

		for (int i = 0; i < boardSize; i++) {
			List<String> xCoord = new ArrayList<String>();
			for (int j = 0; j < boardSize; j++) {
				xCoord.add("");
			}
			bCoord.add(xCoord);
		}

	}

	public String move(int x, int y, String value) {
		int boardSize = bCoord.size();
		boolean isCoordOccupied = bCoord.get(x).get(y).isEmpty() ? false : true;
		if (x < boardSize && y < boardSize && !isCoordOccupied) {
			bCoord.get(x).set(y, value);
			moveCount++;

			// check col
			for (int i = 0; i < boardSize; i++) {
				if (bCoord.get(x).get(i).equalsIgnoreCase(value)) {
					if (i == boardSize - 1) {
						return value;
					}
					continue;
				} else
					break;
//				for (int i = 0; i < boardSize; i++) {
//					if (!bCoord.get(x).get(i).equalsIgnoreCase(value))
//						break;
//					if (i == boardSize - 1) {
//						return value;
//					}
//				}
			}

			// check row
			for (int i = 0; i < boardSize; i++) {
				if (bCoord.get(i).get(y).equalsIgnoreCase(value)) {
					if (i == boardSize - 1)
						return value;
					else
						continue;
				} else
					break;

//				if (!bCoord.get(i).get(y).equalsIgnoreCase(value)) {
//					break;
//				if (i == boardSize - 1) {
//					return value;
//				}
			}

			// check diag
			if (x == y) {
				// we're on a diagonal
				for (int i = 0; i < boardSize; i++) {
					if (bCoord.get(i).get(i).equalsIgnoreCase(value)) {
						if (i == boardSize - 1)
							return value;
						else
							continue;
					} else
						break;
//					if (!bCoord.get(i).get(i).equalsIgnoreCase(value))
//						break;
//					if (i == boardSize - 1) {
//						return value;
//					}
				}
			}

//			// check anti diag (thanks rampion)
//			if (x + y == boardSize - 1) {
//				for (int i = 0; i < boardSize; i++) {
//					if (!bCoord.get(i).get((boardSize - 1) - i).equalsIgnoreCase(value))
//						break;
//					if (i == boardSize - 1) {
//						return value;
//					}
//				}
//			}

			// check draw
			if (moveCount == boardSize*boardSize) {
				// report draw
				return "draw";

			}
		}
		return null;
	}

}
