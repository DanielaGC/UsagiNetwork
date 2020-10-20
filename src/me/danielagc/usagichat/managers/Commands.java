package me.danielagc.usagichat.managers;

import me.danielagc.usagichat.commands.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }

        Player p = (Player)sender;
        ClearCommand.chatclear(p);
        FlyCommand.fly(p);

        return false;
    }
}
