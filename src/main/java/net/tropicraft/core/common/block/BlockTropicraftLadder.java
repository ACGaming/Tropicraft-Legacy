package net.tropicraft.core.common.block;

import net.minecraft.block.BlockLadder;
import net.minecraft.block.SoundType;

// BlockLadder's constructor is protected, go figure.
public class BlockTropicraftLadder extends BlockLadder {

    public BlockTropicraftLadder() {
        this.disableStats();
        this.setSoundType(SoundType.PLANT);
    }

}