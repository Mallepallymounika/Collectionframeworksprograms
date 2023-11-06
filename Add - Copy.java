import java.util.Collections;
import java.util.*;
public class Add
  {
    public static void main(String[] args){
      ArrayList<String> a=new ArrayList<>();
    a.add("A");
     a.add("B");
      a.add("C");
      a.add("D");
      a.add("E");
System.out.println("before");
      System.out.println(a);
      System.out.println("after");
  Collections.swap(a,0,1);
      System.out.println("sort "+a);
      System.out.println("max "+Collections.max(a));
       System.out.println("min "+Collections.min(a));
      Collections.reverse(a);
        System.out.println("reverse "+a);
      Collections.reverseOrder();
        System.out.println("reverse order "+a);
      
      Collections.rotate(a,2);
        System.out.println("rotate "+a);

      Collections.shuffle(a);
        System.out.println("shuffle "+a);

      System.out.println(Collections.binarySearch(a,"B"));
      
      
    }
    
  }