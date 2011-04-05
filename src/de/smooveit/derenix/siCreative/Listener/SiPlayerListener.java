package de.smooveit.derenix.siCreative.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

import de.smooveit.derenix.siCreative.SiCreativeMain;

public class SiPlayerListener extends PlayerListener {

	public final SiCreativeMain plugin;
	
	public SiPlayerListener( SiCreativeMain pPlugin )
	{
		this.plugin = pPlugin;
	}
	
	public void onChat( PlayerChatEvent e )
	{
		if( e.getMessage().startsWith("--") )
		{
			String message = e.getMessage().replaceFirst("--", "");
			String[] cmd = message.split(" ");
			
			if( cmd.equals("give")) this.plugin.itemPerformer.give( cmd[1], e.getPlayer()); 
		}
	}
	
}
