package generalExamples;

public class SplitMethod {

    public static void main(String[] args) {

        String rv = "Lokesh + is + best + person + in World";
        String[] ref = rv.split("//+");
        for (String s : ref)
        {
            System.out.println(s);
        }
    }
}
