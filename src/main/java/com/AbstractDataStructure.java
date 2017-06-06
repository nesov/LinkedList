package com;


/**
 * Created by alexnesov on 01/06/2017.
 */
public abstract class AbstractDataStructure implements IList {

    public abstract void add(Object value);
    public abstract void insert(Object value, int index);
    public abstract int size();
    public abstract void delete();

}