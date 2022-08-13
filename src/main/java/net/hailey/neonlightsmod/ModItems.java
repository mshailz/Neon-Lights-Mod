package net.hailey.neonlightsmod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final BlockItem WHITE_NEON_BLOCK = new BlockItem(ModBlocks.WHITE_NEON_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PINK_NEON_BLOCK = new BlockItem(ModBlocks.PINK_NEON_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(NeonLightsMod.MOD_ID, "white_neon_block"), WHITE_NEON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(NeonLightsMod.MOD_ID, "pink_neon_block"), PINK_NEON_BLOCK);

    }
}
