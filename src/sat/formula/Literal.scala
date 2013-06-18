package sat.formula

import sat.env.Variable

/**
 * Created with IntelliJ IDEA.
 * User: jrussom
 * Date: 6/8/13
 * Time: 1:26 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Literal(val v : Variable) {

  val negation : Literal

  def this(name : String) = {
    this(new Variable(name))
  }

  def negates(literal : Literal) = negation == literal

  override def equals(o : Any) = this == o

  def isPositive

}
