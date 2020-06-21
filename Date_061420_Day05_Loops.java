import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061420_Day05_Loops 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());

		for(int i=1; i<=10; i++)
			System.out.println(n+" x "+i+" = "+(n*i));
	}
}
