package stygian.shears.Entities;

import java.util.ArrayList;

import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import stygian.shears.Reference;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Reference.MODID)
public class ModEntities {
	
	public static ArrayList sheepResources;
	
	public static EntityResourceSheep resource_sheep;
	
	@SubscribeEvent
    public static void register(Entity entity) {
		
    }
	
	public static void init() {
		sheepResources.add(Items.FLINT);
		sheepResources.add(Blocks.SAND);
		sheepResources.add(Blocks.OAK_LOG);
		sheepResources.add(Items.QUARTZ);
		sheepResources.add(Items.GLOWSTONE_DUST);
		sheepResources.add(Items.GUNPOWDER);
		sheepResources.add(Items.REDSTONE);
		sheepResources.add(Items.SNOWBALL);
		sheepResources.add(Items.IRON_INGOT);
		sheepResources.add(Items.COAL);
		sheepResources.add(Items.GOLD_INGOT);
		sheepResources.add(Items.CLAY_BALL);
		sheepResources.add(Blocks.GLASS);
		sheepResources.add(Items.NETHER_WART);
		sheepResources.add(Items.DIAMOND);
		sheepResources.add(Items.BLAZE_ROD);
		sheepResources.add(Items.SLIME_BALL);
		sheepResources.add(Items.PRISMARINE_SHARD);
		sheepResources.add(Items.PRISMARINE_CRYSTALS);
		sheepResources.add(Items.ENDER_PEARL);
		sheepResources.add(Items.GHAST_TEAR);
		sheepResources.add(Items.EMERALD);
		sheepResources.add(Items.MAGMA_CREAM);
		sheepResources.add(Blocks.OBSIDIAN);
	}
}