package generalExamples;

public class SingleTonDesignPattern {

    public static void main(String[] args) {

        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();

        //  Abc ab = new Abc();

    }
}

class Abc {

    static Abc obj = new Abc();

    private Abc() {

    }

    public static Abc getInstance() {

        System.out.println(obj);
        return obj;


    }

}
