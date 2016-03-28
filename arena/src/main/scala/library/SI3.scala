package library

import eu.ace_design.island.arena.Teams
import eu.ace_design.island.bot.IExplorerRaid

trait SI3 extends Teams {

  def all:  Map[String, Class[_ <: IExplorerRaid]] = g1 ++ g2 ++ g3 ++ g4

  def players = all

  private lazy val g1: Map[String, Class[_ <: IExplorerRaid]] = Map(
    "qaa" -> classOf[fr.unice.polytech.qgl.qaa.Explorer],
    "qab" -> classOf[fr.unice.polytech.qgl.qab.Explorer],
    "qac" -> classOf[fr.unice.polytech.qgl.qac.Explorer],
    "qad" -> classOf[fr.unice.polytech.qgl.qad.Explorer],
    "qae" -> classOf[fr.unice.polytech.qgl.qae.Explorer],
    "qaf" -> classOf[fr.unice.polytech.qgl.qaf.Explorer]
  )

  private lazy val g2:  Map[String, Class[_ <: IExplorerRaid]] = Map(
    "qba" -> classOf[fr.unice.polytech.qgl.qba.Explorer],
    "qbb" -> classOf[fr.unice.polytech.qgl.qbb.Explorer],
    "qbc" -> classOf[fr.unice.polytech.qgl.qbc.Explorer],
    "qbd" -> classOf[fr.unice.polytech.qgl.qbd.Explorer],
    "qbe" -> classOf[fr.unice.polytech.qgl.qbe.Explorer],
    "qbf" -> classOf[fr.unice.polytech.qgl.qbf.Explorer]
  )

  private lazy val g3:  Map[String, Class[_ <: IExplorerRaid]]= Map(
    "qca" -> classOf[fr.unice.polytech.qgl.qca.Explorer],
    "qcb" -> classOf[fr.unice.polytech.qgl.qcb.Explorer],
    "qcc" -> classOf[fr.unice.polytech.qgl.qcc.Explorer],
    "qcd" -> classOf[fr.unice.polytech.qgl.qcd.Explorer],
    "qce" -> classOf[fr.unice.polytech.qgl.qce.Explorer],
    "qcf" -> classOf[fr.unice.polytech.qgl.qcf.Explorer]
  )

  private lazy val g4:  Map[String, Class[_ <: IExplorerRaid]] = Map(
    "qda" -> classOf[fr.unice.polytech.qgl.qda.Explorer],
    "qdb" -> classOf[fr.unice.polytech.qgl.qdb.Explorer],
    "qdc" -> classOf[fr.unice.polytech.qgl.qdc.Explorer],
    "qdd" -> classOf[fr.unice.polytech.qgl.qdd.Explorer],
    "qde" -> classOf[fr.unice.polytech.qgl.qde.Explorer],
    "qdf" -> classOf[fr.unice.polytech.qgl.qdf.Explorer]
  )

}
