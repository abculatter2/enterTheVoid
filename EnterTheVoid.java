package enterTheVoid;

import net.minecraft.src.Block;
import net.minecraft.src.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import net.minecraft.src.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import enterTheVoid.common.CommonProxyEnterTheVoid;

@Mod(modid = "Enter: The Void", name = "Enter: The Void", version = "0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired  = false)

public class EnterTheVoid {

	//Blocks

	public static net.minecraft.src.Block Voidstone;
	public static int VoidstoneBlockID = 210;

	//Items

	public static Item Voidstuff;
	public static Item Realstuff;
	public static Item VoidSwordBlade;
	public static Item VoidSword;
	public static Item RealSwordBlade;
	public static Item RealSword;

	@SidedProxy(clientSide = "enterTheVoid.client.ClientEnterTheVoid", serverSide = "enterTheVoid.common.CommonProxyEnterTheVoid")
	public static CommonProxyEnterTheVoid proxy;

	@Init
	public void load(FMLInitializationEvent event)
	{

		//Blocks

		Voidstone = new VoidBlockVoidstone(VoidstoneBlockID, 0).setHardness(-1F).setResistance(18000000).setBlockName("Voidstone");
		Item.itemsList[VoidstoneBlockID] = new ItemBlockVoidstone(VoidstoneBlockID-256, Voidstone).setItemName("Voidstone");
		LanguageRegistry.instance().addStringLocalization("tile.Voidstone.Voidstone.name", "Voidstone");

		//Items

		//Pieces of Matter

		Voidstuff = new VoidItemVoidstuff(5000).setIconIndex(0).setItemName("Voidstuff");
		LanguageRegistry.addName(Voidstuff, "Voidstuff");
		Realstuff = new VoidItemRealstuff(5001).setIconIndex(1).setItemName("Realstuff");
		LanguageRegistry.addName(Realstuff, "Realstuff");

		//Tools

		//Materials
		
		final EnumToolMaterial MatVoidstuff = EnumHelper.addToolMaterial("Voidstuff", 20, 120, 3F, 4, 10);

		//Tier 0

		VoidSwordBlade = new ItemSwordBlade(5002, MatVoidstuff).setIconIndex(193).setItemName("Voidstuff Sword Blade");

		//Proxy

		proxy.registerRenderThings();

	}
}
