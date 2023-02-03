package com.megaShark.megaShark.GameData;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {
	private String id;
	private String ruleset;
	private String version;
	private String map;
	private Integer timeout;
	private String source;
	
	public String getId() {
		return id;
	}
	public String getMap() {
		return map;
	}
	public Integer getTimeout() {
		return timeout;
	}
	public String getSource() {
		return source;
	}
	public String getRuleset() {
		return ruleset;
	}
	public String getVersion() {
		return version;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}
	public void setSource(String source) {
		this.source = source;
	}
	@JsonProperty("ruleset")
	private void unpackNested(Map<String, Object> ruleset) {
		this.ruleset = (String)ruleset.get("name");
		this.version = (String)ruleset.get("version");
	}
	
	
}
