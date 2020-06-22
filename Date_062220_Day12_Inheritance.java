import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_062220_Day12_Inheritance 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a[][] = new int[6][6];

		for(int i=0; i<6; i++)
		{
			String input[] = in.readLine().split(" ");
			a[i][0] = Integer.parseInt(input[0]);
			a[i][1] = Integer.parseInt(input[1]);
			a[i][2] = Integer.parseInt(input[2]);
			a[i][3] = Integer.parseInt(input[3]);
			a[i][4] = Integer.parseInt(input[4]);
			a[i][5] = Integer.parseInt(input[5]);
		}

		int currentSum = 0;
		int maxSum = a[0][0] + a[0][1] + a[0][2] + a[1][1] + a[2][0] + a[2][1] + a[2][2];
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				currentSum = 0;

				currentSum = currentSum + a[i][j];
				currentSum = currentSum + a[i][j+1];
				currentSum = currentSum + a[i][j+2];

				currentSum = currentSum + a[i+1][j+1];

				currentSum = currentSum + a[i+2][j];
				currentSum = currentSum + a[i+2][j+1];
				currentSum = currentSum + a[i+2][j+2];

				//System.out.println(i+" "+j+" = "+currentSum);
				//System.out.println("MaxSum = "+maxSum);

				if(currentSum > maxSum)
				{
					maxSum = currentSum;
					//System.out.println("currentSum > maxSum, MAXSUM ="+maxSum);
				}
			}
		}
		System.out.println(maxSum);
	}
}