package test;

class Cbbb {
	double x;
	double y;
}

public class hw8_2 {
	public static void main(String args[]) {
		Cbbb obj1 = new Cbbb();
		Cbbb obj2 = new Cbbb();
		Cbbb avg = new Cbbb();
		obj1.x = 5.2;
		obj1.y = 3.9;
		obj2.x = 6.5;
		obj2.y = 4.6;

		avg.x = (obj1.x + obj2.x) / 2;
		avg.y = (obj1.y + obj2.y) / 2;

		System.out.println("obj1.x=" + obj1.x + ", obj1.y=" + obj1.y);
		System.out.println("obj2.x=" + obj2.x + ", obj1.y=" + obj2.y);
		System.out.println("avg.x=" + avg.x + ", avg.y=" + avg.y);
	}
}
