import java.util.*;

public class Main
{
	public static void main(String[] args) {
		DoublyLL dLL=new DoublyLL();
		dLL.insertAtFirst(2);
		dLL.insertAtFirst(3);
		dLL.insertAtFirst(4);
		dLL.insertAtFirst(5);
		dLL.printDLL();
		
		dLL.insertAtLast(6);
		dLL.insertAtLast(7);
		dLL.printDLL();
		
		dLL.insertAtGivenIndex(2,8);
		dLL.printDLL();
		
		dLL.insertAtGivenIndex(2,9);
		dLL.printDLL();
		
		dLL.deleteAtFirst();
		dLL.printDLL();
		
		dLL.deleteAtLast();
		dLL.printDLL();
		
		dLL.deleteAtLast();
		dLL.printDLL();
		
		dLL.deleteAtGivenIndex(3);
		dLL.printDLL();
		
		dLL.deleteAtGivenIndex(3);
		dLL.printDLL();
	}
}

class DoublyLL{
    Node head;
    Node tail;
    int size;
    
    DoublyLL(){
        this.size=0;
    }
    
    public void deleteAtGivenIndex(int index){
        if (index < 0 || index > size) {
            System.out.println("Index can't be negative");
            return;
        }
        if (size == 1) {
            // If there's only one node in the DLL
            head = null;
            tail = null;
        } 
        else if (index == 0) {
            // If deleting the first node, update the head pointer.
            deleteAtFirst();
        } 
        else if (index == size - 1) {
            // If deleting the last node
            deleteAtLast();
        }
        else{
            //general case
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size-=1;
    }
    
    public void deleteAtLast(){
        if (tail == null) {
        System.out.println("Doubly LL is already Empty");
        return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            tail=tail.prev;
            tail.next = null;
        }
        size-=1;
    }
    
    public void deleteAtFirst(){
        if(head==null){
            System.out.println("Doubly LL is already Empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }else{
            head=head.next;
            head.prev=null;
        }
        size-=1;
    }
    
    public void insertAtGivenIndex(int index,int val){
        if (index < 0 || index > size) {
            System.out.println("Index can't be negative");
            return;
        }
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        
        if (index == size) {
            insertAtLast(val);
            return;
        }
        
        Node newNode = new Node(val);
        Node current = head;
        
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        newNode.next=current.next;
        current.next.prev=newNode;
        current.next=newNode;
        newNode.prev=current;
        size+=1;
    }
    
    public void insertAtLast(int val){
        Node node= new Node(val);
        if(tail==null){
            head=node;
            tail=node;
        }
        else{
            node.prev=tail;
            tail.next=node;
            tail=node;
        }
        size+=1;
    }
    
    public void printDLL(){
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.value+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public void insertAtFirst(int val){
        Node node= new Node(val);
        if(head==null){
            head=node; 
            tail = node;
        }
        else{
            node.next=head;
            head.prev=node;
            head=node;
        }
        size+=1;
    }
    
    private class Node{
        
        int value;
        Node prev;
        Node next;
        
        Node(int val){
            this.value=val;
        }
        Node(int val,Node previous,Node nextt){
            this.value=val;
            this.prev=previous;
            this.next=nextt;
        }
        
    }
}
