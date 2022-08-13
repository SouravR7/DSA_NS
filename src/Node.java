import java.util.List;
import java.util.Scanner;

class Node {
    Node next;
    int val;
    Node(int val){
        this.val = val;
        next = null;
    }
}
class LinkedList{
    private static Node head;
    public static void push(int data){

        Node temp = head;
        while(temp.next != null){
            temp= temp.next;
        }
        Node new_node = new Node(data);
        new_node.val = data;
        temp = new_node;
        new_node.next = null;
        //head = new_node;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        LinkedList list = new LinkedList();
        for(int i=0; i < size; i++){
            array[i] = sc.nextInt();
            list.push(array[i]);
        }
        printlist(head);
    }

    static void printlist(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

}
