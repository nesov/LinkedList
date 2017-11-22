package com.classes.linkedlist;


import com.INode;

/**
 * Created by alexnesov on 24/05/2017.
 */
public class Node <T>  implements INode {

    private T value;

    private Node next;

    private int index;

    protected Node (){
    }

    protected Node (T value){
        this.setValue(value);
    }

    protected Node(T value, int index ){
        this.setValue(value);
        this.setIndex(index);
    }

    protected Node(T value, Node next, int index){
        this.setValue(value);
        this.setNextNode(next);
        this.setIndex(index);
    }

    public T getValue(){
        return this.value;
    }

    protected void setValue(T value){
        this.value = value;
    }

    public Node getNextNode(){
        return this.next;
    }

    protected void setNextNode(Node next){
        this.next =  next;
    }

    public int getIndex(){
        return this.index;
    }

    void setIndex(int index){
        this.index = index;
    }
}
