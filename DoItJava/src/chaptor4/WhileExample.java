package chaptor4;

public class WhileExample {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;

		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}
}