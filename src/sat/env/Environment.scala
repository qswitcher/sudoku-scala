package sat.env

/**
 * Created with IntelliJ IDEA.
 * User: jrussom
 * Date: 6/7/13
 * Time: 9:03 PM
 * To change this template use File | Settings | File Templates.
 */
class Environment(private val bindings : Map[Variable,Bool] = Map()) {

  def put(v : Variable, b : Bool) = new Environment(bindings + (v -> b))

  def putTrue(v : Variable) = new Environment(bindings + (v -> TRUE))

  def putFalse(v : Variable) = new Environment(bindings + (v -> FALSE))

  def get(v : Variable) = bindings.getOrElse(v, UNDEFINED)

  override def toString = "Environment:" + bindings
}
