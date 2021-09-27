package com.myLearnings.basics.java;

public class factrec {
	int a=1,sum=0;
	void a1() 
	{
		if (a<11) {						
		sum=sum+a;	
		a++;
		a1();
		}		
	}
public static void main(String args[]) {
	factrec b=new factrec();
	b.a1();
	System.out.print(b.sum);
}}
