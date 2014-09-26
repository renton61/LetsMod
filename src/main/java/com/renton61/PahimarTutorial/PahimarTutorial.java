package com.renton61.PahimarTutorial;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="PahimarTutorial", name="Pahimar Tutorial", version="1.0")

public class PahimarTutorial
{
    @Mod.Instance("PahimarTutorial")
    public static PahimarTutorial instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
   {

   }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }
}

