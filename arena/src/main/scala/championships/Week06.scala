package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.Islands
import library.SI3

object Week06 extends Run with SI3 {

  override val number: String = "06"

  override val seed: Long                = Islands.s06
  override lazy val theIsland: IslandMap = Islands.week06

  override val crew: Int    = 25
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 159, Directions.NORTH)
  override val objectives   = Set((WOOD, 15000), (GLASS, 100))

  override def players = all - "qbd" - "qcd" - "qcf"

  run

}
