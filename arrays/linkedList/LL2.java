// Linked List Using collection framework
import java.util.*;

class LL2 {
public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("1");
    list.addLast("2");
    list.addLast("3");
    list.addLast("d");
    System.out.println(list);
    System.out.println(list.size());
    for(int i =0 ; i<list.size();i++){
        System.out.print(list.get(i) + "->");
        
    }System.out.print("NULL");
}
}
