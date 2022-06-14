package me.lucyn.dispensersplus;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class DispenseListener implements org.bukkit.event.Listener{

    @EventHandler
    public void onDispense(org.bukkit.event.block.BlockDispenseEvent event) {

        ItemStack item = event.getItem();

        String itemName = item.getType().toString();

        Block dispenser = event.getBlock();

        World world = dispenser.getWorld();

        Location loc = dispenser.getLocation();

        switch (itemName) {
            case "GOAT_HORN":
                ItemMeta meta = item.getItemMeta();
                String hornType = Objects.requireNonNull(meta).getAsString();
                event.setCancelled(true);

                if (hornType.contains("ponder")) {
                    world.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_0, 1, 1);
                } else if (hornType.contains("sing")) {
                    world.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_1, 1, 1);
                } else if (hornType.contains("seek")) {
                    world.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_2, 1, 1);
                } else if (hornType.contains("feel")) {
                    world.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_3, 1, 1);
                } else if (hornType.contains("admire")) {
                    world.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_4, 1, 1);
                } else if (hornType.contains("call")) {
                    world.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_5, 1, 1);
                } else if (hornType.contains("yearn")) {
                    world.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_6, 1, 1);
                } else if (hornType.contains("dream")) {
                    world.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_7, 1, 1);
                }
                break;

            case "DISPENSER": //placeholder
                return;

                default:
                    break;

        }

    }

}
