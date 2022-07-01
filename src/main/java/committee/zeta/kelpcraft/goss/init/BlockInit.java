package committee.zeta.kelpcraft.goss.init;

import committee.zeta.kelpcraft.goss.KelpCraft;
import committee.zeta.kelpcraft.goss.common.block.KelpCraftingTable;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author GossChinese
 */
public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KelpCraft.MOD_ID);

    public static final RegistryObject<Block> KELP_CRAFTING_TABLE_BLOCK = BLOCKS.register("kelp_crafting_table",
                ()-> new KelpCraftingTable(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_GREEN).strength(0.5F, 2.5F).sound(SoundType.GRASS))
            );

    public static final RegistryObject<Block> KELP_BLOCK = BLOCKS.register("kelp_block",
                ()-> new Block(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_GREEN).strength(0.5F, 2.5F).sound(SoundType.GRASS))
            );

}
