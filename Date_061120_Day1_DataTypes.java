import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Date_061120_Day1_DataTypes 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int i1;;
		double d1;
		String s1;
		try
		{
			i1 = Integer.parseInt(in.readLine());
			d1 = Double.parseDouble(in.readLine());
			s1 = in.readLine();
			System.out.println(i+i1);
			System.out.println(d+d1);
			System.out.println(s+s1);
			in.close();
		}
		catch(Exception e)
		{

		}
		scan.close();
	}
}