package chaptor4;

import java.util.Scanner;

public class Chaptor4Quiz4 {
	public static void main(String[] args) {
		int n; //입력한 줄의 개수
		Scanner sc = new Scanner(System.in);
		System.out.print("줄의 개수를 입력하세요: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {//라인
			for(int j = 0; j < n - i; j++) {//공백의 수
				System.out.print(" ");
			}
			for(int k = 0; k < 2 * i + 1; k++) {//별(2n+1)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
