package enterTheVoid.client;

import enterTheVoid.common.CommonProxyEnterTheVoid;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientEnterTheVoid extends CommonProxyEnterTheVoid {

	@Override
	public void registerRenderThings()
	{
		MinecraftForgeClient.preloadTexture("/enterTheVoid/VoidItemTextures.png");
		MinecraftForgeClient.preloadTexture("/enterTheVoid/VoidBlockTextures.png");
	}
}
