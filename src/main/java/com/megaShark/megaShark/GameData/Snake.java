package com.megaShark.megaShark.GameData;

public class Snake {
	private String id;
	private String name;
	private Integer health;
	private Coordinate[] body;
	private Integer latency;
	private Coordinate head;
	private Integer length;
	private String shout;
	private String squad;
	private Customization customization;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getHealth() {
		return health;
	}
	public Coordinate[] getBody() {
		return body;
	}
	public Integer getLatency() {
		return latency;
	}
	public Coordinate getHead() {
		return head;
	}
	public Integer getLength() {
		return length;
	}
	public String getShout() {
		return shout;
	}
	public String getSquad() {
		return squad;
	}
	public Customization getCustomization() {
		return customization;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(Integer health) {
		this.health = health;
	}
	public void setBody(Coordinate[] body) {
		this.body = body;
	}
	public void setLatency(Integer latency) {
		this.latency = latency;
	}
	public void setHead(Coordinate head) {
		this.head = head;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public void setShout(String shout) {
		this.shout = shout;
	}
	public void setSquad(String squad) {
		this.squad = squad;
	}
	public void setCustomization(Customization customization) {
		this.customization = customization;
	}
}
