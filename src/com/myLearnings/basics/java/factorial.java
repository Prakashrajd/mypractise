package com.myLearnings.basics.java;
public class factorial {
	int a=1,sum=1;
	void a1()
	{
	if (a<7)
	{
	sum=sum*a;
	 a++;	
	 a1();
	}
	}
public static void main(String args[])
{
	factorial b = new factorial();
		b.a1();
		 System.out.println(b.sum);	
}}