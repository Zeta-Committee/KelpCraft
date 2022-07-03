package committee.zeta.kelpcraft.goss.init;

import committee.zeta.kelpcraft.goss.KelpCraft;
import committee.zeta.kelpcraft.goss.common.container.CraftingContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author GossChinese
 */
public class ContainerTypeInit {
    public static final DeferredRegister<MenuType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, KelpCraft.MOD_ID);

    public static final RegistryObject<MenuType<CraftingContainer>> CRAFTING_CONTAINER =
            CONTAINER_TYPES.register("stone_crafting_table_container",
                    ()-> (IForgeMenuType.create(
                            (id, playerInventory, packetBuffer)->
                                    new CraftingContainer(id, playerInventory,
                                            ContainerLevelAccess.create(Minecraft.getInstance().level, packetBuffer.readBlockPos()),
                                            BlockInit.KELP_CRAFTING_TABLE_BLOCK.get()))));
}
