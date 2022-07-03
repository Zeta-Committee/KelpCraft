package committee.zeta.kelpcraft.goss.common.block;

import committee.zeta.kelpcraft.goss.common.container.CraftingContainer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;

/**
 * @author GossChinese
 */
public class KelpCraftingTable extends CraftingTableBlock {
    private static final Component CONTAINER_TITLE = new TranslatableComponent("container.crafting");

    public KelpCraftingTable(Properties properties) {
        super(properties);
    }

    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos position) {
        return new SimpleMenuProvider(
                (id, playerInventory, playerEntity)->
                        new CraftingContainer(id, playerInventory, ContainerLevelAccess.create(level, position), this),
                CONTAINER_TITLE
        );
    }
}
