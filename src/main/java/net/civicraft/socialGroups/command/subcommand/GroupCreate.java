package net.civicraft.socialGroups.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.socialGroups.gui.GroupCreationGUI;
import org.bukkit.entity.Player;

@CommandAlias("group")
public class GroupCreate extends BaseCommand {
    @Subcommand("create")
    public void onGroupCreate(Player player) {
        GroupCreationGUI.openGUI(player);
    }
}
