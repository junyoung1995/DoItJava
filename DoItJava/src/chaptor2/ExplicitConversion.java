package chaptor2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; //두 실수가 각각 형 변환 후에 계산
		int iNum4 = (int)(dNum1 + fNum2); //두 실수가 합해진 후 형 변환
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
