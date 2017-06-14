import com.IList;
import com.Printer;
import com.linkedlist.LinkedList;

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
        list.add(list);
        list.add(printer);

        System.out.println(list.size());

        list.getFirstElement();




        printer.print(list);

//        printer.printWithIndexes(list);
    }

}
