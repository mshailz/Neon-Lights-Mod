package net.hailey.neonlightsmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NeonLightsMod implements ModInitializer {
	public static final String MOD_ID = "neonlightsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static final ItemGroup NEON_LIGHTS_MOD = FabricItemGroup.builder(
			new Identifier("neonlightsmod", "general"))
			.displayName(Text.literal("Neon Lights Mod"))
			.icon(() -> new ItemStack(ModBlocks.CYAN_NEON_BLOCK))
			.entries((enabledFeatures, entries) -> {

				entries.add(ModBlocks.NEON_FRAME_BLOCK);

				//white
				entries.add(ModBlocks.WHITE_NEON_BLOCK);
				entries.add(ModBlocks.WHITE_NEON_TUBE);
				entries.add(ModBlocks.WHITE_FLUORESCENT_LIGHT);

				//red
				entries.add(ModBlocks.RED_NEON_BLOCK);
				entries.add(ModBlocks.RED_NEON_TUBE);
				entries.add(ModBlocks.RED_FLUORESCENT_LIGHT);

				//pink
				entries.add(ModBlocks.PINK_NEON_BLOCK);
				entries.add(ModBlocks.PINK_NEON_TUBE);
				entries.add(ModBlocks.PINK_FLUORESCENT_LIGHT);

				//hot pink
				entries.add(ModBlocks.HOT_PINK_NEON_BLOCK);
				entries.add(ModBlocks.HOT_PINK_NEON_TUBE);
				entries.add(ModBlocks.HOT_PINK_FLUORESCENT_LIGHT);

				//magenta
				entries.add(ModBlocks.MAGENTA_NEON_BLOCK);
				entries.add(ModBlocks.MAGENTA_NEON_TUBE);
				entries.add(ModBlocks.MAGENTA_FLUORESCENT_LIGHT);

				//purple
				entries.add(ModBlocks.PURPLE_NEON_BLOCK);
				entries.add(ModBlocks.PURPLE_NEON_TUBE);
				entries.add(ModBlocks.PURPLE_FLUORESCENT_LIGHT);

				//blue
				entries.add(ModBlocks.BLUE_NEON_BLOCK);
				entries.add(ModBlocks.BLUE_NEON_TUBE);
				entries.add(ModBlocks.BLUE_FLUORESCENT_LIGHT);

				//light blue
				entries.add(ModBlocks.LIGHT_BLUE_NEON_BLOCK);
				entries.add(ModBlocks.LIGHT_BLUE_NEON_TUBE);
				entries.add(ModBlocks.LIGHT_BLUE_FLUORESCENT_LIGHT);

				//cyan
				entries.add(ModBlocks.CYAN_NEON_BLOCK);
				entries.add(ModBlocks.CYAN_NEON_TUBE);
				entries.add(ModBlocks.CYAN_FLUORESCENT_LIGHT);

				//green
				entries.add(ModBlocks.GREEN_NEON_BLOCK);
				entries.add(ModBlocks.GREEN_NEON_TUBE);
				entries.add(ModBlocks.GREEN_FLUORESCENT_LIGHT);

				//yellow
				entries.add(ModBlocks.YELLOW_NEON_BLOCK);
				entries.add(ModBlocks.YELLOW_NEON_TUBE);
				entries.add(ModBlocks.YELLOW_FLUORESCENT_LIGHT);

				//orange
				entries.add(ModBlocks.ORANGE_NEON_BLOCK);
				entries.add(ModBlocks.ORANGE_NEON_TUBE);
				entries.add(ModBlocks.ORANGE_FLUORESCENT_LIGHT);
			})
			.build();

	@Override
	public void onInitialize() {
		ModBlocks.registerBlocks();
		ModItems.registerItems();
	}
}
