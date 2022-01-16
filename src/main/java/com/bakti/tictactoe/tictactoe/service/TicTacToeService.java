package com.bakti.tictactoe.tictactoe.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bakti.tictactoe.tictactoe.model.TIcTacToeGame;

@Service
public class TicTacToeService {

	private final Logger log = LoggerFactory.getLogger(TicTacToeService.class);

	private TIcTacToeGame ttt;

	public TIcTacToeGame start(int boardSize) {
		return ttt = new TIcTacToeGame(boardSize);
	}

	public TIcTacToeGame move(int x, int y) {
		ttt.move(x, y);
		return ttt;
	}

	public TIcTacToeGame getBoard() {
		return ttt;
	}

}
