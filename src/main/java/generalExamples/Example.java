package generalExamples;

/**
 * Created by lokesh.reddy on 30-12-2017.
 */

class Lokesh_Reddy {

    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }
}

public class Example {
    public static void main(String[] args) {

        Lokesh_Reddy lk = new Lokesh_Reddy();
        Lokesh_Reddy lk2 = new Lokesh_Reddy();
        double vol, vol2;


        lk.setDim(1,2,3);
        lk2.setDim(2,3,5);

        vol = lk.volume();
        vol2 = lk2.volume();

        System.out.println(vol);
        System.out.println(vol2);




    }
}
