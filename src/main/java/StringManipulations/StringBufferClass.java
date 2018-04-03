package StringManipulations;

public class StringBufferClass {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Lokesh Reddy Vepanjeri");

        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb.length());
        StringBuffer sb1 = new StringBuffer(100);

        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        String str = "LOkesh  pavi ";

        sb1.append(str);
        sb1.append("loves");
        System.out.println(sb1);
        



    }
}
