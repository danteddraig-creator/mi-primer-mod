package CoinMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BlockItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CoinMod.MOD_ID);

    public static final RegistryObject<Item> COIN = ITEMS.register("coin",
        () -> new Item(new Item.Properties().tab(CoinTab.COIN_TAB)));

    public static final RegistryObject<Item> billete_medieval = ITEMS.register("billete_medieval",
        () -> new Item(new Item.Properties().tab(CoinTab.COIN_TAB)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static final RegistryObject<Item> MESA_CAMBIO = ITEMS.register(
            "mesa_cambio",
            () -> new BlockItem(ModBlocks.MESA_CAMBIO.get(),
                    new Item.Properties().tab(CoinTab.COIN_TAB))
    );


}
