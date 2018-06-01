package learning;

class Animal{
	   public void animalSound(){
		System.out.println("Default Sound");
	   }
	}
public class Polymorphism extends Animal{
	
	public void animalSound(){
		System.out.println("Woof");
	}
	public static void main(String args[]){
		Animal obj = new Polymorphism();
		obj.animalSound();
		Animal obj1 = new Animal();
		obj1.animalSound();
	}
}
	

