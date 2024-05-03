package org.dawnoftime.ancientarchi.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static org.dawnoftime.ancientarchi.registry.DoTBBlocksRegistry.*;

public class DoTBBlockTagGenerator extends BlockTagsProvider {
    public DoTBBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, org.dawnoftime.ancientarchi.AncientArchitecture.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(REINFORCED_BLACK_WROUGHT_IRON_FENCE.get());
        for(TagKey<Block> tag : blockTagsMap.keySet()){
            blockTagsMap.get(tag).forEach(block -> this.tag(tag).add(block.get()));
        }
        //blockTagsMap.clear();
        int a = 1;
    }
}
