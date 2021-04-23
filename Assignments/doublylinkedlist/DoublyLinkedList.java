/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;
import java.util.Scanner;

/**
 *
 * @author Kwamena
 */
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    //A node class for doubly linked list
    class Node{  
        String name;  
        Node previous;  
        Node next;  
   
        public Node(String name) {  
            this.name = name;  
        }  
    }  
    //Setting both head and tail to zero initially
    Node head, tail = null;  
   
    //Method for adding new node
    public void addNodehead(String name) {  
        //Create a new node  
        Node newNode = new Node(name);  
   
        //if list is empty, head and tail points to newNode
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    }  
   
//print all the nodes of doubly linked list  
    public void printNodes() {  
        //Node current will point to head  
        Node current = head;  
        
        if(head == null) {  
            System.out.println("The Playlist empty.");  
            return;  
        }  
        System.out.println("\n^^^^^^^^^^^^DOUBLY LINKED LIST^^^^^^^^^^^^^^\n");
        System.out.println("Songs on the playlist\n");  
        while(current != null) {  
            //Print each node and then go to next. 
            System.out.print(current.name + " \n");
            current = current.next; 
            
        } 
        
         Node last = tail;
        if(tail == null) {  
            System.out.println("The Playlist is empty.");  
            return;  
        } 
        System.out.println("\n*******************************************\n");
         System.out.println("\nSongs in the reverse direction\n");
    while (last != null) {
         //Print each node and then go to next.  
        System.out.print(last.name + " \n");
        last = last.previous;
        
    }
    }
    /* Given a node as previous node, insert a new node after the given node */
public void addNode(Node previous,String name)
{
 //Node newNode = new Node(name);  
    /*1. check if the given prev_node is NULL */
    if (previous == null) {
        System.out.println("The given previous node cannot be NULL ");
        return;
    }
 
    /* 2. allocate node 
    * 3. put in the data */
    Node new_node = new Node(name);
 
    /* 4. Make next of new node as next of previous node */
    new_node.next = previous.next;
 
    /* 5. Make the next of prev_node as new_node */
    previous.next = new_node;
 
    /* 6. Make prev_node as previous of new_node */
    new_node.previous = previous;
 
    /* 7. Change previous of new_node's next node */
    if (new_node.next != null)
        new_node.next.previous = new_node;
}
    public void deleteFromStart() {  
        //Checks whether list is empty  
        if(head == null) {  
              
        }  
        else {  
            //Checks whether the list contains only one element  
            if(head != tail) {  
                //head will point to next node in the list  
                head = head.next;  
                //Previous node to current head will be made null  
                head.previous = null;  
            }  
            //If the list contains only one element  
            //then, it will remove node and now both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  }
    public static void main(String[] args) {
        // TODO code application logic here
        DoublyLinkedList dl_List = new DoublyLinkedList();  
        Scanner k = new Scanner(System.in);
        dl_List.addNodehead("Hello");
        dl_List.addNodehead("No Limit");
        dl_List.addNodehead("Levitate");
        dl_List.addNodehead("Machine");
        dl_List.addNodehead("Waves");
        dl_List.addNodehead("Rolling Stone");
        dl_List.addNodehead("He's gonaa let you know");
        dl_List.addNodehead("Begins");
        dl_List.addNodehead("Hark the voice");
        dl_List.addNodehead("Bless be the tide");
        dl_List.printNodes();  
        int listsize;
        System.out.println("Please enter the number of songs to add");
        listsize = k.nextInt();
         System.out.println("Please enter the titles of the songs ");
        String node;
        int count =0;
        while(count<=listsize)
        {
            //System.out.println("Name: " + count);
            node = k.nextLine();
            //Inserting the nodes
             dl_List.addNodehead(node.toUpperCase());  
              count++;
        } 
   
        //print the nodes(Songs) of DoublyLinkedList
        dl_List.printNodes();
        
        
    } 
    }
    

