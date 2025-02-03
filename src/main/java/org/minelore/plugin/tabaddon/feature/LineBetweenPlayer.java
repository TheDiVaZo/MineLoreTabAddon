package org.minelore.plugin.tabaddon.feature;

import me.neznamy.tab.api.tablist.layout.LayoutManager;
import me.neznamy.tab.shared.features.types.*;
import me.neznamy.tab.shared.platform.TabPlayer;
import org.jetbrains.annotations.NotNull;

/**
 * @author TheDiVaZo
 * created on 04.02.2025
 */
public class LineBetweenPlayer extends RefreshableFeature implements JoinListener, QuitListener, VanishListener, Loadable,
        UnLoadable, TabListClearListener {

    @Override
    public void onJoin(@NotNull TabPlayer tabPlayer) {

    }

    @Override
    public void load() {

    }

    @Override
    public void onQuit(@NotNull TabPlayer tabPlayer) {

    }

    @Override
    public @NotNull String getRefreshDisplayName() {
        return "";
    }

    @Override
    public void refresh(@NotNull TabPlayer tabPlayer, boolean b) {

    }

    @Override
    public @NotNull String getFeatureName() {
        return "";
    }

    @Override
    public void onTabListClear(@NotNull TabPlayer tabPlayer) {

    }

    @Override
    public void unload() {

    }

    @Override
    public void onVanishStatusChange(@NotNull TabPlayer tabPlayer) {

    }
}
