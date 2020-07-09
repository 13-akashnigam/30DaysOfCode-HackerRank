import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Date_070920_Day25_RunningTimeAndComplexity
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long T = Long.parseLong(in.readLine());

		outer: for(int i=0; i<T; i++)
		{
			long n = Long.parseLong(in.readLine());
			if(n%2 == 0)
			{
				System.out.println("Not prime");
				continue outer;
			}
			else
			{
				inner: for(int j=2; j*j<=n; j++)
				{
					if(n%j==0)
					{
						System.out.println("Not prime");
						continue outer;
					}
				}
			System.out.println("Prime");
			continue outer;
			}
		}
	}
}