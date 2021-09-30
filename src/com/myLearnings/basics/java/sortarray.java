package com.myLearnings.basics.java;

public class sortarray {
int i,arrange,b,r;
void ascend()
{
	int a[]= {3,2,8,5,1,4};
		
	for(int i=0;i<a.length;i++) {
	for(int r=i+1;r<a.length;r++) {
	if(a[i]>a[r]) {
		arrange=a[i];
		a[i]=a[r];
		a[r]=arrange;
		
	}	
	}
		System.out.print(a[r]);
	}
	}
     
public static void main(String args[]) {
	sortarray order=new sortarray();
	order.ascend();
	
}}