package com.gmail.jr08102000.KnightCraft.commands;

import com.gmail.jr08102000.KnightCraft.Knight;
import com.gmail.jr08102000.KnightCraft.characters.KnightCharacters;
import com.gmail.jr08102000.KnightCraft.storage.storageManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * �źa�ۻs 6/21/2014..
 */
public class LevelCommand implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Knight plugin = Knight.plugin;
        if(cmd.getName().equalsIgnoreCase("lv")){
            if(sender instanceof Player){
                Player player = (Player)sender;
                if(args.length == 0){
                    ShowGUI(player);
                }
                if(args.length == 1) {
                    Player target = Bukkit.getPlayer(args[0]);

                    if(target.isOnline())
                        ShowGUI(target);
                    else
                        player.sendMessage("���a�S�W�u�A�A����d�ݥL�����");
                }
                else
                    return false;
            }
            else
                plugin.debug("�o�ӫ��O�u���b�C�����~�ॴ�����O�I");

        }

        return false;

    }

    public void ShowGUI(Player player){
        storageManager sm = new storageManager(player.getName());
        KnightCharacters sc = new KnightCharacters(sm);
        String classes = sc.getClasses();

        player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "=======[ " + ChatColor.YELLOW + "�M�hRPG(jr0810�ۻs)" + ChatColor.GOLD + ""+ ChatColor.BOLD
         + " ]=======");
        player.sendMessage(ChatColor.YELLOW + "¾�~ : " + ChatColor.RESET + sc.getClasses() + ChatColor.YELLOW + "   ���� : " + ChatColor.RESET + sc.getLevel() + ChatColor.GRAY + " ( " + ChatColor.RESET + sc.getExp() + ChatColor.GRAY + " )");

    }
}
