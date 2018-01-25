package generalExamples;

/**
 * Created by lokesh.reddy on 06-01-2018.
 */


class Factorial {
    int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}


public class Recurrsion_Example {

    public static void main(String[] args) {

        Factorial ff = new Factorial();

        ff.fact(3);
        ff.fact(4);

    }
}
