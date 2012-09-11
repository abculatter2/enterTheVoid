package enterTheVoid.common;

import net.minecraft.src.EntityMob;
import net.minecraft.src.World;

public class EntityVoidWalker extends EntityMob {

	public EntityVoidWalker(World par1World) {
		super(par1World);
		this.texture = "/resources/VoidWalkerText.png";
		this.moveSpeed = 0.2F;
		this.attackStrength = 7;
//		this.setSize(0.6F, 2.9F);
		this.stepHeight = 1.0F;
	}

	@Override
	public int getMaxHealth() {
		return 40;
	}

	@Override
	public void onLivingUpdate() {
		// TODO Auto-generated method stub
		super.onLivingUpdate();
	}

}
