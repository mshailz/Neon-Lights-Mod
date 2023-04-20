package net.hailey.neonlightsmod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final BlockItem NEON_FRAME_BLOCK = new BlockItem(ModBlocks.NEON_FRAME_BLOCK, new Item.Settings());
    public static final BlockItem WHITE_NEON_BLOCK = new BlockItem(ModBlocks.WHITE_NEON_BLOCK, new Item.Settings());
    public static final BlockItem RED_NEON_BLOCK = new BlockItem(ModBlocks.RED_NEON_BLOCK, new Item.Settings());
    public static final BlockItem PINK_NEON_BLOCK = new BlockItem(ModBlocks.PINK_NEON_BLOCK, new Item.Settings());
    public static final BlockItem HOT_PINK_NEON_BLOCK = new BlockItem(ModBlocks.HOT_PINK_NEON_BLOCK, new Item.Settings());
    public static final BlockItem MAGENTA_NEON_BLOCK = new BlockItem(ModBlocks.MAGENTA_NEON_BLOCK, new Item.Settings());
    public static final BlockItem PURPLE_NEON_BLOCK = new BlockItem(ModBlocks.PURPLE_NEON_BLOCK, new Item.Settings());
    public static final BlockItem BLUE_NEON_BLOCK = new BlockItem(ModBlocks.BLUE_NEON_BLOCK, new Item.Settings());
    public static final BlockItem CYAN_NEON_BLOCK = new BlockItem(ModBlocks.CYAN_NEON_BLOCK, new Item.Settings());
    public static final BlockItem LIGHT_BLUE_NEON_BLOCK = new BlockItem(ModBlocks.LIGHT_BLUE_NEON_BLOCK, new Item.Settings());
    public static final BlockItem GREEN_NEON_BLOCK = new BlockItem(ModBlocks.GREEN_NEON_BLOCK, new Item.Settings());
    public static final BlockItem YELLOW_NEON_BLOCK = new BlockItem(ModBlocks.YELLOW_NEON_BLOCK, new Item.Settings());
    public static final BlockItem ORANGE_NEON_BLOCK = new BlockItem(ModBlocks.ORANGE_NEON_BLOCK, new Item.Settings());


    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "neon_frame_block"), NEON_FRAME_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "white_neon_block"), WHITE_NEON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "red_neon_block"), RED_NEON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "pink_neon_block"), PINK_NEON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "hot_pink_neon_block"), HOT_PINK_NEON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "magenta_neon_block"), MAGENTA_NEON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "purple_neon_block"), PURPLE_NEON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "blue_neon_block"), BLUE_NEON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "cyan_neon_block"), CYAN_NEON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "light_blue_neon_block"), LIGHT_BLUE_NEON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "green_neon_block"), GREEN_NEON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "yellow_neon_block"), YELLOW_NEON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(NeonLightsMod.MOD_ID, "orange_neon_block"), ORANGE_NEON_BLOCK);

    }
}
