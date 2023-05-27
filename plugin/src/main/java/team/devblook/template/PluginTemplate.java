package team.devblook.template;

import org.bukkit.plugin.java.JavaPlugin;
import team.devblook.template.service.ServiceManager;

public class PluginTemplate extends JavaPlugin {

  private ServiceManager serviceManager;

  @Override
  public void onLoad() {
    this.serviceManager = new ServiceManager();
  }

  @Override
  public void onEnable() {
    if (this.serviceManager != null) {
      this.serviceManager.start();
    }
  }

  @Override
  public void onDisable() {
    if (this.serviceManager != null) {
      this.serviceManager.stop();
    }
  }
}
