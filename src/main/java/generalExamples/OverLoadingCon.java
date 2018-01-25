package generalExamples;

/**
 * Created by lokesh.reddy on 12-02-2017.
 */

class Box {

    double width;
    double height;
    double depth;

    Box(Box ob) {

        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {

        width = w;
        height = h;
        depth = d;
    }

    double vol() {

        return width * height * depth;
    }
}

public class OverLoadingCon {

    public static void main(String[] args) {

        Box mybox1 = new Box(10, 20, 30);

        Box myclone = new Box(mybox1);

        double volume;

        volume = mybox1.vol();
        System.out.println("My box " + volume);
        volume = myclone.vol();
        System.out.println("My box " + volume);

    }
}
