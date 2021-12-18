package chaptor3;

public class chaptor3Quiz1 {

	public static void main(String[] args) {
		int myAge = 23; //myAge 변수에 값 23을 대입할 때 사용하는 연산자
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value); //false
		
		System.out.println(myAge <= 25); //true
		//myAge 변수 값과 teacherAge 변수 값이 같은지 비교하는 연산자
		System.out.println(myAge == teacherAge); //false
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		
		System.out.println(ch); //F
	}
}
