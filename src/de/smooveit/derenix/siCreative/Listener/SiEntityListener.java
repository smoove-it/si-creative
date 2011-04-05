package de.smooveit.derenix.siCreative.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityListener;

import de.smooveit.derenix.siCreative.SiCreativeMain;

public class SiEntityListener extends EntityListener
{
	
	public final SiCreativeMain plugin;
	
	public SiEntityListener( SiCreativeMain pPlugin )
	{
		this.plugin = pPlugin;
	}
	
	public void onEntityDamage( EntityDamageEvent e )
	{
		if( e.getEntity() instanceof Player && !e.isCancelled() )
		{
			e.setCancelled(true);
		}
	}
	
}
