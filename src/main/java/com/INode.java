package com;

import com.classes.Node;

public interface INode {
    Object getValue();

    void setValue(Object value);

    Node getNextNode();

    void setNextNode(Node next);

    int getIndex();

    void setIndex(int index);
}
