package com.bakti.tictactoe.tictactoe.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bakti.tictactoe.tictactoe.model.TIcTacToe;

@Service
public class MainService {

	private final Logger log = LoggerFactory.getLogger(MainService.class);

	private TIcTacToe ttt;

	public TIcTacToe start(int boardSize) {
		return ttt = new TIcTacToe(boardSize);
	}

}
