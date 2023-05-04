package net.hailey.neonlightsmod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hailey.neonlightsmod.custom.FluorescentLights;
import net.hailey.neonlightsmod.custom.NeonLightTubes;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.RodBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //blocks
    public static final Block NEON_FRAME_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque());
    public static final Block WHITE_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block RED_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block PINK_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block HOT_PINK_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block MAGENTA_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block PURPLE_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block BLUE_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block CYAN_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block LIGHT_BLUE_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block GREEN_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block YELLOW_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block ORANGE_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));

    //tubes
    public static final RodBlock WHITE_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final RodBlock RED_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final RodBlock PINK_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final RodBlock HOT_PINK_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final RodBlock MAGENTA_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final RodBlock PURPLE_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final RodBlock BLUE_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final RodBlock CYAN_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final RodBlock LIGHT_BLUE_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final RodBlock GREEN_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final RodBlock YELLOW_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final RodBlock ORANGE_NEON_TUBE = new NeonLightTubes( FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));

    //fluorescent lights
    public static final Block WHITE_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));
    public static final Block RED_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));
    public static final Block PINK_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));
    public static final Block HOT_PINK_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));
    public static final Block MAGENTA_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));
    public static final Block PURPLE_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));
    public static final Block BLUE_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));
    public static final Block CYAN_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));
    public static final Block LIGHT_BLUE_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));
    public static final Block GREEN_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));
    public static final Block YELLOW_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));
    public static final Block ORANGE_FLUORESCENT_LIGHT
            = new FluorescentLights(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15));


    public static void registerBlocks() {
        //blocks
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "neon_frame_block"), NEON_FRAME_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "white_neon_block"), WHITE_NEON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "red_neon_block"), RED_NEON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "pink_neon_block"), PINK_NEON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "hot_pink_neon_block"), HOT_PINK_NEON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "magenta_neon_block"), MAGENTA_NEON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "purple_neon_block"), PURPLE_NEON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "blue_neon_block"), BLUE_NEON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "cyan_neon_block"), CYAN_NEON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "light_blue_neon_block"), LIGHT_BLUE_NEON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "green_neon_block"), GREEN_NEON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "yellow_neon_block"), YELLOW_NEON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "orange_neon_block"), ORANGE_NEON_BLOCK);

        //tubes
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "white_neon_tube"), WHITE_NEON_TUBE);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "red_neon_tube"), RED_NEON_TUBE);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "pink_neon_tube"), PINK_NEON_TUBE);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "hot_pink_neon_tube"), HOT_PINK_NEON_TUBE);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "magenta_neon_tube"), MAGENTA_NEON_TUBE);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "purple_neon_tube"), PURPLE_NEON_TUBE);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "blue_neon_tube"), BLUE_NEON_TUBE);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "cyan_neon_tube"), CYAN_NEON_TUBE);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "light_blue_neon_tube"), LIGHT_BLUE_NEON_TUBE);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "green_neon_tube"), GREEN_NEON_TUBE);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "yellow_neon_tube"), YELLOW_NEON_TUBE);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "orange_neon_tube"), ORANGE_NEON_TUBE);

        //fluorescent lights
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "white_fluorescent_light"), WHITE_FLUORESCENT_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "red_fluorescent_light"), RED_FLUORESCENT_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "pink_fluorescent_light"), PINK_FLUORESCENT_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "hot_pink_fluorescent_light"), HOT_PINK_FLUORESCENT_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "magenta_fluorescent_light"), MAGENTA_FLUORESCENT_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "purple_fluorescent_light"), PURPLE_FLUORESCENT_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "blue_fluorescent_light"), BLUE_FLUORESCENT_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "cyan_fluorescent_light"), CYAN_FLUORESCENT_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "light_blue_fluorescent_light"), LIGHT_BLUE_FLUORESCENT_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "green_fluorescent_light"), GREEN_FLUORESCENT_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "yellow_fluorescent_light"), YELLOW_FLUORESCENT_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "orange_fluorescent_light"), ORANGE_FLUORESCENT_LIGHT);
    }
}
