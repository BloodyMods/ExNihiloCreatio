package exnihilofabrico.common.barrels

import com.swordglowsblue.artifice.api.builder.data.recipe.ShapedRecipeBuilder
import exnihilofabrico.common.base.BaseBlock
import net.fabricmc.fabric.api.block.FabricBlockSettings
import net.minecraft.block.*
import net.minecraft.entity.EntityContext
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.registry.Registry
import net.minecraft.world.BlockView

class BarrelBlock(val texture: Identifier,
                  val craftIngredient1: Identifier, val craftIngredient2: Identifier,
                  settings: FabricBlockSettings = FabricBlockSettings.of(Material.WOOD)):
        BaseBlock(settings), BlockEntityProvider {

    override fun getOutlineShape(state: BlockState?, view: BlockView?, pos: BlockPos?, entityContext: EntityContext?) = SHAPE
    override fun getRenderLayer() = BlockRenderLayer.CUTOUT
    override fun getRenderType(state: BlockState?) = BlockRenderType.MODEL

    /**
     * BlockEntity functions
     */
    override fun hasBlockEntity() = true
    override fun createBlockEntity(world: BlockView?) = BarrelBlockEntity()

    fun generateRecipe(builder: ShapedRecipeBuilder) {
        builder.pattern("x x", "x x", "xyx")
            .ingredientItem('x', craftIngredient1)
            .ingredientItem('y', craftIngredient2)
            .result(Registry.ITEM.getId(asItem()), 1)
    }

    companion object {
        val SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0)
    }
}