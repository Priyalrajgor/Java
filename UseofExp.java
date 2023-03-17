package exceptionHandling;

import java.util.Scanner;

public class UseofExp {

	public static void main(String[] args) 
	{
		
		UseofExp obj=new UseofExp();
		try 
		{
			obj.demo();
		} 
		catch (PriyalExp e) 
		{
			System.out.println("MSG="+e.getMessage());
		}

	}
	
	public void demo() throws PriyalExp
	{
		int num1;
		try(Scanner sc=new Scanner(System.in)){
		System.out.print("Enter a Numbers : ");
		num1=sc.nextInt();
		}
		if(num1>0)
		{
			throw new PriyalExp("It is an Positive Number");
		}
		else
		{
			throw new PriyalExp("It is an Negative Number");
		}
	}

}