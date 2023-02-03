package com.megaShark.megaShark;

import com.megaShark.megaShark.GameData.GameData;
import com.megaShark.megaShark.GameData.MoveResponse;

public class Logic {
	
	public static MoveResponse chooseMove(GameData gameData) {
		Utilities.drawBoard(gameData);
		
		return new MoveResponse("down", "Ligma Balls");
	}
	
	
}
