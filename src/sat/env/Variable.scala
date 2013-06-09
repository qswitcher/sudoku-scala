package sat.env

/**
 * Created with IntelliJ IDEA.
 * User: jrussom
 * Date: 6/7/13
 * Time: 8:56 PM
 * To change this template use File | Settings | File Templates.
 */
class Variable(val name: String) {

  def eval(e: Environment) = e.get(this)

  override def toString() = name

  override def equals(o : Any) = o match {
    case v : Variable => v.name == name
    case _ => false
  }
}
