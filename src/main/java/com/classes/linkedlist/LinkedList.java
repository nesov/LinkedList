package com.classes.linkedlist;

import com.IList;
import com.INode;
import com.IPrintable;


public class LinkedList <E> implements IList {

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
    private void addNodeToTail(E value) {

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
    private void addNodeToHead(E value) {

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
    /*--------------------------------------------*/
    public LinkedList() {
        this.setHeadNode(null).setTailNode(null).setSizeTo0();
    }
    public int getSize() {
        return this.size;
    }
    public Node getHeadNode() {
        return this.head;
    }
    public Node getTailNode() {
        return this.tail;
    }
    public void clearList() {
        this.setHeadNode(null).setTailNode(null).setSizeTo0();
    }
    public void addNodeByIndex(E value, int index) {

                Node newNode = new Node(value, index);

                if(newNode.getIndex() < 0 || newNode.getIndex() > this.getSize() - 1) throw new IllegalArgumentException();

                else if (newNode.getIndex() == 0)   addNodeToHead((E) newNode.getValue());


                //TODO Некорректно отрабатывает условие!
                else if (newNode.getIndex() == getSize() - 1)   addNodeToTail((E) newNode.getValue());

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
                    addNodeToTail((E) temp.getValue());

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

        if (previous != this.getHeadNode() && previous != this.getTailNode())
            this.setTailNode(previous);

        else
            this.setHeadNode(null).setTailNode(null).setSizeTo0();

        this.updateIndexes();
        this.setSize(this.size--);

    }
    public void removeNodeByIndex(int index){

        Node prevous = new Node();
        Node temp = getHeadNode();

        if (index < 0 || index > getSize() -1) throw new IllegalArgumentException();

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
    public void add (Object value){
        this.addNodeToTail((E) value);
    }
    public void delete(){
        this.clearList();
    }
    public void insert(Object value, int index) {
        this.addNodeByIndex((E)value, index);
    }
    public int size(){
        return this.getSize();
    }
    public INode getFirstElement(){
        Node node = getHeadNode();
        return node;
    }
    public Object getNextElement(){
        Node node = getHeadNode().getNextNode();
        return node;
    }
    public Object getElementValue(){
        Object obj;
        obj = this.getElementValue();
        return obj;
    }

}













