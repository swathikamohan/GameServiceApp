package com.gameservice.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="gameId")
	private Integer gameId;
	
	@Column(name="gameName")
	private String gameName;
	
	@Column(name="gameType")
	private String gameType;
	
	@Column(name="cost")
	private Float cost;
	
	public Game(Integer gameId, String gameName, String gameType, Float cost) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameType = gameType;
		this.cost = cost;
	}
	
	public Game() {
		super();
	}
	
	public Integer getGameId() {
		return gameId;
	}
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cost, gameId, gameName, gameType);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(cost, other.cost) && Objects.equals(gameId, other.gameId)
				&& Objects.equals(gameName, other.gameName) && Objects.equals(gameType, other.gameType);
	}
	
	@Override
	public String toString() {
		return "Game [gameId=" + gameId + ", gameName=" + gameName + ", gameType=" + gameType + ", cost=" + cost + "]";
	}

	
}













