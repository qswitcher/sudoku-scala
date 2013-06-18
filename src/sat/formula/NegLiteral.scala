package sat.formula

import sat.env.Variable
/**
 * Created with IntelliJ IDEA.
 * User: jrussom
 * Date: 6/9/13
 * Time: 3:00 PM
 * To change this template use File | Settings | File Templates.
 */
object NegLiteral{
  def make(v: Variable) : NegLiteral = make(v.name)
  def make(name: String) : NegLiteral = {
   // PosLiteral.make(name).negation
    ???
  }
}
class NegLiteral(val name: String) extends Literal(name) {
  def isPositive {}

  val negation: Literal = ???
}
