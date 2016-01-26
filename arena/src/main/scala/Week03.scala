import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week03 extends Run with SI3 {

  override val number: String = "03"

  override val seed: Long                = Islands.s03
  override lazy val theIsland: IslandMap = Islands.week03

  override val crew: Int    = 15
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives   = Set((FLOWER, 40), (WOOD, 5000), (QUARTZ, 200), (GLASS, 50))

  override def players = all - "qaa" - "qcf" - "qdb" - "qdd"

  run

}
