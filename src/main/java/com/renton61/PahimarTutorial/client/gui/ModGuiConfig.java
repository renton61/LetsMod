package com.renton61.PahimarTutorial.client.gui;

import com.renton61.PahimarTutorial.PahimarTutorial;
import com.renton61.PahimarTutorial.handler.ConfigurationHandler;
import com.renton61.PahimarTutorial.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig
{

    public ModGuiConfig(GuiScreen guiscreen)
    {
        super(guiscreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));

    }
}
