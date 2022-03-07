package eu.koboo.spigot;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

  private static Main instance;

  @Override
  public void onEnable() {
    instance = this;

    Bukkit.getLogger().info("Enabled!");
  }

  @Override
  public void onDisable() {
    Bukkit.getLogger().info("Disabled!");
  }

  public static Main getInstance() {
    return instance;
  }
}
