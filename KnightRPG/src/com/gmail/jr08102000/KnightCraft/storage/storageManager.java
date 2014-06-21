package com.gmail.jr08102000.KnightCraft.storage;

import com.gmail.jr08102000.KnightCraft.Knight;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * �źa�ۻs 6/20/2014.
 */
public class storageManager {

    protected Knight plugin = Knight.plugin;
    public YamlConfiguration data;
    public String name;
    public File dataFile;
    public File storageFile = new File(plugin.getDataFolder(), "��Ʈw");

    public void setUpStorage() {
        if (!storageFile.exists()) {
            plugin.getLogger().info("�إ߷s����Ʈw");
            storageFile.mkdirs();

        }
    }

    public storageManager() {

    }

    public storageManager(String name) {

        this.name = name;
        this.dataFile = new File(plugin.getDataFolder(), "��Ʈw" + File.separator
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
                    .info("�iTodayBeDevil�j �s�W " + this.name + " �ɮ�...");
            createPlayerData();
            createData();
            saveFile(data, dataFile);


        } else {
            Bukkit.getLogger().info("�iTodayBeDevil�jŪ�� " + this.name + " �ɮ�...");
        }

        this.data = YamlConfiguration.loadConfiguration(dataFile);

    }
    public void createData(){
        this.data = YamlConfiguration.loadConfiguration(dataFile);

        this.data.set("¾�~", "Bitch");
        this.data.set("����" , Integer.valueOf(1));
        this.data.set("�g��", Double.valueOf(0));

    }


    public void saveFile(YamlConfiguration yml, File file) {
        try {
            yml.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
