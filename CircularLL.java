import java.util.*;

public class Main
{
	public static void main(String[] args) {
		CircularLL cLL=new CircularLL();
		cLL.insertAtend(2);
		cLL.insertAtend(3);
		cLL.insertAtend(4);
		cLL.insertAtend(5);
		cLL.deleteItem(8);
		cLL.printCircularLL();
	}
}

class CircularLL{
    
    private Node head;
    private Node tail;
    
    public CircularLL(){
        this.head=null;
        this.tail=null;
    }
    
    public void deleteItem(int value){
        if (head == null) {
            System.out.println("Circular Linked List is already empty");
            return;
        }

        Node currentNode = head;
        Node prevNode = null;
        
        do {
            if (currentNode.val == value) {
                if (prevNode == null) {
                    //Deleting the head node
                    head = currentNode.next;
                    tail.next = head; //Update tail's next to maintain circularity
                } else {
                    //Deleting a non-head node
                    prevNode.next = currentNode.next;
                    if (currentNode == tail) {
                        tail = prevNode; //Update tail if the deleted node was the tail
                    }
                }
                return; //Exit the loop after deletion
            }

            prevNode = currentNode;
            currentNode = currentNode.next;
        } while (currentNode != head); 
        
        System.out.println("Value " + value + " not found in the Circular Linked List.");

        
    }
    
    public void printCircularLL(){
        Node node= head;
        if(head!=null){
            do{
                System.out.print(node.val+"->");
                node=node.next;
            }while(node!=head);
        }
    }
    
    public void insertAtend(int val){
        Node node= new Node(val);
        //if CircularLL is already empty
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            node.next=head;
            tail=node;
        }
    }
    
    private class Node{
        int val;
        Node next;
        
        public Node(int val){
            this.val=val;
        }
    }
}
