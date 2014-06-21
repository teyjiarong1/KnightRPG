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
        this.description = config.getString(name + ".²��");
        this.maxLevel = config.getInt(name +".�̰�����");
        this.experience = config.getDouble(name + ".�g��");
        this.experienceModifier = config.getDouble(name + ".�g��-�C��-�W�[");
        this.baseMaxHealth = config.getInt(name + ".��q");
        this.maxHealthPerLevel = config.getDouble(name + ".��q-�C��-�W�[");
        this.baseMaxMana = config.getInt(name + ".�]�O");
        this.maxManaPerLevel = config.getDouble(name + ".�]�O-�C��-�W�[");
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
