package learning;

public class Array {
	public static void main(String[] args) {
		double[] myList = {5.7, 8.5, 2.6, 1.5};

		// Print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
		     
		// To sum all elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("Total is " + total);
		      
		// To find the largest element
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max) max = myList[i];
		}
		System.out.println("Max is " + max);  
	}
}

