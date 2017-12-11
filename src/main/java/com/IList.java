package com;


/**
 * Created by alexnesov on 03/06/2017.
 */
public interface IList <E> {
    void add(Object object);
    void delete();
    void insert(E value , int index);
    int size();
    INode getFirstElement();
    INode getNextElement();
    default void defaultMetod(){
        System.out.println("Hello from default method");
    }
}
