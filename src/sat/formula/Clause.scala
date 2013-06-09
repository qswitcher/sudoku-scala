package sat.formula

/**
 * Created with IntelliJ IDEA.
 * User: jrussom
 * Date: 6/8/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */

class Clause(val literals : Array[Literal] = Array()) {
  checkRep(literals)

  def checkRep(ls : Array[Literal]) = {
    assert(ls != null, "Clause, Rep invariant: literals non-null")
    if(!ls.isEmpty){
      assert(ls.head != null, "Clause, Rep invariant: no null elements")
    }
    ls
  }

  def this(literal : Literal) = this(Array(literal))



}
