package com.myLearnings.basics.java;

public class recursion3 {
	int a=0;
	void a1()
	{
		 if(a<10){
			 System.out.println(++a);
			 a1();
		 }
		
	}
public static void main(String args[]){
	recursion3 b=new recursion3();
	b.a1();
}}
