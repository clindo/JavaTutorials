package singletonExample;

public class SingletonAccess {

	public static void main(String[] args) {
		Singleton tmp = Singleton.getInstance();
		tmp.demoMethod();
		
		ClassicSingleton test = ClassicSingleton.getInstance();
		test.demoMethod();
		
		 
	}
}