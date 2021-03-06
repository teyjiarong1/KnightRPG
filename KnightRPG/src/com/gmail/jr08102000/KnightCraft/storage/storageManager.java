package com.gmail.jr08102000.KnightCraft.storage;

import com.gmail.jr08102000.KnightCraft.Knight;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * @author jr0810 6/20/2014.
 */
public class storageManager {

    protected Knight plugin = Knight.plugin;
    public YamlConfiguration data;
    public String name;
    public File dataFile;
    public File storageFile = new File(plugin.getDataFolder(), "資料庫");

    public void setUpStorage() {
        if (!storageFile.exists()) {
            plugin.getLogger().info("建立新的資料庫");
            storageFile.mkdirs();

        }
    }

    public storageManager() {

    }

    public storageManager(String name) {

        this.name = name;
        this.dataFile = new File(plugin.getDataFolder(), "資料庫" + File.separator
                + name + ".yml");
    }
    public void createPlayerData() {
        if (this.dataFile.exists()) {
            return;
        }

        try {
            this.dataFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFile() {
        if (!this.dataFile.exists()) {
            Bukkit.getLogger()
                    .info("【TodayBeDevil】 新增 " + this.name + " 檔案...");
            createPlayerData();
            createData();
            saveFile(data, dataFile);


        } else {
            Bukkit.getLogger().info("【TodayBeDevil】讀取 " + this.name + " 檔案...");
        }

        this.data = YamlConfiguration.loadConfiguration(dataFile);

    }
    public void createData(){
        this.data = YamlConfiguration.loadConfiguration(dataFile);

        this.data.set("職業", "初心者");
        this.data.set("等級" , Integer.valueOf(1));
        this.data.set("經驗", Double.valueOf(0));
        this.data.set("屬性.力量", Integer.valueOf(0));
        this.data.set("屬性.敏捷", Integer.valueOf(0));
        this.data.set("屬性.體質", Integer.valueOf(0));
        this.data.set("屬性.智慧", Integer.valueOf(0));
        this.data.set("屬性.點數", Integer.valueOf(3));
        

    }


    public void saveFile(YamlConfiguration yml, File file) {
        try {
            yml.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
