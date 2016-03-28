package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.Islands
import library.SI3

object Week09 extends Run with SI3 {

  override val number: String = "09"

  override val seed: Long                = Islands.s09
  override lazy val theIsland: IslandMap = Islands.week09

  override val crew: Int    = 15
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives   = Set((WOOD, 10000), (LEATHER, 300), (GLASS, 50))

  override def players = all - "qbd" - "qcf"

}
