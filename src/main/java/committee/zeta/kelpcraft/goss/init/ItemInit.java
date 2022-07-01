package committee.zeta.kelpcraft.goss.init;

import committee.zeta.kelpcraft.goss.KelpCraft;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author GossChinese
 */
public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KelpCraft.MOD_ID);

    public static final RegistryObject<Item> KELP_BLOCK_ITEM = ITEMS.register("kelp_block", ()-> new BlockItem(BlockInit.KELP_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> KELP_CRAFTING_TABLE_BLOCK_ITEM = ITEMS.register("kelp_crafting_table", ()-> new BlockItem(BlockInit.KELP_CRAFTING_TABLE_BLOCK.get(), new Item.Properties()));
}
