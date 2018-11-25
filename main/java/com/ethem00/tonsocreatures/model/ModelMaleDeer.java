

package com.ethem00.tonsocreatures.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMaleDeer extends ModelBase
{
  //fields
    public ModelRenderer Body;
    public ModelRenderer HindLegR;
    public ModelRenderer HindLegL;
    public ModelRenderer FrontLegR;
    public ModelRenderer FrontLegL;
    public ModelRenderer Head;
  
  public ModelMaleDeer()
  {
    textureWidth = 64;
    textureHeight = 64;
    setTextureOffset("Body.MainBody", 16, 0);
    setTextureOffset("Body.Tail", 8, 20);
    setTextureOffset("HindLegR.RightHind1", 49, 24);
    setTextureOffset("HindLegR.RightHind2", 51, 32);
    setTextureOffset("HindLegR.RightHind3", 53, 38);
    setTextureOffset("HindLegL.LeftHind1", 49, 24);
    setTextureOffset("HindLegL.LeftHind2", 51, 32);
    setTextureOffset("HindLegL.LeftHind3", 53, 38);
    setTextureOffset("FrontLegR.RightFront1", 34, 24);
    setTextureOffset("FrontLegR.RightFront2", 36, 32);
    setTextureOffset("FrontLegR.RightFront3", 38, 37);
    setTextureOffset("FrontLegL.LeftFront1", 34, 24);
    setTextureOffset("FrontLegL.LeftFront2", 36, 32);
    setTextureOffset("FrontLegL.LeftFront3", 38, 37);
    setTextureOffset("Head.Beard1", 0, 50);
    setTextureOffset("Head.Head1", 0, 40);
    setTextureOffset("Head.Head2", 0, 33);
    setTextureOffset("Head.LeftEar", 0, 30);
    setTextureOffset("Head.RightEar", 0, 30);
    setTextureOffset("Head.AntlerLeft3", 22, 26);
    setTextureOffset("Head.AntlerLeft2", 22, 28);
    setTextureOffset("Head.AntlerLeft1", 22, 30);
    setTextureOffset("Head.AntlerLeft4", 28, 25);
    setTextureOffset("Head.AntlerRight1", 22, 30);
    setTextureOffset("Head.AntlerRight2", 22, 28);
    setTextureOffset("Head.AntlerRight3", 22, 26);
    setTextureOffset("Head.AntlerRight4", 28, 25);
    
    Body = new ModelRenderer(this, "Body");
    Body.setRotationPoint(0F, 0F, 0F);
    setRotation(Body, 0F, 0F, 0F);
    Body.mirror = true;
      Body.addBox("MainBody", -4F, -4F, -8F, 8, 8, 16);
      Body.addBox("Tail", -1F, -3F, 8F, 2, 3, 1);
    HindLegR = new ModelRenderer(this, "HindLegR");
    HindLegR.setRotationPoint(-4F, 2F, 5F);
    setRotation(HindLegR, 0F, 0F, 0F);
    HindLegR.mirror = true;
      HindLegR.addBox("RightHind1", -1F, -2F, -2F, 2, 4, 4);
      HindLegR.addBox("RightHind2", -1F, 2F, -1F, 2, 3, 3);
      HindLegR.addBox("RightHind3", -1F, 5F, 0F, 2, 6, 2);
    HindLegL = new ModelRenderer(this, "HindLegL");
    HindLegL.setRotationPoint(4F, 2F, 5F);
    setRotation(HindLegL, 0F, 0F, 0F);
    HindLegL.mirror = true;
    FrontLegR = new ModelRenderer(this, "FrontLegR");
    FrontLegR.setRotationPoint(-4F, 2F, -5F);
    setRotation(FrontLegR, 0F, 0F, 0F);
    FrontLegR.mirror = true;
      FrontLegR.addBox("RightFront1", -1F, -2F, -2F, 2, 4, 4);
      FrontLegR.addBox("RightFront2", -1F, 2F, -1F, 2, 2, 3);
      FrontLegR.addBox("RightFront3", -1F, 4F, 0F, 2, 7, 2);
    FrontLegL = new ModelRenderer(this, "FrontLegL");
    FrontLegL.setRotationPoint(4F, 2F, -5F);
    setRotation(FrontLegL, 0F, 0F, 0F);
    FrontLegL.mirror = true;
    Head = new ModelRenderer(this, "Head");
    Head.setRotationPoint(0F, -4F, -8F);
    setRotation(Head, 0F, 0F, 0F);
    Head.mirror = true;
      Head.addBox("Beard1", -2F, -2F, -2F, 4, 7, 5);
      Head.addBox("Head1", -2F, -5F, -3F, 4, 3, 6);
      Head.addBox("Head2", -2F, -7F, -1F, 4, 2, 4);
      Head.addBox("AntlerRight1", -2F, -9F, 1F, 1, 2, 1);
      Head.addBox("AntlerRight2", -5F, -10F, 1F, 4, 1, 1);
      Head.addBox("AntlerRight3", -2F, -11F, 1F, 1, 1, 1);
      Head.addBox("AntlerRight4", -4F, -12F, 1F, 1, 2, 1);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    HindLegR.render(f5);
    HindLegL.render(f5);
    FrontLegR.render(f5);
    FrontLegL.render(f5);
    Head.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
