package library

import eu.ace_design.island.dsl.DiSLand
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.processes.AssignPitch
import eu.ace_design.island.stdlib.WhittakerDiagrams

object Islands extends DiSLand {

  // Big island, easy to find.
  val s46 = 0xE2D3535222C0D8B2L
  lazy val week46: IslandMap = {
    createIsland shapedAs ellipsis(80.percent, 50.percent, 72) withSize 1000 having 1200.faces builtWith Seq(
      plateau(20), flowing(rivers = 10, distance = 0.4), withMoisture(soils.wet, distance = 200),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s46
  }


  // Round island, quite big. Easy to exploit.
  val s47 = 0x7C86C8F0AE471824L
  lazy val week47: IslandMap = {
    createIsland shapedAs donut(70.percent, 30.percent) withSize 1600 having 1200.faces builtWith Seq(
      plateau(30), flowing(rivers = 30, distance = 0.4), withMoisture(soils.normal, distance = 700),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s47
  }

  // Needle in an haystack
  val s48 = 0x7099D003D471C6D9L
  lazy val week48: IslandMap = {
    createIsland shapedAs donut(40.percent, 5.percent) withSize 1600 having 1200.faces builtWith Seq(
      plateau(10), flowing(rivers = 5, distance = 0.4), withMoisture(soils.dry, distance = 100),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s48
  }

  // Let the game begin: ocean inside!
  val s49 = 0x19ABF6AA7B22F38BL
  lazy val week49: IslandMap = {
    createIsland shapedAs radial(factor = 1.57) withSize 1600 having 1200.faces builtWith Seq(
      plateau(30), flowing(rivers = 40, distance = 0.1), withMoisture(soils.wet, distance = 100),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s49
  }


  // Large island, three capes, but few wood.
  val s50 = 0xBE3EF65BEF2BD459L
  lazy val week50: IslandMap = {
    createIsland shapedAs radial(factor = 0.42) withSize 1600 having 1200.faces builtWith Seq(
      plateau(5), flowing(rivers = 10, distance = 0.9), withMoisture(soils.dry, distance = 200),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s50
  }

  // Butterfly island
  val s51 = 0x9B4937D7A7783C0EL
  lazy val week51: IslandMap = {
    createIsland shapedAs radial(factor = 0.01) withSize 1600 having 1500.faces builtWith Seq(
      plateau(20), flowing(rivers = 50, distance = 0.9), withMoisture(soils.normal, distance = 900),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s51
  }

  // Salamander's Island (looks like a salamander looking to the right)
  val s52 = 0x6C3E51CEEFA93D5FL
  lazy val week52: IslandMap = {
    createIsland shapedAs radial(factor = 1.42) withSize 1600 having 1500.faces builtWith Seq(
      plateau(40), flowing(rivers = 10, distance = 0.7), withMoisture(soils.wet, distance = 400),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s52
  }

  // Templar's island
  val s53 = 0x68C81A2529ACAFF3L
  lazy val week53: IslandMap = {
    createIsland shapedAs radial(factor = 1.666) withSize 1600 having 1500.faces builtWith Seq(
      plateau(40), flowing(rivers = 15, distance = 0.7), withMoisture(soils.wet, distance = 400),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s53
  }

  // atoll
  val s01 = 0x8E80C1B12F0B7C40L
  lazy val week01: IslandMap = {
    createIsland shapedAs donut(80.percent, 65.percent) withSize 1600 having 1500.faces builtWith Seq(
      plateau(4), flowing(rivers = 2, distance = 0.7), withMoisture(soils.normal, distance = 400),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s01
  }

  // Templar's island
  val s02 = 0x71CE0F48848F322DL
  lazy val week02: IslandMap = {
    createIsland shapedAs radial(factor = 1.666) withSize 1600 having 1500.faces builtWith Seq(
      plateau(40), flowing(rivers = 15, distance = 0.7), withMoisture(soils.normal, distance = 800),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean))  usingSeed s02
  }

  //
  val s03 = 0xC0ECF96E85B08EFEL
  lazy val week03: IslandMap = {
    createIsland shapedAs radial(factor = 1.666) withSize 1600 having 1500.faces builtWith Seq(
      plateau(30), flowing(rivers = 18, distance = 0.9), withMoisture(soils.wet, distance = 600),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean))  usingSeed s03
  }

  val s04 = s52
  lazy val week04 = week52

  val s05 = 0x3EAC7E4FF2A31F33L
  lazy val week05: IslandMap = {
    createIsland shapedAs radial(factor = 1.42) withSize 1600 having 1500.faces builtWith Seq(
      plateau(30), flowing(rivers = 40, distance = 0.6), withMoisture(soils.normal, distance = 600),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean))  usingSeed s05
  }

  val s06 = 0x1DB7EB420E31D98AL
  lazy val week06: IslandMap = {
    createIsland shapedAs radial(factor = 0.10) withSize 1600 having 1500.faces builtWith Seq(
      plateau(25), flowing(rivers = 40, distance = 0.8), withMoisture(soils.wet, distance = 600),
      AssignPitch, usingBiomes(WhittakerDiagrams.nordic))  usingSeed s06
  }

  val s07 = 0xEC4F4F3A4630034BL
  lazy val week07: IslandMap = {
    createIsland shapedAs radial(factor = 0.50) withSize 1600 having 1500.faces builtWith Seq(
      plateau(40), flowing(rivers = 30, distance = 0.5), withMoisture(soils.normal, distance = 900),
      AssignPitch, usingBiomes(WhittakerDiagrams.nordic))  usingSeed s07
  }

  val s08 = 0xAE6942D415A29E7FL
  lazy val week08: IslandMap = {
    createIsland shapedAs radial(factor = 1.80) withSize 1600 having 1500.faces builtWith Seq(
      plateau(80), flowing(rivers = 15, distance = 0.5), withMoisture(soils.dry, distance = 900),
      AssignPitch, usingBiomes(WhittakerDiagrams.nordic))  usingSeed s08
  }

  val s09 = 0xDE577ABFB68A7E38L
  lazy val week09: IslandMap = {
    createIsland shapedAs radial(factor = 0.2) withSize 1600 having 1500.faces builtWith Seq(
      plateau(10), flowing(rivers = 2, distance = 0.9), withMoisture(soils.wet, distance = 400),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s09
  }

  val s10 = 0xDE05C9B2CE32BF74L
  lazy val week10: IslandMap = {
    createIsland shapedAs radial(factor = 0.2) withSize 1600 having 1500.faces builtWith Seq(
      plateau(10), flowing(rivers = 20, distance = 0.3), withMoisture(soils.dry, distance = 600),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s10
  }

  val s11 = 0xC70825E4D144AA25L
  lazy val week11: IslandMap = {
    createIsland shapedAs radial(factor = 0.2) withSize 1600 having 1500.faces builtWith Seq(
      plateau(30), flowing(rivers = 30, distance = 0.9), withMoisture(soils.wet, distance = 400),
      AssignPitch, usingBiomes(WhittakerDiagrams.nordic)) usingSeed s11
  }

  val s12 = 0xF72CAB3A55178C4CL
  lazy val week12: IslandMap = {
    createIsland shapedAs radial(factor = 1.59) withSize 1600 having 1500.faces builtWith Seq(
      plateau(25), flowing(rivers = 50, distance = 0.9), withMoisture(soils.dry, distance = 600),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s12
  }

}
