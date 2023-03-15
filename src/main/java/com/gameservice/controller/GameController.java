package com.gameservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gameservice.entity.Game;
import com.gameservice.exception.GameAlreadyExistsException;
import com.gameservice.exception.ValueNotFoundException;
import com.gameservice.service.GameService;

@RestController
@CrossOrigin("*")
@RequestMapping("/gamedata")
public class GameController {

	@Autowired
	private GameService gameservice;

	@GetMapping("/getall")
	public List<Game> getAllGames(){
		return this.gameservice.getAllGames();
	}
	
	@GetMapping("/game/{gameId}")
	public ResponseEntity<Game> getId(@PathVariable("gameId") Integer gameId) {
		return new ResponseEntity<> (HttpStatus.OK);
	}
	
	@PostMapping("/gameadd")
	public Game addGame(@RequestBody Game game1) throws GameAlreadyExistsException {
		return this.gameservice.addGame(game1);
	}

	@PutMapping("/gameupdate")
	public Game updateGame(@RequestBody Game game1) throws GameAlreadyExistsException {
		return this.gameservice.updateGame(game1);
	}
	
	@DeleteMapping("/game/{gameId}")
	public void deleteGame(@PathVariable("gameId") Integer gameId) throws ValueNotFoundException {
		this.gameservice.deleteGameById(gameId);

	}
}