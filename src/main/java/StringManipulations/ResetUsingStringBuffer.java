package StringManipulations;

public class ResetUsingStringBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Pavi Reddy");

        sb.delete(0,sb.length());

        System.out.println(sb);
        
    }
}
