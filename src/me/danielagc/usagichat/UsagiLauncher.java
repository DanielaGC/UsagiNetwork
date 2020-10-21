package me.danielagc.usagichat;

import me.danielagc.usagichat.commands.ClearCommand;
import me.danielagc.usagichat.managers.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.richaard5.kotlindezoas.utils.KotlinPlugin;

public class UsagiLauncher extends KotlinPlugin {
    public static UsagiLauncher plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getConsoleSender().sendMessage("§2[UsagiChat]: §fUsagiChat has been successfully started");
        registerCommands(
                new ClearCommand()
        );
        registerEvents(
                new Events()
        );
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§4[UsagiChat]: $fUsagiChat has been successfully disabled");
    }
}
