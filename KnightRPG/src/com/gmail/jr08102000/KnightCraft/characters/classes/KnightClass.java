package com.gmail.jr08102000.KnightCraft.characters.classes;

import org.bukkit.configuration.file.FileConfiguration;

/**
 *  @author jr0810 6/20/2014.
 */
public class KnightClass {

    private String name;
    private String description;

    private int maxLevel;
    private double experience;
    private double experienceModifier;

    private int baseMaxHealth;
    private int baseMaxMana;
    private int damage;

    private double maxHealthPerLevel;
    private double maxManaPerLevel;
    private double DamagePerLevel;

    public KnightClass(String name , FileConfiguration config){
        this.name = name;
        this.description = config.getString(name + ".虏ざ");
        this.maxLevel = config.getInt(name +".程蔼单");
        this.experience = config.getDouble(name + ".竒喷");
        this.experienceModifier = config.getDouble(name + ".竒喷-–单-糤");
        this.baseMaxHealth = config.getInt(name + ".﹀秖");
        this.maxHealthPerLevel = config.getDouble(name + ".﹀秖-–单-糤");
        this.baseMaxMana = config.getInt(name + ".臸");
        this.maxManaPerLevel = config.getDouble(name + ".臸-–单-糤");
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
    public int getDamage()
    {
    	return this.damage;
    }
    public double getMaxHealthPerLevel()
    {
        return this.maxHealthPerLevel;
    }
    public double getMaxManaPerLevel()
    {
        return this.maxManaPerLevel;
    }
    public double getDamagePerLevel()
    {
    	return this.DamagePerLevel;
    }
}
