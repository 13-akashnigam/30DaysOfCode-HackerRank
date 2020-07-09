import java.util.*;

class Date_070620_Day18_QueuesAndStacks
{
	LinkedList queue;
	Stack stack;

	public Date_070620_Day18_QueuesAndStacks()
	{
		queue = new LinkedList();
		stack = new Stack();
	}

	void pushCharacter(char ch)
	{
		stack.push(ch);
	}

	void enqueueCharacter(char ch)
	{
		queue.add(ch);
	}

	char popCharacter()
	{
		return (char) stack.pop();
	}

	char dequeueCharacter()
	{
		return (char) queue.remove();
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Date_070620_Day18_QueuesAndStacks p = new Date_070620_Day18_QueuesAndStacks();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length/2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;                
				break;
			}
		}

		//Finally, print whether string s is palindrome or not.
		System.out.println( "The word, " + input + ", is " 
				+ ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}
}