package com.renton61.PahimarTutorial.handler;

import com.renton61.PahimarTutorial.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        // Create the config object from the file
        if(configuration == null)
        {
        configuration = new Configuration(configFile);
            LoadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            LoadConfiguration();
        }
    }

    private static void LoadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", configuration.CATEGORY_GENERAL, false, "Test Example");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
