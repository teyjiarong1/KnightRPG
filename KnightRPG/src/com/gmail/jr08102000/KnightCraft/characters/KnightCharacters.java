package com.gmail.jr08102000.KnightCraft.characters;

import com.gmail.jr08102000.KnightCraft.storage.storageManager;
import org.bukkit.configuration.file.YamlConfiguration;

/**
 * @author jr0810 20/6/2014
 */
public class KnightCharacters {

    private String name;
    private String classes;
    private storageManager sm;
    private YamlConfiguration data;

    private int level;
    private double exp;


    public KnightCharacters(storageManager sm){
        this.sm = sm;
        this.name = sm.name;
        this.data = sm.data;
        this.data = YamlConfiguration.loadConfiguration(sm.dataFile);

        this.classes = this.data.getString("職業");
        this.level = this.data.getInt("等級");
        this.exp = this.data.getDouble("經驗");
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

}
