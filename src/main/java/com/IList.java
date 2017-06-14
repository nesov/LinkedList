package com;

/**
 * Created by alexnesov on 03/06/2017.
 */
public interface IList<E> {
    void add(E value);
    int size();

    void delete();
    void insert(E value, int index);

    Object getFirstElement();
    Object getNextElement();

    Object getElementValue();
    void getElementIndex();

    void setFirstElement();
    void setNextElement();
}
