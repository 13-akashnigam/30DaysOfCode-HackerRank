import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Date_062120_Day09_Recursion3 
{
	static int factorial(int n) 
	{
		if(n==1)
			return 1;
		else
		{
			n = n * factorial(n-1);
		}
		return n;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException 
	{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/users/ngksh/Documents/HackerRankOutput.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int result = factorial(n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}