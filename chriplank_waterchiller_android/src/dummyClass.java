
public class dummyClass
{
	public void thisIsANewMethod()
	{
		System.out.println("newMethod");

		testMethod();
		testMethod(50);

		System.out.println("bugfix completed");

		System.out.println("bugfix2 completed");
	}

	void testMethod()
	{
		int val = 0;
		for(int i = 0; i < 10; i++)
			val += 3;
		
		System.out.println("Value: " + val);
	}
	
	void testMethod(int counter)
	{
		int val = 0;
		for(int i = 0; i < counter; i++)
			val += 3;
		
		System.out.println("Value: " + val);
	}

}
