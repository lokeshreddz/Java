package collectionframeworkexamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collections {

    public static void main(String[] args) {

        HashSet<String> fruitsStore = new HashSet<String>();


        LinkedList<String> fruitsMarket = new LinkedList<String>();

        TreeSet<String> fruitsBuzz = new TreeSet<String>();

        for (String fruit : Arrays.asList("Mango", "Banana", "Apple")) {

            fruitsStore.add(fruit);
            fruitsMarket.add(fruit);
            fruitsBuzz.add(fruit);
        }
        System.out.println(fruitsStore);
        System.out.println(fruitsMarket);
        System.out.println(fruitsBuzz);


    }
}
