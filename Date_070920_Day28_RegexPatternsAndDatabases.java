import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Date_070920_Day28_RegexPatternsAndDatabases
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		int countOfGmails = 0;
		String result[] = new String[N];
		int resultPointer = 0;

		for(int i=0; i<N; i++)
		{
			String input[] = in.readLine().split(" ");
			String fName = input[0];
			String email = input[1];
			if(email.endsWith("@gmail.com"))
			{
				countOfGmails++;
				result[resultPointer] = fName;
				resultPointer++;
			}
		}

		String resultWithoutNulls[] = new String[countOfGmails];
		for(int i=0; i<countOfGmails; i++)
			resultWithoutNulls[i] = result[i];

		Arrays.sort(resultWithoutNulls);

		for(int i=0; i<countOfGmails; i++)
			System.out.println(resultWithoutNulls[i]);
	}
}