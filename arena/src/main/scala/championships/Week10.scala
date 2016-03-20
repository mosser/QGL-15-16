package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.Islands
import library.SI3

object Week10 extends Run with SI3 {

  override val number: String = "10"

  override val seed: Long                = Islands.s10
  override lazy val theIsland: IslandMap = Islands.week10

  override val crew: Int    = 15
  override val budget: Int  = 20000
  override val plane: Plane = Plane(159, 159, Directions.NORTH)
  override val objectives   = Set((WOOD, 10000), (QUARTZ, 500), (LEATHER, 300), (RUM, 50))

  override def players = all - "qae"

  run

}
