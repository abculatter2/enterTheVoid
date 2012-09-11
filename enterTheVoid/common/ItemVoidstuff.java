package enterTheVoid.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntitySkeleton;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.World;

public class ItemVoidstuff extends Item {

	public ItemVoidstuff(int id) {
		super(id);
		maxStackSize = 1;
		this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	}

	public String getTextureFile() {
		return "/resources/VoidItemTextures.png";
	}
}
