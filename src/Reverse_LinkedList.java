import org.w3c.dom.Node;

public class Reverse_LinkedList {

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.add(12);
        l1.add(13);
        l1.add(14);
        l1.add(15);
        l1.add(16);

        l1.Print_LinkedList();
        System.out.println();
        l1.Print_reverse();
    }

}


class LinkedList{

    Node head;
    Node tail;

    public void Print_reverse(){
        Node temp = head;
        Node temp1 = null;
        while(temp.next != null){
            if(temp.next.next == null){
                temp1 = temp;
            }
            temp.next.prev = temp;
            temp = temp.next;
        }
        while (temp != null){

            System.out.print(temp.val+" -> ");

            temp = temp.prev;
        }
        System.out.print("Start");
    }

    public void Print_LinkedList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public void add(int val){

        Node node = new Node(val);
        if(isEmpty()){
            head = node;
            tail = node;
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        tail = node;
    }

    class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val) {
            this.val = val;
        }

    }

}
