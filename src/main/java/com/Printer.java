package com;
import com.linkedlist.LinkedList;
import com.linkedlist.Node;

public class Printer {

        public Printer(){}

        public void print(IList list){

                if (list instanceof LinkedList) {

                        Node tempnode;

                        LinkedList temp;

                        temp = (LinkedList) list;

                        tempnode = temp.getHeadNode();

                        try {
                                for (int i = 0 ; i < list.size(); i++){
                                        if (tempnode == temp.getHeadNode()){
                                                System.out.print(tempnode.getValue() + ",");
                                                tempnode = temp.getHeadNode().getNextNode();
                                        }
                                        else {
                                                System.out.print(tempnode.getValue() + ",");
                                                tempnode = tempnode.getNextNode();
                                        }
                                }
                        } catch (NullPointerException e){}
                }
        }

        public void printWithIndexes(IList list){
        }
}




