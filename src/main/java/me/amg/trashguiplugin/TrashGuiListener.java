package me.amg.trashguiplugin;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class TrashGuiListener implements Listener {

    public void onInvClose(InventoryCloseEvent e) {
        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Trash Bin")) {
            e.getInventory().clear();

        }
    }


}
