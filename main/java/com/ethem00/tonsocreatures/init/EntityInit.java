package com.ethem00.tonsocreatures.init;

import com.ethem00.tonsocreatures.Main;
import com.ethem00.tonsocreatures.entity.EntityDeer;
import com.ethem00.tonsocreatures.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("deer", EntityDeer.class, Reference.ENTITY_DEER, 20, 11437146, 000000);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
