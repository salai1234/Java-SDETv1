package day4;

import java.util.Arrays;

public class MultiDimArray {

	public static void main(String[] args) {
		//int a[][] = new int [3][2]; //Declaring an array with 3rows, 2columns size
		
		/*a[0][0] = 100;   // inserting values into an array
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;*/
		
		int a[][] = { {100,200}, {300,400}, {500,600}, {700,800}  }; // Declaring array without size
		
		System.out.println("Number of rows " + a.length);
		System.out.println("Number of columns " + a[0].length);
		
		
		
		/*for (int i=0;i<a.length;i++){
			for (int j=0;j<a[i].length;j++){
				System.out.println(a[i][j]);
			}
		}*/
		
		for (int r[]:a){
			for (int i:r){
				System.out.println(i);
			}
		}
			
		
		
	}

}
