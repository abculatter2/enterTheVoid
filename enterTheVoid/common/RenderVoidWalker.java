package enterTheVoid.common;

import net.minecraft.src.ModelBase;
import net.minecraft.src.RenderLiving;

public class RenderVoidWalker extends RenderLiving {

	private ModelVoidwalker voidwalkerModel;

	public RenderVoidWalker() {
		super(new ModelVoidwalker(), 0.5f);
		this.voidwalkerModel = (ModelVoidwalker) super.mainModel;
	}

}
