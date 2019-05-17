package stygian.shears.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemShears;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import stygian.shears.Reference;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Reference.MODID)
public class ModItems {
	public static ItemShears wooden_shears;
	public static ItemShears stone_shears;
	public static ItemShears golden_shears;
	public static ItemShears diamond_shears;
	
	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
                new ItemShears(new Item.Properties().maxStackSize(1).defaultMaxDamage(56).group(ItemGroup.TOOLS)).setRegistryName(Reference.MODID, "wooden_shears"),
                new ItemShears(new Item.Properties().maxStackSize(1).defaultMaxDamage(120).group(ItemGroup.TOOLS)).setRegistryName(Reference.MODID, "stone_shears"),
                new ItemShears(new Item.Properties().maxStackSize(1).defaultMaxDamage(30).group(ItemGroup.TOOLS)).setRegistryName(Reference.MODID, "golden_shears"),
                new ItemShears(new Item.Properties().maxStackSize(1).defaultMaxDamage(1500).group(ItemGroup.TOOLS)).setRegistryName(Reference.MODID, "diamond_shears")
		);
    }
}