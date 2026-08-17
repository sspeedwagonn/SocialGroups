package net.civicraft.socialGroups.gui;

import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.pane.OutlinePane;
import com.github.stefvanschie.inventoryframework.pane.Pane;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;
import com.github.stefvanschie.inventoryframework.pane.util.Slot;
import org.bukkit.entity.Player;

public class GroupsGUI {
    public static void openGUI(Player player) {
        ChestGui gui = new ChestGui(4, "Groups");

        StaticPane options = new StaticPane(1, 1, Pane.Priority.HIGHEST);

        OutlinePane outline = new OutlinePane(1, 1, Pane.Priority.LOWEST);

        gui.addPane(Slot.fromIndex(9), options);
        gui.addPane(Slot.fromIndex(0), outline);

        gui.show(player);
    }
}
