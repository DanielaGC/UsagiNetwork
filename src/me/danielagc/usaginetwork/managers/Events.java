package me.danielagc.usaginetwork.managers;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class Events implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) { event.setJoinMessage(null); }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        event.setQuitMessage(null);
    }

    @EventHandler
    public void onSendMessage(AsyncPlayerChatEvent event) {
        event.setFormat("[§7-§f] §f" + event.getPlayer().getDisplayName() + ": §7" + event.getMessage().replaceAll("&", "§"));
    }
}
