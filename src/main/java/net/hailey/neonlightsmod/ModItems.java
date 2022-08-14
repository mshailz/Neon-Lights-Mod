package net.hailey.neonlightsmod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final BlockItem NEON_FRAME_BLOCK = new BlockItem(ModBlocks.NEON_FRAME_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem WHITE_NEON_BLOCK = new BlockItem(ModBlocks.WHITE_NEON_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem RED_NEON_BLOCK = new BlockItem(ModBlocks.RED_NEON_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PINK_NEON_BLOCK = new BlockItem(ModBlocks.PINK_NEON_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem HOT_PINK_NEON_BLOCK = new BlockItem(ModBlocks.HOT_PINK_NEON_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MAGENTA_NEON_BLOCK = new BlockItem(ModBlocks.MAGENTA_NEON_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PURPLE_NEON_BLOCK = new BlockItem(ModBlocks.PURPLE_NEON_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BLUE_NEON_BLOCK = new BlockItem(ModBlocks.BLUE_NEON_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(NeonLightsMod.MOD_ID, "neon_frame_block"), NEON_FRAME_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(NeonLightsMod.MOD_ID, "white_neon_block"), WHITE_NEON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(NeonLightsMod.MOD_ID, "red_neon_block"), RED_NEON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(NeonLightsMod.MOD_ID, "pink_neon_block"), PINK_NEON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(NeonLightsMod.MOD_ID, "hot_pink_neon_block"), HOT_PINK_NEON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(NeonLightsMod.MOD_ID, "magenta_neon_block"), MAGENTA_NEON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(NeonLightsMod.MOD_ID, "purple_neon_block"), PURPLE_NEON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(NeonLightsMod.MOD_ID, "blue_neon_block"), BLUE_NEON_BLOCK);

    }
}
