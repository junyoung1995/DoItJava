package chaptor2;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10; //int i = 10���� �����ϵ�
		var j = 10.0; //double j = 10.0���� ������ ��
		var str = "hello"; //String str = "hello"�� ������
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3;
	}

}
