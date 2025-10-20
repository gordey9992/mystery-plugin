package com.mystery.plugin;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import com.mystery.plugin.commands.SecretCommand; // Добавляем импорт

public class MysteryPlugin extends JavaPlugin {
    
    private static MysteryPlugin instance;
    private FileConfiguration config;
    
    @Override
    public void onEnable() {
        instance = this;
        
        // Загрузка конфига
        saveDefaultConfig();
        config = getConfig();
        
        getLogger().info("Активирую тайные механизмы...");
        
        // Инициализация команд
        initializeCommands();
        
        getLogger().info("Тайные механизмы готовы к работе!");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("Скрываю следы тайных операций...");
    }
    
    private void initializeCommands() {
        getCommand("secret").setExecutor(new SecretCommand());
    }
    
    public static MysteryPlugin getInstance() {
        return instance;
    }
    
    public FileConfiguration getPluginConfig() {
        return config;
    }
}
