package linkedlist.Classes;

import linkedlist.Interfaces.ILinkedList;

/**
 * Created by alexnesov on 24/05/2017.
 */
public class LinkedList extends APrinter implements ILinkedList {

    private Node head = new Node();

    private Node tail = new Node();

    private int size;

    public LinkedList(){
        this.setFirstNode(null).setLastNode(null).setSizeTo0();
    }

    public int getSize(){
        return this.size;
}

    public LinkedList setSizeTo0() {
        this.size = 0;
        return this;
    }

    public Node getFirstNode() {
        return head;
    }

    public Node getLastNode() {
        return tail;
    }

    public LinkedList setFirstNode(Node firstNode) {
            this.head = firstNode;
            return this;
    }

    public LinkedList setLastNode(Node lastNode) {
        this.tail = lastNode;
        return this;
    }

    public void showSize(){
        System.out.println(" "+ getSize());
    }

    public void addNodeToList(String value){

        Node a = new Node(value);

        if(tail == null){
            head = tail =  a;
        }
        else {
            tail.setNextNode(a);
            tail = a;
        }
        size++;

        updateIndexes();
    }

    public void addNodeToListToFront(String value){

        Node a = new Node(value);

        if (head == null){
            head = tail = a;

        } else {
            a.setNextNode(head);
            head = a;
        }

        size++;

        updateIndexes();
    }

    public void clearList(){
        this.setFirstNode(null).setLastNode(null).setSizeTo0();
    }

    public void updateIndexes(){

        int index = 0;
        Node node = getFirstNode();


        try {
                node.setIndex(index);

                while (node != null){

                    index++;
                    node = node.getNextNode();
                    node.setIndex(index);
                }

        } catch (NullPointerException e){}

    }

    @Override
    public void printList() {

        Node node = getFirstNode();

        try {

            System.out.println(node.getIndex() + " --> " + node.getValue());

            while (node.getNextNode() != null) {
                node = node.getNextNode();
                System.out.println(node.getIndex() + " --> " + node.getValue());

            }
        } catch (NullPointerException e){}
    }


    public void addNodeByIndex(){}
    public void removeNodeFromList(){}
    public void removeNodeByIndex(){}
}






