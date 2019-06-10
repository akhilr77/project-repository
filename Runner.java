public class Runner
{
	public Runner()
	{
		MethodInterfaceB func = (int x) -> {return Math.sqrt(x) % 1 == 0;};
		System.out.printf("" + func.methodB(5) + "\n");
	}
	public static void main(String args[])
	{
		Runner app = new Runner();
	}
}
