package de.smooveit.derenix.siCreative.Performer;

import org.bukkit.entity.Player;

import de.smooveit.derenix.siCreative.SiCreativeMain;

public class SiPerformerItem extends SiPerformer {

	public final SiCreativeMain instance;
	
	public SiPerformerItem(SiCreativeMain instance)
	{
		super(instance);
		this.instance = instance;
	}

	public void give( Integer id, Player player )
	{
		
	}
	
	public void give( String name, Player player )
	{
		if( this.instance.itemDes.has( name ) )
		{
			this.instance.logServer("give " + name + " to " + player.getName() );
			return;
		}
	}	
}