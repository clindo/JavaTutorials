public class FreshJuiceEnumTest {
	public static void main(String args[]) {
		FreshJuiceEnum juice = new FreshJuiceEnum();
		juice.size = FreshJuiceEnum.FreshJuiceSize.MEDIUM;
		System.out.println("Size: " + juice.size);
	}
}