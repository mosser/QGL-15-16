import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week49 extends Run with SI3 {

  override val number: String = "49"

  override val seed: Long                = Islands.s49
  override lazy val theIsland: IslandMap = Islands.week49

  override val crew: Int    = 3
  override val budget: Int  = 10000
  override val plane: Plane = Plane(152, 159, Directions.NORTH)
  override val objectives   = Set((WOOD, 5000), (SUGAR_CANE, 1000), (GLASS, 300))

  override def players = all -"qbd" - "qcf"

  run

}
