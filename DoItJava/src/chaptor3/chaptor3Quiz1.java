package chaptor3;

public class chaptor3Quiz1 {

	public static void main(String[] args) {
		int myAge = 23; //myAge ������ �� 23�� ������ �� ����ϴ� ������
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value); //false
		
		System.out.println(myAge <= 25); //true
		//myAge ���� ���� teacherAge ���� ���� ������ ���ϴ� ������
		System.out.println(myAge == teacherAge); //false
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		
		System.out.println(ch); //F
	}
}
