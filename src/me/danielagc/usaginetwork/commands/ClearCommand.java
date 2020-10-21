package me.danielagc.usaginetwork.commands;
import com.richaard5.kotlindezoas.utils.commands.PluginCommand;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ClearCommand extends PluginCommand {
    public ClearCommand() {
        super(new String[] { "clearchat", "limparchat" }, null);
    }

    @Override
    public void execute(Player player, String[] args) {
        for (Player p : Bukkit.getOnlinePlayers()) {
            for (int i = 1; i < 100; i++) {
                p.sendMessage(" ");
            }
            p.sendMessage("§7[§6§lUsagi§f§lNetwork§7]: " + player.getDisplayName() + " fez uma limpeza no chat");
        }
    }
}