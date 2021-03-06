package singletonExample;

public class ClassicSingleton {
	private static ClassicSingleton instance = null;

	private ClassicSingleton() {
		// Exists only to defeat instantiation.
	}

	public static ClassicSingleton getInstance() {
		if (instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}
	
	/* Other methods protected by singleton-ness */
	protected static void demoMethod() {
		System.out.println("Test Method out put from Classic Singleton");
	}
}