import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_062120_Day06_LetsReview 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for(int i=0; i<T; i++)
		{
			String s = in.readLine();
			int len = s.length();
			String sEven = "";
			String sOdd = "";
			for(int j=0; j<len; j++)
			{
				if(j%2==0)
					sEven += s.charAt(j);
				else
					sOdd += s.charAt(j);
			}
			System.out.println(sEven+" "+sOdd);
		}
	}
}
