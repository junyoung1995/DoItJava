package chaptor4;

import java.util.Scanner;

public class SwitchCaseDoit {
	public static void main(String[] args) {
		int floor; //��
		String place = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է����ּ���: ");
		floor = sc.nextInt();
		
		switch(floor) {
		case 1 : place = "�౹";
			break;
		case 2 : place = "�����ܰ�";
			break;
		case 3 : place = "�Ǻΰ�";
			break;
		case 4 : place = "ġ��";
			break;
		case 5 : place = "�ｺ Ŭ��";
			break;
		default : 
			System.out.println("�� ���� 5������ �Դϴ�.");
			break;
		}
		System.out.println(floor + "���� " + place + "�Դϴ�.");
	}
}
