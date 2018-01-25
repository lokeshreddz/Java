package generalExamples;

public class NumberOfOccurences {

    public static void main(String[] args) {

        int count1 =0;
        int count2 =0;

        String rv1 = "abababahfyufaaaa";

        for(int i=0;i<rv1.length();i++){
            
            if (rv1.charAt(i)=='a') {
                count1++;
            }
            if (rv1.charAt(i)=='b'){
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
