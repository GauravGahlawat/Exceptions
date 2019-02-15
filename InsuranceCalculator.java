
class InsuranceRate
{
	protected InsuranceRate()
	{
		
	}
	
	public static int calculateRate (final String birth) throws Exception
	{
		final int year = 2019;
		int age = 0;
		int birthYear = Integer.parseInt(birth);
		age = year - birthYear;
		
		if(age < 16)
		{
			System.out.println("Age Is :" + age);
			throw new Exception();
		}
		else
		{
			int drivenYears = age - 16;
			if(drivenYears < 4)
			{
				return 1000;
			}
			else
			{
				return 600;
			}
		}
	}
	
}

class InsuranceCalculator {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		InsuranceRate obj=new InsuranceRate();
		String inData = "2010";
		try
		{
			System.out.println("Your Insurance is :" + obj.calculateRate(inData));
		}
		catch(Exception oops)
		{
			System.out.println("Too Young For Insurance");
		}
		
	}

}

