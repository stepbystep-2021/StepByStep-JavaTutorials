package stepbystep.basic.concepts;


// First preference - static block - implicitly 
// Instance Initialization Block - per Object - implicitly 
// Matching Constructor of the object will be called - implicitly
// At last the methods will be called as per calling sequence of the object - Explicitly 
public class SequenceOfExecution {

	// Second Method
	private void methodTwo(String message) {
		System.out.println(message);
	}

	// Default Constructor
	SequenceOfExecution() {
		System.out.println("This is default Constructor.");
	}

	// Static Block - Always executed First
	static {
		System.out.println("This is static block");
	}

	// First Method
	private void methodOne() {
		System.out.println("This is Method 1.");
	}

	// Instance Initialization Block - It will always be executed before constructor for each Object
	{
		System.out.println("This is instance block");
	}

	// Parameterized constructor
	SequenceOfExecution(String message) {
		System.out.println(message);
	}

	public static void main(String args[]) {
		SequenceOfExecution obj = new SequenceOfExecution("This is for parameterized Constructor.");		
		obj.methodOne();
		obj.methodTwo("This is Method 2.");
		
		SequenceOfExecution obj1 = new SequenceOfExecution();
	}
}
