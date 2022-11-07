package me.amg.trashguiplugin;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

// will open up trash gui using /trash
public class TrashCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;
            Inventory trashInventory = Bukkit.createInventory(p, 36, ChatColor.AQUA + "Trash Bin");

            p.openInventory(trashInventory);

        }
        else {
            sender.sendMessage("An in-game player must use this command!");
        }


        return true;
    }
}
