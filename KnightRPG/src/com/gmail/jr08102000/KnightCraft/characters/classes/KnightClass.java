package com.gmail.jr08102000.KnightCraft.characters.classes;

import org.bukkit.configuration.file.FileConfiguration;

/**
 * 嘉榮自製  6/20/2014.
 */
public class KnightClass {

    private String name;
    private String description;

    private int maxLevel;
    private double experience;
    private double experienceModifier;

    private int baseMaxHealth;
    private int baseMaxMana;

    private double maxHealthPerLevel;
    private double maxManaPerLevel;

    public KnightClass(String name , FileConfiguration config){
        this.name = name;
        this.description = config.getString(name + ".簡介");
        this.maxLevel = config.getInt(name +".最高等級");
        this.experience = config.getDouble(name + ".經驗");
        this.experienceModifier = config.getDouble(name + ".經驗--變化");
        this.baseMaxHealth = config.getInt(name + ".血量");
        this.maxHealthPerLevel = config.getDouble(name + ".血量-每等級-增加");
        this.baseMaxMana = config.getInt(name + ".魔力");
        this.maxManaPerLevel = config.getDouble(name + ".魔力-每等級-增加");
    }

    public String getName()
    {
        return  this.name;
    }
    public String getDescription()
    {
        return this.description;
    }
    public int getMaxLevel()
    {
        return this.maxLevel;
    }
    public double getExperience()
    {
        return this.experience;
    }
    public double getExperienceModifier(){
        return this.experienceModifier;
    }
    public int getBaseMaxHealth()
    {
        return this.baseMaxHealth;
    }
    public int getBaseMaxMana()
    {
        return this.baseMaxMana;
    }
    public double getMaxHealthPerLevel()
    {
        return this.maxHealthPerLevel;
    }
    public double getMaxManaPerLevel()
    {
        return this.maxManaPerLevel;
    }
}
