package team.devblook.template;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginTemplate extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled");
    }

}
