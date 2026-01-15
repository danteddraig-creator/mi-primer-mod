package CoinMod;

import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;
import CoinMod.ModBlocks;

public class ModPOIs {

    public static final DeferredRegister<PoiType> POIS =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, CoinMod.MOD_ID);

    public static final RegistryObject<PoiType> MESA_CAMBIO_POI = POIS.register(
        "mesa_cambio_poi",
        () -> new PoiType(
                "mesa_cambio_poi",
                Set.copyOf(
                        ModBlocks.MESA_CAMBIO.get()
                                .getStateDefinition()
                                .getPossibleStates()
                ),
                1,
                1
        )
);
        public static void register(IEventBus bus) {
                POIS.register(bus);     
    }
}
