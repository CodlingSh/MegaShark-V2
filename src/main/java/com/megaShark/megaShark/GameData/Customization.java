package com.megaShark.megaShark.GameData;

public class Customization {
	private final int apiversion;
	private final String author;
	private final String color;
	private final String head;
	private final String tail;
	
	public Customization() {
		this.apiversion = 1;
		this.author = "codlinsh";
		this.color = "#a79d9d";
		this.head = "shark";
		this.tail = "do-sammy";
	}

	public int getApiversion() {
		return apiversion;
	}

	public String getAuthor() {
		return author;
	}

	public String getColor() {
		return color;
	}

	public String getHead() {
		return head;
	}

	public String getTail() {
		return tail;
	}
	
}
