import java.util.*;
public class BinarySearch {
public static int binarySearch(int[] arr, int key) {
int l= 0;
int r= arr.length-1;
 while (l<=r) {
int mid=l+(r-l)/2;
if (arr[mid] == key) 
{
return mid;
} 
else if (arr[mid] < key)
{
 l= mid + 1;
 } else 
{
 r= mid-1;
}
 }
return -1;
}
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter the size of the array");
int size=sc.nextInt();
int[] arr=new int[size];
  System.out.println("Enter the elements of the sorted array");
for (int i=0;i<size;i++) { //1,5,6,8,3
 arr[i]=sc.nextInt();
 }
 System.out.print("Enter the key element to search for");
 int key=sc.nextInt();
 int result =binarySearch(arr,key);
if (result !=-1) {
 System.out.println("Element found at index"+ result);
 } 
else
 {
System.out.println("Element not there in the array");
 }      
}
}
