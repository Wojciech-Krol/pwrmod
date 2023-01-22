package net.psiokoksy.pwrmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.psiokoksy.pwrmod.PWRMod;

import static net.psiokoksy.pwrmod.PWRMod.MOD_ID;
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab PWR_TAB;
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        PWR_TAB =  event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "pwrmod_tab"),
                builder ->
                        builder.icon(() -> new ItemStack(ModItems.pwr_miecz.get())).title(Component.literal("PWRMod Tab")).build());
    }
}
