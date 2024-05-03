package org.dawnoftime.ancientarchi.block.japanese;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.dawnoftime.ancientarchi.block.IBlockSpecialDisplay;
import org.dawnoftime.ancientarchi.block.templates.WaterloggedBlock;

public class CastIronTeapotBlock extends WaterloggedBlock implements IBlockSpecialDisplay {
    private static final VoxelShape VS = Block.box(4.8D, 0.0D, 4.8D, 11.2D, 6.4D, 11.2D);

    public CastIronTeapotBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return VS;
    }
}