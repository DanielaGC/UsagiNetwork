package me.danielagc.usagichat;

import me.danielagc.usagichat.managers.Commands;
import me.danielagc.usagichat.managers.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.richaard5.kotlindezoas.utils.KotlinPlugin;

public class UsagiLauncher extends KotlinPlugin {
    public static UsagiLauncher plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getConsoleSender().sendMessage("§2[UsagiChat]: §fUsagiChat has been successfully started");
        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§4[UsagiChat]: $fUsagiChat has been successfully disabled");
    }

    public void registerCommands() {
        getCommand("chatclear").setExecutor(new Commands());
        getCommand("fly").setExecutor(new Commands());
    }

    public void registerEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new Events(), this);
    }
}
