package StringManipulations;

public class StringManipulationExamples {

    public static void main(String[] args) {

        String SS = "LokeshReddyVepanjeri";

        System.out.println(SS);

        char[] chararray = {'J','A','V','A'};

        String sss = new String(chararray);

        System.out.println(sss);

        System.out.println("lengthnof " + SS.length());

        int index = SS.charAt(5);
        char ch = SS.charAt(10);


        int indexof = SS.indexOf('e');
        int indef = SS.lastIndexOf(7);


        String split = "aaa bbb aaa bbb aaa bbb aaa bbb";

        String[] s = split.split("aaa");

        System.out.println(s);

    }
}
