package net.psiokoksy.pwrmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier PWRTIER = new ForgeTier(3, 500, 6.5f, 2.5f, 15, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.COPPER_INGOT) );
}
