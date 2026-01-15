package CoinMod;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, CoinMod.MOD_ID);

    public static final RegistryObject<VillagerProfession> CAMBISTA =
            VILLAGER_PROFESSIONS.register("cambista",
                    () -> new VillagerProfession(
                            "cambista",
                            holder -> holder.get() == ModPOIs.MESA_CAMBIO_POI.get(),
                            holder -> holder.get() == ModPOIs.MESA_CAMBIO_POI.get(),
                            null,
                            null,
                            SoundEvents.VILLAGER_WORK_CARTOGRAPHER
                    )
            );

    public static void register(IEventBus eventBus) {
        VILLAGER_PROFESSIONS.register(eventBus);
git init
    }
}
