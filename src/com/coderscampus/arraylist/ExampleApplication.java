package com.coderscampus.arraylist;


public class ExampleApplication {

	public static void main(String[] args) {

		
		CustomList<String> newList = new CustomArrayList<>();
		newList.add("Joshua");
		newList.add("Matthias");
		newList.add("Shaung");
		newList.add("Robert");
		newList.add("Sandy");
		newList.add("Jonathon");
		newList.add("Scout");
		newList.add("Tiger");
		newList.add("Keziah");
		newList.add("Ben");
		newList.add("Joshua2");
		newList.add("Matthias2");
		newList.add("Shaung2");
		newList.add("Robert2");
		newList.add("Sandy2");
		newList.add("Sandy3");

		
		for (int i=0; i<newList.getSize(); i++) {
		    System.out.println(i + " - > " + newList.get(i));
		}
		
		

	}

}
