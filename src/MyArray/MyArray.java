package MyArray;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {
		int[] arr2 = { 10, 20, 30, 40, 50};
		
		int max = arr2[0];
		int min = arr2[0];
		int sum = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			
			if(arr2[i] > max) {
				max = arr2[i];
			}
			
			if(arr2[i] < min) {
				min = arr2[i];			
			}
			
			sum += arr2[i];
		}
		
		double a = (double) sum / arr2.length;
			System.out.println("最大值: " + max);
		    System.out.println("最小值: " + min);
		    System.out.println("平均值: " + a);
		
	}

}
