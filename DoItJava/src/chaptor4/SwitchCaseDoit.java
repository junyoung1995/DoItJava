package chaptor4;

import java.util.Scanner;

public class SwitchCaseDoit {
	public static void main(String[] args) {
		int floor; //층
		String place = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("층을 입력해주세요: ");
		floor = sc.nextInt();
		
		switch(floor) {
		case 1 : place = "약국";
			break;
		case 2 : place = "정형외과";
			break;
		case 3 : place = "피부과";
			break;
		case 4 : place = "치과";
			break;
		case 5 : place = "헬스 클럽";
			break;
		default : 
			System.out.println("층 수는 5층까지 입니다.");
			break;
		}
		System.out.println(floor + "층은 " + place + "입니다.");
	}
}
