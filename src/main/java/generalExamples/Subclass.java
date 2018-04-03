package generalExamples;

public class Subclass extends SuperKeywodExample {

    public void printMethod() {

        super.printMethod(2,"Lokesh");
        System.out.println("Lokesh");
    }

    public static void main(String[] args) {

        Subclass sb = new Subclass();

        sb.printMethod();

    }



}
