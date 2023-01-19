package com.demo;

public class Demo1 {

	public static void main(String[] args) {
		//Write a program in Java to Reverse an Array without using extra space.
		//int arr[] ={1,5,6,7,8};
	//	hkd-quwx-qex
		
		int arr[]=new int[] {1,5,6,7,8};
//		System.out.println("original array:");
//		for(int i=0;i<arr.length;i++);
//		{
//			
//			System.out.println(arr[i]);
//			
//		}
		System.out.println("After REverse array:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}

	}

}
