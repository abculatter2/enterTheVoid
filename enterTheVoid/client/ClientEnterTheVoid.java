package enterTheVoid.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import enterTheVoid.common.CommonProxyEnterTheVoid;
import enterTheVoid.common.EntityVoidWalker;
import enterTheVoid.common.RenderVoidWalker;

public class ClientEnterTheVoid extends CommonProxyEnterTheVoid {

	@Override
	public void registerRenderThings()
	{
		MinecraftForgeClient.preloadTexture("/resources/VoidItemTextures.png");
		MinecraftForgeClient.preloadTexture("/resources/VoidBlockTextures.png");
	}
	
	@Override
	public void initializeEntityRendering() {
		RenderingRegistry.registerEntityRenderingHandler(EntityVoidWalker.class, new RenderVoidWalker());
	}
}
