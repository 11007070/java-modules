package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What is your test score? (out of 100)");
	double testScore = Double.parseDouble(score);
	if (testScore >= 60) {
		System.out.println("Good job! You passed!");
	}
	else {
		System.out.println("Nice try! But you sadly didn't pass.");
	}
}
}
