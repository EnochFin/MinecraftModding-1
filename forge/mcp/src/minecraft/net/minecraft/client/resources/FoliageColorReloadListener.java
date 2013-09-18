package net.minecraft.client.resources;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.io.IOException;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.ColorizerFoliage;

@SideOnly(Side.CLIENT)
public class FoliageColorReloadListener implements ResourceManagerReloadListener
{
    private static final ResourceLocation field_130079_a = new ResourceLocation("textures/colormap/foliage.png");

    public void func_110549_a(ResourceManager par1ResourceManager)
    {
        try
        {
            ColorizerFoliage.setFoliageBiomeColorizer(TextureUtil.func_110986_a(par1ResourceManager, field_130079_a));
        }
        catch (IOException ioexception)
        {
            ;
        }
    }
}
