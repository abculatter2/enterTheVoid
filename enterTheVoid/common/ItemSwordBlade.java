package enterTheVoid.common;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;

public class ItemSwordBlade extends ItemSword
{
	public ItemSwordBlade(int itemID, EnumToolMaterial toolMaterial)
	{
		super(itemID, toolMaterial);
	}
	
	public String getTextureFile()
    {
            return "/resources/VoidItemTextures.png";
    }
}
