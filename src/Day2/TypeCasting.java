package Day2;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 23;
		int i = b;
		System.out.println(i);
		
		float f = 22.30f;
		double d = f;
		System.out.println(d);
		
		char ch = 'G';
		int i3 = ch;
		System.out.println(i3);
		
		char var1 = '\u00AC';
		int i4 = var1;
		System.out.println(i4);
		
		// narrowing/explicit type casting

		double f1 = 30.23f;
		long l = (long) f1;
		System.out.println(l);

		long l1 = 923372036854775806l;
		int i2 = (int) l1;
		System.out.println(i2);

		float f2 = 34.89f;
		int i1 = (int) f2;
		System.out.println(i1);

		byte b1 = 71;
		char ch1 = (char) b1;
		System.out.println(ch1);
	}

}
