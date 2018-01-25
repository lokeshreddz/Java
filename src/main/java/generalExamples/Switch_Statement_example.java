package generalExamples;

/**
 * Created by lokesh.reddy on 30-12-2017.
 */
public class Switch_Statement_example {

    public static void main(String[] args) {

        int month=12;

        String season;

        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;

            case 6:
            case 7:
            case 8:
                season ="Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autum";
                break;
            default:
                season = "Bogus Month";
        }

        System.out.println("April is in the season" + season);


    }
}
