package io.github.javezki.groups;

import org.bukkit.Material;

import io.github.javezki.SimpleAutomota;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.Getter;

public final class AutomotaGroup {

    private AutomotaGroup() {
    };

    // The main category shown on the first page of the slimefun guide

    @Getter
    private static NestedItemGroup nestedItemGroup;

    @Getter
    private static ItemGroup toolsGroup;

    // The output group thats within the main group
    // TODO: Change display model of output group
    @Getter
    private static ItemGroup outputGroup;

    // The input group
    // TODO: Change display model of groups
    @Getter
    private static ItemGroup inputGroup;

    public static void setUp() {

        nestedItemGroup = new NestedItemGroup(
                SimpleAutomota.newKey(AutomotaGroups.MAIN.toString()),
                new CustomItemStack(Material.HOPPER, "&4Simple Automata", "", "&a> Click to open"));

        toolsGroup = new SubItemGroup(
                SimpleAutomota.newKey(AutomotaGroups.TOOLS.toString()),
                nestedItemGroup,
                new CustomItemStack(Material.IRON_AXE, "&2Tools", "", "&a> Tools for automota"));

        outputGroup = new SubItemGroup(
                SimpleAutomota.newKey(AutomotaGroups.OUTPUT.toString()),
                nestedItemGroup,
                new CustomItemStack(Material.HOPPER, "&4Output", "", "&a> Output items"));

        inputGroup = new SubItemGroup(
                SimpleAutomota.newKey(AutomotaGroups.INPUT.toString()),
                nestedItemGroup,
                new CustomItemStack(Material.HOPPER, "&3Input", "", "&a> Input Items"));

    }

}
