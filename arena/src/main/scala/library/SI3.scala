package library

import eu.ace_design.island.arena.Teams
import eu.ace_design.island.bot.IExplorerRaid

trait SI3 extends Teams {

  def all: Map[String, IExplorerRaid] = g1 ++ g2 ++ g3 ++ g4

  def players = all

  private lazy val g1: Map[String, IExplorerRaid] = Map(
    "qaa" -> new fr.unice.polytech.qgl.qaa.Explorer(),
    "qab" -> new fr.unice.polytech.qgl.qab.Explorer(),
    "qac" -> new fr.unice.polytech.qgl.qac.Explorer(),
    "qad" -> new fr.unice.polytech.qgl.qad.Explorer(),
    "qae" -> new fr.unice.polytech.qgl.qae.Explorer(),
    "qaf" -> new fr.unice.polytech.qgl.qaf.Explorer()
  )

  private lazy val g2: Map[String, IExplorerRaid] = Map(
    "qba" -> new fr.unice.polytech.qgl.qba.Explorer(),
    "qbb" -> new fr.unice.polytech.qgl.qbb.Explorer(),
    "qbc" -> new fr.unice.polytech.qgl.qbc.Explorer(),
    "qbd" -> new fr.unice.polytech.qgl.qbd.Explorer(),
    "qbe" -> new fr.unice.polytech.qgl.qbe.Explorer(),
    "qbf" -> new fr.unice.polytech.qgl.qbf.Explorer()
  )

  private lazy val g3: Map[String, IExplorerRaid]= Map(
    "qca" -> new fr.unice.polytech.qgl.qca.Explorer(),
    "qcb" -> new fr.unice.polytech.qgl.qcb.Explorer(),
    "qcc" -> new fr.unice.polytech.qgl.qcc.Explorer(),
    "qcd" -> new fr.unice.polytech.qgl.qcd.Explorer(),
    "qce" -> new fr.unice.polytech.qgl.qce.Explorer()
    //"qcf" -> new fr.unice.polytech.qgl.qcf.Explorer()
  )

  private lazy val g4: Map[String, IExplorerRaid]= Map(
    "qda" -> new fr.unice.polytech.qgl.qda.Explorer(),
    "qdb" -> new fr.unice.polytech.qgl.qdb.Explorer(),
    "qdc" -> new fr.unice.polytech.qgl.qdc.Explorer(),
    "qdd" -> new fr.unice.polytech.qgl.qdd.Explorer(),
    "qde" -> new fr.unice.polytech.qgl.qde.Explorer(),
    "qdf" -> new fr.unice.polytech.qgl.qdf.Explorer()
  )

}
