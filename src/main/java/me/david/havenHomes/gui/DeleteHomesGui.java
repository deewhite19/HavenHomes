package me.david.havenHomes.gui;

import me.david.havenHomes.HavenHomes;
import me.david.havenHomes.models.Home;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;


public class DeleteHomeGui {

    private final HavenHomes plugin;

    public DeleteHomeGui(HavenHomes plugin){
        this.plugin = plugin;
    }

    public void open(Player player){

        Inventory gui = Bukkit.createInventory(null, 27, "Delete Homes");

        List<Home> playerHomes = plugin.getHomeManager().getHomes(player.getUniqueId());

        int slot = 10;

        for(Home home : playerHomes){
            ItemStack item = new ItemStack(Material.PAPER);
            ItemMeta meta = item.getItemMeta();

            meta.setDisplayName("§c" + home.getName());
            meta.setCustomModelData(1002);

            item.setItemMeta(meta);

            gui.setItem(slot, item);

            slot++;

            if (slot >= 27){
                break;
            }
        }
        player.openInventory(gui);
    }
}
