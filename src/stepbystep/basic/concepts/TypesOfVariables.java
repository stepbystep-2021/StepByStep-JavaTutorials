package stepbystep.basic.concepts;

public class TypesOfVariables {
	
	String instanceVar;  // the value will be available per object
	// all 4 access modifier are allowed for instance variable
	// instance variable can be final.
	
	static String staticVar;  // it will be available for all objects.
	// all 4 access modifier are allowed for static variable
	// static variable can be final.
	
	public void assignData(String instanceVar, String staticVar)
	{
		final String localVar = "Local Variable";  // Scope is limited to method / block
		// Local variable doesn't need access modifier.
		// static not allowed for local variable
		// final is allowed for local variable
		
		this.instanceVar = instanceVar;
		this.staticVar = staticVar;
		System.out.println("Local Variable Data -> "+localVar);
	}
	
	public void displayData()
	{
		System.out.println("Instance Variable Data -> "+instanceVar);
		System.out.println("Static Variable Data -> "+staticVar);		
	}
	
	public static void main(String args[])
	{
		TypesOfVariables obj = new TypesOfVariables();
		obj.assignData("Instance Variable", "Static Variable");
		obj.displayData();
		
		TypesOfVariables obj1 = new TypesOfVariables();
		obj1.displayData();
	}

}
