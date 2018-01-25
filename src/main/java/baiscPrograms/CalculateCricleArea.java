package baiscPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lokesh.reddy on 27-04-2017.
 */
public class CalculateCricleArea {

    public static void main(String[] args) {

        int radius =0;
        System.out.println("Please enter the radius of circle");

        try{                        

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            radius =Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

        catch (NumberFormatException ne){
            System.out.println("invalid radius value" +ne);
            System.exit(0);

        }

        double area =  Math.PI*radius*radius;

        System.out.println("Area of Circle is " +area);


    }
}
