package committee.zeta.kelpcraft.goss.init;

import committee.zeta.kelpcraft.goss.KelpCraft;
import committee.zeta.kelpcraft.goss.common.block.KelpCraftingTable;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author GossChinese
 */
public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KelpCraft.MOD_ID);

    public static final RegistryObject<Block> KELP_CRAFTING_TABLE_BLOCK = BLOCKS.register("kelp_crafting_table",
                ()-> new KelpCraftingTable(Block.Properties.of(Material.GRASS, MaterialColor.COLOR_GREEN).strength(0.5F, 2.5F).sound(SoundType.GRASS))
            );

    public static final RegistryObject<Block> KELP_BLOCK = BLOCKS.register("kelp_block",
                ()-> new Block(Block.Properties.of(Material.GRASS, MaterialColor.COLOR_GREEN).strength(0.5F, 2.5F).sound(SoundType.GRASS))
            );

}
