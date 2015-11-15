import eu.ace_design.island.dsl.DiSLand
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.processes.AssignPitch
import eu.ace_design.island.stdlib.WhittakerDiagrams

object Islands extends DiSLand {


  val s46 = 0xE2D3535222C0D8B2L
  lazy val week46: IslandMap = {
    createIsland shapedAs ellipsis(80.percent, 50.percent, 72) withSize 1000 having 1200.faces builtWith Seq(
      plateau(20), flowing(rivers = 10, distance = 0.4), withMoisture(soils.wet, distance = 200),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s46
  }




}
