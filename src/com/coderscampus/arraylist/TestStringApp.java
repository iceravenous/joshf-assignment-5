package com.coderscampus.arraylist;

public class TestStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize = 10;
		String[] items = new String[maxSize];
		items[4] = "Hello";
		System.out.println(items[4]);
		for(int i = 0; i < maxSize; i++) {
			if(items[i] != null && items[0].length() > 0) {
				System.out.println(i + " Not Empty");
			} else {
				System.out.println("Empty");
			}
			
		}
		
	}

}
