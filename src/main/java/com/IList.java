package com;

/**
 * Created by alexnesov on 03/06/2017.
 */
public interface IList<E> {

    void add(E value);
    void size();
    void delete();
    void insert(E value, int index);
}
