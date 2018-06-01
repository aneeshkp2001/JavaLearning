package learning;

public class Loop {

	public static void main(String[] args) {
		// FOR Loop & WHILE Loop
		System.out.println("Numbers are: \n");
		int num =15;
		int j=2;
		for (int i = 1; i < num; i++) {
			System.out.println(i);
		}
		System.out.println("Even numbers are: ");
		
		while (j <num){
			System.out.println(j);
			j=j+2;
		}
	}
}
