package com.mystery.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MysteryPlugin extends JavaPlugin {
    
    private static MysteryPlugin instance;
    
    @Override
    public void onEnable() {
        instance = this;
        
        getLogger().info("Что-то таинственное активировано...");
        
        // Секретная инициализация
        initializeSecretStuff();
    }
    
    @Override
    public void onDisable() {
        getLogger().info("Тайна скрывается в тени...");
    }
    
    private void initializeSecretStuff() {
        // Здесь происходит нечто загадочное
        getCommand("secret").setExecutor(new SecretCommand());
    }
    
    public static MysteryPlugin getInstance() {
        return instance;
    }
}
