package enterTheVoid.common;

import java.util.logging.Level;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.ForgeSubscribe;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "EnterTheVoid", name = "Enter: The Void", version = "0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class EnterTheVoid {

	// Blocks

	public static net.minecraft.src.Block Voidstone;
	public static int VoidstoneBlockID;

	@Instance("EnterTheVoid")
	public static EnterTheVoid instance;

	// Items

	public static Item Voidstuff;
	public static Item Realstuff;
	public static Item VoidSwordBlade;
	public static Item VoidSword;
	public static Item RealSwordBlade;
	public static Item RealSword;

	public static int VoidstuffItemId;
	public static int RealstuffItemId;
	public static int VoidSwordBladeItemId;
	public static int VoidSwordItemId;
	public static int RealSwordBladeItemId;
	public static int RealSwordItemId;

	@SidedProxy(clientSide = "enterTheVoid.client.ClientEnterTheVoid", serverSide = "enterTheVoid.common.CommonProxyEnterTheVoid")
	public static CommonProxyEnterTheVoid proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		try {
			config.load();
			VoidstoneBlockID = config.getOrCreateBlockIdProperty("Voidstuff", 210).getInt(210);
			VoidstuffItemId = config.getOrCreateIntProperty("VoidStuff", "item", 5000).getInt(5000);
			RealstuffItemId = config.getOrCreateIntProperty("RealStuff", "item", 5001).getInt(5001);
			VoidSwordBladeItemId = config.getOrCreateIntProperty("Voidstuff Sword Blade", "item", 5002).getInt(5002);

		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, "Enter the Void failed to load configurations.");
		} finally {
			config.save();
		}
	}

	@Init
	public void load(FMLInitializationEvent event) {

		// Blocks

		Voidstone = new VoidBlockVoidstone(VoidstoneBlockID, 0);
		GameRegistry.registerBlock(Voidstone.setBlockName("Voidstone"));
		LanguageRegistry.addName(Voidstone, "Voidstone");

		// Items

		// Entities
		EntityRegistry.registerGlobalEntityID(EntityVoidWalker.class, "VoidWalker", 100, 0xffff00, 0x000ff);

		// Pieces of Matter

		Voidstuff = new ItemVoidstuff(VoidstuffItemId).setIconIndex(0).setItemName("Voidstuff");
		LanguageRegistry.addName(Voidstuff, "Voidstuff");
		Realstuff = new ItemRealstuff(RealstuffItemId).setIconIndex(1).setItemName("Realstuff");
		LanguageRegistry.addName(Realstuff, "Realstuff");

		// Tools

		// Materials

		final EnumToolMaterial MatVoidstuff = EnumHelper.addToolMaterial("Voidstuff", 20, 120, 3F, 4, 10);

		// Tier 0

		VoidSwordBlade = new ItemSwordBlade(VoidSwordBladeItemId, MatVoidstuff).setIconIndex(226).setItemName("Voidstuff Sword Blade");
		LanguageRegistry.addName(VoidSwordBlade, "Voidstuff Sword Blade");
		// Proxy

		proxy.registerRenderThings();
		proxy.initializeEntityRendering();

	}
}
