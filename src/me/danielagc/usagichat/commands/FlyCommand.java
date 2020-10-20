package me.danielagc.usagichat.commands;

import org.bukkit.entity.Player;

public class FlyCommand {
    public static void fly (Player player) {
        if (player.isFlying() == false) {
            player.setFlying(true);
            player.sendMessage("§7[§6UsagiFly§7]: Seu fly foi ativado, agora você poderá voar");
        } else {
            player.setFlying(false);
            player.sendMessage("§7[§6UsagiFly§7]: Seu fly foi desativado, agora não você poderá voar");
        }
    }
}
