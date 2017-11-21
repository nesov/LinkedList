package com;

/**
 * Created by alexnesov on 23/06/2017.
 */
public interface INode<T> {

    T getValue();
    T getNextNode();
    int getIndex();
}
