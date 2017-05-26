package linkedlist.Classes;

import linkedlist.Interfaces.ILinkedList;

/**
 * Created by alexnesov on 24/05/2017.
 */
abstract class APrinter implements ILinkedList {
        private LinkedList list;

        public abstract void printList();

        public void printSize(){
                try {
                        System.out.println("The size is : " + list.getSize());
                } catch (NullPointerException e){}

        }
}




