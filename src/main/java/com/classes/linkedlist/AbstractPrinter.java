package com.classes.linkedlist;


import com.IList;
import com.INode;

import java.awt.print.Printable;

abstract class AbstractPrinter{
        public void print(IList list){

                INode node = list.getFirstElement();

                Object temp;

                for(int i = 0; i< list.size(); i++){
                        if(node == list.getFirstElement()){
                                System.out.print(node.getValue() + ", ");
                                temp = list.getNextElement();
                                node = (INode) temp;
                        }
                        else {
                                System.out.print(node.getValue() + ", ");
                                temp = node.getNextNode();
                                node = (INode) temp;
                        }
                }
        }
        public void printWithIndexes(IList list) {

                INode node = list.getFirstElement();

                Object temp;

                for(int i = 0; i< list.size(); i++) {
                        if(node == list.getFirstElement()) {
                            System.out.println("at index ["+node.getIndex()+"] -->  "+node.getValue());
                            temp = list.getNextElement();
                            node = (INode) temp;
                        } else {
                            System.out.println("at index ["+node.getIndex()+"] -->  "+node.getValue());
                            temp = node.getNextNode();
                            node = (INode) temp;
                        }
                }
        }
}




