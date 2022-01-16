package com.bakti.tictactoe.tictactoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bakti.tictactoe.tictactoe.model.TIcTacToeGame;
import com.bakti.tictactoe.tictactoe.service.TicTacToeService;

@RestController
@RequestMapping("/main")
public class TicTacToeController {

	@Autowired
	private TicTacToeService mainService;

	@PostMapping(value = "/start")
	public TIcTacToeGame start(@RequestParam int boardSize) {
		return mainService.start(boardSize);
	}

	@GetMapping(value = "/board")
	public TIcTacToeGame getBoard() {
		return mainService.getBoard();
	}

	@PostMapping(value = "/move")
	public TIcTacToeGame move(int x, int y) {
		return mainService.move(x, y);
	}
}
