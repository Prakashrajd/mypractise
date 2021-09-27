package com.myLearnings.basics.java;

public class fabonicrec {
int f=0,s=1,t;
void fab()
{
	if(f<9) {
		f=s;
		s=t;
		t=(f+s);
		fab();
	}
	}
public static void main(String arg[]) {
fabonicrec b=new fabonicrec();
   b.fab();
   System.out.println(b.f);
}}
