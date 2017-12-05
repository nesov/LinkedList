package com;


/**
 * Created by alexnesov on 03/06/2017.
 */
public interface IList <E> extends IPrintable {
    void add(Object object);
    void delete();
    void insert(E value , int index);
    int size();
    INode getFirstElement();
    Object getNextElement();
//    default void defaultMetod(){
//        System.out.println("Hello from default method");
//    }
}
