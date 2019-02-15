
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String languages[] = { "C", "C++", "Java", "Perl", "Python" };
		try
		{
			// it raise exception because we have only 5 data in array and our index out of bound 
			for(int c=0;c<=5;c++) 
			{
				System.out.println(languages[c]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
