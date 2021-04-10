package com.github.chaosindustory.fallguysmrk2;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class FallGuys implements Listener {
    @EventHandler
    public void jiray(PlayerInteractEvent event) {


        if (event.getAction().toString().equalsIgnoreCase("PHYSICAL")) {
            if (event.getClickedBlock().getType().toString().equalsIgnoreCase("OAK_PRESSURE_PLATE")) {

                event.setCancelled(true);
                event.getClickedBlock().setType(Material.AIR);

                int r = 1;

                Location startLoc = event.getClickedBlock().getLocation().subtract(r, r, r);

                for (int i = startLoc.getBlockX(); i < startLoc.getBlockX() + r * 3; i++) {
                    for (int j = startLoc.getBlockY(); j > startLoc.getBlockY() - r * 3; j--) {
                        for (int k = startLoc.getBlockZ(); k < startLoc.getBlockZ() + r * 3; k++) {
                            Location loc = new Location(startLoc.getWorld(), i, j, k);
                            Block b = loc.getBlock();

                            b.setType(Material.AIR);

                        }
                    }
                }
            }
            Bukkit.getLogger().info("Eliminated");
        }
    }

    @EventHandler
    public void jiraykaijo(PlayerInteractEvent event) {

        if (event.getAction().toString().equalsIgnoreCase("RIGHT_CLICK_BLOCK")) {
            if (event.getClickedBlock().getType().toString().equalsIgnoreCase("OAK_PRESSURE_PLATE")) {
                Location loc = event.getClickedBlock().getLocation();
                Block b = loc.getBlock();
                event.setCancelled(true);
                b.setType(Material.AIR);
                Bukkit.getLogger().info("BOMB Deleted");

            }
        }
    }
}

