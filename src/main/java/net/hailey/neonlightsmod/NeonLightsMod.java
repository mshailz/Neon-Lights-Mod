package net.hailey.neonlightsmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NeonLightsMod implements ModInitializer {
	public static final String MOD_ID = "neonlightsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
			new Identifier("neonlightsmod", "general"))
			.icon(() -> new ItemStack(Items.SEA_LANTERN))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModBlocks.WHITE_NEON_BLOCK));

			})
			.build();

	@Override
	public void onInitialize() {
		ModBlocks.registerBlocks();
		ModItems.registerItems();
	}
}
