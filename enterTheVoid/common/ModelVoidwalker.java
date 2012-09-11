package enterTheVoid.common;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelVoidwalker extends ModelBase {
	// fields
	ModelRenderer RightHeel;
	ModelRenderer RightToe1;
	ModelRenderer RightToe2;
	ModelRenderer RightToe3;
	ModelRenderer LeftHeel;
	ModelRenderer LeftToe1;
	ModelRenderer LeftToe2;
	ModelRenderer LeftToe3;
	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer LeftArm;
	ModelRenderer RightArm;
	ModelRenderer RightLeg;
	ModelRenderer LeftLeg;
	ModelRenderer LeftLowerArm;
	ModelRenderer LeftLowerLeg;
	ModelRenderer RightLowerLeg;
	ModelRenderer RightLowerArm;

	public ModelVoidwalker() {
		textureWidth = 64;
		textureHeight = 32;

		RightHeel = new ModelRenderer(this, 25, 0);
		RightHeel.addBox(0F, 0F, 0F, 2, 3, 2);
		RightHeel.setRotationPoint(-5F, 20F, 1F);
		RightHeel.setTextureSize(64, 32);
		RightHeel.mirror = true;
		setRotation(RightHeel, 0F, 0F, 0F);
		RightToe1 = new ModelRenderer(this, 0, 0);
		RightToe1.addBox(0F, 0F, 0F, 1, 3, 1);
		RightToe1.setRotationPoint(-5F, 22F, 1F);
		RightToe1.setTextureSize(64, 32);
		RightToe1.mirror = true;
		setRotation(RightToe1, -0.7853982F, 0.7853982F, 0F);
		RightToe2 = new ModelRenderer(this, 0, 0);
		RightToe2.addBox(0F, 0F, -1F, 1, 3, 1);
		RightToe2.setRotationPoint(-5F, 22F, 3F);
		RightToe2.setTextureSize(64, 32);
		RightToe2.mirror = true;
		setRotation(RightToe2, 0.7853982F, -0.7853982F, 0F);
		RightToe3 = new ModelRenderer(this, 0, 0);
		RightToe3.addBox(0F, 0F, 0F, 1, 3, 1);
		RightToe3.setRotationPoint(-4F, 22F, 1.5F);
		RightToe3.setTextureSize(64, 32);
		RightToe3.mirror = true;
		setRotation(RightToe3, 0F, 0F, -0.7853982F);
		LeftHeel = new ModelRenderer(this, 25, 0);
		LeftHeel.addBox(0F, 0F, 0F, 2, 3, 2);
		LeftHeel.setRotationPoint(4F, 20F, -4.5F);
		LeftHeel.setTextureSize(64, 32);
		LeftHeel.mirror = true;
		setRotation(LeftHeel, 0F, 0.7853982F, 0F);
		LeftToe1 = new ModelRenderer(this, 0, 0);
		LeftToe1.addBox(0F, 0F, 0F, 1, 3, 1);
		LeftToe1.setRotationPoint(4.5F, 22F, -5.5F);
		LeftToe1.setTextureSize(64, 32);
		LeftToe1.mirror = true;
		setRotation(LeftToe1, -0.7853982F, 0F, 0F);
		LeftToe2 = new ModelRenderer(this, 0, 0);
		LeftToe2.addBox(0F, 0F, 0F, 1, 3, 1);
		LeftToe2.setRotationPoint(6.5F, 22F, -4.5F);
		LeftToe2.setTextureSize(64, 32);
		LeftToe2.mirror = true;
		setRotation(LeftToe2, -0.7853982F, -1.570796F, 0F);
		LeftToe3 = new ModelRenderer(this, 0, 0);
		LeftToe3.addBox(0F, 0F, 0F, 1, 3, 1);
		LeftToe3.setRotationPoint(5F, 22F, -5F);
		LeftToe3.setTextureSize(64, 32);
		LeftToe3.mirror = true;
		setRotation(LeftToe3, 0.7853982F, -0.7853982F, 0F);
		Head = new ModelRenderer(this, 0, 0);
		Head.addBox(-4F, -8F, -6F, 8, 8, 8);
		Head.setRotationPoint(-4F, -11F, -7F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Body = new ModelRenderer(this, 0, 16);
		Body.addBox(-4F, -5F, -2F, 8, 12, 4);
		Body.setRotationPoint(-2F, -8F, -3F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0.7853982F, 0.7853982F, 0F);
		// LeftArm.mirror = true;
		LeftArm = new ModelRenderer(this, 33, 0);
		LeftArm.addBox(-1F, 0F, -1F, 2, 15, 2);
		LeftArm.setRotationPoint(0F, -11F, -8F);
		LeftArm.setTextureSize(64, 32);
		LeftArm.mirror = true;
		setRotation(LeftArm, -0.7853982F, -0.7853982F, 0F);
		LeftArm.mirror = false;
		RightArm = new ModelRenderer(this, 33, 0);
		RightArm.addBox(-1F, 0F, -1F, 2, 15, 2);
		RightArm.setRotationPoint(-7F, -11F, -2F);
		RightArm.setTextureSize(64, 32);
		RightArm.mirror = true;
		setRotation(RightArm, -0.2617994F, 0.7853982F, 0F);
		RightLeg = new ModelRenderer(this, 33, 0);
		RightLeg.addBox(-1F, 0F, -1F, 2, 15, 2);
		RightLeg.setRotationPoint(-1F, -2F, 2F);
		RightLeg.setTextureSize(64, 32);
		RightLeg.mirror = true;
		setRotation(RightLeg, 0F, 0F, 0.7853982F);
		// LeftLeg.mirror = true;
		LeftLeg = new ModelRenderer(this, 33, 0);
		LeftLeg.addBox(-1F, 0F, -1F, 2, 15, 2);
		LeftLeg.setRotationPoint(3F, -2F, -2F);
		LeftLeg.setTextureSize(64, 32);
		LeftLeg.mirror = true;
		setRotation(LeftLeg, -0.7853982F, -0.7853982F, 0F);
		LeftLeg.mirror = false;
		LeftLowerArm = new ModelRenderer(this, 41, 0);
		LeftLowerArm.addBox(-1F, 0F, -1F, 2, 15, 2);
		LeftLowerArm.setRotationPoint(7F, -1F, -15F);
		LeftLowerArm.setTextureSize(64, 32);
		LeftLowerArm.mirror = true;
		setRotation(LeftLowerArm, -0.7853982F, 0.7853982F, 0F);
		LeftLowerLeg = new ModelRenderer(this, 41, 0);
		LeftLowerLeg.addBox(-1F, 0F, -1F, 2, 15, 2);
		LeftLowerLeg.setRotationPoint(10F, 8F, -9F);
		LeftLowerLeg.setTextureSize(64, 32);
		LeftLowerLeg.mirror = true;
		setRotation(LeftLowerLeg, 0.5235988F, -0.7853982F, 0F);
		RightLowerLeg = new ModelRenderer(this, 41, 0);
		RightLowerLeg.addBox(-1F, 0F, -1F, 2, 15, 2);
		RightLowerLeg.setRotationPoint(-11F, 8F, 2F);
		RightLowerLeg.setTextureSize(64, 32);
		RightLowerLeg.mirror = true;
		setRotation(RightLowerLeg, 0F, 0F, -0.5235988F);
		RightLowerArm = new ModelRenderer(this, 41, 0);
		RightLowerArm.addBox(-1F, 0F, -1F, 2, 15, 2);
		RightLowerArm.setRotationPoint(-10F, 3F, -5F);
		RightLowerArm.setTextureSize(64, 32);
		RightLowerArm.mirror = true;
		setRotation(RightLowerArm, 0.1745329F, 0.7853982F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5);
		RightHeel.render(f5);
		RightToe1.render(f5);
		RightToe2.render(f5);
		RightToe3.render(f5);
		LeftHeel.render(f5);
		LeftToe1.render(f5);
		LeftToe2.render(f5);
		LeftToe3.render(f5);
		Head.render(f5);
		Body.render(f5);
		LeftArm.render(f5);
		RightArm.render(f5);
		RightLeg.render(f5);
		LeftLeg.render(f5);
		LeftLowerArm.render(f5);
		LeftLowerLeg.render(f5);
		RightLowerLeg.render(f5);
		RightLowerArm.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
		
		this.Head.rotateAngleY = f4 / (180f / (float)Math.PI);
		this.Head.rotateAngleX = -(f5 / (180f / (float)Math.PI));
	}
}
