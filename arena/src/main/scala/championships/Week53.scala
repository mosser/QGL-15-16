package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.Islands

import library.SI3

object Week53 extends Run with SI3 {

  override val number: String = "53"

  override val seed: Long                = Islands.s53
  override lazy val theIsland: IslandMap = Islands.week53

  override val crew: Int    = 25
  override val budget: Int  = 10000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives   = Set((FLOWER, 80), (WOOD, 5000), (GLASS, 100))

  override def players = all - "qab" - "qcf"

}
