package test;

class CCircle {
	double area(double r) {
		return (3.14 * r * r);
	}

	float area(float r) {
		return (3.14f * r * r);
	}

	double area(int r) {
		return (3.14 * r * r);
	}
}

public class hw8_13 {
	public static void main(String args[]) {
		CCircle obj = new CCircle();

		System.out.println("area(2)=" + obj.area(2));
		System.out.println("area(2.2f)=" + obj.area(2.2f));
		System.out.println("area(2.2)=" + obj.area(2.2));
	}
}
