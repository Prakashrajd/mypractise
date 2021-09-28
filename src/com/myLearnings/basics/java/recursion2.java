package com.myLearnings.basics.java;

public class recursion2 {
 int a=1;

void m1()
{
	System.out.print("m1");
	if(a<5){
		a++;
		m1();
	}
}
void m2()
{
  m3();
  System.out.print("m2");
}
 void m3()
 {
	 System.out.print("m3");
 }
 public static void main(String args[]) {
	 recursion2 b=new recursion2();
	 b.m1();
 
 }
}
