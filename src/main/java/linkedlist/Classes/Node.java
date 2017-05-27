package linkedlist.Classes;

/**
 * Created by alexnesov on 24/05/2017.
 */
public class Node {

    private String value;

    private Node next;

    private int index;

    public Node (){
    }

    public Node (String value){
        this.setValue(value);
    }

    public Node(String value, int index ){
        this.setValue(value);
        this.setIndex(index);

    }

    public Node(String value, Node next, int index){
        this.value = value;
        this.next = next;
        this.index = index;
    }

    public String getValue(){
        return this.value;
    }

    public boolean isNull(){
        return true;
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
