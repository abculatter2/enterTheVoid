package enterTheVoid.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemRealstuff extends Item {

	public ItemRealstuff(int id) {
		super(id);
        maxStackSize = 12;
        this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	}
	
	public String getTextureFile()
	{
		return "/resources/VoidItemTextures.png";
	}
}
