//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index dynamically.

import java.util.Scanner;

class LinkedL{
    Node head;
    private int size;
    LinkedL(){
        this.size=0;
    }

    class Node{
        
         int data;
         Node next;
         
         Node(int data){
            this.data= data;
            this.next = null;
            size++;
         

         }

    }
   
// function to add element from first in linked list
public void addFirst(int data){
    
    Node element = new Node(data);
  
    if(head==null){
       
       
        head=element;
    }
    else{
   
    element.next= head;
    head = element;
}
}
// function to add element from back in the linked list

public void addBack(int data){
    Node element = new Node(data);
    if(head==null){
        head = element;
    }
    else{
        Node currNode = head;
        while(currNode.next != null){
            currNode= currNode.next;
        } 
        
        currNode.next = element;
    }
}



//function to display data
public void displayList(){
    if (head==null){
        System.out.println("No elements in the list");
    }else{
    Node element= head;
    while(element !=null){
        System.out.print(element.data + "->");
        element= element.next;
    }
    System.out.print("NULL");
}}
// function to search data
public int searchData(int data) {
    Node identifier = new Node(data);
    Node iterator = head;
    int position =-1 ;
    
   for(int i = 0; i<size; i++){
    if(identifier.data == iterator.data){
        return ++position;
    }else{
        if(position>=size){
        position=-1;
        }
        else{
            iterator= iterator.next;
            position++;
        }
        }
    }
    return position;

   }


    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        LinkedL list = new LinkedL();
        System.out.print("Enter the number of items to insert in the list:");
        int dataLimit = sc.nextInt();

        // add element from the user
        for(int i =0 ; i< dataLimit;i++){
            System.out.print("Enter the "+(i+1)+ " number:");
           int num = sc.nextInt();
            list.addBack(num);
        }
        
        list.displayList();
        System.out.println();
        try{
        System.out.println("Type the digit to search");
        
        int data= sc.nextInt();
      
        System.out.print("The searched element is at :"+list.searchData(data));
    }catch(Exception e){
        System.out.println("Not found");
    }
   
        sc.close();

    }




}