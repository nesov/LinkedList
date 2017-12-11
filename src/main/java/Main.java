import com.IList;
import com.IPrintable;
import com.classes.LinkedList;
import com.classes.LinkedListPrinter;



public class Main {
    
    public static void main(String[] args) {
        IList list = new LinkedList();
        IPrintable printable = new LinkedListPrinter();




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
        list.insert(list, 0);

        printable.printWithIndexes(list);

        printable.print(list);

//
//
//
//        list.printWithIndexes();
//        list.print();
//        System.out.println(list.size());
//        list.delete();

//        list.defaultMetod();
    }
}

