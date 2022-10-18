package test;

class CSphere {
	private int x; // 圓心的 x 座標
	private int y; // 圓心的 y 座標
	private int z; // 圓心的 z 座標
	private int radius; // 圓球的半徑

	void setLocation(int a, int b, int c) // 設定圓心的位置
	{
		x = a;
		y = b;
		z = c;
	}

	void setRadius(int r) // 設定半徑
	{
		radius = r;
	}

	double surfaceArea() // 傳回表面積
	{
		return 4 * 3.14 * radius * radius * radius;
	}

	double volume() {
		return ((double) (3.0 / 4) * 3.14 * radius * radius * radius);
	}

	void showCenter() {
		System.out.println("x=" + x + ", y=" + y + ", z=" + z);
	}
}

public class hw8_16 {
	public static void main(String args[]) {
		CSphere cs = new CSphere();

		cs.setLocation(3, 4, 5);
		cs.setRadius(1);
		cs.showCenter();
		System.out.println("surface area=" + cs.surfaceArea());
		System.out.println("volume=" + cs.volume());
	}
}
