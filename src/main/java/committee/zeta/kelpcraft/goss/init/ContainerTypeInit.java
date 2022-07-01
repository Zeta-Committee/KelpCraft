package committee.zeta.kelpcraft.goss.init;

import committee.zeta.kelpcraft.goss.KelpCraft;
import committee.zeta.kelpcraft.goss.common.container.CraftingContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.IWorldPosCallable;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author GossChinese
 */
public class ContainerTypeInit {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, KelpCraft.MOD_ID);

    public static final RegistryObject<ContainerType<CraftingContainer>> CRAFTING_CONTAINER =
            CONTAINER_TYPES.register("stone_crafting_table_container",
                    ()-> (IForgeContainerType.create(
                            (id, playerInventory, packetBuffer)->
                                    new CraftingContainer(id, playerInventory,
                                            IWorldPosCallable.create(Minecraft.getInstance().level, packetBuffer.readBlockPos()),
                                            BlockInit.KELP_CRAFTING_TABLE_BLOCK.get()))));
}
