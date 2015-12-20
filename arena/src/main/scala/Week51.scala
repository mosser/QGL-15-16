import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week51 extends Run with SI3 {

  override val number: String = "51"

  override val seed: Long                = Islands.s51
  override lazy val theIsland: IslandMap = Islands.week51

  override val crew: Int    = 25
  override val budget: Int  = 10000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives   = Set((FUR, 3000), (WOOD, 3000), (GLASS, 100))

  override def players = all - "qac" - "qcf"

  run

}
