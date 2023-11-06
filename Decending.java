import java.util.*;
public class Decending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> s = new TreeMap<>((id1, id2) -> id2.compareTo(id1));

  System.out.print("Enter no.of stds ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0;i < num;i++) {
      System.out.print("Enter std name ");
      String name = sc.nextLine();
   System.out.print("Enter st Id ");
       int id = sc.nextInt();
      sc.nextLine(); 
     s.put(id, name);
}
 System.out.println("Std in decending orderof id");
   for (int id:s.keySet()) {
    String name = s.get(id);
  System.out.println("ID " + id + " Name " + name);
        }
    }
}
