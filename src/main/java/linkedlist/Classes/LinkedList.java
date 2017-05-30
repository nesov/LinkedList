package linkedlist.Classes;

import linkedlist.Interfaces.ILinkedList;

/**
 * Created by alexnesov on 24/05/2017.
 */
public class LinkedList extends APrinter implements ILinkedList {

    private Node head = new Node();

    private Node tail = new Node();

    private int size;

    private LinkedList setHeadNode(Node head) {
        this.head = head;
        return this;
    }

    private LinkedList setTailNode(Node tail) {
        this.tail = tail;
        return this;
    }

    private void setSize(int size){
        this.size = size;
    }

    private void setSizeTo0() {
        this.size = 0;
    }

    private void updateIndexes() {

        int index = 0;
        Node node = getHeadNode();

        try {
            node.setIndex(index);

            while (node.getNextNode() != null) {

                index++;
                node = node.getNextNode();
                node.setIndex(index);
            }

        } catch (NullPointerException e) {

        }
    }

    public int getSize() {
        return this.size;
    }

    private Node getHeadNode() {
        return this.head;
    }

    private Node getTailNode() {
        return this.tail;
    }

    public LinkedList() {
        this.setHeadNode(null).setTailNode(null).setSizeTo0();
    }




    public void showListSize() {
        System.out.println("The size is : " + getSize());
    }

    public void addNodeToTail(String value) {

        Node a = new Node(value);

        if (getTailNode() == null) {
            this.head = this.tail = a;
        } else {
            getTailNode().setNextNode(a);
            setTailNode(a);
        }
        size++;

        updateIndexes();
    }

    public void addNodeToHead(String value) {

        Node a = new Node(value);

        if (getHeadNode() == null) {
            this.head = this.tail = a;

        } else {
            a.setNextNode(getHeadNode());
            setHeadNode(a);
        }

        this.size++;

        updateIndexes();
    }

    public void clearList() {
        this.setHeadNode(null).setTailNode(null).setSizeTo0();
    }

    @Override
    public void printList() {

        Node node = getHeadNode();

        if(node != null) {

            try {
                    System.out.println(node.getIndex() + " --> " + node.getValue());   //TODO нужно бы пофиксить гвонокод

                    while (node.getNextNode() != null) {
                        node = node.getNextNode();
                        System.out.println(node.getIndex() + " --> " + node.getValue());

                    }
                } catch (NullPointerException e) {
            }
        } else if(this.getSize() == 0) System.out.println("The list is EMPTY");

    }

    public void addNodeByIndex(String value, int index) {

                Node newNode = new Node(value, index);

                if(newNode.getIndex() < 0 || newNode.getIndex() > this.getSize() - 1) throw new IllegalArgumentException();

                else if (newNode.getIndex() == 0)   addNodeToHead(newNode.getValue());

                else if (newNode.getIndex() == getSize() - 1)   addNodeToTail(newNode.getValue());

                else {

                    Node next = new Node();
                    Node prevous = new Node();
                    Node temp = getHeadNode();

                    while (temp.getIndex() != index) {
                        prevous = temp;
                        temp = temp.getNextNode();
                        next = temp.getNextNode();
                    }

                    prevous.setNextNode(newNode);
                    newNode.setNextNode(next);
                    addNodeToTail(temp.getValue());

                    updateIndexes();
                }
    }

    public void removeNodeFromList(){

        Node temp = this.getHeadNode();
        Node previous = new Node();

        while(temp.getNextNode() != null){
             previous = temp;
             temp = temp.getNextNode();
        }

        if (previous != this.getHeadNode() && previous != getTailNode())
            this.setTailNode(previous);

        else
            this.setHeadNode(null).setTailNode(null).setSizeTo0();

        this.updateIndexes();
        this.setSize(this.size--);

    }

    public void removeNodeByIndex(int index){

        Node prevous = new Node();
        Node temp = getHeadNode();

        if (index < 0 || index > getSize() -1) throw new IllegalArgumentException("Не корректный диапазон");

        if (index == 0) setHeadNode(temp.getNextNode());

        if (index == this.getSize() - 1){
            while (temp.getNextNode() != null){
                prevous = temp.getNextNode();
                temp = temp.getNextNode();
            }

            temp = prevous;
            setTailNode(temp);
        }

        else {
            while (index != temp.getIndex()){
                prevous = temp;
                temp = temp.getNextNode();
            }
                prevous.setNextNode(temp.getNextNode());
                this.setTailNode(prevous);

        }

        this.updateIndexes();
        this.setSize(this.size--);

    }
}













