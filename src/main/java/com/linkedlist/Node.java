package com.linkedlist;


/**
 * Created by alexnesov on 24/05/2017.
 */
public class Node <E>{

    private E value;

    private Node next;

    private int index;

    protected Node (){
    }

    protected Node (E value){
        this.setValue(value);
    }

    protected Node(E value, int index ){
        this.setValue(value);
        this.setIndex(index);
    }

    protected Node(E value, Node next, int index){
        this.setValue(value);
        this.setNextNode(next);
        this.setIndex(index);
    }

    public E getValue(){
        return this.value;
    }

    protected void setValue(E value){
        this.value = value;
    }

    public Node getNextNode(){
        return this.next;
    }

    protected void setNextNode(Node next){
        this.next = next;
    }

    public int getIndex(){
        return this.index;
    }

    protected void setIndex(int index){
        this.index = index;
    }
}
