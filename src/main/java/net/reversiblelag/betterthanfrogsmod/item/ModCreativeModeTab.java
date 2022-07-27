package net.reversiblelag.betterthanfrogsmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BETTER_THAN_FROGS_TAB = new CreativeModeTab("betterthanfrogstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FROG_POKER.get());
        }
    };
}
