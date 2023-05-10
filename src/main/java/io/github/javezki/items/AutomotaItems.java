package io.github.javezki.items;

import java.util.logging.Level;

import org.bukkit.Material;

import io.github.javezki.SimpleAutomota;
import io.github.javezki.items.tools.Wrench;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import net.md_5.bungee.api.ChatColor;

public class AutomotaItems {

    /**
     * Use this method to instantiate all items involving Simple Automota
     */
    public static void setUpItems(SimpleAutomota instance) {
        /**
         * Instantiate the Wrench slimefun item
         */
        new Wrench(
            new SlimefunItemStack("AUTOMOTA_WRENCH", 
            Material.IRON_AXE, 
            "&bWrench", 
            "", 
            "&7Used to rotate blocks", 
            "&7and to pick up machines")
        ).register(instance);

        instance.getLogger().log(Level.INFO, ChatColor.GREEN + "Item's successfully setup!");
    }
}
