package org.dawnoftime.ancientarchi.block.precolumbian;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.dawnoftime.ancientarchi.block.templates.ColumnConnectibleBlock;

public class PlasteredStoneColumnBlock extends ColumnConnectibleBlock {
    private static final VoxelShape VS_LONE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);
    private static final VoxelShape VS_BOT = Shapes.or(
            Block.box(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D),
            Block.box(3.0D, 4.0D, 3.0D, 13.0D, 16.0D, 13.0D)
    );
    private static final VoxelShape VS_MID = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D);
    private static final VoxelShape VS_TOP = Shapes.or(
            Block.box(1.0D, 8.0D, 1.0D, 15.0D, 16.0D, 15.0D),
            Block.box(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D)
    );

    public PlasteredStoneColumnBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(VERTICAL_CONNECTION)) {
            default -> VS_TOP;
            case BOTH -> VS_MID;
            case NONE -> VS_LONE;
            case ABOVE -> VS_BOT;
        };
    }
}
