package com.github.chaosindustory.fallguysmrk2;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FallGuysMrk2 extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new FallGuys(), this);
        Bukkit.getLogger().info("FallGuysMrk2が有効になりました");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("FallGuysMrk2が無効になりました");
    }
}
