package Day1;

import java.util.Scanner;

public class AdditionScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Enter a:");
		a = sc.nextInt();
		System.out.println("Enter b:");
		b = sc.nextInt();
		c=a+b;
		System.out.println("Addition of a="+a+" and b="+b+" is" +c);
	}

}
