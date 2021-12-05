package pack9.sub1;

public class CTrapezoid {
	
		int upper=0;
		int base=0;
		int height=0;
	public CTrapezoid(int u,int b,int h) 
	{
		upper=u;
		base=b;
		height=h;
	}
	public void show()
	{
		System.out.println((upper+base)*height/2);
	}

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

	}

}
