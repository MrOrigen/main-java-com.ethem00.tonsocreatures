package com.ethem00.tonsocreatures.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityDeer extends EntityCow
{
	public EntityDeer(World worldIn) 
	{
		super(worldIn);
	}

	@Override
	public EntityCow createChild(EntityAgeable ageable)
	{
		return new EntityDeer(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound() 
	{
		// TODO
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) 
	{
		// TODO
		return super.getHurtSound(source);
	}
	
	@Override
	protected SoundEvent getDeathSound() 
	{
		// TODO
		return super.getDeathSound();
	}
}
