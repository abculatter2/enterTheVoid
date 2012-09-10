package enterTheVoid.client;

import net.minecraftforge.client.MinecraftForgeClient;
import enterTheVoid.common.CommonProxyEnterTheVoid;

public class ClientEnterTheVoid extends CommonProxyEnterTheVoid {

	@Override
	public void registerRenderThings()
	{
		MinecraftForgeClient.preloadTexture("/enterTheVoid/VoidItemTextures.png");
		MinecraftForgeClient.preloadTexture("/enterTheVoid/VoidBlockTextures.png");
	}
}
