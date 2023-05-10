package io.github.javezki.items.tools;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.javezki.groups.AutomotaGroup;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import lombok.NonNull;

/**
 * Wrench class for the wrench item(s)
 * TODO: Determine whether or not this is an abstract or final
 */
public class Wrench extends SimpleSlimefunItem<ItemUseHandler> {

    /**
     * @param item The itemstack of the wrench
     * @param id
     * @param recipeType
     * @param recipe
     */

    public Wrench(SlimefunItemStack item) {
        super(AutomotaGroup.getToolsGroup(), item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            null, null, null,
            null, new ItemStack(Material.IRON_AXE), null,
            null, null, null
        });
        //TODO Auto-generated constructor stub
    }
    /**
     * Used to initialize item handlers
     * Handler's won't run if there is no recipe
     */
    @NonNull
    @Override
    public void preRegister() {
        addItemHandler((ItemUseHandler) this::onWrenchClick);

    }
    /**
     * Called when the wrench is clicked
     * @param ev The event that is fired when the wrench is clicked
     */
    private void onWrenchClick(PlayerRightClickEvent ev) {
        ev.cancel();
        
        
    }
    @Override
    public ItemUseHandler getItemHandler() {
        return this::onWrenchClick;
    }
    
}
