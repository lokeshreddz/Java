package generalExamples;

class A {

    public void display() {
        System.out.println("Lokesh");
    }
}

class B extends A {
    @Override
    public void display() {
        System.out.println("Pavi");
    }

}


public class MethodOverRiding {

    public static void main(String[] args) {

        B b1 = new B();

        A a1 = new A();

        a1.display();

        b1.display();

    }
}
