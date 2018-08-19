package com.minecolonies.coremod.blocks;

import com.minecolonies.api.util.constant.Constants;
import com.minecolonies.coremod.blocks.cactus.*;
import com.minecolonies.coremod.blocks.decorative.*;
import com.minecolonies.coremod.blocks.huts.*;
import com.minecolonies.coremod.blocks.schematic.BlockSolidSubstitution;
import com.minecolonies.coremod.blocks.schematic.BlockSubstitution;
import com.minecolonies.coremod.blocks.schematic.BlockWaypoint;
import com.minecolonies.coremod.blocks.types.TimberFrameType;
import com.minecolonies.coremod.items.ItemCushions;
import com.minecolonies.coremod.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Class to create the modBlocks.
 * References to the blocks can be made here
 * <p>
 * We disabled the following finals since we are neither able to mark the items as final, nor do we want to provide public accessors.
 */
@SuppressWarnings({"squid:ClassVariableVisibilityCheck", "squid:S2444", "squid:S1444", "squid:S1820",})

public final class ModBlocks
{
    /*
     * Creating objects for all blocks in the mod.
     * References can be made to here.
     */

    private static final List<BlockTimberFrame>         timberFrames = new ArrayList<>();
    public static        BlockHutTownHall               blockHutTownHall;
    public static        BlockHutCitizen                blockHutCitizen;
    public static        BlockHutMiner                  blockHutMiner;
    public static        BlockHutLumberjack             blockHutLumberjack;
    public static        BlockHutBaker                  blockHutBaker;
    public static        BlockHutBuilder                blockHutBuilder;
    public static        BlockHutDeliveryman            blockHutDeliveryman;
    public static        BlockHutBlacksmith             blockHutBlacksmith;
    public static        BlockHutStonemason             blockHutStonemason;
    public static        BlockHutFarmer                 blockHutFarmer;
    public static        BlockHutFisherman              blockHutFisherman;
    public static        BlockSubstitution              blockSubstitution;
    public static        BlockBarracksTowerSubstitution blockBarracksTowerSubstitution;
    public static        BlockSolidSubstitution         blockSolidSubstitution;
    public static        BlockHutField                  blockHutField;
    public static        BlockHutGuardTower             blockHutGuardTower;
    public static        BlockHutWareHouse              blockHutWareHouse;
    public static        BlockHutShepherd               blockHutShepherd;
    public static        BlockHutCowboy                 blockHutCowboy;
    public static        BlockHutSwineHerder            blockHutSwineHerder;
    public static        BlockHutChickenHerder          blockHutChickenHerder;
    public static        BlockHutBarracks               blockHutBarracks;
    public static        BlockHutBarracksTower          blockHutBarracksTower;
    public static        BlockHutCook                   blockHutCook;
    public static        BlockHutSmeltery               blockHutSmeltery;
    public static        BlockCactusPlank               blockCactusPlank;
    public static        BlockCactusDoor                blockCactusDoor;
    public static        BlockCactusTrapdoor            blockCactusTrapdoor;
    public static        BlockCactusStair               blockCactusStair;
    public static        BlockCactusSlabHalf            blockCactusSlabHalf;
    public static        BlockCactusSlabDouble          blockCactusSlabDouble;
    public static        BlockHutComposter              blockHutComposter;
    public static        BlockHutLibrary                blockHutLibrary;

    /**
     * Utility blocks.
     */
    public static BlockConstructionTape       blockConstructionTape;
    public static BlockMinecoloniesRack       blockRack;
    public static BlockWaypoint               blockWayPoint;
    public static BlockInfoPoster             blockInfoPoster;
    public static BlockPaperwall              blockPaperWall;
    public static BlockShingle                blockShingleOak;
    public static BlockShingle                blockShingleBirch;
    public static BlockShingle                blockShingleJungle;
    public static BlockShingle                blockShingleSpruce;
    public static BlockShingle                blockShingleDarkOak;
    public static BlockShingle                blockShingleAcacia;
    public static BlockShingleSlab            blockShingleSlab;
    public static MultiBlock                  multiBlock;
    public static BlockBarrel                 blockBarrel;

//      public static BlockCushion                blockCushion;
    public static BlockCushion                blockCushionWhite;
    public static BlockCushion                blockCushionOrange;
    public static BlockCushion                blockCushionMagenta;
    public static BlockCushion                blockCushionLight_blue;
    public static BlockCushion                blockCushionYellow;
    public static BlockCushion                blockCushionLime;
    public static BlockCushion                blockCushionPink;
    public static BlockCushion                blockCushionGray;
    public static BlockCushion                blockCushionSilver;
    public static BlockCushion                blockCushionCyan;
    public static BlockCushion                blockCushionPurple;
    public static BlockCushion                blockCushionBlue;
    public static BlockCushion                blockCushionBrown;
    public static BlockCushion                blockCushionGreen;
    public static BlockCushion                blockCushionRed;
    public static BlockCushion                blockCushionBlack;

    
    public static List<BlockTimberFrame> getTimberFrames()
    {
        return new ArrayList<>(timberFrames);
    }

    /**
     * Private constructor to hide the implicit public one.
     */
    private ModBlocks()
    {
        /*
         * Intentionally left empty.
         */
    }

    /**
     * Initates all the blocks. At the correct time.
     */
    public static void init(final IForgeRegistry<Block> registry)
    {
        blockHutBaker = new BlockHutBaker().registerBlock(registry);
        blockHutBlacksmith = new BlockHutBlacksmith().registerBlock(registry);
        blockHutBuilder = new BlockHutBuilder().registerBlock(registry);
        blockHutCitizen = new BlockHutCitizen().registerBlock(registry);
        blockHutDeliveryman = new BlockHutDeliveryman().registerBlock(registry);
        blockHutFarmer = new BlockHutFarmer().registerBlock(registry);
        blockHutField = new BlockHutField().registerBlock(registry);
        blockHutFisherman = new BlockHutFisherman().registerBlock(registry);
        blockHutGuardTower = new BlockHutGuardTower().registerBlock(registry);
        blockHutLumberjack = new BlockHutLumberjack().registerBlock(registry);
        blockHutMiner = new BlockHutMiner().registerBlock(registry);
        blockHutStonemason = new BlockHutStonemason().registerBlock(registry);
        blockHutTownHall = new BlockHutTownHall().registerBlock(registry);
        blockHutWareHouse = new BlockHutWareHouse().registerBlock(registry);
        blockHutShepherd = new BlockHutShepherd().registerBlock(registry);
        blockHutCowboy = new BlockHutCowboy().registerBlock(registry);
        blockHutSwineHerder = new BlockHutSwineHerder().registerBlock(registry);
        blockHutChickenHerder = new BlockHutChickenHerder().registerBlock(registry);
        blockHutBarracks = new BlockHutBarracks().registerBlock(registry);
        blockHutBarracksTower = new BlockHutBarracksTower().registerBlock(registry);
        blockHutCook = new BlockHutCook().registerBlock(registry);
        blockHutSmeltery = new BlockHutSmeltery().registerBlock(registry);
        blockHutComposter = new BlockHutComposter().registerBlock(registry);
        blockHutLibrary =  new BlockHutLibrary().registerBlock(registry);

        blockInfoPoster = new BlockInfoPoster().registerBlock(registry);
        blockPaperWall = new BlockPaperwall().registerBlock(registry);
        blockConstructionTape = new BlockConstructionTape().registerBlock(registry);
        blockSolidSubstitution = new BlockSolidSubstitution().registerBlock(registry);
        blockBarracksTowerSubstitution = new BlockBarracksTowerSubstitution().registerBlock(registry);
        blockSubstitution = new BlockSubstitution().registerBlock(registry);
        blockRack = new BlockMinecoloniesRack().registerBlock(registry);
        blockWayPoint = new BlockWaypoint().registerBlock(registry);

        blockCactusPlank = new BlockCactusPlank().registerBlock(registry);
        blockCactusDoor = new BlockCactusDoor(blockCactusDoor).registerBlock(registry);
        blockCactusTrapdoor = new BlockCactusTrapdoor().registerBlock(registry);
        blockCactusSlabHalf = new BlockCactusSlabHalf().registerBlock(registry);
        blockCactusSlabDouble = new BlockCactusSlabDouble().registerBlock(registry);

        blockCactusStair = new BlockCactusStair(new BlockPlanks().getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.OAK)).registerBlock(registry);

//        blockCushionWhite = new BlockCushion(MapColor.COLORS[0],BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.WHITE.getUnlocalizedName()).registerBlock(registry);
//        blockCushionGreen = new BlockCushion(MapColor.GREEN,BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.GREEN.getUnlocalizedName()).registerBlock(registry);
//        blockCushionBlue = new BlockCushion(MapColor.BLUE,BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.BLUE.getUnlocalizedName()).registerBlock(registry);

        blockCushionWhite = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.WHITE.getUnlocalizedName()).registerBlock(registry);
        blockCushionGreen = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.GREEN.getUnlocalizedName()).registerBlock(registry);
        blockCushionBlue = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.BLUE.getUnlocalizedName()).registerBlock(registry);
        blockCushionOrange = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.ORANGE.getUnlocalizedName()).registerBlock(registry);
        blockCushionMagenta = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.MAGENTA.getUnlocalizedName()).registerBlock(registry);
        blockCushionLight_blue = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.LIGHT_BLUE.getUnlocalizedName()).registerBlock(registry);
        blockCushionYellow = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.YELLOW.getUnlocalizedName()).registerBlock(registry);
        blockCushionLime = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.LIME.getUnlocalizedName()).registerBlock(registry);
        blockCushionPink = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.PINK.getUnlocalizedName()).registerBlock(registry);
        blockCushionGray = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.GRAY.getUnlocalizedName()).registerBlock(registry);
        blockCushionSilver = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.SILVER.getUnlocalizedName()).registerBlock(registry);
        blockCushionCyan = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.CYAN.getUnlocalizedName()).registerBlock(registry);
        blockCushionPurple = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.PURPLE.getUnlocalizedName()).registerBlock(registry);
        blockCushionBrown = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.BROWN.getUnlocalizedName()).registerBlock(registry);
        blockCushionRed = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.RED.getUnlocalizedName()).registerBlock(registry);
        blockCushionBlack = new BlockCushion(BlockCushion.BLOCK_PREFIX + "_" + EnumDyeColor.BLACK.getUnlocalizedName()).registerBlock(registry);

        blockShingleOak = new BlockShingle(new BlockPlanks().getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.OAK),
          BlockShingle.BLOCK_PREFIX + "_" + BlockPlanks.EnumType.OAK.getName()).registerBlock(registry);
        blockShingleJungle = new BlockShingle(new BlockPlanks().getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.JUNGLE),
          BlockShingle.BLOCK_PREFIX + "_" + BlockPlanks.EnumType.JUNGLE.getName()).registerBlock(registry);
        blockShingleBirch = new BlockShingle(new BlockPlanks().getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.BIRCH),
          BlockShingle.BLOCK_PREFIX + "_" + BlockPlanks.EnumType.BIRCH.getName()).registerBlock(registry);
        blockShingleSpruce = new BlockShingle(new BlockPlanks().getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.SPRUCE),
          BlockShingle.BLOCK_PREFIX + "_" + BlockPlanks.EnumType.SPRUCE.getName()).registerBlock(registry);
        blockShingleDarkOak = new BlockShingle(new BlockPlanks().getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.DARK_OAK),
          BlockShingle.BLOCK_PREFIX + "_" + BlockPlanks.EnumType.DARK_OAK.getName()).registerBlock(registry);
        blockShingleAcacia = new BlockShingle(new BlockPlanks().getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.ACACIA),
          BlockShingle.BLOCK_PREFIX + "_" + BlockPlanks.EnumType.ACACIA.getName()).registerBlock(registry);
        blockShingleSlab = new BlockShingleSlab().registerBlock(registry);
        multiBlock = new MultiBlock().registerBlock(registry);
        blockBarrel = new BlockBarrel().registerBlock(registry);

        for (final BlockPlanks.EnumType type : BlockPlanks.EnumType.values())
        {
            for (final TimberFrameType frameType : TimberFrameType.values())
            {
                timberFrames.add(new BlockTimberFrame(BlockTimberFrame.BLOCK_NAME + "_" + type.getName() + "_" + frameType).registerBlock(registry));
            }
        }
    }

    public static void registerItemBlock(final IForgeRegistry<Item> registry)
    {
        blockHutBaker.registerItemBlock(registry);
        blockHutBlacksmith.registerItemBlock(registry);
        blockHutBuilder.registerItemBlock(registry);
        blockHutCitizen.registerItemBlock(registry);
        blockHutDeliveryman.registerItemBlock(registry);
        blockHutFarmer.registerItemBlock(registry);
        blockHutField.registerItemBlock(registry);
        blockHutFisherman.registerItemBlock(registry);
        blockHutGuardTower.registerItemBlock(registry);
        blockHutLumberjack.registerItemBlock(registry);
        blockHutMiner.registerItemBlock(registry);
        blockHutStonemason.registerItemBlock(registry);
        blockHutTownHall.registerItemBlock(registry);
        blockHutWareHouse.registerItemBlock(registry);
        blockHutShepherd.registerItemBlock(registry);
        blockHutCowboy.registerItemBlock(registry);
        blockHutSwineHerder.registerItemBlock(registry);
        blockHutChickenHerder.registerItemBlock(registry);
        blockHutBarracksTower.registerItemBlock(registry);
        blockHutBarracks.registerItemBlock(registry);
        blockHutCook.registerItemBlock(registry);
        blockHutSmeltery.registerItemBlock(registry);
        blockHutComposter.registerItemBlock(registry);
        blockHutLibrary.registerItemBlock(registry);

        blockConstructionTape.registerItemBlock(registry);
        blockSolidSubstitution.registerItemBlock(registry);
        blockSubstitution.registerItemBlock(registry);
        blockBarracksTowerSubstitution.registerItemBlock(registry);
        blockRack.registerItemBlock(registry);
        blockWayPoint.registerItemBlock(registry);
        blockInfoPoster.registerItemBlock(registry);
        blockPaperWall.registerItemBlock(registry);
        blockShingleOak.registerItemBlock(registry);
        blockShingleBirch.registerItemBlock(registry);
        blockShingleJungle.registerItemBlock(registry);
        blockShingleSpruce.registerItemBlock(registry);
        blockShingleDarkOak.registerItemBlock(registry);
        blockShingleAcacia.registerItemBlock(registry);
        blockShingleSlab.registerItemBlock(registry);
        multiBlock.registerItemBlock(registry);
        blockCactusPlank.registerItemBlock(registry);
        blockCactusTrapdoor.registerItemBlock(registry);
        blockCactusStair.registerItemBlock(registry);
        registry.register(new ItemSlab(blockCactusSlabHalf, blockCactusSlabHalf, blockCactusSlabDouble).setRegistryName(blockCactusSlabHalf.getRegistryName()));
        blockBarrel.registerItemBlock(registry);

        blockCushionWhite.registerItemBlock(registry);
        blockCushionGreen.registerItemBlock(registry);
        blockCushionBlue.registerItemBlock(registry);
        blockCushionOrange.registerItemBlock(registry);
        blockCushionMagenta.registerItemBlock(registry);
        blockCushionLight_blue.registerItemBlock(registry);
        blockCushionYellow.registerItemBlock(registry);
        blockCushionLime.registerItemBlock(registry);
        blockCushionPink.registerItemBlock(registry);
        blockCushionGray.registerItemBlock(registry);
        blockCushionSilver.registerItemBlock(registry);
        blockCushionCyan.registerItemBlock(registry);
        blockCushionPurple.registerItemBlock(registry);
        blockCushionBrown.registerItemBlock(registry);
        blockCushionRed.registerItemBlock(registry);
        blockCushionBlack.registerItemBlock(registry);

        

        for (final BlockTimberFrame frame: timberFrames)
        {
            frame.registerItemBlock(registry);
        }
    }
}
