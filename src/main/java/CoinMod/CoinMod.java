package CoinMod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CoinMod.MOD_ID)
public class CoinMod {

    public static final String MOD_ID = "coinmod";

    public CoinMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.register(bus);
        ModItems.register(bus);
        ModVillagers.register(bus); // Cambiado para pasar el bus
        ModPOIs.register(bus);
    }
}
