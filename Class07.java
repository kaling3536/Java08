package test;

class CTest {
	void test(int n) {

		System.out.print("n= " + n);

		if (n % 2 == 1)
			System.out.println(", 此數為奇數");
		else if (n == 0)
			System.out.println(", 此數為 0");
		else
			System.out.println(", 此數為偶數");
	}
}

public class hw8_7 {
	public static void main(String args[]) {
		CTest t = new CTest();

		t.test(3);
		t.test(8);
		t.test(0);
	}
}
