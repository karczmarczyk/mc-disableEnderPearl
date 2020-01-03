package pl.karczmarczyk.disableEnderPearl;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author mateusz
 */
public final class DisableEnderPearl extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DisableEnderPearl is running!");
    }

    @Override
    public void onDisable() {
        getLogger().info("DisableEnderPearl is stoped!");
    }

    @EventHandler
    public void onTeleport(PlayerTeleportEvent event) {
        if (event.getCause().equals(TeleportCause.ENDER_PEARL)) {
            event.setCancelled(true);
            getLogger().info("Ender Pearl stopped!");
        }
    }

}
