package StringManipulations;

public class ReverseStringWords {

    public void reverseWord(String sentense) {

        String[] words = sentense.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                /* The charAt() function returns the character
                 * at the given position in a string
                 */
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(sentense);
        System.out.println(reversedString);


    }

    public static void main(String[] args) {

        ReverseStringWords rv = new ReverseStringWords();

        rv.reverseWord("Lokesh and Pavithra are great human beings");
    }
}
