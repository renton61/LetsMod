package com.renton61.PahimarTutorial.init;

import com.renton61.PahimarTutorial.item.ItemLMRB;
import com.renton61.PahimarTutorial.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMRB mapleleaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleleaf, "mapleLeaf");
    }
}
