import com.IList;
import com.Printer;
import com.classes.linkedlist.LinkedList;

/**
 * Created by julia on 06.06.17.
 */
public class Main {

    public static void main(String[] args) {

        IList list = new LinkedList();

        Printer printer = new Printer();


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
        list.add(printer);


        printer.print(list);
        System.out.println();
        printer.printWithIndexes(list);

    }

}
