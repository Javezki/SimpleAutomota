package io.github.javezki;

import java.util.logging.Level;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class SimpleAutomota extends JavaPlugin implements SlimefunAddon {

    // The main category name ID
    public static final String MAIN_CATEGORY = "SIMPLE_AUTOMOTA";
    public static final String OUTPUT_CATEGORY = "OUTPUT_AUTOMOTA";

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

        /*
         * 1. Creating a new Category
         * This Category will use the following ItemStack
         */
        ItemStack itemGroupItem = new CustomItemStack(Material.HOPPER, "&4SimpleAutomata", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey itemGroupId = new NamespacedKey(this, MAIN_CATEGORY);
        NestedItemGroup nestedItemGroup = new NestedItemGroup(itemGroupId, itemGroupItem);
        ItemGroup outputGroup = new SubItemGroup(itemGroupId, nestedItemGroup, new CustomItemStack(Material.HOPPER, "&4Output", OUTPUT_CATEGORY, "&a> Output items"));
        /*
         * 2. Create a new SlimefunItemStack
         * This class has many constructors, it is very important
         * that you give each item a unique id.
         */
        SlimefunItemStack slimefunItem = new SlimefunItemStack("basic_hopper", Material.DIAMOND, "&4Basic Hopper", "&c+What does it do?");


        /*
         * 3. Creating a Recipe
         * The Recipe is an ItemStack Array with a length of 9.
         * It represents a Shaped Recipe in a 3x3 crafting grid.
         * The machine in which this recipe is crafted in is specified
         * further down as the RecipeType.
         */

        /**
         * Recipe: 
         * Magnesium Ingot, Magnesium Ingot, Magnesium Ingot
         * Magnesium Ingot, Hopper, Magnesium Ingot
         * Magnesium Ingot, Magnesium Ingot, Magnesium Ingot
         */
        ItemStack[] recipe = 
        {
            new ItemStack(SlimefunItems.MAGNESIUM_INGOT),  new ItemStack(SlimefunItems.MAGNESIUM_INGOT), new ItemStack(SlimefunItems.MAGNESIUM_INGOT),
            new ItemStack(SlimefunItems.MAGNESIUM_INGOT), new ItemStack(Material.HOPPER), new ItemStack(SlimefunItems.MAGNESIUM_INGOT),
            new ItemStack(SlimefunItems.MAGNESIUM_INGOT), new ItemStack(SlimefunItems.MAGNESIUM_INGOT), new ItemStack(SlimefunItems.MAGNESIUM_INGOT)
        };

        /*
         * 4. Registering the Item
         * Now you just have to register the item.
         * RecipeType.ENHANCED_CRAFTING_TABLE refers to the machine in
         * which this item is crafted in.
         * Recipe Types from Slimefun itself will automatically add the recipe to that machine.
         */
        SlimefunItem item = new SlimefunItem(outputGroup, slimefunItem, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        item.register(this);

        getLogger().log(Level.CONFIG, "&6Sucessfully initialized SimpleAutomota!");
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/Javezki/SimpleAutomota/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }

}
