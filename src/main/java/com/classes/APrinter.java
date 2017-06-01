package com.classes;


import com.iterfaces.IList;
import com.classes.LinkedList.LinkedList;

/**
 * Created by alexnesov on 24/05/2017.
 */
@SuppressWarnings("ALL")
abstract class APrinter implements IList {
        private LinkedList list;

        public abstract void printList();

        public void printSize(LinkedList list){
                list = new LinkedList();

                try {
                        System.out.println("The size is : " + list.getSize());
                } catch (NullPointerException e){}

        }
}




