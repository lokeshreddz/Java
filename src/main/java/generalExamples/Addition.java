package generalExamples;

class Addition1{

    int a;

    int b;

    public int Addition1(int a, int b){
        this.a = a;
        this.b =b;
        return a+b;
    }
}


public class Addition {

    public static void main(String[] args) {

       Addition1 ad = new Addition1();

        System.out.println(ad.Addition1(10,20));
    }
}
