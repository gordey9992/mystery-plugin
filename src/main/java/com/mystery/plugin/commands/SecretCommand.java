package com.mystery.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class SecretCommand implements CommandExecutor {
    
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, 
                           @NotNull String label, @NotNull String[] args) {
        
        sender.sendMessage("§6[Тайна] §fЧто-то загадочное происходит...");
        // Секретная логика будет добавлена позже
        return true;
    }
}
