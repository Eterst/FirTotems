package org.eterst.firtotems.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;
import org.bukkit.inventory.PlayerInventory;
import org.eterst.firtotems.FirTotems;
import java.util.Random;

public class InteractListener implements Listener {

    private FirTotems pl;

    private Random rand;

    public InteractListener(FirTotems pl){
        rand = new Random();
        this.pl = pl;
    }

    @EventHandler
    public void onEntityResurrectEvent(EntityResurrectEvent e){
        if(e.getEntity() instanceof dPlayer && !e.isCancelled()){
            if(rand.nextFloat() <= 0.50f){
                e.setCancelled(true);
                PlayerInventory playerInventory = ((Player) e.getEntity()).getInventory();
                if(playerInventory.getItemInMainHand().getType() == Material.TOTEM_OF_UNDYING){
                    playerInventory.setItemInMainHand(null);
                }
                else if(playerInventory.getItemInOffHand().getType() == Material.TOTEM_OF_UNDYING){
                    playerInventory.setItemInOffHand(null);
                }
                e.getEntity().sendMessage(ChatColor.GREEN + "Totem " + ChatColor.DARK_RED + "NO" + ChatColor.GREEN + " activado! (" + ChatColor.DARK_RED + "50%" + ChatColor.GREEN + ")");
                return;
            }
        }
    }
}
