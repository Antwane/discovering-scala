package ninetynineproblems.lists

import org.specs._

object FunctionsSpec extends Specification 
{
  "Functions" should 
  {
    val functions = new Functions()
    "find last element" in
    {
      val numbers = List( 1, 2, 3, 4, 5 )
      val last = functions.last( numbers )
      last must be equalTo(5)
    }
    "throws NoSuchElementException when providing empty list of a given type" in 
    {
      val numbers = List() 
      functions.last(numbers) must throwA[NoSuchElementException]
    }
  }  
}
