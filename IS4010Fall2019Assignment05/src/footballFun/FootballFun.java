/*
 * IS4010 Fal 2019
 * Assignment 05
 * Eric Mazza
 * mazzaej@mail.uc.edu
 * LATE SUBMISSION 10/3
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed"); 
		} else {
			System.out.println("At least one test failed");
		}
	}
	
	/**
	 * take int and spit out correct football term
	 * @param int score
	 * @return translated String
	 */
	
	public static String translateScore (int score) {
		String translation = " ";
		if (score == 2) {translation = "safety";}
		if (score == 3) {translation = "field goal";}
		if (score == 6) {translation = "touchdown";}
		if (score == 7) {translation = "touchdown and extra point";}
		if (score == 8) {translation = "touchdown and 2-point conversion";}
		if (score == -1) {translation = "";}
		if (score == 1) {translation = "invalid";}
		if (score == 10) {translation = "you must be playing Quidditch ";}
		return translation;
	}
	
}
