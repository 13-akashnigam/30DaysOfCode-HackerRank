import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_062120_Day07_Arrays 
{
    public static void main(String[] args) throws NumberFormatException, IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        String elements[] = in.readLine().split(" ");

        for(int j=N-1; j>=0; j--)
            System.out.print(elements[j]+" ");
    }
}