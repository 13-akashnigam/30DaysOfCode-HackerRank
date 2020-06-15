import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061120_Day0_HelloWorld 
{
	public static void main(String[] args) throws IOException 
	{		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		System.out.println("Hello, World.");
		System.out.println(input);
	}
}
