package Ch05.연산자;

public class C05쉬프트연산 {

	public static void main(String[] args) {
		int num1 = 15;		//00000000 00000000 00000000 00001111
		
		int num2 = 20;		//00000000 00000000 00000000 00010100
		int num3 = num2<<3; //00000000 00000000 00000000 10100000
		int num4 = num2>>3; //00000000 00000000 00000000 00000010 
		// <<면 좌측으로 미는거 >>는 우측으로 미는거 <<3 => 왼쪽3칸 즉 2^3이 증가함. >>3 => 우측3칸 즉 2^3만큼 작아짐
		System.out.println("<<Shift 연산결과 :" + num3);
		System.out.println(">>Shift 연산결과 :" + num4);

	}

}
