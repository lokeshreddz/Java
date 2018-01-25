package generalExamples;

public class ReverseStringAndPalindrome {

    public static void main(String[] args) {

        String rv1 = "lokesh";
        
        String rv2 = "";
        for(int i=rv1.length()-1;i>=0;i--){
            rv2 = rv2+rv1.charAt(i);
        }

        System.out.println(rv2);

        if (rv1.equalsIgnoreCase(rv2))
            System.out.println("palindrome");
    }
}
