package Day8.interfaces.Extendinginterfaces;

public class ExtendinginterfaceDemo implements ChildInterface {
	
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}