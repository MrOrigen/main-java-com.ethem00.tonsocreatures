package com.ethem00.tonsocreatures.util.handlers;

import com.ethem00.tonsocreatures.entity.EntityDeer;
import com.ethem00.tonsocreatures.entity.render.RenderDeer;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityDeer.class, new IRenderFactory<EntityDeer>() 
		{
			@Override
			public Render<? super EntityDeer> createRenderFor(RenderManager manager)
			{
				return new RenderDeer(manager);
			}
		});
	}
}
