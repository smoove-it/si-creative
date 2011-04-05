package de.smooveit.derenix.siCreative.Listener;

import org.bukkit.block.*;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockListener;

import de.smooveit.derenix.siCreative.SiCreativeMain;

public class SiBlockListener extends BlockListener {

	private final SiCreativeMain plugin;
	
	public SiBlockListener( final SiCreativeMain pPlugin )
	{
		this.plugin = pPlugin;
	}
	
}
