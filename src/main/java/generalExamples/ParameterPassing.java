package generalExamples;

class box {

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

public class ParameterPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		box bb = new box();
		box bb1 = new box();
		double vol;
		bb.setDim(10, 20, 30);
		bb1.setDim(20, 30, 40);
		vol = bb.volume();
		System.out.println("volume is " + vol);

		vol = bb1.volume();

		System.out.println("volume is " + vol);
	}

}
