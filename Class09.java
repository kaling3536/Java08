package test;

class CCalculator {
	int a;
	int b;
	int c;

	void set_value(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}

	void show() {
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
	}

	int add() {
		System.out.print(a + "+" + b + "+" + c + "=");
		return (a + b + c);
	}

	int sub() {
		System.out.print(a + "-" + b + "-" + c + "=");
		return (a - b - c);
	}

	int mul() {
		System.out.print(a + "*" + b + "*" + c + "=");
		return a * b * c;
	}

	double avg() {
		return ((a + b + c) / 3.0);
	}
}

public class hw8_9 {
	public static void main(String args[]) {
		CCalculator obj = new CCalculator();

		obj.set_value(25, 3, 7);
		obj.show();
		System.out.println(obj.add());
		System.out.println(obj.sub());
		System.out.println(obj.mul());
		System.out.println("average=" + obj.avg());
	}
}
