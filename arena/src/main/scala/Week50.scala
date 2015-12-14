import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week50 extends Run with SI3 {

  override val number: String = "50"

  override val seed: Long                = Islands.s50
  override lazy val theIsland: IslandMap = Islands.week50

  override val crew: Int    = 3
  override val budget: Int  = 10000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives   = Set((FUR, 5000), (WOOD, 1000), (GLASS, 300))

  override def players = all - "qbe" - "qcf"

  run

}
