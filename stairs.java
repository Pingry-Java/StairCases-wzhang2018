import java.util.Scanner;


/**
 * This program makes a staircase of stars that looks aesthetically pleasing.
 * Works for both normal stairs and weird upside down ones that don't 
 * even really qualify as stairs at all.
 *
 * Main method sets the size of the stairs and gives the size for the two 
 * other methods to use.
 *
 * @author William Zhang
 @ @version 1
 */
 
public class stairs
{
	public static void main(String[] args)
	{
		Scanner keys = new Scanner(System.in);
		System.out.println("How many levels of stairs would you like?");
		int levels = keys.nextInt();
		
		ascendingStairs(levels);
		descendingStairs(levels);
	}
	/**
	 * Ascending stair function, prints "levelnum" number of stars on the bottom and one star on top.
	 */
	public static void ascendingStairs(int levelnum)
	{
		int count = 0;
		while (count++ != levelnum)
		{
			int count1 = 0;
			while (count1++ != count)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		// This line isn't really essential to the code, it's just to separate the two stairs more clearly.
		System.out.print("\n");
	}
	/**
	 * Descending stair function.  These aren't even descending stairs, they're just weird.
	 * The number of stars on top is equal to the number of levels of the stairs.  This is
	 * the premise of my code and it's where I started.  Each row subtracts one from the level
	 * of stairs value.
	 */
	public static void descendingStairs(int levelnum1)
	{
		int count = levelnum1;
		while (count-- != 0)
		{
			int count1 = levelnum1--;
			while (count1-- != 0)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
	
	
	
	
	
	
	
	
	