/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author Kwamena
 */
public class Stacks {

    
      // store elements of stack
  int elements[];
  // represent top of stack
  int top;
  // total capacity of the stack
  int capa;

  // Creating a stack
  Stacks(int size) {
    // initialize the array
    // initialize the stack variables
    elements = new int[size];
    capa = size;
    top = -1;
  }

  // push elements to the top of stack
  public void push(int x) {
    if (isFull()) {
      System.out.println("Stack OverFlow!");

      System.exit(1);
    }

    // insert element on top of stack
    System.out.println("Inserting " + x);
    elements[++top] = x;
  }
  
  // Show element on top
   public int peek()
    {
        if (!isEmpty()) {
            return elements[top];
        }
        else {
            System.exit(1);
        }
 
        return -1;
       
    }
   
   // Utility function to return the size of the stack
    public int size() 
    {
        return top + 1;
    }

  // pop elements from top of stack
  public int pop() {

    // if stack is empty
    // no element to pop
    if (isEmpty()) {
      System.out.println("Stack is empty!");
     System.exit(1);
    }

    // pop element from top of stack
    return elements[top--];
  }

  // return size of the stack
  public int getSize() {
    return top + 1;
  }

  // check if the stack is empty
  public Boolean isEmpty() {
    return top == -1;
  }

  // check if the stack is full
  public Boolean isFull() {
    return top == capa - 1;
  }

  // display elements of stack
  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.print(elements[i] + "| ");
    }
  }
    public static void main(String[] args) {
         System.out.print("*******STACK IMPLEMENTATION********");
        
    Stacks stack = new Stacks(10);
    
    
    System.out.println("\n\nThis stack can take a maximum of\n"
            + "10 elements.\n");
    System.out.println("Inserting elements into the stack.");
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(8);
    stack.push(7);
    stack.push(5);
    stack.push(11);

    System.out.print("Stack: ");
    stack.printStack();
    System.out.print("\nThe size of the stack is "+ stack.size());
    
    System.out.println("\nThe top element is " + stack.peek());
    
    System.out.println("----------------------------------------------");
    // remove last element inserted from stack
    stack.pop();
    System.out.println("\nAfter popping out last element stacked");
    stack.printStack();
    System.out.print("\nThe size of the stack is "+ stack.size());
    System.out.println("\nThe top element is " + stack.peek());
    System.out.print("\n");
    
    System.out.println("----------------------------------------------");
    stack.pop();
     System.out.println("\nAfter popping out current element on top");
    stack.printStack();
    System.out.print("\nThe size of the stack is "+ stack.size());
    System.out.println("\nThe top element is " + stack.peek());
    System.out.print("\n");   
    }
    }
    

