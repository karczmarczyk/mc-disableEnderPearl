package pl.karczmarczyk.disableEnderPearl;

import org.bukkit.plugin.java.JavaPlugin;
import pl.karczmarczyk.disableEnderPearl.listeners.MainListener;

/**
 *
 * @author mateusz
 */
public final class DisableEnderPearl extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DisableEnderPearl is running!");
        
        //ini listeners
        new MainListener(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("DisableEnderPearl is stoped!");
    }

}
