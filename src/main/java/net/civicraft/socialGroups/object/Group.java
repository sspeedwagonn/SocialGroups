package net.civicraft.socialGroups.object;

import net.civicraft.socialGroups.object.type.InterestTagTypes;
import net.civicraft.socialGroups.object.type.RoleType;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

//TODO: Add invite type. Add this after stable release
public class Group {
    private UUID id;
    private Component name;
    private Component description;
    private ArrayList<InterestTagTypes> interestTags;
    private Player owner;
    private Map<Player, RoleType> members;
    private ItemStack icon;
    private LocalDateTime createdAt;
    private ArrayList<Event> currentEvents;
    private ArrayList<Event> pastEvents;
}
