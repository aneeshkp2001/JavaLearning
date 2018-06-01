package learning;

public class Class {
	static int length = 10;
	static int breadth = 10;
public static void calcArea(){
	int area= length * breadth;
	System.out.println("Area is: " + area);
	}
public void printText(String text){
	System.out.println(text);
	}
public static void main(String[] args) {
			// TODO Auto-generated method stub
	Class s = new Class();
	s.printText("Aneesh");
	calcArea();
	}
}
