package me.danielagc.usagichat.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ClearCommand {
    public static void chatclear (Player player) {
        for (Player p : Bukkit.getOnlinePlayers()) {
            for (int i = 1; i < 100; i++) {
                p.sendMessage(" ");
            }
            p.sendMessage("§7[§bUsagiChat§7]: §a" + player.getDisplayName() + " fez uma limpeza no chat");
        }
    }
}
