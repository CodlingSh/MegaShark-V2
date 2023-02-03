package com.megaShark.megaShark;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.megaShark.megaShark.GameData.Customization;
import com.megaShark.megaShark.GameData.MoveResponse;
import com.megaShark.megaShark.GameData.GameData;

@RestController
public class RequestHandler {
	
	@GetMapping("/")
	public Customization index() {
		return new Customization();
	}
	
	@PostMapping("/start")
	public void start(@RequestBody GameData gameData) {
		System.out.println("Starting game. ID: " + gameData.getId());
	}
	
	@PostMapping("/move")
	public MoveResponse move(@RequestBody GameData gameData) {
		return Logic.chooseMove(gameData);
	}
}
