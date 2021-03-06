package net.tslat.aoa3.client.model.entities.minions;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelPenguin extends ModelBase {
	private ModelRenderer Foot1;
	private ModelRenderer body;
	private ModelRenderer Foot2;
	private ModelRenderer head;
	private ModelRenderer Beak_mouth;
	private ModelRenderer Beak_top;
	private ModelRenderer R_arm;
	private ModelRenderer L_arm;
	private ModelRenderer tail;

	public ModelPenguin() {
		textureWidth = 64;
		textureHeight = 32;
		(Foot1 = new ModelRenderer(this, 0, 17)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		Foot1.setRotationPoint(-2.0f, 18.0f, 0.0f);
		Foot1.setTextureSize(64, 32);
		Foot1.mirror = true;
		setRotation(Foot1, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 18, 17)).addBox(-4.0f, 0.0f, -4.0f, 8, 6, 7);
		body.setRotationPoint(0.0f, 12.0f, 0.0f);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(Foot2 = new ModelRenderer(this, 0, 17)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		Foot2.setRotationPoint(2.0f, 18.0f, 0.0f);
		Foot2.setTextureSize(64, 32);
		Foot2.mirror = true;
		setRotation(Foot2, 0.0f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head.setRotationPoint(0.0f, 12.0f, -2.0f);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(Beak_mouth = new ModelRenderer(this, 34, 13)).addBox(-2.0f, -3.0f, -5.0f, 4, 1, 1);
		Beak_mouth.setRotationPoint(0.0f, 12.0f, -2.0f);
		Beak_mouth.setTextureSize(64, 32);
		Beak_mouth.mirror = true;
		setRotation(Beak_mouth, 0.0f, 0.0f, 0.0f);
		(Beak_top = new ModelRenderer(this, 57, 13)).addBox(-1.0f, -4.0f, -5.0f, 2, 1, 1);
		Beak_top.setRotationPoint(0.0f, 12.0f, -2.0f);
		Beak_top.setTextureSize(64, 32);
		Beak_top.mirror = true;
		setRotation(Beak_top, 0.0f, 0.0f, 0.0f);
		(R_arm = new ModelRenderer(this, 46, 0)).addBox(-1.0f, 0.0f, -2.0f, 1, 7, 4);
		R_arm.setRotationPoint(-4.0f, 12.0f, 0.0f);
		R_arm.setTextureSize(64, 32);
		R_arm.mirror = true;
		setRotation(R_arm, 0.0f, 0.0f, 15.0f);
		(L_arm = new ModelRenderer(this, 34, 0)).addBox(0.0f, 0.0f, -1.955556f, 1, 7, 4);
		L_arm.setRotationPoint(4.0f, 12.0f, 0.0f);
		L_arm.setTextureSize(64, 32);
		L_arm.mirror = true;
		setRotation(L_arm, 0.0f, 0.0f, -15.0f);
		(tail = new ModelRenderer(this, 0, 28)).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 2);
		tail.setRotationPoint(0.0f, 18.0f, 3.0f);
		tail.setTextureSize(64, 32);
		tail.mirror = true;
		setRotation(tail, 0.7853982f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		Foot1.render(par7);
		body.render(par7);
		Foot2.render(par7);
		head.render(par7);
		Beak_mouth.render(par7);
		Beak_top.render(par7);
		R_arm.render(par7);
		L_arm.render(par7);
		tail.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		Beak_mouth.rotateAngleY = par4 / 57.295776f;
		Beak_mouth.rotateAngleX = par5 / 54.11268f;
		Beak_top.rotateAngleY = par4 / 57.295776f;
		Beak_top.rotateAngleX = par5 / 54.11268f;
		Foot1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		Foot1.rotateAngleY = 0.0f;
		Foot2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		R_arm.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.03f;
		L_arm.rotateAngleZ = -R_arm.rotateAngleZ;
	}
}
