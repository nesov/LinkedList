package com;


/**
 * Created by alexnesov on 03/06/2017.
 */
public interface IList<E>  extends IPrintable {
    void add(Object object);
    void delete();
    void insert(Object object, int index);
    int size();
    INode getFirstElement();
    Object getNextElement();
    void print(IList list);
    void printWithIndexes(IList iList);

}
