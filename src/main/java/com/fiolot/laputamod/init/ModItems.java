package com.fiolot.laputamod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import com.fiolot.laputamod.item.ItemLM;
import com.fiolot.laputamod.item.ItemMysteriousStone;
import  com.fiolot.laputamod.item.ItemFloatingStone;

public class ModItems
{
    public static final ItemLM MysteriousStone = new ItemMysteriousStone();
    public static final ItemLM FloatingStone = new ItemFloatingStone();
    public static void init()
    {
        GameRegistry.registerItem(MysteriousStone, "MysteriuosStone");
        GameRegistry.registerItem(FloatingStone, "FloatingStone");
    }
}
