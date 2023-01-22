package net.psiokoksy.pwrmod.item;

import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.psiokoksy.pwrmod.PWRMod;
import net.psiokoksy.pwrmod.block.ModBlocks;

import static net.psiokoksy.pwrmod.PWRMod.MOD_ID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> pwr_miecz =
            ITEMS.register("pwr_miecz", () -> new SwordItem(ModTiers.PWRTIER, 3, -2f, new Item.Properties()));
    public static final RegistryObject<Item> pwr_kilof =
            ITEMS.register("pwr_kilof", () -> new PickaxeItem(ModTiers.PWRTIER, 1, -2.5f, new Item.Properties()));
    public static final RegistryObject<Item> pwr_siekiera =
            ITEMS.register("pwr_siekiera", () -> new AxeItem(ModTiers.PWRTIER, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> pwr_lopata =
            ITEMS.register("pwr_lopata", () -> new ShovelItem(ModTiers.PWRTIER, 1, -2.5f, new Item.Properties()));
    public static final RegistryObject<Item> pwr_motyka =
            ITEMS.register("pwr_motyka", () -> new HoeItem(ModTiers.PWRTIER, 0, -2f, new Item.Properties()));

    public static final RegistryObject<Item> piwo_seeds =
            ITEMS.register("piwo_seeds", () -> new ItemNameBlockItem(ModBlocks.piwo_crop.get(), new Item.Properties()));

    public static final RegistryObject<Item> piwo_male =
            ITEMS.register("piwo_male", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 500, 2), 1f).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS,40),1f).build())));
    public static final RegistryObject<Item> piwo_duze =
                ITEMS.register("piwo_duze", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(2f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1000, 3), 1f).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS,40),1f).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
