package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.Islands
import library.SI3

object Week01 extends Run with SI3 {

  override val number: String = "01"

  override val seed: Long                = Islands.s01
  override lazy val theIsland: IslandMap = Islands.week01

  override val crew: Int    = 4
  override val budget: Int  = 15000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives   = Set((FLOWER, 80), (WOOD, 3000), (QUARTZ, 800), (PLANK, 1000))

  override def players = all  - "qae" - "qaf" - "qbe"- "qcf" - "qdd" - "qde"

}
