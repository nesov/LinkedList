package com.classes;
import com.classes.LinkedList.LinkedList;


abstract class APrinter {
        private LinkedList list;

        public abstract void printList();

        public void printSize(LinkedList list){
                list = new LinkedList();

                try {
                        System.out.println("The size is : " + list.getSize());
                } catch (NullPointerException e){}

        }
}




