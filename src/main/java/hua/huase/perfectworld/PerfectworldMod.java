package hua.huase.perfectworld;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = PerfectworldMod.MODID, name = PerfectworldMod.NAME, version = PerfectworldMod.VERSION)
public class PerfectworldMod
{
    public static final String MODID = "perfectworld";
    public static final String NAME = "Perfect World";
    public static final String VERSION = "1.0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("Perfect World Start");
    }
}
