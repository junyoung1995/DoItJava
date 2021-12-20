package chaptor4;

import java.util.Scanner;

public class IfExampleDoit {

	public static void main(String[] args) {
		int score;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		score = sc.nextInt();
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}
		else if(score >=80 && score <= 89) {
			grade = 'B';
		}
		else if(score >= 70 && score <= 79) {
			grade = 'C';
		}
		else if(score >= 60 && score <= 69) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("당신의 성적은 " + grade + "입니다.");
	}
}
