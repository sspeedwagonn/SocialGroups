package net.civicraft.socialGroups.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import net.civicraft.socialGroups.gui.GroupsGUI;
import org.bukkit.entity.Player;

@CommandAlias("group")
public class GroupCommand extends BaseCommand {
    @Default
    public void onGroup(Player player) {
        GroupsGUI.openGUI(player);
    }
}
