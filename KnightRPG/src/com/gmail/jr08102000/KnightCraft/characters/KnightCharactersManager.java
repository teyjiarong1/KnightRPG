package com.gmail.jr08102000.KnightCraft.characters;

import com.gmail.jr08102000.KnightCraft.characters.classes.KnightClass;
import com.gmail.jr08102000.KnightCraft.characters.classes.KnightClassManager;

public class KnightCharactersManager {
	
	private KnightCharacters knightCharacters;
	private KnightClass knightClass;
	private KnightClassManager KnightClassManager;
	
	public KnightCharactersManager(KnightCharacters knightCharacters, KnightClass knightClass){
		this.knightCharacters = knightCharacters;
		this.knightClass = knightClass;
		this.KnightClassManager = new KnightClassManager(knightClass,knightCharacters.getLevel() , knightCharacters.getExp());
	}
	
	
	
}
