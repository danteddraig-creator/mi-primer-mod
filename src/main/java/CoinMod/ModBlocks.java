package CoinMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CoinMod.MOD_ID);

    // Bloque de trabajo del cambista
    public static final RegistryObject<Block> MESA_CAMBIO = BLOCKS.register(
            "mesa_cambio",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.WOOD)
                    .strength(2.5f)
                    .sound(SoundType.WOOD))
    );

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}