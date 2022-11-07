package me.amg.trashguiplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TrashGuiPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("trash").setExecutor(new TrashCommand());

    }


}
