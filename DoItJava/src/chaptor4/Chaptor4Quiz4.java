package chaptor4;

import java.util.Scanner;

public class Chaptor4Quiz4 {
	public static void main(String[] args) {
		int n; //�Է��� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {//����
			for(int j = 0; j < n - i; j++) {//������ ��
				System.out.print(" ");
			}
			for(int k = 0; k < 2 * i + 1; k++) {//��(2n+1)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
