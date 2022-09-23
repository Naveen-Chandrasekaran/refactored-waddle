package Swaping;
import java.util.Scanner; 
public class Swaping {
	void swap1(int a, int b)
	{
		int temp= a;
		a=b;
		b=temp;
		System.out.println("After Swapping, Value of a and b: "+a+" "+b);
	}
	public static void main(String[]args)
	{
		System.out.println("Enter a and b:");
		Scanner in= new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		Swaping obj=new Swaping();
		obj.swap1(a, b);
		
	}

}
