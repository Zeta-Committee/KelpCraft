package committee.zeta.kelpcraft.goss.common.container;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;

/**
 * @author GossChinese
 */
public class CraftingContainer extends CraftingMenu {
    private final Block workbench;
    private final ContainerLevelAccess callable;

    public CraftingContainer(int id, Inventory inventory, ContainerLevelAccess callable, Block workbench) {
        super(id, inventory, callable);
        this.workbench = workbench;
        this.callable = callable;
    }

    protected static boolean isWithinUsableDistance(ContainerLevelAccess callable, Player player, Block craftingTable){
        return callable.evaluate(
                ((level, position)->
                        (level.getBlockState(position).getBlock().equals(craftingTable)) &&
                        (player.distanceToSqr(position.getX()+0.5D, position.getY()+0.5D, position.getZ()+0.5D) <= 48))
        ).get();
    }

    @Override
    public boolean stillValid(Player player) {
        return CraftingContainer.isWithinUsableDistance(this.callable, player, this.workbench);
    }
}
