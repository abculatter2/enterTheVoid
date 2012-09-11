package enterTheVoid.common;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class VoidBlockVoidstone extends Block {

	public VoidBlockVoidstone(int par1, int par2) {
		super(par1, par2, Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setRequiresSelfNotify();
		setHardness(-1F);
		setResistance(18000000);
	}

	public String getTextureFile() {
		return "/resources/VoidBlockTextures.png";
	}

	public int getBlockTextureFromSideAndMetadata(int par1, int par2) {
		switch (par2) {
		case 1:
			return 1;
		case 2:
			return 2;
		default:
			return 0;
		}
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 <= 2; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

}
