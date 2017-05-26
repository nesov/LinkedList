package linkedlist.Classes;

/**
 * Created by alexnesov on 24/05/2017.
 */
public class Node {

    private String value;

    private Node next;

    private int index;

    Node (){
    }

    Node(String value, Node next, int index){
        this.value = value;
        this.next = next;
        this.index = index;
    }

    Node(String value){
        this.setValue(value);

    }

    public String getValue(){
        return this.value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public Node getNextNode(){
        return this.next;
    }

    public void setNextNode(Node next){
        this.next = next;
    }

    public int getIndex(){
        return index;
    }

    public void setIndex(int index){
        this.index = index;
    }
}
