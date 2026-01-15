package CoinMod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CoinTab {

    public static final CreativeModeTab COIN_TAB = new CreativeModeTab("coin_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COIN.get());
        }
    };
}
