package customexception;

public class Voting {
	public static void main(String[] args)
	{
		int age=20;
		try
		{
			if(age<18)
			{
				throw new UnderAgeException("you can not vote as your age is below 18");
			}
			else
			{
				System.out.println("you can vote now");
			}
		}
		 catch(UnderAgeException e)
		{
			 e.printStackTrace();
		}
	}

}
