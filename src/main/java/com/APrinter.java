package com;

public class APrinter {
//        public abstract void printList();

        public void printSize(IList list){
                try {
                        System.out.println("The size is : " + list.size());
                } catch (NullPointerException e){}

        }
}




