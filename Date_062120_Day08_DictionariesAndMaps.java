import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Date_062120_Day08_DictionariesAndMaps 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Map<String, Integer> phoneLookUp = new HashMap<String, Integer>();

		for(int i=0; i<n; i++)
		{
			String name = in.next();
			int phone = in.nextInt();
			phoneLookUp.put(name, phone);
		}

		while(in.hasNext())
		{
			String s = in.next();
			if(phoneLookUp.get(s)==null)
				System.out.println("Not found");
			else
				System.out.println(s+"="+phoneLookUp.get(s));
		}
		in.close();
	}
}