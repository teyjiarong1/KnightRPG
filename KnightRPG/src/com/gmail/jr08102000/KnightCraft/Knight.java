package com.gmail.jr08102000.KnightCraft;

import com.gmail.jr08102000.KnightCraft.configuration.configClasses;
import com.gmail.jr08102000.KnightCraft.listener.K_PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import  com.gmail.jr08102000.KnightCraft.storage.storageManager;
import com.gmail.jr08102000.KnightCraft.commands.*;

/**
 * @author Jr0810 20/6/2014
 */
public class Knight extends JavaPlugin{

    public static Knight plugin;

    public void debug(String message) {
        getLogger().info("[Debug] " + message);
    }

    public void onEnable(){
        registerCommands();
        registerListener();
        loadConfigFile();
        setUpStorage();
    }
    public void onDisable(){

    }

    public void registerCommands(){
        getCommand("lv").setExecutor(new LevelCommand());
    }
    public void registerListener(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new K_PlayerListener() , this);
    }
    public void loadConfigFile(){

        configClasses.getInstance();
    }
    public void setUpStorage(){
        storageManager sm = new storageManager();
        sm.setUpStorage();
    }


}
