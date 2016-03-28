package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.Islands
import library.SI3

object Week02 extends Run with SI3 {

  override val number: String = "02"

  override val seed: Long                = Islands.s02
  override lazy val theIsland: IslandMap = Islands.week02

  override val crew: Int    = 4
  override val budget: Int  = 15000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives   = Set((FLOWER, 40), (WOOD, 5000), (QUARTZ, 200), (GLASS, 50))

  override def players = all - "qcf"

}
