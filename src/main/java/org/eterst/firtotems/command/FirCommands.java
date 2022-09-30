package org.eterst.firtotems.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.eterst.firtotems.FirTotems;

public class FirCommands implements CommandExecutor {

    FirTotems plugin;

    public FirCommands(FirTotems plugin){
        this.plugin = plugin;
        Bukkit.getPluginCommand("firtotems").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        /*
        if (args.length == 0){
            String message = "&7[FirTotems] &aSubcomandos: \n&3reinicio, ";
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&',message));
        }*/
        return false;
    }
}
