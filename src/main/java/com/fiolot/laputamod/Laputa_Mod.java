package com.fiolot.laputamod;

import com.fiolot.laputamod.handler.ConfigurationHandler;
import com.fiolot.laputamod.init.ModItems;
import com.fiolot.laputamod.proxy.IProxy;
import com.fiolot.laputamod.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Laputa_Mod
{
    @Mod.Instance(Reference.MOD_ID)
    public static Laputa_Mod instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}
