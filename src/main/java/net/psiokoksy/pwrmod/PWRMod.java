package net.psiokoksy.pwrmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.psiokoksy.pwrmod.item.ModCreativeModeTab;
import net.psiokoksy.pwrmod.item.ModItems;
import net.psiokoksy.pwrmod.painting.ModPaintings;
import org.slf4j.Logger;

@Mod(PWRMod.MOD_ID)
public class PWRMod
{
    public static final String MOD_ID = "pwrmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace

    public PWRMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModPaintings.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab()== ModCreativeModeTab.PWR_TAB){
            event.accept(ModItems.pwr_miecz);
            event.accept(ModItems.pwr_kilof);
            event.accept(ModItems.pwr_boots);
            event.accept(ModItems.pwr_cap);
            event.accept(ModItems.pwr_chestplate);
            event.accept(ModItems.pwr_leggins);
        }
        if(event.getTab()== CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItems.pwr_kilof);
        }
        if(event.getTab()== CreativeModeTabs.COMBAT) {
            event.accept(ModItems.pwr_miecz);
            event.accept(ModItems.pwr_cap);
            event.accept(ModItems.pwr_chestplate);
            event.accept(ModItems.pwr_leggins);
            event.accept(ModItems.pwr_boots);
        }

    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
