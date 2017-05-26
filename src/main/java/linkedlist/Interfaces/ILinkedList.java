package linkedlist.Interfaces;

/**
 * Created by alexnesov on 25/05/2017.
 */
public interface ILinkedList {
    void addNodeToList(String value);

    void addNodeToListToFront(String value);

    void addNodeByIndex();

    void removeNodeFromList();

    void removeNodeByIndex();

    void clearList();

    void updateIndexes();

    void showSize();

    void printList();

}
