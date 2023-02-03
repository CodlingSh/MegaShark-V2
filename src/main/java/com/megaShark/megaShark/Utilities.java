package com.megaShark.megaShark;

import com.megaShark.megaShark.GameData.GameData;

public class Utilities {
	
	public static void drawBoard(GameData gameData) {
		
		for (int y = 0; y < gameData.getBoardHeight(); y++) {
			for (int x = 0; x < gameData.getBoardWidth(); x++) {
				System.out.print('0');
			}
			System.out.println();
		}
		
	}
}
