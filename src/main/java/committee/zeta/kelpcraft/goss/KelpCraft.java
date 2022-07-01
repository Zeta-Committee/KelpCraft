package committee.zeta.kelpcraft.goss;

import committee.zeta.kelpcraft.goss.init.BlockInit;
import committee.zeta.kelpcraft.goss.init.ContainerTypeInit;
import committee.zeta.kelpcraft.goss.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author GossChinese
 */
@Mod(KelpCraft.MOD_ID)
public class KelpCraft {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "kelpcraft";

    public KelpCraft() {
        MinecraftForge.EVENT_BUS.register(this);
        registry(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void registry(IEventBus modBus){
        BlockInit.BLOCKS.register(modBus);
        ItemInit.ITEMS.register(modBus);
        ContainerTypeInit.CONTAINER_TYPES.register(modBus);
    }
}
