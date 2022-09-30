package org.eterst.firtotems;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;
import org.eterst.firtotems.command.FirCommands;
import org.eterst.firtotems.listeners.InteractListener;

public class FirTotems extends JavaPlugin {

    private static FirTotems instance;

    private FirCommands commands;

    private InteractListener interactListener;

    @Override
    public void onEnable() {
        FirTotems.instance = this;
        super.onEnable();
        interactListener = new InteractListener(this);
        commands = new FirCommands(this);
        getServer().getPluginManager().registerEvents(interactListener, this);
        Bukkit.getLogger().info("[FirTotems] Plugin Habilitado");
    }

    @Override
    public void onDisable() {
        HandlerList.unregisterAll(interactListener);
        super.onDisable();
        Bukkit.getLogger().info("[FirTotems] Plugin Deshabilitado");
    }

    public static FirTotems getInstance() {
        if(instance == null){
            instance = new FirTotems();
        }
        return instance;
    }
}
