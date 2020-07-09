import java.util.*;


class Difference 
{
	private int[] elements;
	public int maximumDifference;

	Difference(int a[])
	{
		elements = a;
	}

	void computeDifference()
	{
		Arrays.sort(elements);
		maximumDifference = Math.abs(elements[0]-elements[elements.length-1]);
	}
}

public class Date_062520_Day14_Scope 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}