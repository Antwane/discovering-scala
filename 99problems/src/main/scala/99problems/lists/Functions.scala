package ninetynineproblems.lists

class Functions 
{
  def last[A]( list: List[A] ) :A = 
  {
    list match 
    {
      case ( h :: Nil ) => h
      case ( _ :: tail ) => last(tail)
      case ( _ ) => throw new NoSuchElementException
    }
  }

  def penultimate[A]( list: List[A] ) :A = 
  {
    list.head 
  }
} 
