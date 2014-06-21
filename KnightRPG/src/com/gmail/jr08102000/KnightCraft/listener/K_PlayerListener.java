package com.gmail.jr08102000.KnightCraft.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.gmail.jr08102000.KnightCraft.Knight;
import com.gmail.jr08102000.KnightCraft.characters.KnightCharacters;
import com.gmail.jr08102000.KnightCraft.characters.KnightCharactersManager;
import com.gmail.jr08102000.KnightCraft.characters.classes.KnightClass;
import com.gmail.jr08102000.KnightCraft.storage.storageManager;

/**
 * @author jr0810 6/21/2014.
 */
public class K_PlayerListener implements Listener{

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        storageManager sm = new storageManager(player.getName());
        KnightCharacters kcs = new KnightCharacters(sm);
        KnightClass kc = new KnightClass(kcs.getClasses());
        final KnightCharactersManager kcm = new KnightCharactersManager(player,kc);
        
        sm.loadFile();
        
        Bukkit.getScheduler().runTaskLater(Knight.plugin, new Runnable() {
			@Override
			public void run() {
				kcm.setMaxHealth();
		        kcm.setMaxMana();
			}
		}, 60);
        
        
        
    }
}
