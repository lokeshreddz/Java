package generalExamples;


public class ThisKeywordExample {

    int a;
    int b;

    public void setData(int a, int b) {
        this.a = a;
        this.b = b;


    }

    public void showData() {

        System.out.println("" + a);
        System.out.println("" + b);


    }

    public static void main(String[] args) {

        ThisKeywordExample thisKeywordExample = new ThisKeywordExample();

        thisKeywordExample.setData(1, 2);
        thisKeywordExample.showData();


    }
}
