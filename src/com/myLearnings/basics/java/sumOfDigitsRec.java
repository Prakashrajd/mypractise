package com.myLearnings.basics.java;

public class sumOfDigitsRec {
	int a=25,sum=0,c;
	void sumOfdigit() {
		if (a>0) {
			c= a%10;
			sum=sum+c;
			a= a/10;
			sumOfdigit();
			 
			}
		}
public static void main(String args[]) {
	sumOfDigitsRec b=new sumOfDigitsRec();
	 b.sumOfdigit();
	 System.out.println(b.sum);
	
}}