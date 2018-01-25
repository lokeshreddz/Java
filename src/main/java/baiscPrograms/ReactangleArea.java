package baiscPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lokesh.reddy on 27-04-2017.
 */
public class ReactangleArea {

    public static void main(String[] args) throws IOException {

        int length =0;
        int width=0;

        BufferedReader bb =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Lenth of Rectangle");
        length =Integer.parseInt(bb.readLine());
        System.out.println("Enter the Width of Rectangle");
        width=Integer.parseInt(bb.readLine());

        double area =length*width;

        System.out.println("Area of Rectangle is "+area);
        
    }
}
