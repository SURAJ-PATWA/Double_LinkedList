public class Insert_at_Begin_of_Doubly_LinkedList {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int x){
            data=x;
            prev=null;
            next=null;
        }
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static Node  insertBegin(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        if(head!=null){
            head.prev=temp;
            head=temp;
        }
        return head;
    }
    
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        printlist(head);  // 10 20 30
         head=insertBegin(head,5);
         printlist(head);  // 5 10 20 30

    }
}
