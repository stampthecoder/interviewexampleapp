package com.java.exampleapp;


/**
 * This is a reversal of a singular LinkedList 
 * @author Christopher Stamp
 */
public final class ReverseSingularlyLinkedList
 {
    private ReverseSingularlyLinkedList() {
    }

     static class  LinkedListNode<T>{
      private T data;
       LinkedListNode<T> next;
      
     boolean setData(T value) {
        data =value;
        return (data ==null) ? false : true;
     }

       LinkedListNode<T> getNextNode(){
          return next;
     }
     LinkedListNode<T> getCurrentNode(){
         return this;
     }
     public T getData(){
         return data;
     }

     LinkedListNode<T> setNextNode(LinkedListNode<T> node){
           return next = node;
     }
      
     


     
     
}

/**
 *  Print the list
 * @param head
 */
public   static  void printList(LinkedListNode<?> head){
    LinkedListNode<?>  curr = head;
    LinkedListNode<?> next;

     while (curr!=null){
       System.out.println(curr.data!=null ? curr.data:"nope");
       next  = curr.getNextNode();
       curr = next;
    }
}

// Reverse a linked list 
// Reverse references of linked list
public static <T>LinkedListNode<T> reverse(LinkedListNode<T> head) {
    // Create pointers
    LinkedListNode<T> forward;
    LinkedListNode<T> prev= null;
    LinkedListNode<T>   curr = head;
    // iterate through linked list and reverse list
     while(curr!=null) {
    
    
      //  forward pointer moves to current's next node
      forward = curr.getNextNode();

    
      //  currents next node
      curr.next = prev;
     // reverses the  next of current node to the current node 
      prev = curr;
      
      // move the current pointer to point the node forward is pointing to
       curr = forward;


    
     }
     
     // we must remove the  head reference to the next because of potential cycling and creates a doubly linked nodes
     head.next =null;
     
     //head = curr;
    return prev;

}
    /**
     * Reverse a linkedlist
     */
    public static void main(String[] args) {
        LinkedListNode<Integer> first = new LinkedListNode<Integer>();
        first.setData(1);
        //initialize  linked lists
        LinkedListNode<Integer> second = new LinkedListNode<Integer>();
        second.setData(2);
        first.setNextNode(second);
        LinkedListNode<Integer> third = new LinkedListNode<>();
        third.setData(3);
        second.setNextNode(third);
        
        
        printList(first);
        // reverse a singular linked list

       //print linked list
       printList(reverse(first));
       
        
    }
}
