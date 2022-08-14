package net.hailey.neonlightsmod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block NEON_FRAME_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque());
    public static final Block WHITE_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block RED_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block PINK_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block HOT_PINK_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block MAGENTA_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block PURPLE_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block BLUE_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "neon_frame_block"), NEON_FRAME_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "white_neon_block"), WHITE_NEON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "red_neon_block"), RED_NEON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "pink_neon_block"), PINK_NEON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "hot_pink_neon_block"), HOT_PINK_NEON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "magenta_neon_block"), MAGENTA_NEON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "purple_neon_block"), PURPLE_NEON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "blue_neon_block"), BLUE_NEON_BLOCK);
    }
}
