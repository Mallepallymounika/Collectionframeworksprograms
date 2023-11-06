
import java.util.*;
class Employee24 implements Comparable<Employee24>{
  String name;
  int id;
  int Salary;
  Employee24(String name,int id,int Salary){
    this.name=name;
    this.id=id;
    this.Salary=Salary;
  }
  public int compareTo(Employee24 emp){
     return this.Salary-emp.Salary;
  }
  public String toString()

    {

      return ("" + this.name + " " + this.id + " "+ this.Salary);

    }



}

public class Employee2{

  public static void main(String[] args){


    TreeSet<Employee24> ts=new TreeSet<>();

    Employee24 emp1=new Employee24("x",1,40000);

    Employee24 emp2=new Employee24("y",2,50000);

    Employee24 emp3=new Employee24("z",3,60000);

    ts.add(emp1);

    ts.add(emp2);

    ts.add(emp3);

    System.out.println(ts);

    System.out.println("Ascending order");

    for (Employee24 emp : ts) {

 

      if(emp.Salary>=20000 && emp.Salary<=70000){

        System.out.println(emp);

      }



    }


  }

}

 