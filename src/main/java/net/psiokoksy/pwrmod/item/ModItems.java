package net.psiokoksy.pwrmod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.psiokoksy.pwrmod.armor.ModArmorMaterials;

import static net.psiokoksy.pwrmod.PWRMod.MOD_ID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,  MOD_ID);

    public static final RegistryObject<Item> pwr_miecz = ITEMS.register("pwr_miecz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> pwr_kilof = ITEMS.register("pwr_kilof",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<ArmorItem> pwr_chestplate = ITEMS.register("pwr_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST,new Item.Properties()));

    public static final RegistryObject<ArmorItem> pwr_leggins = ITEMS.register("pwr_leggins",
            () -> new ArmorItem(ModArmorMaterials.COPPER,EquipmentSlot.LEGS,new Item.Properties()));

    public static final RegistryObject<ArmorItem> pwr_cap = ITEMS.register("pwr_cap",
            () -> new ArmorItem(ModArmorMaterials.COPPER,EquipmentSlot.HEAD,new Item.Properties()));

    public static final RegistryObject<ArmorItem> pwr_boots = ITEMS.register("pwr_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER,EquipmentSlot.FEET,new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
