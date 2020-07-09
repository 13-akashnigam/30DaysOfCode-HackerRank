import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Date_070920_Day29_BitwiseAND
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for(int i=0; i<T; i++)
		{
			String input[] = in.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int K = Integer.parseInt(input[1]);

			int maxResultLessThanK = 0;
			for(int x=1; x<=N; x++)
			{
				for(int y=x+1; y<=N; y++)
				{
					int result = x & y;
					if(result>maxResultLessThanK && result<K)
						maxResultLessThanK = result;
				}
			}
			System.out.println(maxResultLessThanK);
		}
	}
}