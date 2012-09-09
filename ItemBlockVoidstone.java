package enterTheVoid;

import net.minecraft.src.Block;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class ItemBlockVoidstone extends ItemBlock
{
	public ItemBlockVoidstone(int par1, Block block)
	{
		super(par1);
		setHasSubtypes(true);
	}

	public String getItemNameIS(ItemStack itemstack)
	{
		String name = "";
		switch(itemstack.getItemDamage())
		{
		case 0:
		{
			name = "Voidstone";
			break;
		}
		case 1:
		{
			name = "Voidstone";
			break;
		}
		case 2:
		{
			name = "Voidstone";
			break;
		}
		default:
		{
			name = "Voidstone BLUH";
		}
		}
		return getItemName() + "." + name;
	}
	
	public int getMetadata(int par1)
	{
		return par1;
	}
}