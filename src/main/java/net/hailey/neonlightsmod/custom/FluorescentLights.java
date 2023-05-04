package net.hailey.neonlightsmod.custom;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class FluorescentLights extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public FluorescentLights(AbstractBlock.Settings settings) {
        super( settings );
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH)));
    }

//X is width, Y is height, Z is horizontal plane cross-section (referenced from ladderBlock)
    private static final VoxelShape SOUTH = Block.createCuboidShape(0,13,0, 16,15,1.6);
    private static final VoxelShape NORTH = Block.createCuboidShape(0, 13, 14.5, 16, 15, 16);
    private static final VoxelShape WEST = Block.createCuboidShape(14.5, 13, 0, 16, 15, 16);
    private static final VoxelShape EAST = Block.createCuboidShape(0, 13, 0, 1.5, 15, 16);


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get( FACING )) {
            case NORTH -> {
                return NORTH;
            }
            case SOUTH -> {
                return SOUTH;
            }
            case WEST -> {
                return WEST;
            }
        }
        return EAST;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
