
public class CustomExceptionTest {
	public static void main(String args[])
	{
		int age = 13;
		if(age < 18)
		{
			try {
				throw new CustumException("Age shuld be greater then 18");
			} catch (CustumException e) {
				System.out.println(e);
			}
		}
	}

}
