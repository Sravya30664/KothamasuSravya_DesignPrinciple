import java.util.*;
public class Calci {
	public int addition(int x,int y)
	{
		return x+y;
	}
	public int subtraction(int x,int y)
	{
		return x-y;
	}
	
	public int divison(int x,int y) {
		return x/y;
	}
	public int multiplication(int x,int y) {
		return x*y;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Calci c=new Calci();
		int no1,no2;
		System.out.println("Enter any operation to perform: 1.add 2.subtract 3.multiply 4.divison");
		int ch;
		ch=sc.nextInt();
		System.out.println("Enter any two numbers:");
		no1=sc.nextInt();
		no2=sc.nextInt();
		switch(ch) {
			case 1:
				System.out.println("addition of two numbers :"+c.addition(no1, no2));
				break;
			case 2:
				System.out.println("subtraction of two numbers :"+c.subtraction(no1, no2));
				break;
			case 3:
				System.out.println("multiplicatio of two numbers:"+c.multiplication(no1, no2));
				break;
			case 4:
				System.out.println("divison of two numbers :"+c.divison(no1, no2));
				break;
	}
		sc.close();
}
}

