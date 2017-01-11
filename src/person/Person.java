package person;

public class Person {
	
	
	public Person(){
		
		System.out.println("Person() called");
	}
	public Person(String name){
		
		System.out.println("Person("+name+") called");
	}
	
	
	public String name;
	protected int height;
	int age;
	private int weight;
}
