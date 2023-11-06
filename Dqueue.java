
import java.util.LinkedList;
import java.util.ListIterator;
class Dqueue{
  public static void main(String[] args){
    LinkedList<String> d=new LinkedList<>();
    d.addFirst("a");
      d.addFirst("b");
      d.addFirst("c");
      d.addFirst("d");
    d.offer("e");
    System.out.println(d);
    System.out.println("1st element"+d.getFirst());
     System.out.println("Last element"+d.getLast());
    
   // System.out.println("removing");
    System.out.println(d);
   //  System.out.println("removing 1st element"+d.removeFirst());
   //  System.out.println(" removing Last element"+d.removeLast());

   // System.out.println("peek elements");
   // System.out.println(d);
    
 //System.out.println(" 1st element"+d.pollFirst());
    // System.out.println(" last element"+d.pollLast());
    //System.out.println(d);
    //System.out.println(" 1st element"+d.peekFirst());
    //System.out.println(" last element"+d.peekLast());
    System.out.println("iterator");
    ListIterator<String> c = d.listIterator();
    while (c.hasNext()) 
     {
      System.out.println(c.next());
     }
    System.out.println("Iterating through elements in reverse order:");

        ListIterator<String> a = d.listIterator();
        while (a.hasPrevious()) {
          System.out.println(a.Previous());
            //String element = a.previous();
            System.out.println(a);
        }

  }
}
    
    
    
    