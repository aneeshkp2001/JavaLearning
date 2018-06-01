package learning;

interface AnimalI {
	   public void eat();
	   public void travel();
	}

public  class Interface implements AnimalI{
	public void eat(){
		System.out.println("Animal eats");
	}
	public void travel(){
		System.out.println("Animal travels ");
	}
	public static void main(String args[]){
		Interface int1 = new Interface();
		int1.eat();
		//int1.travel();
	}
}
