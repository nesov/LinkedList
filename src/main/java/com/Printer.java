package com;


public class Printer extends Object implements IPrintable, IList {

        public Printer(){}

        public void add(Object object) {

        }

        public void delete() {

        }

        public void insert(Object object, int index) {

        }

        public int size() {
                return 0;
        }

        public INode getFirstElement() {
                return null;
        }

        public Object getNextElement() {
                return null;
        }

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




