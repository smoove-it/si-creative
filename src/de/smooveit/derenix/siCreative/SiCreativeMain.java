package de.smooveit.derenix.siCreative;

import java.util.HashMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;

public class SiCreativeMain extends JavaPlugin {
	
	private final SiPlayerListener playerListener = new SiPlayerListener(this);
	private final SiEntityListener entityListener = new SiEntityListener(this);
	private final SiBlockListener blockListener = new SiBlockListener(this);
	public final HashMap<Player, Boolean> gods = new HashMap<Player, Boolean>();
	public final SiItemBlockDescriptor itemDes = new SiItemBlockDescriptor();
	public final SiPerformerItem itemPerformer = new SiPerformerItem(this); 
	
	public void onEnable()
	{
		this.itemDes.build();
		registerEvents();
	}

	public void registerEvents()
	{
		PluginManager pm = getServer().getPluginManager();
		PluginDescriptionFile pdFile = getDescription();
		
		pm.registerEvent( Event.Type.ENTITY_DAMAGE, entityListener, Event.Priority.Highest, this );
		pm.registerEvent( Event.Type.BLOCK_BREAK, blockListener, Event.Priority.Highest, this);
		pm.registerEvent( Event.Type.PLAYER_CHAT, playerListener, Event.Priority.Highest, this);
		
		logServer( "Version " + pdFile.getVersion() + " is enabled!" );
	}
	
	public void logServer( String message )
	{
		System.out.println( "[siCreative] " + message );
	}
	
	public void deregisterEvents()
	{
		
	}

	@Override
	public void onDisable()
	{
		deregisterEvents();
	}
}
