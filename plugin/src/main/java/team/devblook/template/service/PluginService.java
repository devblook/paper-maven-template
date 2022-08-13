package team.devblook.template.service;

import org.bukkit.plugin.java.JavaPlugin;
import team.devblook.template.api.Service;

public class PluginService implements Service {

    private final JavaPlugin plugin;

    public PluginService(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void start() {
            plugin.getLogger().info("Service of plugin started");
    }

    @Override
    public void stop() {
        plugin.getLogger().info("Service of plugin stopped");
    }
}
