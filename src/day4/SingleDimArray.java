package day4;

import java.util.Arrays;

public class SingleDimArray {

	public static void main(String[] args) {
		
	//int a[] = new int[5];  //Declared array with size 5, starting index is 0 last index is 4
	//Storing/Inserting values into the array
	/*	a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;  */
		
		int a[] = {100,200,300,400,500}; //Declare an array without specific size
	
	System.out.println("Length of an array is "+ a.length); //prints length/size of array
	
	System.out.println(a[2]);  //reading a specific value
	
	System.out.println(Arrays.toString(a)); //printing all the values in an array
	
	/*for (int i=0;i<=a.length-1;i++){   //reading all values in an array using for loop
		System.out.println(a[i]);
	}*/
	
	for(int i:a){
		System.out.println(i);   //reading all values in an array using enhanced for loop
	}
	}
	

}
