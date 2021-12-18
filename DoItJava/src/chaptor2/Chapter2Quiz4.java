package chaptor2;

public class Chapter2Quiz4 {

	public static void main(String[] args) {
		int num1 = 10; //변수 10
		float fnum2 = 2.0F; //변수 2.0
		
		int sum = (int)(num1 + fnum2); //더해서 정수값으로 반환
		int minus = (int)(num1 - fnum2); //빼서 정수값으로 반환
		int multiple = (int)(num1 * fnum2); //곱해서 정수값으로 반환
		int divide = (int)(num1 / fnum2); //나눠서 정수값으로 반환
		
		System.out.println(sum); //더하기
		System.out.println(minus); //빼기
		System.out.println(multiple); //곱하기
		System.out.println(divide); //나누기
	}
}
