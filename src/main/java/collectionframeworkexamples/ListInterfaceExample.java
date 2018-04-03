package collectionframeworkexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListInterfaceExample {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        // arr.add(1);
        //arr.add(2);
        //arr.add(3);
        //arr.add(4);
        arr.add("Reddy");
        arr.add("Pavi");
        arr.add("Reddy");
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println(arr.get(0));

        //arr.remove(0);

        Collections.sort(arr);
        System.out.println(arr);
        arr.set(1, 50);
        System.out.println(arr);

        ArrayList aar1 = new ArrayList();

        aar1.add(null);

        LinkedList ll = new LinkedList();
        ll.add(null);
        ll.add("Reddy");
        ll.add("Aeddy");
        System.out.println(ll);


    }
}
