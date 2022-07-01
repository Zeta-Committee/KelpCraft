package committee.zeta.kelpcraft.goss.common.block;

import committee.zeta.kelpcraft.goss.common.container.CraftingContainer;
import net.minecraft.block.BlockState;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * @author GossChinese
 */
public class KelpCraftingTable extends CraftingTableBlock {
    private static final ITextComponent CONTAINER_TITLE = new TranslationTextComponent("container.crafting");

    public KelpCraftingTable(Properties properties) {
        super(properties);
    }

    @Override
    public INamedContainerProvider getMenuProvider(BlockState state, World level, BlockPos position) {
        return new SimpleNamedContainerProvider(
                (id, playerInventory, playerEntity)->
                        new CraftingContainer(id, playerInventory, IWorldPosCallable.create(level, position), this),
                CONTAINER_TITLE
        );
    }
}
