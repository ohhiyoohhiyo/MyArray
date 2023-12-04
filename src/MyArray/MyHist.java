package MyArray;

public class MyHist {
	public void printHist() {
		int[] arr1 = { 1, 7, 3, 2, 5, 6 };
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length - 1; j++) {
				if(arr1[j] > arr1[j+1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
					
				}
			}
		}
		for(int v : arr1)
			System.out.print(v+",");
	}
}
