package org.minelore.plugin.tabaddon;

import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.api.event.player.PlayerLoadEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class TabAddon extends JavaPlugin {
    private final Logger LOG = getLogger();

    @Override
    public void onEnable() {
        super.onEnable();
        LOG.info("plugin has enabled. Development by TheDiVaZo for MineLore");
        TabAPI.getInstance().getEventBus().register(PlayerLoadEvent.class, event -> {
            TabPlayer tabPlayer = event.getPlayer();
            //do something
        });
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}