package com.demo;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java Program to count the number of words in a string using HashMap.

		String str = "Spring boot simplifies commonly used spring dependencies and runs applications straight from a command line";
		Map<String,Integer>hm=new HashMap<>();
		String[] word=str.split(" ");
		for(String words:word)
		{
			Integer integer= hm.get(words);
			if(integer==null)
			{
				hm.put(words,1);
				
			}
			else
			{
				hm.put(words,integer+1);
			}
		}
System.out.println(hm);
	}

}
