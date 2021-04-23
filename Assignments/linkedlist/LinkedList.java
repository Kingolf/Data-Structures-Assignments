/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;
import java.util.Scanner;

/**
 *
 * @author KINGOLF EWUSIE
 * 219CS01000141
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
     //Represent a node of the linked list    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    //These represent the head and tail of the linked list    
     Node head = null;    
     Node tail = null;    
        
     
    //addNode() will add a new node to the list    
    public void addNode(int data) {    
        //Create a new node    
        Node newNode = new Node(data);   
        
         
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {   
            // if the node is not null
            /**newNode will be added after tail such that 
             * tails next will point to newNode**/    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
     //addAtStart() will add a new node to the beginning of the list  
    public void addAtStart(int data) {  
        //Create a new node  
        Node newNode = new Node(data);
        
          //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //Node temp will point to head  
            Node temp = head;  
            //newNode will become new head of the list  
            head = newNode;  
            //Node temp(previous head) will be added after new head  
            head.next = temp;  
        }  
    }
    //display() will display all the nodes present in the list    
    public void display() {    
        //Node current will point to head    
        Node initial= head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("These are the numbers in the list: ");    
        while(initial != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(initial.data + " ");    
            initial = initial.next;    
        }    
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");   
    }  
    
      public void push(int newdata){
        Node newnode =new Node(newdata);
        newnode.next=head;
        head=newnode;
      }
        public void insertAfter(Node prevnode, int data){

         if(prevnode ==null){
             System.out.println("Node cannot be null");
             return;
         }
           Node newnode=new Node(data);
           newnode.next=prevnode.next;
           prevnode.next=newnode;

        }
        
          public void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
       prev.next = temp.next;
    }

        public void insertAtEnd(int data){

                Node new_node = new Node(data);

                if (head == null) {
                    head = new Node(data);
                    return;
                }

                new_node.next = null;

                Node last = head;
                while (last.next != null)
                    last = last.next;

                last.next = new_node;
                
            }
    public static void main(String[] args) {
        // TODO code application logic here
        int nodeNumber;
        Scanner  king = new Scanner(System.in);
        LinkedList lList = new LinkedList();  
        System.out.println("Please how many nodes would you like to enter,");
        nodeNumber = king.nextInt();
         System.out.println("Please enter the nodes ");
        int count =1;
        int node;
        while (count<=nodeNumber) {
            //System.out.println("Please enter the nodes ");
             System.out.println("Node: " +count);
            node=king.nextInt();
            //Inserting the nodes
            lList.addNode(node);
            count++;
        }

       
            
        //Displays the nodes present in the list    
        lList.display();  
        //Inserting 15 at the begining of the list
        System.out.println("\nAfter node 15 has been inserted at the begining,");
        lList.addAtStart(15);
        //Displayiing the list with 15 inserted
        lList.display();
        
       
        
        //Displays the list after inserting 30 after node 10
         System.out.println("\nAfter inserting 30 after node 10,");
        lList.insertAfter( lList.head.next.next, 30);
        lList.display();
        
        //Displays the list after inserting 45 at the end of the list
        System.out.println("\nAfter node 9 has been deleted,");
        lList.insertAtEnd(45);
        lList.display();

        
    }
    }
    

