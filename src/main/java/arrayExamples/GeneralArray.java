package arrayExamples;

public class GeneralArray {
    public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,4,5,6};
    
    //arr = new int[6];

    arr[0]=1;
    arr[5]=9;

    for(int a :arr){

        System.out.println(a);
    }

    }
}
