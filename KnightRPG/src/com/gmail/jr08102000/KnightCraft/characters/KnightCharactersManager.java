package com.gmail.jr08102000.KnightCraft.characters;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import com.gmail.jr08102000.KnightCraft.characters.classes.KnightClass;
import com.gmail.jr08102000.KnightCraft.characters.classes.KnightClassManager;
import com.gmail.jr08102000.KnightCraft.configuration.configMain;
import com.gmail.jr08102000.KnightCraft.storage.storageManager;
import com.nisovin.magicspells.MagicSpells;

public class KnightCharactersManager {
	
	private Player player;
	private KnightCharacters knightCharacters;
	private storageManager sm;
	private KnightClassManager KnightClassManager;
	private FileConfiguration config;
	
	public KnightCharactersManager(Player player,KnightClass knightClass){
		this.player = player;
		this.sm = new storageManager(player.getName());
		this.knightCharacters = new KnightCharacters(sm);
		this.KnightClassManager = new KnightClassManager(knightClass,knightCharacters.getLevel() , knightCharacters.getExp());
		this.config = configMain.getInstance().config;
	}
	
	public void setMaxHealth()
	{
		int CHealth = KnightClassManager.getClassesMaxHealth();
		int ConHealth = knightCharacters.getCon() * config.getInt("屬性設定.體質增加多少血量");
		
		player.setMaxHealth(CHealth + ConHealth);
	}
	
	public void setMaxMana()
	{
		int CMana = KnightClassManager.getClassesMaxMana();
		int InteMana = knightCharacters.getInte() * config.getInt("屬性設定.智慧增加多少魔力");
		
		MagicSpells.getManaHandler().setMaxMana(player, CMana + InteMana);
	}
	
	public int setWeaponDamage()
	{
		int CDamage = KnightClassManager.getClassesDamage();
		int StrDamage = knightCharacters.getStr() * config.getInt("屬性設定.力量增加多少近戰攻擊力");
		
		return CDamage+StrDamage;
	}
	
	public int setProjDamage()
	{
		int CProjDamage = KnightClassManager.getClassesProjDamage();
		int DexDamage = knightCharacters.getDex() * config.getInt("屬性設定.敏捷增加多少遠戰攻擊力");
		return CProjDamage + DexDamage;
	}
	
	

	
	
	
}
