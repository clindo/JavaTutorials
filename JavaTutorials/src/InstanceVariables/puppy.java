package InstanceVariables;

//This example explains how to access instance variables and methods of a class
public class puppy {
	int puppyAge;

	public puppy(String name) {
		// This constructor has one parameter, name.
		System.out.println("Name chosen is :" + name);
	}

	public void setAge(int age) {
		puppyAge = age;
	}

	public int getAge() {
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		/* Object creation */
		puppy myPuppy = new puppy("Rockey");
		/* Call class method to set puppy's age */
		myPuppy.setAge(2);
		/* Call another class method to get puppy's age */
		myPuppy.getAge();
		/* You can access instance variable as follows as well */
		System.out.println("Variable Value :" + myPuppy.puppyAge);
	}
}