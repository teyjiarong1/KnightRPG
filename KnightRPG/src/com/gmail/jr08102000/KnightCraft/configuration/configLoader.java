package com.gmail.jr08102000.KnightCraft.configuration;

import com.gmail.jr08102000.KnightCraft.Knight;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 嘉榮自製 6/21/2014.
 */
public abstract class configLoader {
    protected static final Knight plugin = Knight.plugin;
    protected String fileName;
    protected File configFile;
    public FileConfiguration config;

    public configLoader(String relativePath, String fileName)
    {
        this.fileName = fileName;
        this.configFile = new File(plugin.getDataFolder(), relativePath + File.separator + fileName);
        loadFile();
    }

    public configLoader(String fileName)
    {
        this.fileName = fileName;
        this.configFile = new File(plugin.getDataFolder(), fileName);
        loadFile();
    }

    public void loadFile()
    {
        if (!this.configFile.exists())
        {
            plugin.getLogger().info("新增 " + this.fileName + " 檔案...");
            createFile();
        }
        else
        {
            plugin.getLogger().info("讀取 " + this.fileName + " 檔案...");
        }

        this.config = YamlConfiguration.loadConfiguration(this.configFile);
    }

    protected abstract void loadKeys();

    protected void createFile()
    {
        if (this.configFile.exists())
        {
            return;
        }

        this.configFile.getParentFile().mkdirs();

        InputStream inputStream = plugin.getResource(this.fileName);

        if (inputStream != null) {
            try
            {
                copyStreamToFile(inputStream, this.configFile);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else
            plugin.getLogger().severe("Missing ressource file: '" + this.fileName + "' please notify the plugin authors");
    }

    private static void copyStreamToFile(InputStream inputStream, File file) throws Exception
    {
        OutputStream outputStream = new FileOutputStream(file);

        int read = 0;
        byte[] bytes = new byte[1024];

        while ((read = inputStream.read(bytes)) != -1)
        {
            outputStream.write(bytes, 0, read);
        }

        inputStream.close();
        outputStream.close();
    }
}
