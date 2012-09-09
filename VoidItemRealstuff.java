package enterTheVoid;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class VoidItemRealstuff extends Item {

	public VoidItemRealstuff(int id) {
		super(id);
        maxStackSize = 12;
        this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	}
	
	public String getTextureFile()
	{
		return "/enterTheVoid/VoidItemTextures.png";
	}
}
