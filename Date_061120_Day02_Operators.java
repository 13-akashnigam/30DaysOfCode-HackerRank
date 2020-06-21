import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061120_Day02_Operators
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double mealCost = Double.parseDouble(in.readLine());
		int tipPercent = Integer.parseInt(in.readLine());
		int taxPercent = Integer.parseInt(in.readLine());
		double tip = (mealCost * tipPercent)/100;
		double tax = (mealCost * taxPercent)/100;
		System.out.println(Math.round(mealCost+tip+tax));
	}
}
