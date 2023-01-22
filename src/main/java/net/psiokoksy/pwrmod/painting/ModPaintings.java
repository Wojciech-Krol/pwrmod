package net.psiokoksy.pwrmod.painting;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.psiokoksy.pwrmod.PWRMod;


public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, PWRMod.MOD_ID);

    public static final RegistryObject<PaintingVariant>  pudzian = PAINTING_VARIANTS.register("pudzian",
            () -> new PaintingVariant(48,48));
    public static final RegistryObject<PaintingVariant>  pudzian_calka = PAINTING_VARIANTS.register("pudzian_calka",
            () -> new PaintingVariant(32,32));
    public static final RegistryObject<PaintingVariant>  pwr_logo = PAINTING_VARIANTS.register("pwr_logo",
            () -> new PaintingVariant(16,16));
    public static final RegistryObject<PaintingVariant>  pwr_piwo = PAINTING_VARIANTS.register("pwr_piwo",
            () -> new PaintingVariant(32,16));

    public static void register(IEventBus eventBus){
        PAINTING_VARIANTS.register(eventBus);
    }
}
