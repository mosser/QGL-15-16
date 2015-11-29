import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week48 extends Run with SI3 {

  override val number: String = "48"

  override val seed: Long                = Islands.s48
  override lazy val theIsland: IslandMap = Islands.week48

  override val crew: Int    = 3
  override val budget: Int  = 10000
  override val plane: Plane = Plane(152, 159, Directions.NORTH)
  override val objectives   = Set((WOOD, 2000), (GLASS, 30), (FUR, 1000))

  override def players = all - "qaf" - "qcf" - "qda"

  run

}
