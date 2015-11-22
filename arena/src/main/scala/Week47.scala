import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{SI3, Islands}

object Week47 extends Run with SI3 {

  override val number: String = "47"

  override val seed: Long                = Islands.s47
  override lazy val theIsland: IslandMap = Islands.week47

  override val crew: Int      = 15
  override val budget: Int    = 7000
  override val plane: Plane   = Plane(1,1,Directions.EAST)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 1000), (QUARTZ, 300), (FLOWER,10))

  override def players = all - "qad" - "qcb" - "qcc" - "qce" - "qcf"

  run()

}
