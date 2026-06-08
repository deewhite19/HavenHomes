package me.david.havenHomes.commands;

import me.david.havenHomes.HavenHomes;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class HomeCommand implements CommandExecutor {
    private final HavenHomes plugin;

    public HomeCommand(HavenHomes plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}
