package com.ssr.ds.array;

public class Array {

	private int count;
	private int[] arr;

	public Array(int size) {
		super();
		arr = new int[size];
	}

	public void insert(int number) {
		if (arr.length == count) {
			int [] newArr = new int [(count*2)];
			for(int i=0; i<arr.length; i++) {
				newArr[i] = arr[i];
			}
			this.arr = newArr;
		}
		arr[count++] = number;
	}

	public void removeAt(int index) {
		if (index < 0 || index >= count) {
			throw new IllegalArgumentException();
		} else {
			for (int i = index; i < count; i++) {
				arr[i] = arr[i + 1];
			}
			count--;
		} 
	}

	public void print() {
		System.out.println("## print start ##");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("## print ends ##");

	}

	public int indexOf(int number) {
		int indexOfNumber = -1;

		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == number) {
					indexOfNumber = i;
					break;
				}
			}
		}

		return indexOfNumber;
	}
	
	public int max() {
		int max = -1;
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i]> max)
				max = arr[i];
		}
		return max;
	};

	public int[] reverse() {
		int [] reverseArr =  new int[arr.length];
		for(int i=arr.length-1,j=0; (i>=0 && j<arr.length); i--, j++)
			reverseArr[j] =  arr[i];	
		
		return reverseArr;
	};

	
	public void insertAt(int item, int index) {
		for(int i=arr.length-1; i> index; i--)
			arr[i] = arr[i-1];
		
		arr[index] = item;
	};


	public static void main(String[] args) {

		Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.print();

		numbers.insert(40);
		//numbers.print();

		numbers.reverse();
		numbers.removeAt(3);

		//numbers.removeAt(2);
		//numbers.removeAt(1);
		numbers.insertAt(100, 2);
		numbers.print();

		numbers.insertAt(200, 0);
		numbers.print();
		
		numbers.insertAt(300, 5);
		numbers.print();

		

	}

}
