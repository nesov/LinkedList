package linkedlist.Interfaces;

/**
 * Created by alexnesov on 25/05/2017.
 */
@SuppressWarnings("DefaultFileTemplate")
public interface ILinkedList {

    void addNodeToTail(String value);

    void addNodeToHead(String value);

    void addNodeByIndex(String value, int index);

    void removeNodeFromList();

    void removeNodeByIndex();

    void clearList();

    void showListSize();

    void printList();

    void printSize();

}
