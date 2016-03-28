package retrospective

import championships._
import eu.ace_design.island.arena.{Retrospective, Run}
import library.SI3

object TheAllTogether extends Retrospective with SI3 {

  val qgl1: Set[Run] = Set(Week46, Week47, Week48, Week49, Week50, Week51, Week52, Week53,
                           Week01, Week02, Week03, Week04)
  val qgl2: Set[Run] = Set(Week05, Week06, Week07, Week09, Week10, Week11, Week12)

  override val outputDir = "championships/_retrospective"
  override val weeks = qgl1 ++ qgl2

  trigger

}
