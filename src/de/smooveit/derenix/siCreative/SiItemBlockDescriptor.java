package de.smooveit.derenix.siCreative;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class SiItemBlockDescriptor {

	public final HashMap<String, Integer> mEntities = new HashMap<String, Integer>();

	public final Integer get(String name) {
		if (mEntities.containsKey(name)) {
			return mEntities.get(name);
		}

		return -1;
	}

	public final Integer search(String name) {
		return get(name);
	}

	public final void build()
	{
		mEntities.put("air", 0);
		mEntities.put("stone", 1);
		mEntities.put("grass", 2);
		mEntities.put("dirt", 3);
		mEntities.put("cobblestone", 4);
		mEntities.put("wooden plank", 5);
		mEntities.put("sapling", 6);
		mEntities.put("bedrock", 7);
		mEntities.put("water", 8);
		mEntities.put("stationary water", 9);
		mEntities.put("lava", 10);
		mEntities.put("stationary lava", 11);
		mEntities.put("sand", 12);
		mEntities.put("gravel", 13);
		mEntities.put("gold ore", 14);
		mEntities.put("iron ore", 15);
		mEntities.put("coal ore", 16);
		mEntities.put("wood", 17);
		mEntities.put("leaves", 18);
		mEntities.put("sponge", 19);
		mEntities.put("glass", 20);
		mEntities.put("lapius lazuli ore", 21);
		mEntities.put("lapius lazuli block", 22);
		mEntities.put("dispenser", 23);
		mEntities.put("sandstone", 24);
		mEntities.put("note block", 25);
		mEntities.put("bed", 26);
		
		mEntities.put("wool", 35);
		mEntities.put("yellow flower", 37);
		mEntities.put("red rose", 38);
		mEntities.put("brown mushroom", 39);
		mEntities.put("red mushroom", 40);
		mEntities.put("gold block", 41);
		mEntities.put("iron blick", 42);
		mEntities.put("double slab", 43);
		mEntities.put("slab", 44);
		mEntities.put("brick block", 45);
		mEntities.put("tnt", 46);
		mEntities.put("bookshelf", 47);
		mEntities.put("moos stone", 48);
		mEntities.put("obsidian", 49);
		mEntities.put("torch", 50);
		mEntities.put("fire", 51);
		mEntities.put("monster spawner", 52);
		mEntities.put("wooden stairs", 53);
		mEntities.put("chest", 54);
		mEntities.put("redstone wire", 55);
		mEntities.put("diamond ore", 56);
		mEntities.put("diamond block", 57);
		mEntities.put("crafting table", 58);
		mEntities.put("crops", 59);
		mEntities.put("farmland", 60);
		mEntities.put("furnace", 61);
	}

	public boolean has(String name)
	{
		if( mEntities.containsKey(name) )
		{
			return true;
		}
		
		return false;
	}
}
