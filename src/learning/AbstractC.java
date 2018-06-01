package learning;

//abstract class
abstract class AnimalC{
	//abstract method
	public abstract void animalSound();
}
public class AbstractC extends AnimalC{
   public void animalSound(){
	   System.out.println("Woof");
   }
   public static void main(String args[]){
	   AnimalC obj = new AbstractC();
	   obj.animalSound();
   }	
}
	