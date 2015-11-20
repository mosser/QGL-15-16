package library

import eu.ace_design.island.bot.IExplorerRaid

trait Teams {
  def players: Map[String, IExplorerRaid]

  def playerNames: String = players.map { case (n,_) => n.toUpperCase }.toSeq.sorted mkString ", "

}

trait SI3 extends Teams {

  def players: Map[String, IExplorerRaid] = g1 ++ g2 ++ g3 ++ g4

  private lazy val g1: Map[String, IExplorerRaid] = Map(
    //"qaa" -> new fr.unice.polytech.qgl.qaa.Explorer(), // deliv fail
    "qab" -> new fr.unice.polytech.qgl.qab.Explorer(),
    "qac" -> new fr.unice.polytech.qgl.qac.Explorer(),
    "qad" -> new fr.unice.polytech.qgl.qad.Explorer()
    //"qae" -> new fr.unice.polytech.qgl.qae.Explorer(), // deliv fail
    //"qaf" -> new fr.unice.polytech.qgl.qaf.Explorer()  // missing tag
  )

  private lazy val g2: Map[String, IExplorerRaid] = Map(
    "qba" -> new fr.unice.polytech.qgl.qba.Explorer(),
    //"qbb" -> new fr.unice.polytech.qgl.qbb.Explorer(), // deliv fail
    "qbc" -> new fr.unice.polytech.qgl.qbc.Explorer(),
    "qbd" -> new fr.unice.polytech.qgl.qbd.Explorer(),
    //"qbe" -> new fr.unice.polytech.qgl.qbe.Explorer(), // missing tag
    "qbf" -> new fr.unice.polytech.qgl.qbf.Explorer()
  )

  private lazy val g3: Map[String, IExplorerRaid]= Map(
    //"qca" -> new fr.unice.polytech.qgl.qca.Explorer(), // bad interface
    //"qcb" -> new fr.unice.polytech.qgl.qcb.Explorer(), // build fail
    //"qcc" -> new fr.unice.polytech.qgl.qcc.Explorer(), // deliv fail
    "qcd" -> new fr.unice.polytech.qgl.qcd.Explorer()
    //"qce" -> new fr.unice.polytech.qgl.qce.Explorer(), // build fail
    //"qcf" -> new fr.unice.polytech.qgl.qcf.Explorer()  // missing tag
  )

  private lazy val g4: Map[String, IExplorerRaid]= Map(
    // "qda" -> new fr.unice.polytech.qgl.qda.Explorer(), // missing tag
    "qdb" -> new fr.unice.polytech.qgl.qdb.Explorer(),
    "qdc" -> new fr.unice.polytech.qgl.qdc.Explorer(),
    "qdd" -> new fr.unice.polytech.qgl.qdd.Explorer()
    //"qde" -> new fr.unice.polytech.qgl.qde.Explorer(), // missing tag
    //"qdf" -> new fr.unice.polytech.qgl.qdf.Explorer()  // deliv fail
  )

}
