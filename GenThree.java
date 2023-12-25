/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		int random1 = (int) (Math.random() * (Math.abs(x-y)))+Math.min(x,y));
		int random2 = (int) (Math.random() * (Math.abs(x-y)))+Math.min(x,y));
		int random3 = (int) (Math.random() * (Math.abs(x-y)))+Math.min(x,y));
		int minimum = Math.min(Math.min(random1,random2),random3);
		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);
		System.out.println("The minimal generated number was " + minimum);


	}
}
