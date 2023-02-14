package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	Integer maxSize = 10; //
	int currentSize = 0;
	 
	public Integer getMaxSize(Integer maxSize) {
		return maxSize;
	}
	
	@Override
	public boolean add(T item) {
		// TODO Auto-generated method stub

		

		if (currentSize ==  maxSize){
			maxSize = maxSize*2;
			Object temp[]= Arrays.copyOf(items, maxSize);
			items = temp;
		}
			for(int i = 0; i < items.length; i++ ) {
				if (items[i] == null) {
					items[i] = item;
					currentSize ++;					
					
						
					return true;
				} 
				
			}
	

		
		

		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int listCount = currentSize;
		return listCount;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		
		return (T)items[index];
	}
	
	
	
}
