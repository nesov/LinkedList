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

    public void setSizeTo0() {
        this.size = 0;
    }

    public Node getHeadNode() {
        return head;
    }

    public Node getTailNode() {
        return tail;
    }

    public LinkedList setHeadNode(Node head) {
        this.head = head;
        return this;
    }

    public LinkedList setTailNode(Node tail) {
        this.tail = tail;
        return this;
    }

    public void showListSize() {
        System.out.println(" " + getSize());
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

    public void updateIndexes() {

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
        } else if(getSize() == 0) System.out.println("The list is EMPTY");

    }

    public void addNodeByIndex(String value, int index) {

                Node newNode = new Node(value, index);

                switch (newNode.getIndex()) {
                    case 1 : if (newNode.getIndex() <= 0) {
                                addNodeToHead(value);
                                System.out.println("Индекс меньше размера списка");
                    }
                            break;

                    case 2 : if (newNode.getIndex() >= this.getSize() - 1) {
                                addNodeToTail(value);
                                System.out.println("Индекс больше размера списка");
                    }
                            break;

                    case 3:
                        Node next = new Node();
                        Node prevous = new Node();
                        Node tempNode = getHeadNode();

                        System.out.println("добавили в середину по индексу заменямемая нода вынесена в конец");

                        while (tempNode.getIndex() != index) {
                            prevous = tempNode;
                            tempNode = tempNode.getNextNode();
                            next = tempNode.getNextNode();
                        }

                        prevous.setNextNode(newNode);
                        newNode.setNextNode(next);
                        addNodeToTail(tempNode.getValue());

                        updateIndexes();

                        break;

                    default: break;

                }

    }

    public void removeNodeFromList(){}
    public void removeNodeByIndex(){}
}













