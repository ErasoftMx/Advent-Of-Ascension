package net.tslat.aoa3.structure.iromine;

import net.minecraft.block.BlockChest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class IroPassage2 extends AoAStructure { //StructureSize: 17x5x16
	private static final IBlockState stripedBrick = BlockRegister.bricksIroStriped.getDefaultState();
	private static final IBlockState dottedBrick = BlockRegister.bricksIroDotted.getDefaultState();
	private static final IBlockState confusionTrap = BlockRegister.iroBrickTrap.getDefaultState();
	private static final IBlockState enforcerSpawner = BlockRegister.spawnerEnforcer.getDefaultState();
	private static final IBlockState mechyonSpawner = BlockRegister.spawnerMechyon.getDefaultState();
	private static final IBlockState chest = Blocks.CHEST.getDefaultState().withProperty(BlockChest.FACING, EnumFacing.SOUTH);

	public IroPassage2() {
		super("IroPassage2");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, dottedBrick);
		addBlock(world, basePos, 0, 0, 1, stripedBrick);
		addBlock(world, basePos, 0, 0, 2, stripedBrick);
		addBlock(world, basePos, 0, 0, 3, stripedBrick);
		addBlock(world, basePos, 0, 0, 4, dottedBrick);
		addBlock(world, basePos, 1, 0, 0, dottedBrick);
		addBlock(world, basePos, 1, 0, 1, stripedBrick);
		addBlock(world, basePos, 1, 0, 2, stripedBrick);
		addBlock(world, basePos, 1, 0, 3, stripedBrick);
		addBlock(world, basePos, 1, 0, 4, dottedBrick);
		addBlock(world, basePos, 2, 0, 0, dottedBrick);
		addBlock(world, basePos, 2, 0, 1, stripedBrick);
		addBlock(world, basePos, 2, 0, 2, stripedBrick);
		addBlock(world, basePos, 2, 0, 3, stripedBrick);
		addBlock(world, basePos, 2, 0, 4, dottedBrick);
		addBlock(world, basePos, 3, 0, 0, dottedBrick);
		addBlock(world, basePos, 3, 0, 1, confusionTrap);
		addBlock(world, basePos, 3, 0, 2, confusionTrap);
		addBlock(world, basePos, 3, 0, 3, confusionTrap);
		addBlock(world, basePos, 3, 0, 4, dottedBrick);
		addBlock(world, basePos, 4, 0, 0, dottedBrick);
		addBlock(world, basePos, 4, 0, 1, stripedBrick);
		addBlock(world, basePos, 4, 0, 2, stripedBrick);
		addBlock(world, basePos, 4, 0, 3, stripedBrick);
		addBlock(world, basePos, 4, 0, 4, dottedBrick);
		addBlock(world, basePos, 4, 0, 5, dottedBrick);
		addBlock(world, basePos, 5, 0, 0, dottedBrick);
		addBlock(world, basePos, 5, 0, 1, confusionTrap);
		addBlock(world, basePos, 5, 0, 2, confusionTrap);
		addBlock(world, basePos, 5, 0, 3, confusionTrap);
		addBlock(world, basePos, 5, 0, 4, dottedBrick);
		addBlock(world, basePos, 5, 0, 5, dottedBrick);
		addBlock(world, basePos, 5, 0, 6, dottedBrick);
		addBlock(world, basePos, 5, 0, 7, dottedBrick);
		addBlock(world, basePos, 6, 0, 0, dottedBrick);
		addBlock(world, basePos, 6, 0, 1, stripedBrick);
		addBlock(world, basePos, 6, 0, 2, stripedBrick);
		addBlock(world, basePos, 6, 0, 3, stripedBrick);
		addBlock(world, basePos, 6, 0, 4, stripedBrick);
		addBlock(world, basePos, 6, 0, 5, stripedBrick);
		addBlock(world, basePos, 6, 0, 6, stripedBrick);
		addBlock(world, basePos, 6, 0, 7, dottedBrick);
		addBlock(world, basePos, 7, 0, 0, dottedBrick);
		addBlock(world, basePos, 7, 0, 1, stripedBrick);
		addBlock(world, basePos, 7, 0, 2, stripedBrick);
		addBlock(world, basePos, 7, 0, 3, stripedBrick);
		addBlock(world, basePos, 7, 0, 4, stripedBrick);
		addBlock(world, basePos, 7, 0, 5, stripedBrick);
		addBlock(world, basePos, 7, 0, 6, stripedBrick);
		addBlock(world, basePos, 7, 0, 7, dottedBrick);
		addBlock(world, basePos, 7, 0, 8, dottedBrick);
		addBlock(world, basePos, 8, 0, 0, dottedBrick);
		addBlock(world, basePos, 8, 0, 1, stripedBrick);
		addBlock(world, basePos, 8, 0, 2, stripedBrick);
		addBlock(world, basePos, 8, 0, 3, stripedBrick);
		addBlock(world, basePos, 8, 0, 4, stripedBrick);
		addBlock(world, basePos, 8, 0, 5, stripedBrick);
		addBlock(world, basePos, 8, 0, 6, stripedBrick);
		addBlock(world, basePos, 8, 0, 7, dottedBrick);
		addBlock(world, basePos, 8, 0, 8, dottedBrick);
		addBlock(world, basePos, 8, 0, 9, dottedBrick);
		addBlock(world, basePos, 8, 0, 10, dottedBrick);
		addBlock(world, basePos, 9, 0, 0, dottedBrick);
		addBlock(world, basePos, 9, 0, 1, dottedBrick);
		addBlock(world, basePos, 9, 0, 2, dottedBrick);
		addBlock(world, basePos, 9, 0, 3, dottedBrick);
		addBlock(world, basePos, 9, 0, 4, stripedBrick);
		addBlock(world, basePos, 9, 0, 5, stripedBrick);
		addBlock(world, basePos, 9, 0, 6, stripedBrick);
		addBlock(world, basePos, 9, 0, 7, stripedBrick);
		addBlock(world, basePos, 9, 0, 8, stripedBrick);
		addBlock(world, basePos, 9, 0, 9, stripedBrick);
		addBlock(world, basePos, 9, 0, 10, dottedBrick);
		addBlock(world, basePos, 10, 0, 2, dottedBrick);
		addBlock(world, basePos, 10, 0, 3, dottedBrick);
		addBlock(world, basePos, 10, 0, 4, stripedBrick);
		addBlock(world, basePos, 10, 0, 5, stripedBrick);
		addBlock(world, basePos, 10, 0, 6, stripedBrick);
		addBlock(world, basePos, 10, 0, 7, stripedBrick);
		addBlock(world, basePos, 10, 0, 8, stripedBrick);
		addBlock(world, basePos, 10, 0, 9, stripedBrick);
		addBlock(world, basePos, 10, 0, 10, dottedBrick);
		addBlock(world, basePos, 11, 0, 3, dottedBrick);
		addBlock(world, basePos, 11, 0, 4, stripedBrick);
		addBlock(world, basePos, 11, 0, 5, stripedBrick);
		addBlock(world, basePos, 11, 0, 6, stripedBrick);
		addBlock(world, basePos, 11, 0, 7, stripedBrick);
		addBlock(world, basePos, 11, 0, 8, stripedBrick);
		addBlock(world, basePos, 11, 0, 9, stripedBrick);
		addBlock(world, basePos, 11, 0, 10, dottedBrick);
		addBlock(world, basePos, 11, 0, 11, dottedBrick);
		addBlock(world, basePos, 12, 0, 3, dottedBrick);
		addBlock(world, basePos, 12, 0, 4, dottedBrick);
		addBlock(world, basePos, 12, 0, 5, dottedBrick);
		addBlock(world, basePos, 12, 0, 6, dottedBrick);
		addBlock(world, basePos, 12, 0, 7, stripedBrick);
		addBlock(world, basePos, 12, 0, 8, stripedBrick);
		addBlock(world, basePos, 12, 0, 9, stripedBrick);
		addBlock(world, basePos, 12, 0, 10, dottedBrick);
		addBlock(world, basePos, 12, 0, 11, dottedBrick);
		addBlock(world, basePos, 12, 0, 12, dottedBrick);
		addBlock(world, basePos, 12, 0, 13, dottedBrick);
		addBlock(world, basePos, 12, 0, 14, dottedBrick);
		addBlock(world, basePos, 12, 0, 15, dottedBrick);
		addBlock(world, basePos, 13, 0, 5, dottedBrick);
		addBlock(world, basePos, 13, 0, 6, dottedBrick);
		addBlock(world, basePos, 13, 0, 7, stripedBrick);
		addBlock(world, basePos, 13, 0, 8, stripedBrick);
		addBlock(world, basePos, 13, 0, 9, stripedBrick);
		addBlock(world, basePos, 13, 0, 10, confusionTrap);
		addBlock(world, basePos, 13, 0, 11, stripedBrick);
		addBlock(world, basePos, 13, 0, 12, confusionTrap);
		addBlock(world, basePos, 13, 0, 13, stripedBrick);
		addBlock(world, basePos, 13, 0, 14, stripedBrick);
		addBlock(world, basePos, 13, 0, 15, stripedBrick);
		addBlock(world, basePos, 14, 0, 6, dottedBrick);
		addBlock(world, basePos, 14, 0, 7, stripedBrick);
		addBlock(world, basePos, 14, 0, 8, stripedBrick);
		addBlock(world, basePos, 14, 0, 9, stripedBrick);
		addBlock(world, basePos, 14, 0, 10, confusionTrap);
		addBlock(world, basePos, 14, 0, 11, stripedBrick);
		addBlock(world, basePos, 14, 0, 12, confusionTrap);
		addBlock(world, basePos, 14, 0, 13, stripedBrick);
		addBlock(world, basePos, 14, 0, 14, stripedBrick);
		addBlock(world, basePos, 14, 0, 15, stripedBrick);
		addBlock(world, basePos, 15, 0, 6, dottedBrick);
		addBlock(world, basePos, 15, 0, 7, stripedBrick);
		addBlock(world, basePos, 15, 0, 8, stripedBrick);
		addBlock(world, basePos, 15, 0, 9, stripedBrick);
		addBlock(world, basePos, 15, 0, 10, confusionTrap);
		addBlock(world, basePos, 15, 0, 11, stripedBrick);
		addBlock(world, basePos, 15, 0, 12, confusionTrap);
		addBlock(world, basePos, 15, 0, 13, stripedBrick);
		addBlock(world, basePos, 15, 0, 14, stripedBrick);
		addBlock(world, basePos, 15, 0, 15, stripedBrick);
		addBlock(world, basePos, 16, 0, 6, dottedBrick);
		addBlock(world, basePos, 16, 0, 7, dottedBrick);
		addBlock(world, basePos, 16, 0, 8, dottedBrick);
		addBlock(world, basePos, 16, 0, 9, dottedBrick);
		addBlock(world, basePos, 16, 0, 10, dottedBrick);
		addBlock(world, basePos, 16, 0, 11, dottedBrick);
		addBlock(world, basePos, 16, 0, 12, dottedBrick);
		addBlock(world, basePos, 16, 0, 13, dottedBrick);
		addBlock(world, basePos, 16, 0, 14, dottedBrick);
		addBlock(world, basePos, 16, 0, 15, dottedBrick);
		addBlock(world, basePos, 0, 1, 0, stripedBrick);
		addBlock(world, basePos, 0, 1, 4, stripedBrick);
		addBlock(world, basePos, 1, 1, 0, stripedBrick);
		addBlock(world, basePos, 1, 1, 4, stripedBrick);
		addBlock(world, basePos, 2, 1, 0, stripedBrick);
		addBlock(world, basePos, 2, 1, 4, stripedBrick);
		addBlock(world, basePos, 3, 1, 0, stripedBrick);
		addBlock(world, basePos, 3, 1, 4, stripedBrick);
		addBlock(world, basePos, 4, 1, 0, stripedBrick);
		addBlock(world, basePos, 4, 1, 4, stripedBrick);
		addBlock(world, basePos, 4, 1, 5, dottedBrick);
		addBlock(world, basePos, 5, 1, 0, stripedBrick);
		addBlock(world, basePos, 5, 1, 4, stripedBrick);
		addBlock(world, basePos, 5, 1, 5, stripedBrick);
		addBlock(world, basePos, 5, 1, 6, stripedBrick);
		addBlock(world, basePos, 5, 1, 7, stripedBrick);
		addBlock(world, basePos, 6, 1, 0, stripedBrick);
		addBlock(world, basePos, 6, 1, 6, enforcerSpawner);
		addBlock(world, basePos, 6, 1, 7, stripedBrick);
		addBlock(world, basePos, 7, 1, 0, stripedBrick);
		addBlock(world, basePos, 7, 1, 7, stripedBrick);
		addBlock(world, basePos, 7, 1, 8, dottedBrick);
		addBlock(world, basePos, 8, 1, 0, stripedBrick);
		addBlock(world, basePos, 8, 1, 7, stripedBrick);
		addBlock(world, basePos, 8, 1, 8, stripedBrick);
		addBlock(world, basePos, 8, 1, 9, stripedBrick);
		addBlock(world, basePos, 8, 1, 10, stripedBrick);
		addBlock(world, basePos, 9, 1, 0, stripedBrick);
		addBlock(world, basePos, 9, 1, 1, stripedBrick);
		addBlock(world, basePos, 9, 1, 2, stripedBrick);
		addBlock(world, basePos, 9, 1, 3, stripedBrick);
		addBlock(world, basePos, 9, 1, 9, mechyonSpawner);
		addBlock(world, basePos, 9, 1, 10, stripedBrick);
		addBlock(world, basePos, 10, 1, 2, dottedBrick);
		addBlock(world, basePos, 10, 1, 3, stripedBrick);
		addBlock(world, basePos, 10, 1, 10, stripedBrick);
		addBlock(world, basePos, 11, 1, 3, stripedBrick);
		addBlock(world, basePos, 11, 1, 4, chest);
		addBlock(world, basePos, 11, 1, 10, stripedBrick);
		addBlock(world, basePos, 11, 1, 11, dottedBrick);
		addBlock(world, basePos, 12, 1, 3, stripedBrick);
		addBlock(world, basePos, 12, 1, 4, stripedBrick);
		addBlock(world, basePos, 12, 1, 5, stripedBrick);
		addBlock(world, basePos, 12, 1, 6, stripedBrick);
		addBlock(world, basePos, 12, 1, 10, stripedBrick);
		addBlock(world, basePos, 12, 1, 11, stripedBrick);
		addBlock(world, basePos, 12, 1, 12, stripedBrick);
		addBlock(world, basePos, 12, 1, 13, stripedBrick);
		addBlock(world, basePos, 12, 1, 14, stripedBrick);
		addBlock(world, basePos, 12, 1, 15, stripedBrick);
		addBlock(world, basePos, 13, 1, 5, dottedBrick);
		addBlock(world, basePos, 13, 1, 6, stripedBrick);
		addBlock(world, basePos, 14, 1, 6, stripedBrick);
		addBlock(world, basePos, 15, 1, 6, stripedBrick);
		addBlock(world, basePos, 16, 1, 6, stripedBrick);
		addBlock(world, basePos, 16, 1, 7, stripedBrick);
		addBlock(world, basePos, 16, 1, 8, stripedBrick);
		addBlock(world, basePos, 16, 1, 9, stripedBrick);
		addBlock(world, basePos, 16, 1, 10, stripedBrick);
		addBlock(world, basePos, 16, 1, 11, stripedBrick);
		addBlock(world, basePos, 16, 1, 12, stripedBrick);
		addBlock(world, basePos, 16, 1, 13, stripedBrick);
		addBlock(world, basePos, 16, 1, 14, stripedBrick);
		addBlock(world, basePos, 16, 1, 15, stripedBrick);
		addBlock(world, basePos, 0, 2, 0, stripedBrick);
		addBlock(world, basePos, 0, 2, 4, stripedBrick);
		addBlock(world, basePos, 1, 2, 0, stripedBrick);
		addBlock(world, basePos, 1, 2, 4, stripedBrick);
		addBlock(world, basePos, 2, 2, 0, stripedBrick);
		addBlock(world, basePos, 2, 2, 4, stripedBrick);
		addBlock(world, basePos, 3, 2, 0, stripedBrick);
		addBlock(world, basePos, 3, 2, 4, stripedBrick);
		addBlock(world, basePos, 4, 2, 0, stripedBrick);
		addBlock(world, basePos, 4, 2, 4, stripedBrick);
		addBlock(world, basePos, 4, 2, 5, dottedBrick);
		addBlock(world, basePos, 5, 2, 0, stripedBrick);
		addBlock(world, basePos, 5, 2, 4, stripedBrick);
		addBlock(world, basePos, 5, 2, 5, stripedBrick);
		addBlock(world, basePos, 5, 2, 6, stripedBrick);
		addBlock(world, basePos, 5, 2, 7, stripedBrick);
		addBlock(world, basePos, 6, 2, 0, stripedBrick);
		addBlock(world, basePos, 6, 2, 7, stripedBrick);
		addBlock(world, basePos, 7, 2, 0, stripedBrick);
		addBlock(world, basePos, 7, 2, 7, stripedBrick);
		addBlock(world, basePos, 7, 2, 8, dottedBrick);
		addBlock(world, basePos, 8, 2, 0, stripedBrick);
		addBlock(world, basePos, 8, 2, 7, stripedBrick);
		addBlock(world, basePos, 8, 2, 8, stripedBrick);
		addBlock(world, basePos, 8, 2, 9, stripedBrick);
		addBlock(world, basePos, 8, 2, 10, stripedBrick);
		addBlock(world, basePos, 9, 2, 0, stripedBrick);
		addBlock(world, basePos, 9, 2, 1, stripedBrick);
		addBlock(world, basePos, 9, 2, 2, stripedBrick);
		addBlock(world, basePos, 9, 2, 3, stripedBrick);
		addBlock(world, basePos, 9, 2, 10, stripedBrick);
		addBlock(world, basePos, 10, 2, 2, dottedBrick);
		addBlock(world, basePos, 10, 2, 3, stripedBrick);
		addBlock(world, basePos, 10, 2, 10, stripedBrick);
		addBlock(world, basePos, 11, 2, 3, stripedBrick);
		addBlock(world, basePos, 11, 2, 10, stripedBrick);
		addBlock(world, basePos, 11, 2, 11, dottedBrick);
		addBlock(world, basePos, 12, 2, 3, stripedBrick);
		addBlock(world, basePos, 12, 2, 4, stripedBrick);
		addBlock(world, basePos, 12, 2, 5, stripedBrick);
		addBlock(world, basePos, 12, 2, 6, stripedBrick);
		addBlock(world, basePos, 12, 2, 10, stripedBrick);
		addBlock(world, basePos, 12, 2, 11, stripedBrick);
		addBlock(world, basePos, 12, 2, 12, stripedBrick);
		addBlock(world, basePos, 12, 2, 13, stripedBrick);
		addBlock(world, basePos, 12, 2, 14, stripedBrick);
		addBlock(world, basePos, 12, 2, 15, stripedBrick);
		addBlock(world, basePos, 13, 2, 5, dottedBrick);
		addBlock(world, basePos, 13, 2, 6, stripedBrick);
		addBlock(world, basePos, 14, 2, 6, stripedBrick);
		addBlock(world, basePos, 15, 2, 6, stripedBrick);
		addBlock(world, basePos, 16, 2, 6, stripedBrick);
		addBlock(world, basePos, 16, 2, 7, stripedBrick);
		addBlock(world, basePos, 16, 2, 8, stripedBrick);
		addBlock(world, basePos, 16, 2, 9, stripedBrick);
		addBlock(world, basePos, 16, 2, 10, stripedBrick);
		addBlock(world, basePos, 16, 2, 11, stripedBrick);
		addBlock(world, basePos, 16, 2, 12, stripedBrick);
		addBlock(world, basePos, 16, 2, 13, stripedBrick);
		addBlock(world, basePos, 16, 2, 14, stripedBrick);
		addBlock(world, basePos, 16, 2, 15, stripedBrick);
		addBlock(world, basePos, 0, 3, 0, stripedBrick);
		addBlock(world, basePos, 0, 3, 4, stripedBrick);
		addBlock(world, basePos, 1, 3, 0, stripedBrick);
		addBlock(world, basePos, 1, 3, 4, stripedBrick);
		addBlock(world, basePos, 2, 3, 0, stripedBrick);
		addBlock(world, basePos, 2, 3, 4, stripedBrick);
		addBlock(world, basePos, 3, 3, 0, stripedBrick);
		addBlock(world, basePos, 3, 3, 4, stripedBrick);
		addBlock(world, basePos, 4, 3, 0, stripedBrick);
		addBlock(world, basePos, 4, 3, 4, stripedBrick);
		addBlock(world, basePos, 4, 3, 5, dottedBrick);
		addBlock(world, basePos, 5, 3, 0, stripedBrick);
		addBlock(world, basePos, 5, 3, 4, stripedBrick);
		addBlock(world, basePos, 5, 3, 5, stripedBrick);
		addBlock(world, basePos, 5, 3, 6, stripedBrick);
		addBlock(world, basePos, 5, 3, 7, stripedBrick);
		addBlock(world, basePos, 6, 3, 0, stripedBrick);
		addBlock(world, basePos, 6, 3, 7, stripedBrick);
		addBlock(world, basePos, 7, 3, 0, stripedBrick);
		addBlock(world, basePos, 7, 3, 7, stripedBrick);
		addBlock(world, basePos, 7, 3, 8, dottedBrick);
		addBlock(world, basePos, 8, 3, 0, stripedBrick);
		addBlock(world, basePos, 8, 3, 7, stripedBrick);
		addBlock(world, basePos, 8, 3, 8, stripedBrick);
		addBlock(world, basePos, 8, 3, 9, stripedBrick);
		addBlock(world, basePos, 8, 3, 10, stripedBrick);
		addBlock(world, basePos, 9, 3, 0, stripedBrick);
		addBlock(world, basePos, 9, 3, 1, stripedBrick);
		addBlock(world, basePos, 9, 3, 2, stripedBrick);
		addBlock(world, basePos, 9, 3, 3, stripedBrick);
		addBlock(world, basePos, 9, 3, 10, stripedBrick);
		addBlock(world, basePos, 10, 3, 2, dottedBrick);
		addBlock(world, basePos, 10, 3, 3, stripedBrick);
		addBlock(world, basePos, 10, 3, 10, stripedBrick);
		addBlock(world, basePos, 11, 3, 3, stripedBrick);
		addBlock(world, basePos, 11, 3, 10, stripedBrick);
		addBlock(world, basePos, 11, 3, 11, dottedBrick);
		addBlock(world, basePos, 12, 3, 3, stripedBrick);
		addBlock(world, basePos, 12, 3, 4, stripedBrick);
		addBlock(world, basePos, 12, 3, 5, stripedBrick);
		addBlock(world, basePos, 12, 3, 6, stripedBrick);
		addBlock(world, basePos, 12, 3, 10, stripedBrick);
		addBlock(world, basePos, 12, 3, 11, stripedBrick);
		addBlock(world, basePos, 12, 3, 12, stripedBrick);
		addBlock(world, basePos, 12, 3, 13, stripedBrick);
		addBlock(world, basePos, 12, 3, 14, stripedBrick);
		addBlock(world, basePos, 12, 3, 15, stripedBrick);
		addBlock(world, basePos, 13, 3, 5, dottedBrick);
		addBlock(world, basePos, 13, 3, 6, stripedBrick);
		addBlock(world, basePos, 14, 3, 6, stripedBrick);
		addBlock(world, basePos, 15, 3, 6, stripedBrick);
		addBlock(world, basePos, 16, 3, 6, stripedBrick);
		addBlock(world, basePos, 16, 3, 7, stripedBrick);
		addBlock(world, basePos, 16, 3, 8, stripedBrick);
		addBlock(world, basePos, 16, 3, 9, stripedBrick);
		addBlock(world, basePos, 16, 3, 10, stripedBrick);
		addBlock(world, basePos, 16, 3, 11, stripedBrick);
		addBlock(world, basePos, 16, 3, 12, stripedBrick);
		addBlock(world, basePos, 16, 3, 13, stripedBrick);
		addBlock(world, basePos, 16, 3, 14, stripedBrick);
		addBlock(world, basePos, 16, 3, 15, stripedBrick);
		addBlock(world, basePos, 0, 4, 0, dottedBrick);
		addBlock(world, basePos, 0, 4, 1, stripedBrick);
		addBlock(world, basePos, 0, 4, 2, stripedBrick);
		addBlock(world, basePos, 0, 4, 3, stripedBrick);
		addBlock(world, basePos, 0, 4, 4, dottedBrick);
		addBlock(world, basePos, 1, 4, 0, dottedBrick);
		addBlock(world, basePos, 1, 4, 1, stripedBrick);
		addBlock(world, basePos, 1, 4, 2, stripedBrick);
		addBlock(world, basePos, 1, 4, 3, stripedBrick);
		addBlock(world, basePos, 1, 4, 4, dottedBrick);
		addBlock(world, basePos, 2, 4, 0, dottedBrick);
		addBlock(world, basePos, 2, 4, 1, stripedBrick);
		addBlock(world, basePos, 2, 4, 2, stripedBrick);
		addBlock(world, basePos, 2, 4, 3, stripedBrick);
		addBlock(world, basePos, 2, 4, 4, dottedBrick);
		addBlock(world, basePos, 3, 4, 0, dottedBrick);
		addBlock(world, basePos, 3, 4, 1, stripedBrick);
		addBlock(world, basePos, 3, 4, 2, stripedBrick);
		addBlock(world, basePos, 3, 4, 3, stripedBrick);
		addBlock(world, basePos, 3, 4, 4, dottedBrick);
		addBlock(world, basePos, 4, 4, 0, dottedBrick);
		addBlock(world, basePos, 4, 4, 1, stripedBrick);
		addBlock(world, basePos, 4, 4, 2, stripedBrick);
		addBlock(world, basePos, 4, 4, 3, stripedBrick);
		addBlock(world, basePos, 4, 4, 4, dottedBrick);
		addBlock(world, basePos, 4, 4, 5, dottedBrick);
		addBlock(world, basePos, 5, 4, 0, dottedBrick);
		addBlock(world, basePos, 5, 4, 1, stripedBrick);
		addBlock(world, basePos, 5, 4, 2, stripedBrick);
		addBlock(world, basePos, 5, 4, 3, stripedBrick);
		addBlock(world, basePos, 5, 4, 4, dottedBrick);
		addBlock(world, basePos, 5, 4, 5, dottedBrick);
		addBlock(world, basePos, 5, 4, 6, dottedBrick);
		addBlock(world, basePos, 5, 4, 7, dottedBrick);
		addBlock(world, basePos, 6, 4, 0, dottedBrick);
		addBlock(world, basePos, 6, 4, 1, stripedBrick);
		addBlock(world, basePos, 6, 4, 2, stripedBrick);
		addBlock(world, basePos, 6, 4, 3, stripedBrick);
		addBlock(world, basePos, 6, 4, 4, stripedBrick);
		addBlock(world, basePos, 6, 4, 5, stripedBrick);
		addBlock(world, basePos, 6, 4, 6, stripedBrick);
		addBlock(world, basePos, 6, 4, 7, dottedBrick);
		addBlock(world, basePos, 7, 4, 0, dottedBrick);
		addBlock(world, basePos, 7, 4, 1, stripedBrick);
		addBlock(world, basePos, 7, 4, 2, stripedBrick);
		addBlock(world, basePos, 7, 4, 3, stripedBrick);
		addBlock(world, basePos, 7, 4, 4, stripedBrick);
		addBlock(world, basePos, 7, 4, 5, stripedBrick);
		addBlock(world, basePos, 7, 4, 6, stripedBrick);
		addBlock(world, basePos, 7, 4, 7, dottedBrick);
		addBlock(world, basePos, 7, 4, 8, dottedBrick);
		addBlock(world, basePos, 8, 4, 0, dottedBrick);
		addBlock(world, basePos, 8, 4, 1, stripedBrick);
		addBlock(world, basePos, 8, 4, 2, stripedBrick);
		addBlock(world, basePos, 8, 4, 3, stripedBrick);
		addBlock(world, basePos, 8, 4, 4, stripedBrick);
		addBlock(world, basePos, 8, 4, 5, stripedBrick);
		addBlock(world, basePos, 8, 4, 6, stripedBrick);
		addBlock(world, basePos, 8, 4, 7, dottedBrick);
		addBlock(world, basePos, 8, 4, 8, dottedBrick);
		addBlock(world, basePos, 8, 4, 9, dottedBrick);
		addBlock(world, basePos, 8, 4, 10, dottedBrick);
		addBlock(world, basePos, 9, 4, 0, dottedBrick);
		addBlock(world, basePos, 9, 4, 1, dottedBrick);
		addBlock(world, basePos, 9, 4, 2, dottedBrick);
		addBlock(world, basePos, 9, 4, 3, dottedBrick);
		addBlock(world, basePos, 9, 4, 4, stripedBrick);
		addBlock(world, basePos, 9, 4, 5, stripedBrick);
		addBlock(world, basePos, 9, 4, 6, stripedBrick);
		addBlock(world, basePos, 9, 4, 7, stripedBrick);
		addBlock(world, basePos, 9, 4, 8, stripedBrick);
		addBlock(world, basePos, 9, 4, 9, stripedBrick);
		addBlock(world, basePos, 9, 4, 10, dottedBrick);
		addBlock(world, basePos, 10, 4, 2, dottedBrick);
		addBlock(world, basePos, 10, 4, 3, dottedBrick);
		addBlock(world, basePos, 10, 4, 4, stripedBrick);
		addBlock(world, basePos, 10, 4, 5, stripedBrick);
		addBlock(world, basePos, 10, 4, 6, stripedBrick);
		addBlock(world, basePos, 10, 4, 7, stripedBrick);
		addBlock(world, basePos, 10, 4, 8, stripedBrick);
		addBlock(world, basePos, 10, 4, 9, stripedBrick);
		addBlock(world, basePos, 10, 4, 10, dottedBrick);
		addBlock(world, basePos, 11, 4, 3, dottedBrick);
		addBlock(world, basePos, 11, 4, 4, stripedBrick);
		addBlock(world, basePos, 11, 4, 5, stripedBrick);
		addBlock(world, basePos, 11, 4, 6, stripedBrick);
		addBlock(world, basePos, 11, 4, 7, stripedBrick);
		addBlock(world, basePos, 11, 4, 8, stripedBrick);
		addBlock(world, basePos, 11, 4, 9, stripedBrick);
		addBlock(world, basePos, 11, 4, 10, dottedBrick);
		addBlock(world, basePos, 11, 4, 11, dottedBrick);
		addBlock(world, basePos, 12, 4, 3, dottedBrick);
		addBlock(world, basePos, 12, 4, 4, dottedBrick);
		addBlock(world, basePos, 12, 4, 5, dottedBrick);
		addBlock(world, basePos, 12, 4, 6, dottedBrick);
		addBlock(world, basePos, 12, 4, 7, stripedBrick);
		addBlock(world, basePos, 12, 4, 8, stripedBrick);
		addBlock(world, basePos, 12, 4, 9, stripedBrick);
		addBlock(world, basePos, 12, 4, 10, dottedBrick);
		addBlock(world, basePos, 12, 4, 11, dottedBrick);
		addBlock(world, basePos, 12, 4, 12, dottedBrick);
		addBlock(world, basePos, 12, 4, 13, dottedBrick);
		addBlock(world, basePos, 12, 4, 14, dottedBrick);
		addBlock(world, basePos, 12, 4, 15, dottedBrick);
		addBlock(world, basePos, 13, 4, 5, dottedBrick);
		addBlock(world, basePos, 13, 4, 6, dottedBrick);
		addBlock(world, basePos, 13, 4, 7, stripedBrick);
		addBlock(world, basePos, 13, 4, 8, stripedBrick);
		addBlock(world, basePos, 13, 4, 9, stripedBrick);
		addBlock(world, basePos, 13, 4, 10, stripedBrick);
		addBlock(world, basePos, 13, 4, 11, stripedBrick);
		addBlock(world, basePos, 13, 4, 12, stripedBrick);
		addBlock(world, basePos, 13, 4, 13, stripedBrick);
		addBlock(world, basePos, 13, 4, 14, stripedBrick);
		addBlock(world, basePos, 13, 4, 15, stripedBrick);
		addBlock(world, basePos, 14, 4, 6, dottedBrick);
		addBlock(world, basePos, 14, 4, 7, stripedBrick);
		addBlock(world, basePos, 14, 4, 8, stripedBrick);
		addBlock(world, basePos, 14, 4, 9, stripedBrick);
		addBlock(world, basePos, 14, 4, 10, stripedBrick);
		addBlock(world, basePos, 14, 4, 11, stripedBrick);
		addBlock(world, basePos, 14, 4, 12, stripedBrick);
		addBlock(world, basePos, 14, 4, 13, stripedBrick);
		addBlock(world, basePos, 14, 4, 14, stripedBrick);
		addBlock(world, basePos, 14, 4, 15, stripedBrick);
		addBlock(world, basePos, 15, 4, 6, dottedBrick);
		addBlock(world, basePos, 15, 4, 7, stripedBrick);
		addBlock(world, basePos, 15, 4, 8, stripedBrick);
		addBlock(world, basePos, 15, 4, 9, stripedBrick);
		addBlock(world, basePos, 15, 4, 10, stripedBrick);
		addBlock(world, basePos, 15, 4, 11, stripedBrick);
		addBlock(world, basePos, 15, 4, 12, stripedBrick);
		addBlock(world, basePos, 15, 4, 13, stripedBrick);
		addBlock(world, basePos, 15, 4, 14, stripedBrick);
		addBlock(world, basePos, 15, 4, 15, stripedBrick);
		addBlock(world, basePos, 16, 4, 6, dottedBrick);
		addBlock(world, basePos, 16, 4, 7, dottedBrick);
		addBlock(world, basePos, 16, 4, 8, dottedBrick);
		addBlock(world, basePos, 16, 4, 9, dottedBrick);
		addBlock(world, basePos, 16, 4, 10, dottedBrick);
		addBlock(world, basePos, 16, 4, 11, dottedBrick);
		addBlock(world, basePos, 16, 4, 12, dottedBrick);
		addBlock(world, basePos, 16, 4, 13, dottedBrick);
		addBlock(world, basePos, 16, 4, 14, dottedBrick);
		addBlock(world, basePos, 16, 4, 15, dottedBrick);
	}

	@Override
	protected void doPostBuildOps(World world, Random rand, BlockPos basePos) {
		assignLootChests(world, rand, LootSystemRegister.structureIroPassageChests, basePos.add(11, 1, 4));
	}
}
