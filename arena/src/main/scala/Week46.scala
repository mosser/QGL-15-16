import eu.ace_design.island.dsl.DiSLand
import eu.ace_design.island.game._
import eu.ace_design.island.io.IslandMapFactory
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.POIGenerators.WithCreeks
import eu.ace_design.island.stdlib.Resources.{FLOWER, QUARTZ, WOOD}
import library.{Championship, SI3}
import java.io.File

object Week46 extends Championship with SI3 with DiSLand {

  override val seed = 0L// Islands.s46
  override val outputDir = "../championships/week46/"
  override val objectives: Set[(Resource,Int)] = Set((WOOD, 1000), (QUARTZ, 300), (FLOWER,10))

  // Generating the map and exporting it into readable artifacts
  def generate() = {
    val theIsland: IslandMap = Islands.week46
    IslandMapFactory(theIsland, new File(s"$outputDir/_map.json"))
    theIsland -> ( s"$outputDir/_map" as pdf)
  }

  //generate()

  val theIsland = IslandMapFactory(new File(s"$outputDir/_map.json"))
  val builder = new GameBoardBuilder(poiGenerators = Seq(new WithCreeks(10)))
  val theBoard: GameBoard = builder(theIsland).copy(startingTile = Some((1,1)))
  printInfo(theIsland, theBoard)

  // Building the game engine and the associated objectives
  val plane = Plane(theBoard.startingTile.get._1, theBoard.startingTile.get._2,Directions.EAST)
  val initialization = Game(Budget(7000), Crew(15), objectives).copy(plane = Some(plane))

  println("\n## Running championship with the following players")
  println(s"  - $playerNames")
  val results = run(initialization,theBoard, theIsland)

  // Displaying results
  printResults(results)

}
