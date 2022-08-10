package net.hailey.neonlightsmod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block WHITE_NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(NeonLightsMod.MOD_ID, "white_neon_block"), WHITE_NEON_BLOCK);
    }
}
