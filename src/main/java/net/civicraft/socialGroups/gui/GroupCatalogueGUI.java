package net.civicraft.socialGroups.gui;

import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import org.bukkit.entity.Player;

public class GroupCatalogueGUI {
    public static void openGUI(Player player) {
        ChestGui gui = new ChestGui(6, "Find a Group");

        /*
        for all groups that exist
        add them
        add some click function and a hover function
        add a bottom bar for pagination and filtering
        and to go back to the main menu
        and maybe some information
         */
        
        gui.show(player);
    }
}
