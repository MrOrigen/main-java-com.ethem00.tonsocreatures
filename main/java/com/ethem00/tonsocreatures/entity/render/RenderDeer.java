package com.ethem00.tonsocreatures.entity.render;

import com.ethem00.tonsocreatures.entity.EntityDeer;
import com.ethem00.tonsocreatures.model.ModelMaleDeer;
import com.ethem00.tonsocreatures.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDeer extends RenderLiving<EntityDeer>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/animal/deertexture.png");
	
	public RenderDeer(RenderManager manager)
	{
		super(manager, new ModelMaleDeer(), 0.5f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDeer entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityDeer entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving,  p_77043_2_,  rotationYaw,  partialTicks);
	}
}
