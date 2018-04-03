package generalExamples;

public class ReverseOfNumber {

    public int reversenumber(int number){

        int reverse =0;
        while(number !=0){
            reverse = (reverse*10)+(number%10); 
            number = number/10;
        }
        return reverse;
    }
    public static void main(String[] args) {

        ReverseOfNumber rv = new ReverseOfNumber();

        System.out.println(rv.reversenumber(543 ));

        
    }
}
