package org.minelore.plugin.tabaddon;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class TabAddon extends JavaPlugin {
    private final Logger LOG = getLogger();

    @Override
    public void onEnable() {
        super.onEnable();
        LOG.info("plugin has enabled. Development by TheDiVaZo for MineLore");
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}