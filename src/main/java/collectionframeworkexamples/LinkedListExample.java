package collectionframeworkexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        LinkedList<String> linkedList2 = new LinkedList<String>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(1, 12);
        arrayList.add(12);

        int[] arr = {1, 2, 3, 4, 5};
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = new int[]{1, 2, 3, 4};

        System.out.println(Arrays.toString(arr1));

        for (Object lokesh : arr1) {
            System.out.println(lokesh);

        }
        System.out.println(arrayList);

        linkedList.add(1);
        linkedList.add(1, 12);
        linkedList.add(12);
        linkedList2.add("Lokesh");

        List ll = new LinkedList();

        List lll = new ArrayList();

        String[] str = new String[]{"Lokesh", "Pavithra", "Reddy"};

        for (String str1 : str) {

            System.out.println(str1);

        }


        


        for (Object aLinkedList : linkedList) {
            System.out.println(aLinkedList);
        }

        for (Object obj : linkedList2) {
            System.out.println(obj);

        }


    }


}
