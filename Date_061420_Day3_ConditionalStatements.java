import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061420_Day3_ConditionalStatements 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());

		if(n%2!=0)
		{
			System.out.println("Weird");
		}
		else
		{
			if(n>=2 && n<=5)
				System.out.println("Not Weird");
			else if(n>=6 && n<=20)
				System.out.println("Weird");
			else
				System.out.println("Not Weird");
		}
	}
}
