package com.classes;


import com.INode;

/**
 * Created by alexnesov on 24/05/2017.
 */
public class Node <T> implements INode {

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


    @Override
    public T getValue(){
        return this.value;
    }

    @Override
    public void setValue(Object value){
        this.value = (T)value;
    }

    @Override
    public Node getNextNode(){
        return this.next;
    }

    @Override
    public void setNextNode(Node next){
        this.next =  next;
    }

    @Override
    public int getIndex(){
        return this.index;
    }

    @Override
    public void setIndex(int index){
        this.index = index;
    }
}
