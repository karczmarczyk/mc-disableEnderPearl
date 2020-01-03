package pl.karczmarczyk.disableEnderPearl.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;
import pl.karczmarczyk.disableEnderPearl.DisableEnderPearl;

/**
 *
 * @author mateusz
 */
public final class MainListener implements Listener {
    
    DisableEnderPearl instance;
    
    public MainListener (DisableEnderPearl plugin) {
        instance = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    
    @EventHandler
    public void onTeleport(PlayerTeleportEvent event) {
        instance.getLogger().info("Starting teleport!");
        if (event.getCause().equals(PlayerTeleportEvent.TeleportCause.ENDER_PEARL)) {
            event.setCancelled(true);
            instance.getLogger().info("Ender Pearl stopped!");
            Player player = event.getPlayer();
            player.sendMessage("Teleport za pomocą EnderPerły jest wyłączony :)");
        }
    }
}
