import java.util.*;

public class Main
{
	public static void main(String[] args) {
		SinglyLL ll= new SinglyLL();
		ll.insertAtFirst(2);
		ll.insertAtFirst(3);
		ll.insertAtFirst(5);
		ll.printLL();
		ll.insertAtLast(6);
		ll.printLL();
		
		ll.insertAtGivenIndex(2,10);
		ll.printLL();
		ll.insertAtGivenIndex(2,20);
		ll.printLL();
		ll.deleteAtFirst();
		ll.printLL();
		ll.deleteAtLast();
		ll.printLL();
		
		ll.deleteAtGivenIndex(1);
		ll.printLL();
		
		ll.insertAtGivenIndex(0,100);
		ll.printLL();
		
	}
}

class SinglyLL{
    private Node head;
    private Node tail;
    private int size;
    
    SinglyLL(){
        this.size=0;
    }
    
    public void deleteAtGivenIndex(int index){
        if(index<0){
            System.out.println("invalid index");
            return;
        }
        //LL is already empty
        if(head==null){
           System.out.println("LinkedList is already empty"); 
           return;
        }
        if(index==0){
            deleteAtFirst();
            return;
        }
        Node current=head;
        Node prev=null;
        int currentIndex=0;
        while(current!=null && currentIndex<index){
            prev=current;
            current=current.next;
            currentIndex+=1;
        }
        if(current==null){
            System.out.println("Index out of bound");
            return;
        }
        prev.next=current.next;
        
    }
    
    
    public void deleteAtLast(){
        if(head==null){
            System.out.println("LinkedList is already empty");
            return;
        }
        //single node case
        if(head.next==null){
            deleteAtFirst();
        }
        
        //general;
        Node current=head;
        Node previous=null;
        
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        
    }
    
    public int deleteAtFirst(){
        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size-=1;
        return val;
    }
    
    public void insertAtGivenIndex(int index,int val){
        if(index<0){
            System.out.println("index can't ne negative");
            return;
        }
        Node node=new Node(val);
        if(index==0){
            insertAtFirst(val);
        }
        else{
            Node current=head;
            int currentIndex=0;
            while(current!=null && currentIndex<index-1){
                current=current.next;
                currentIndex+=1;
            }
            if(current==null){
                System.out.println("Index out of bound");
                return;
            }
            node.next=current.next;
            current.next=node;
            
        }
        
    }
    
    public void insertAtLast(int val){
        if(tail==null){
            insertAtFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }
    
    
    public void printLL(){
        //Print all item of LL
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
        System.out.println("null"); 
    }
    
    public void insertAtFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    
    private class Node{
        int val;
        Node next;
        
        public Node(int value){
            this.val=value;
        }
        public Node(int value,Node Nnode){
            this.val=value;
            this.next=Nnode;
        }
    }
}
