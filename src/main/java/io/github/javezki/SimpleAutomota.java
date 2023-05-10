package io.github.javezki;

import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.javezki.groups.AutomotaGroup;
import io.github.javezki.items.AutomotaItems;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import net.md_5.bungee.api.ChatColor;

public class SimpleAutomota extends JavaPlugin implements SlimefunAddon {

    // The main category name ID
    public static final String MAIN_CATEGORY = "SIMPLE_AUTOMOTA";
    public static final String OUTPUT_CATEGORY = "OUTPUT_AUTOMOTA";
    private static SimpleAutomota instance;

    @Override
    public void onEnable() {
        // Instantiate config file
        Config cfg = new Config(this);

        getLogger().info("Loading Simple Automota v" + getDescription().getVersion() + "...");

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }
        AutomotaGroup.setUp();
        AutomotaItems.setUpItems(this);

        getServer().getConsoleSender().sendMessage(ChatColor.GOLD +
                "Simple Automota v" + getDescription().getVersion()
                + " has been enabled! Thanks for using Simple Automota!\n" +
                "Report any bugs to: " + getBugTrackerURL());
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

    public static NamespacedKey newKey(String key) {
        return new NamespacedKey(SimpleAutomota.getPlugin(SimpleAutomota.class), key);
    }

    public static SimpleAutomota getInstance() {
        return instance;
    }

}
