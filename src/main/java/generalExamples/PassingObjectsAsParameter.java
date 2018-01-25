package generalExamples;

class Test {

    int a, b;

    Test(int i, int j) {


        a = i;
        b = j;

    }

    boolean equalTo(Test obj) {
        if (obj.a == a && obj.b == b) return true;
        else return false;
    }
}


public class PassingObjectsAsParameter {
    public static void main(String[] args) {

        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(1, 1);

        System.out.println(ob1.equalTo(ob2));
        System.out.println(ob2.equalTo(ob3));

    }

}
