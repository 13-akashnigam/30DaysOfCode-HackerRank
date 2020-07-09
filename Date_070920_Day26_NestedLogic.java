import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Date_070920_Day26_NestedLogic
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String actualReturn[] = in.readLine().split(" ");
		String expectedReturn[] = in.readLine().split(" ");;

		int actualReturnDate = Integer.parseInt(actualReturn[0]);
		int actualReturnMonth = Integer.parseInt(actualReturn[1]);
		int actualReturnYear = Integer.parseInt(actualReturn[2]);

		int expectedReturnDate = Integer.parseInt(expectedReturn[0]);
		int expectedReturnMonth = Integer.parseInt(expectedReturn[1]);
		int expectedReturnYear = Integer.parseInt(expectedReturn[2]);

		if(actualReturnYear > expectedReturnYear)
		{
			System.out.println("10000");
			return;
		}
		else if(actualReturnYear < expectedReturnYear)
		{
			System.out.println(0);
		}
		else
		{
			if(actualReturnMonth > expectedReturnMonth)
			{
				System.out.println(500*(actualReturnMonth-expectedReturnMonth));
			}
			else if(actualReturnMonth < expectedReturnMonth)
			{
				System.out.println(0);
			}
			else
			{
				if(actualReturnDate > expectedReturnDate)
				{
					System.out.println(15*(actualReturnDate-expectedReturnDate));
				}
				else
				{
					System.out.println(0);
				}
			}
		}
	}
}