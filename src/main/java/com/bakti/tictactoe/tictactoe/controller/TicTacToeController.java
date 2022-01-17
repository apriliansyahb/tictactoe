package com.bakti.tictactoe.tictactoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakti.tictactoe.tictactoe.model.Move;
import com.bakti.tictactoe.tictactoe.model.Start;
import com.bakti.tictactoe.tictactoe.model.TIcTacToeGame;
import com.bakti.tictactoe.tictactoe.service.TicTacToeService;

@RestController
@RequestMapping("/main")
public class TicTacToeController {

	@Autowired
	private TicTacToeService mainService;

	@PostMapping(value = "/start")
	public TIcTacToeGame start(@RequestBody Start start) {
		return mainService.start(start.getBoardSize());
	}

	@GetMapping(value = "/board")
	public TIcTacToeGame getBoard() {
		return mainService.getBoard();
	}

	@PutMapping(value = "/move")
	public TIcTacToeGame move(@RequestBody Move move) {
		return mainService.move(move.getX(), move.getY());
	}
}
