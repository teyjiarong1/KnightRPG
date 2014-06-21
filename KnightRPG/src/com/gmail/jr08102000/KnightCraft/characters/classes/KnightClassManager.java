package com.gmail.jr08102000.KnightCraft.characters.classes;

public class KnightClassManager {

	private KnightClass knightClass;
	private int PlayerLevel;
	private double playerExp;

	public KnightClassManager(KnightClass knightClass, int PlayerLevel,
			double PlayerExp) {
		this.knightClass = knightClass;
		this.PlayerLevel = PlayerLevel;
		this.playerExp = PlayerExp;
	}

	public int getClassesMaxHealth() {
		int maxHealth = knightClass.getBaseMaxHealth();
		double modifier = knightClass.getMaxHealthPerLevel();

		int getMaxHealth = (int) (maxHealth + ((this.PlayerLevel - 1) * modifier));

		return getMaxHealth;
	}
	

	public int getClassesMaxMana() {
		int maxMana = knightClass.getBaseMaxMana();
		double modifier = knightClass.getMaxManaPerLevel();

		int getMaxMana = (int) (maxMana + ((this.PlayerLevel - 1) * modifier));

		return getMaxMana;
	}

	public int getClassesDamage() {
		int damage = knightClass.getDamage();

		double modifier = knightClass.getDamagePerLevel();

		int getDamage = (int) (damage + ((this.PlayerLevel - 1) * modifier));

		return getDamage;
	}
	
	public int getClassesProjDamage(){
		int ProjDamage = knightClass.getProjDamage();
		
		double modifier = knightClass.getProjDamagePerLevel();
		
		int getProjDamage = (int)(ProjDamage + ((this.PlayerLevel - 1) * modifier));
		
		return getProjDamage;
	}
	

	public double getExperience() {
		double exp = knightClass.getExperience();
		double modifier = knightClass.getExperienceModifier();

		double getExperience = exp + ((this.PlayerLevel - 1) * modifier);
		return getExperience;

	}

	public void checkExp() {
		int maxLevel = knightClass.getMaxLevel();
		if (this.PlayerLevel != maxLevel) {
			if (this.playerExp >= getExperience()) {
				this.PlayerLevel++;
			}
		}
	}

}
