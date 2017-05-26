package linkedlist.Classes;

import linkedlist.Interfaces.ILinkedList;

/**
 * Created by alexnesov on 24/05/2017.
 */
public class LinkedList extends APrinter implements ILinkedList {

    private Node head = new Node();

    private Node tail = new Node();

    private int size;

    public LinkedList() {
        this.setHeadNode(null).setTailNode(null).setSizeTo0();
    }

    public int getSize() {
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

    public LinkedList setHeadNode(Node firstNode) {
        this.head = firstNode;
        return this;
    }

    public LinkedList setTailNode(Node lastNode) {
        this.tail = lastNode;
        return this;
    }

    public void showListSize() {
        System.out.println(" " + getSize());
    }

    public void addNodeToTail(String value) {

        Node a = new Node(value);

        if (tail == null) {
            head = tail = a;
        } else {
            tail.setNextNode(a);
            tail = a;
        }
        size++;

        updateIndexes();
    }

    public void addNodeToHead(String value) {

        Node a = new Node(value);

        if (head == null) {
            head = tail = a;

        } else {
            a.setNextNode(head);
            head = a;
        }

        size++;

        updateIndexes();
    }

    public void clearList() {
        this.setHeadNode(null).setTailNode(null).setSizeTo0();
    }

    public void updateIndexes() {

        int index = 0;
        Node node = getFirstNode();

        try {
            node.setIndex(index);

            while (node != null) {

                index++;
                node = node.getNextNode();
                node.setIndex(index);
            }

        } catch (NullPointerException e) {
        }

    }

    @Override
    public void printList() {

        Node node = getFirstNode();

        if(node != null) {

            try {
                    System.out.println(node.getIndex() + " --> " + node.getValue());   //TODO нужно бы пофиксить гвонокод

                    while (node.getNextNode() != null) {
                        node = node.getNextNode();
                        System.out.println(node.getIndex() + " --> " + node.getValue());

                    }
                } catch (NullPointerException e) {
            }
        } else if(getSize() == 0) System.out.println("The list is EMPTY");

    }

    public void addNodeByIndex(String value, int index) {

        Node newNode = new Node(value, index);
        Node next = new Node();
        Node prevous = new Node();
        Node tempNode = getFirstNode();

        while (tempNode.getIndex() != index) {
            prevous = tempNode;
            tempNode = tempNode.getNextNode();
            next = tempNode.getNextNode();
        }

        prevous.setNextNode(newNode);
        newNode.setNextNode(next);
        addNodeToTail(tempNode.getValue());
        updateIndexes();
    }

    public void removeNodeFromList(){}
    public void removeNodeByIndex(){}
}













