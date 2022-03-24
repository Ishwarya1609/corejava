package accessspecifier;

public class TestInClass {

	public static void main(String[] args) {
		public_specifier();
		private_specifier();
		protected_specifier();
		default_specifier();

	}
	public static void public_specifier()
	{
		System.out.println("Public specifier is working");
	}
	private static void private_specifier()
	{
		System.out.println("Private specifier is working");
	}
	protected static void protected_specifier()
	{
		System.out.println("Protected specifier is working");
	}
	static void default_specifier()
	{
		System.out.println("Default specifier is working");
	}

}
