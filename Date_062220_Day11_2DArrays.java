import java.util.*;

class Person 
{
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){
		System.out.println(
				"Name: " + lastName + ", " + firstName 
				+ 	"\nID: " + idNumber); 
	}

}

class Student extends Person
{
	private int[] testScores;

	Student(String firstName, String lastName, int pID, int scores[])
	{
		super(firstName, lastName, pID);
		testScores = scores;
	}

	char calculate()
	{
		int totalScore = 0;
		int len = testScores.length;
		for(int i=0; i<len; i++)
		{
			totalScore = totalScore + testScores[i];
		}

		int average = totalScore/len;

		if(average<40)
			return 'T';
		else if(average>=40 && average<55)
			return 'D';
		else if(average>=55 && average<70)
			return 'P';
		else if(average>=70 && average<80)
			return 'A';
		else if(average>=80 && average<90)
			return 'E';
		else //if(totalScore>=90 && totalScore<=100)
			return 'O';
	}
}

class Solution 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++)
		{
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}