package com.bakti.tictactoe.tictactoe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakti.tictactoe.tictactoe.model.Board;
import com.bakti.tictactoe.tictactoe.service.MainService;

@RestController
@RequestMapping("/main")
public class TicTacToeController {

	@Autowired
	private MainService mainService;
	private Board board;
	
	

	@PostMapping(value = "/test")
	public String test() {
		return "test";
	}

	@GetMapping(value = "/board")
	public String getBoard() {
		StringBuilder sb = new StringBuilder();
		List<List<String>> getbCoord = board.getbCoord();
		int boardSize = getbCoord.size();
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				sb.append(getbCoord.get(i).get(j));
				sb.append("/n");
			}
		}
		return sb.toString();
	}

	@PostMapping(value = "/move")
	public boolean move(int x, int y, String value) {
		return board.setCoordValue(x, y, value);
	}
}
