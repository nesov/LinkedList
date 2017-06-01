package com.classes.LinkedList;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by alexnesov on 24/05/2017.
 */
class Node <E>{

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

    protected E getValue(){
        return this.value;
    }

    protected void setValue(E value){
        this.value = value;
    }

    protected Node getNextNode(){
        return this.next;
    }

    protected void setNextNode(Node next){
        this.next = next;
    }

    protected int getIndex(){
        return this.index;
    }

    protected void setIndex(int index){
        this.index = index;
    }
}
