package committee.zeta.kelpcraft.goss.init;

import committee.zeta.kelpcraft.goss.KelpCraft;
import committee.zeta.kelpcraft.goss.common.tier.KelpTier;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author GossChinese
 */
public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KelpCraft.MOD_ID);

    public static final RegistryObject<Item> KELP_BLOCK_ITEM = ITEMS.register("kelp_block", ()-> new BlockItem(BlockInit.KELP_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> KELP_CRAFTING_TABLE_BLOCK_ITEM = ITEMS.register("kelp_crafting_table", ()-> new BlockItem(BlockInit.KELP_CRAFTING_TABLE_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> KELP_SWORD = ITEMS.register("kelp_sword", ()-> new SwordItem(KelpTier.KELP, 3, -2.4F, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KELP_SHOVEL = ITEMS.register("kelp_shovel", ()-> new ShovelItem(KelpTier.KELP, 1.5F, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KELP_PICKAXE = ITEMS.register("kelp_pickaxe", ()-> new PickaxeItem(KelpTier.KELP, 1, -2.8F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KELP_AXE = ITEMS.register("kelp_axe", ()-> new AxeItem(KelpTier.KELP, 6.0F, -3.2F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KELP_HOE = ITEMS.register("kelp_hoe", ()-> new HoeItem(KelpTier.KELP, 0, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

}
