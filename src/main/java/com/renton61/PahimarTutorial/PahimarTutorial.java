package com.renton61.PahimarTutorial;

import com.renton61.PahimarTutorial.handler.ConfigurationHandler;
import com.renton61.PahimarTutorial.init.ModItems;
import com.renton61.PahimarTutorial.proxy.Iproxy;
import com.renton61.PahimarTutorial.reference.Reference;
import com.renton61.PahimarTutorial.utitity.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class PahimarTutorial
{
    @Mod.Instance(Reference.MOD_ID)
    public static PahimarTutorial instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static Iproxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
   {
       ConfigurationHandler.init(event.getSuggestedConfigurationFile());
       FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
       LogHelper.info("Pre Init complete");

       ModItems.init();
   }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
LogHelper.info("Init complete");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
LogHelper.info("Post Pre Init complete");
    }
}

