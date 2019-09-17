package exnihilofabrico.api.registry

import exnihilofabrico.registry.*

object ExNihiloRegistries {
    @JvmField
    val WITCHWATER_WORLD: IWitchWaterFluidRegistry = WitchWaterFluidRegistry()

    @JvmField
    val HAMMER: IToolRegistry = ToolRegistry()
    @JvmField
    val CROOK: IToolRegistry = ToolRegistry()

    @JvmField
    val MESH: IMeshRegistry = MeshRegistry()
    @JvmField
    val SIEVE: ISieveRegistry = SieveRegistry()

    @JvmField
    val CRUCIBLE_HEAT: ICrucibleHeatRegistry = CrucibleHeatRegistry()
    @JvmField
    val CRUCIBLE_STONE: ICrucibleRegistry = CrucibleRegistry()
    @JvmField
    val CRUCIBLE_WOOD: ICrucibleRegistry = CrucibleRegistry()

    @JvmField
    val ORES: IOreRegistry = OreRegistry()
}