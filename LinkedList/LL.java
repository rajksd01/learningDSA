// Linked List from Scratch

class LL{
    Node head;
 

class Node{
    String data;
    Node next;
 Node(String data){
    this.data=data;
    this.next=null;
 
 }
}


public void addFirst(String data){
    Node newNode = new Node(data);
       if(head==null){
        head =newNode;
        return;

    }
    newNode.next = head;
    head= newNode;


}
public void addLast(String data){
    Node newNode= new Node(data);
       
    if(head==null){
        head=newNode;
        return;
    }else{
        Node currNode = head;     
        while(currNode.next!=null){
            currNode= currNode.next;
        }
        currNode.next=  newNode;
    }

}

public  void displayList(){
    if(head==null){
        System.out.println("The linked list is empty");
    }
    else{
        Node currNode = head; 
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode= currNode.next;

        }
        System.out.println("Null ");
        
    }
}

// deledting from linked list

public void deleteFront(){
    if(head==null){
        System.out.println("No items to delete");
    }
    
else{
    Node currNode = head.next;
    head = currNode;
    }

    
}
// deletelast
public void deleteLast(){
    if(head==null){
        System.out.println("No elements in the list");

    }else{
        Node lastNode= head.next;
        Node secondLastNode = head;
        while(lastNode.next!=null){
            lastNode= lastNode.next;
            secondLastNode= secondLastNode.next;

        }
        secondLastNode.next=null;     
           
        
    }
}
public static void main(String[] args) {
    LL list = new LL();
    list.addFirst("A");
    list.displayList();
    list.addLast("B");
    list.displayList();
    list.deleteFront();
    list.displayList();   
    list.addLast("C");
    list.addLast("D");
    list.addLast("E");
    list.displayList();
    list.deleteLast();
    list.displayList();

}



}
