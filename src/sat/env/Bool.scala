package sat.env

/**
 * Created with IntelliJ IDEA.
 * User: jrussom
 * Date: 6/7/13
 * Time: 9:11 PM
 * To change this template use File | Settings | File Templates.
 */
sealed abstract class Bool {
  def and(b1 : Bool, b2: Bool) = {
    if(b1 == UNDEFINED || b2 == UNDEFINED) UNDEFINED else
      b1 match {
        case TRUE => b2
        case FALSE => FALSE
      }
  }

  def or(b1: Bool, b2: Bool) = {
    if(b1 == UNDEFINED || b2 == UNDEFINED) UNDEFINED else
      b1 match {
        case TRUE => TRUE
        case FALSE => b2
      }
  }

  def not(b: Bool) = b match {
    case FALSE => TRUE
    case TRUE => FALSE
    case UNDEFINED => UNDEFINED
  }
}
case object TRUE extends Bool
case object FALSE extends Bool
case object UNDEFINED extends Bool
