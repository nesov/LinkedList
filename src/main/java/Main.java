import com.IList;
import com.classes.linkedlist.LinkedList;


public class Main {
    
    public static void main(String[] args) {

        IList list = new LinkedList();

        list.add("String");
        list.add(1);
        list.add(2.0);
        list.add('c');
        list.add("Last item");
        list.add(true);
        list.add(null);
        list.add(false);
        list.add("String1");
        list.add(11123123);
        list.add(2123123.0123);
        list.add('K');
        list.add("Last item asiudyuaisdiuaysdui");
        list.add("String");
        list.add(1);
        list.add(2.0);
        list.add('c');
        list.add("Last item");
        list.add(true);
        list.add(null);
        list.add(false);
        list.add("String1");
        list.add(11123123);
        list.add(2123123.0123);
        list.add('K');
        list.add("Last item asiudyuaisdiuaysdui");
        list.add(list);




        list.printWithIndexes();
        list.print();
    }

}
