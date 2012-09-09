package enterTheVoid;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class VoidItemVoidstuff extends Item {

	public VoidItemVoidstuff(int id) {
		super(id);
        maxStackSize = 1;
        this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	}
	
	public String getTextureFile()
	{
		return "/enterTheVoid/VoidItemTextures.png";
	}
}
