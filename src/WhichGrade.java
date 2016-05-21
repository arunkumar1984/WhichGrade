import java.util.*;

/**
 *   File Name: WhichGrade.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 21, 2016
 *   
 */

/**
 * WhichGrade //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Venkatraman, Arunkumar
 * @version 1.0.0
 * @since 1.0
 *
 */
public class WhichGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Scanner object
		Scanner scanner = new Scanner(System.in);
		// String variable to hold user input string
		String inpStr;
		// Ask the user input
		System.out.print("Please enter your score: ");
		inpStr = scanner.nextLine();
		// Store the user's input inside the integer variable
		int gradeString = Integer.parseInt(inpStr);

		if (gradeString >= 85 && gradeString <= 100) {
			System.out.println("Your grade is 'A'");
		}

		else if (gradeString >= 60 && gradeString < 85) {
			System.out.println("Your grade is 'B'");
		}

		else if (gradeString >= 45 && gradeString < 60) {
			System.out.println("Your grade is 'C'");
		}

		else if (gradeString >= 25 && gradeString < 45) {
			System.out.println("Your grade is 'D'");
		}

		else if (gradeString >= 0 && gradeString < 25) {
			System.out.println("Your grade is 'E'");
		} else {
			System.out.println("Invalid score");
		}
	}

}
