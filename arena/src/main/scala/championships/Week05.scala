package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.Islands
import library.SI3

object Week05 extends Run with SI3 {

  override val number: String = "05"

  override val seed: Long                = Islands.s05
  override lazy val theIsland: IslandMap = Islands.week05

  override val crew: Int    = 25
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives   = Set((FUR, 2000), (WOOD, 7000), (GLASS, 100), (PLANK, 5000))

  override def players = all - "qaa" - "qcf"

  run

}
