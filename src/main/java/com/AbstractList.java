package com;

import com.iterfaces.IList;

/**
 * Created by alexnesov on 01/06/2017.
 */
public abstract class AbstractList <E> implements IList {

    abstract void add();
    abstract void insert(E value, int index);
    abstract void size();
    abstract void delete();


}
