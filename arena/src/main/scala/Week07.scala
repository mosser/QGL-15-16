import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week07 extends Run with SI3 {

  override val number: String = "07"

  override val seed: Long                = Islands.s07
  override lazy val theIsland: IslandMap = Islands.week07

  override val crew: Int    = 25
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 159, Directions.NORTH)
  override val objectives   = Set((WOOD, 15000), (LEATHER, 30), (GLASS, 100))

  override def players = all - "qac" - "qaf" - "qbd" - "qca" - "qcc" - "qce" - "qcf"

  run

}
