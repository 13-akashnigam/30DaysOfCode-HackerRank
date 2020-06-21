import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_062120_Day10_BinaryNumbers 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String bin = Integer.toBinaryString(n);
		//System.out.println(bin);
		int len = bin.length();
		int maxCountOfConsecutive1s = 0;
		int currentCountOfConsecutive1s = 0;
		for(int i=0; i<len; i++)
		{
			if(bin.charAt(i)=='1')
				currentCountOfConsecutive1s++;

			if(bin.charAt(i)=='0')
			{
				if(currentCountOfConsecutive1s>maxCountOfConsecutive1s)
					maxCountOfConsecutive1s = currentCountOfConsecutive1s;
				currentCountOfConsecutive1s = 0;
			}
		}
		if(currentCountOfConsecutive1s>maxCountOfConsecutive1s)
			maxCountOfConsecutive1s = currentCountOfConsecutive1s;
		System.out.println(maxCountOfConsecutive1s);
	}
}