package net.reversiblelag.betterthanfrogsmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.reversiblelag.betterthanfrogsmod.BetterThanFrogsMod;
import net.reversiblelag.betterthanfrogsmod.item.custom.FrogLegs;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterThanFrogsMod.MOD_ID);

    public static final RegistryObject<Item> FROG_POKER = ITEMS.register("frog_poker",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.BETTER_THAN_FROGS_TAB)
                    .stacksTo(1)
                    .durability(30)
            ));

    public static final RegistryObject<Item> FROG_SKIN = ITEMS.register("frog_skin",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.BETTER_THAN_FROGS_TAB)
            ));

    public static final RegistryObject<Item> FROG_LEGS = ITEMS.register("frog_legs",
            () -> new FrogLegs(new Item.Properties()
                    .tab(ModCreativeModeTab.BETTER_THAN_FROGS_TAB)
            ));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}