package library

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


  val s47 = 0x7C86C8F0AE471824L
  lazy val week47: IslandMap = {
    createIsland shapedAs donut(70.percent, 30.percent) withSize 1600 having 1200.faces builtWith Seq(
      plateau(30), flowing(rivers = 30, distance = 0.4), withMoisture(soils.normal, distance = 700),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s47
  }


}
