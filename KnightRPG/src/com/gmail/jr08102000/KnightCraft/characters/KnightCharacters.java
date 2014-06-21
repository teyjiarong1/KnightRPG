package com.gmail.jr08102000.KnightCraft.characters;

import com.gmail.jr08102000.KnightCraft.storage.storageManager;
import org.bukkit.configuration.file.YamlConfiguration;

/**
 * @author jr0810 20/6/2014
 */
public class KnightCharacters {

    private String name;
    private String classes;
    private YamlConfiguration data;

    private int level;
    private double exp;
    
    private int str;
    private int dex;
    private int con;
    private int inte;
    private int Point;


    public KnightCharacters(storageManager sm){
        this.name = sm.name;
        this.data = sm.data;
        this.data = YamlConfiguration.loadConfiguration(sm.dataFile);

        this.classes = this.data.getString("職業");
        this.level = this.data.getInt("等級");
        this.exp = this.data.getDouble("經驗");
        
        this.str = this.data.getInt("屬性.力量");
        this.dex = this.data.getInt("屬性.敏捷");
        this.con = this.data.getInt("屬性.體質");
        this.inte = this.data.getInt("屬性.智慧");
        this.Point = this.data.getInt("屬性.點數");
    }

    public String getName(){
        return this.name;
    }
    public String getClasses(){
        return this.classes;
    }
    public int getLevel(){
        return this.level;
    }
    public double getExp(){
        return this.exp;
    }
    public int getStr(){
    	return this.str;
    }
    public int getDex(){
    	return this.dex;
    }
    public int getCon(){
    	return this.con;
    }
    public int getInte(){
    	return this.inte;
    }
    public int getPoint(){
    	return this.Point;
    }
    
    /**
     * Set
     */

    public void setClasses(String classes){
    	this.classes = classes;
    	this.data.set("職業", this.classes);
    }
    public void setLevel(int level){
    	this.level = level;
    	this.data.set("等級", Integer.valueOf(this.level));
    }
    public void setExp(double exp){
    	this.exp = exp;
    	this.data.set("經驗", Double.valueOf(this.exp));
    }
    public void setStr(int str){
    	this.str = str;
    	this.data.set("屬性.力量", Integer.valueOf(this.str));
    }
    public void setDex(int dex){
    	this.dex = dex;
    	this.data.set("屬性.敏捷", Integer.valueOf(this.dex));
    }
    public void setCon(int con){
    	this.con = con;
    	this.data.set("屬性.體質", Integer.valueOf(this.con));
    }
    public void setInte(int inte){
    	this.inte = inte;
    	this.data.set("屬性.智慧", Integer.valueOf(this.inte));
    }
    public void setPoin(int point){
    	this.Point = point;
    	this.data.set("屬性.點數", Integer.valueOf(this.Point));
    }
    
}
