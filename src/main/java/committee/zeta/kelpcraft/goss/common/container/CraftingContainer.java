package committee.zeta.kelpcraft.goss.common.container;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.WorkbenchContainer;
import net.minecraft.util.IWorldPosCallable;

/**
 * @author GossChinese
 */
public class CraftingContainer extends WorkbenchContainer {
    private final Block workbench;
    private final IWorldPosCallable callable;

    public CraftingContainer(int id, PlayerInventory inventory, IWorldPosCallable callable, Block workbench) {
        super(id, inventory, callable);
        this.workbench = workbench;
        this.callable = callable;
    }

    protected static boolean isWithinUsableDistance(IWorldPosCallable callable, PlayerEntity player, Block craftingTable){
        return callable.evaluate(
                ((level, position)->
                        (level.getBlockState(position).getBlock().is(craftingTable)) &&
                        (player.distanceToSqr(position.getX()+0.5D, position.getY()+0.5D, position.getZ()+0.5D) <= 6))
        ).get();
    }

    @Override
    public boolean stillValid(PlayerEntity player) {
        return CraftingContainer.isWithinUsableDistance(this.callable, player, this.workbench);
    }
}
