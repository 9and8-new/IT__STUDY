package Ch03;

public class C06Typechange {

	public static void main(String[] args) {
		
		char n1 = 60000; // char = 2byte. 2^16:65535까지 값이 들어감.
		short n2 = (short)n1; // 조건이 안맞음. 
		System.out.println(n2);
		
		int n3 = n2;
		System.out.println(n3);

	}

}
