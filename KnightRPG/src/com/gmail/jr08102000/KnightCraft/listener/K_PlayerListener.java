package com.gmail.jr08102000.KnightCraft.listener;

import com.gmail.jr08102000.KnightCraft.characters.KnightCharacters;
import com.gmail.jr08102000.KnightCraft.storage.storageManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * ¹Åºa¦Û»s 6/21/2014.
 */
public class K_PlayerListener implements Listener{

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        storageManager sm = new storageManager(player.getName());
        sm.createPlayerData();
    }
}
