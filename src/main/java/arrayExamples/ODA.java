package arrayExamples;

/**
 * Created by lokesh.reddy on 29-12-2017.
 */
public class ODA {

    public static void main(String[] args) {

        double nums[] = {11.2,12.3,12.4,11.1,23.4};

        double result =0;
        int i;
        for (i=0;i<4;i++)
            System.out.println(result);
            result =result+nums[i];
        System.out.println("average is " + result/5);
    }
}
