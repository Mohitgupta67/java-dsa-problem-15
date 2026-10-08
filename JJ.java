import java.util.*;
public class LL {
public static void main(String args[]) {
    System.out.println("Enter the size of list");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println("Enter the element in list from 1 to 50");
  LinkedList<Integer> list = new LinkedList<>();
  for(int i =0; i<n; i++) {
     int value = sc.nextInt();

     if(value >= 1 && value <= 50) {
        list.add(value);
     }
     else {
   System.out.println("Enter the number between 1 to 50");
        i--;
     }
  }
  System.out.println("Original list:" + list);

  for(int i=0; i<list.size(); i++) {
    if(list.get(i) > 25) {
        list.remove(i);
        i--;
    }
  }
  System.out.println("After deletion:" + list);
}
}