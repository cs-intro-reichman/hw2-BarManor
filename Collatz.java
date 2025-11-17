/* Good job! again it's clear you 
 * understood the logic and really sat down and coded it
 * well done.
 * same styling suggestions for improvement apply here
 */

// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		String mode = args[1].toLowerCase(); //'c' 'v' for collatz or verbose'
		int originalNum = Integer.parseInt(args[0]);
		int steps = 0;
		int currentNum = 0;// the current number in the sequence
		boolean reachedOne = false; // whether or not 1 has been reached yet
		for (int i = 1; i < originalNum + 1; i++) {
		    currentNum = i;// reset currentNum to the starting number
			reachedOne = false;	// reset reachedOne for the new sequence
			steps = 0; // reset steps for the new sequence
			while (!reachedOne) { // continue until 1 is reached
				if (mode.equals("v")) {
					System.out.print(currentNum + " ");
				}
				if (currentNum % 2 == 0) {
					currentNum = currentNum / 2;
				} else {
					currentNum = 3 * currentNum + 1;
				}
				if (currentNum == 1) { //change reachedOne to true and print 1 if in verbose mode and 1 has been reached
					if (mode.equals("v")) {
						System.out.print("1 ");
					}
					steps++; // we count the final step to reach 1
					reachedOne = true;
				}
				steps++;

			}
			if (mode.equals("v")) {
				System.out.println("(" + steps + ")");
			}
		}
		if (mode.equals("v")) {
			System.out.println("Every one of the first " + originalNum + " hailstone sequences reached 1.");
		} else {
			System.out.println("Every one of the first " + originalNum + " hailstone sequences reached 1.");
		}
	}
}
