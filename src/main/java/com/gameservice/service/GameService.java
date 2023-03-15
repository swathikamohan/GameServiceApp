package com.gameservice.service;

import java.util.List;

import com.gameservice.entity.Game;
import com.gameservice.exception.GameAlreadyExistsException;
import com.gameservice.exception.ValueNotFoundException;

public interface GameService {

	public List<Game> getAllGames();

	public void getGameById(Integer gameId) throws ValueNotFoundException;

	public Game addGame(Game game1) throws GameAlreadyExistsException;

	public Game updateGame(Game game1) throws GameAlreadyExistsException;

	public void deleteGameById(Integer gameId) throws ValueNotFoundException;



}
