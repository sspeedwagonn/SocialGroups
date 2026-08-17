package net.civicraft.socialGroups;

import co.aikar.commands.PaperCommandManager;
import net.civicraft.socialGroups.command.GroupCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SocialGroups extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PaperCommandManager manager = new PaperCommandManager(this);
        manager.registerCommand(new GroupCommand());
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
