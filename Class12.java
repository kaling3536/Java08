package test;

class CWin {
	int width;
	int height;
	String name;

	void setW(int w) // 設定寬度的 method
	{
		width = w;
	}

	void setH(int h) // 設定高度的 method
	{
		height = h;
	}

	void setName(String s)// 設定視窗名稱的 method
	{
		name = s;
	}

	void show() {
		System.out.println("Name=" + name);
		System.out.println("W=" + width + ", H=" + height);
	}

	void setWindows(int w, int h) {
		width = w;
		height = h;
	}

	void setWindows(int w, int h, String s) {
		width = w;
		height = h;
		name = s;
	}
}

public class hw8_12 {
	public static void main(String args[]) {
		CWin cw = new CWin();
		cw.setName("1st Windows");
		cw.setW(5);
		cw.setH(3);
		cw.show();
		cw.setName("2nd Windows");
		cw.setWindows(6, 8);
		cw.show();
		cw.setWindows(4, 2, "3rd Windows");
		cw.show();
	}
}
