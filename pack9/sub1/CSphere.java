package pack9.sub1;
public class CSphere {
	
	double pi=3.14;
	double radius=0;
	public CSphere(double r) 
	{
		radius=r;
	}
	public void show()
	{
		double ball=4/3*pi*radius;
		System.out.println("radius="+radius);
		System.out.println("�y��="+ball);
	}

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub

	}

}
