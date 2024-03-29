package robot

import cats.effect.IO

object IOFunctions {
  def getLine: IO[String] = IO(scala.io.StdIn.readLine())
  def putStrLn(s: String): IO[Unit] = IO(println(s))
}
