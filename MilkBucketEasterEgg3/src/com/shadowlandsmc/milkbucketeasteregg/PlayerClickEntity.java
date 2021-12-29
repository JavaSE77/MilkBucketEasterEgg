package com.shadowlandsmc.milkbucketeasteregg;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.GameMode;
import org.bukkit.entity.Ageable;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.Listener;

public class PlayerClickEntity implements Listener
{
	//check when a player clicks a mob with a milk bucket
    @EventHandler
    public void playerClickEntity(final PlayerInteractEntityEvent event) {
        final Player player = event.getPlayer();
        //set the mob to baby
        if (player.getInventory().getItemInMainHand().getType() == Material.MILK_BUCKET && event.getRightClicked() instanceof Ageable) {
            final Ageable baby = (Ageable)event.getRightClicked();
            baby.setBaby();
            //if player is in creative, do not remove the milk bucket
            if (player.getGameMode() != GameMode.CREATIVE) {
                player.getInventory().setItemInMainHand(new ItemStack(Material.BUCKET));
            }
        }
    }
}