package me.danielagc.usagichat.commands;

import com.richaard5.kotlindezoas.utils.commands.PluginCommand;
import org.bukkit.entity.Player;

public class FlyCommand extends PluginCommand {
    public FlyCommand() {
        super(new String[] {"fly", "voar"}, null);
    }

    @Override
    public void execute(Player p, String[] args) {
        if (!p.getAllowFlight()) {
            p.setAllowFlight(true);
            p.sendMessage("§7[§6§lUsagi§f§lNetwork§7]: Seu fly foi ativado, agora você poderá voar");
        } else {
            p.setAllowFlight(false);
            p.sendMessage("§7[§6§lUsagi§f§lNetwork§7]: Seu fly foi desativado, agora não você poderá voar");
        }
    }
}
