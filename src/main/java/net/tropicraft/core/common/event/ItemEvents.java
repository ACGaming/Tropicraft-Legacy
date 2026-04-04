package net.tropicraft.core.common.event;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.tropicraft.core.common.block.BlockTropicsWater;
import net.tropicraft.core.common.item.IUnderwaterTool;
import net.tropicraft.core.registry.BlockRegistry;
import net.tropicraft.core.registry.ItemRegistry;

import static net.tropicraft.core.common.item.scuba.ScubaHelper.isFullyUnderwater;

public class ItemEvents {

	@SubscribeEvent
	public void handleBucketFillEvent(FillBucketEvent event) {
		if (event.getEmptyBucket().getItem() != Items.BUCKET) return;
		if (event.getTarget() == null || event.getTarget().typeOfHit != RayTraceResult.Type.BLOCK) return;

		World world = event.getWorld();

		BlockPos pos = event.getTarget().getBlockPos();
		IBlockState iblockstate = event.getWorld().getBlockState(pos);

		if (!event.getWorld().isBlockModifiable(event.getEntityPlayer(), pos)) return;
		if (!event.getEntityPlayer().canPlayerEdit(pos.offset(event.getTarget().sideHit), event.getTarget().sideHit, event.getEmptyBucket())) return;

		if (iblockstate.getBlock() == BlockRegistry.tropicsWater && ((Integer)iblockstate.getValue(BlockTropicsWater.LEVEL)).intValue() == 0) {
			ItemStack iHazBucket = new ItemStack(ItemRegistry.tropicsWaterBucket);
			event.setResult(Result.ALLOW);
			event.setFilledBucket(iHazBucket);
			event.getWorld().setBlockToAir(pos);
		}
	}

	// Fixed up code from 1.7, shame it never got used there
	@SubscribeEvent
	public void handleUnderwaterTools(PlayerEvent.BreakSpeed event) {
		EntityPlayer player = (EntityPlayer) event.getEntityPlayer();
		ItemStack itemstack = player.getHeldItem(EnumHand.MAIN_HAND);

		if (itemstack != null && itemstack.getItem() != null) {
			if (itemstack.getItem() instanceof IUnderwaterTool) {
				if (isFullyUnderwater(player.world, player)) {
					event.setNewSpeed(event.getOriginalSpeed() * (player.onGround ? 5F : 10F));
				} else { // Nerf underwater tools above water
					event.setNewSpeed(event.getOriginalSpeed() / 14F);
					if (itemstack.getItem() instanceof IUnderwaterTool)
						event.setNewSpeed(event.getOriginalSpeed() / 5F);
				}
			}
		}
	}
}