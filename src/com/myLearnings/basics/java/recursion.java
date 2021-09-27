package com.myLearnings.basics.java;

public class recursion {	
	
		void a1()
		{
			System.out.print("a1");
			a2();
		}
		void a2()
		{
			a3();
			System.out.print("a2");
		}
		void a3()
		{
			System.out.print("a3");
		}
public static void main(String arg[])
{
	recursion b= new recursion();
	b.a1();
}
	}

