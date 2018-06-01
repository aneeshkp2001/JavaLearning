package learning;

public class Constructor {
	String place;
	int parkno;
	
	Constructor(){
		this.place ="New Hampshire";
		this.parkno = 10;
	}
	Constructor(String p, int n){
		this.place =p;
		this.parkno = n;
	}
	
	public static void main(String[] args) {
		// Constructor and Parameterized 
		Constructor obj1 = new Constructor();
		System.out.println(obj1.place + " has " + obj1.parkno + " parks");
		Constructor obj2 = new Constructor("Connecticut", 15);
		System.out.println(obj2.place + " has " + obj2.parkno + " parks");
	}

}
