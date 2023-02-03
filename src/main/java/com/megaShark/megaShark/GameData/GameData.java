package com.megaShark.megaShark.GameData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GameData {
	
	ObjectMapper mapper = new ObjectMapper();
	
	private String id;
	private String rulesetName;
	private String rulesetVersion;
	private Integer foodSpawnChance;
	private Integer minimumFood;
	private Integer hazardDamage;
	private String map;
	private String source;
	private Integer timeout;
	
	private Integer turn;
	
	private Integer boardHeight;
	private Integer boardWidth;
	private ArrayList<LinkedHashMap<String, Integer>> food;
	private ArrayList<LinkedHashMap<String, Integer>> hazards;
	private Snake[] enemies;
	private Snake megaShark;
	
	// Setters
	@SuppressWarnings("unchecked")
	@JsonProperty("game")
	private void unpackNestedGame(Map<String, Object> game) {
		this.id = (String)game.get("id");
		Map<String, Object> ruleset = (Map<String, Object>)game.get("ruleset");
		this.rulesetName = (String)ruleset.get("name");
		this.rulesetVersion = (String)ruleset.get("version");
		Map<String, Integer> settings = (Map<String, Integer>)ruleset.get("settings");
		this.foodSpawnChance = (Integer)settings.get("foodSpawnChance");
		this.minimumFood = (Integer)settings.get("minimumFood");
		this.hazardDamage = (Integer)settings.get("hazardDamagePerTurn");
		
		this.map = (String)game.get("map");
		this.source = (String)game.get("source");
		this.timeout = (Integer)game.get("timeout");		
	}
	
	public void setTurn(Integer turn) {
		this.turn = turn;
	}
	
	@SuppressWarnings("unchecked")
	@JsonProperty("board")
	private void unpackNestedBoard(Map<String, Object> board) {
		this.boardHeight = (Integer)board.get("height");
		this.boardWidth = (Integer)board.get("width");
		this.food = (ArrayList<LinkedHashMap<String, Integer>>) board.get("food");
		this.hazards = (ArrayList<LinkedHashMap<String, Integer>>) board.get("Hazards");
	}
	
	public void setMegaShark(Snake megaShark) {
		this.megaShark = megaShark;
	}
	
	//Getters
	public String getId() {
		return id;
	}

	public String getRulesetName() {
		return rulesetName;
	}

	public String getRulesetVersion() {
		return rulesetVersion;
	}

	public Integer getFoodSpawnChance() {
		return foodSpawnChance;
	}

	public Integer getMinimumFood() {
		return minimumFood;
	}

	public Integer getHazardDamage() {
		return hazardDamage;
	}

	public String getMap() {
		return map;
	}

	public String getSource() {
		return source;
	}

	public Integer getTimeout() {
		return timeout;
	}
	
	public Integer getTurn() {
		return turn;
	}
	
	public Integer getBoardHeight() {
		return boardHeight;
	}
	
	public Integer getBoardWidth() {
		return boardWidth;
	}
	
	public ArrayList<LinkedHashMap<String, Integer>> getFood() {
		return food;
	}
	
	public ArrayList<LinkedHashMap<String, Integer>> getHazard() {
		return hazards;
	}
	
	public Snake[] getEnemies() {
		return enemies;
	}
	
	public Snake getMegaShark() {
		return megaShark;
	}
}
