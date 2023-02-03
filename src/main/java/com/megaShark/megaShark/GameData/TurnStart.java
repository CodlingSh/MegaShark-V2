package com.megaShark.megaShark.GameData;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TurnStart {
	private Game game;
	private Integer turn;
	private Board board;
	private Snake you;
	private int timeout;
	private int foodSpawnChance;
	
	public Game getGame() {
		return game;
	}
	public Integer getTurn() {
		return turn;
	}
	public Board getBoard() {
		return board;
	}
	public Snake getYou() {
		return you;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public void setTurn(Integer turn) {
		this.turn = turn;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public void setYou(Snake you) {
		this.you = you;
	}
	
	@SuppressWarnings("unchecked")
	@JsonProperty("game")
	private void unpackNested(Map<String, Object> gameObject) {
		this.timeout = (int)gameObject.get("timeout");
		Map<String, Integer> ruleset = (Map<String, Integer>)gameObject.get("ruleset");
	}
	
	public int getTimeout() {
		return this.foodSpawnChance;
	}
}

//class Game {
//	private String id;
//	private Ruleset ruleset;
//	private String map;
//	private int timeout;
//	private String source;
//	
//	public String getId() {
//		return id;
//	}
//	public Ruleset getRuleset() {
//		return ruleset;
//	}
//	public String getMap() {
//		return map;
//	}
//	public int getTimeout() {
//		return timeout;
//	}
//	public String getSource() {
//		return source;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public void setRuleset(Ruleset ruleset) {
//		this.ruleset = ruleset;
//	}
//	public void setMap(String map) {
//		this.map = map;
//	}
//	public void setTimeout(int timeout) {
//		this.timeout = timeout;
//	}
//	public void setSource(String source) {
//		this.source = source;
//	}
//}
//
//class Ruleset {
//	private String name;
//	private String version;
//	
//	public String getName() {
//		return name;
//	}
//	public String getVersion() {
//		return version;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setVersion(String version) {
//		this.version = version;
//	}
//}
//
//class Board {
//	private Integer height;
//	private Integer width;
//	private Coordinate[] food;
//	private Snake[] snakes;
//	
//	public Integer getHeight() {
//		return height;
//	}
//	public Integer getWidth() {
//		return width;
//	}
//	public Coordinate[] getFood() {
//		return food;
//	}
//	public Snake[] getSnakes() {
//		return snakes;
//	}
//	public void setHeight(Integer height) {
//		this.height = height;
//	}
//	public void setWidth(Integer width) {
//		this.width = width;
//	}
//	public void setFood(Coordinate[] food) {
//		this.food = food;
//	}
//	public void setSnakes(Snake[] snakes) {
//		this.snakes = snakes;
//	}
//}


